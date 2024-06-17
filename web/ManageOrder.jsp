<%-- 
    Document   : ManageOrder
    Created on : Jun 11, 2024, 11:44:34 PM
    Author     : Admin
--%>

<%@page import="dto.Order"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="nav-header.css">
    <link rel="stylesheet" href="ManageOrder.css">
    <link rel="stylesheet" href="global.css">
    <script src="ManageOrder.js"></script>
</head>
<div data-include="nav-header.html"></div>

<body>
    <div class="search-parent">
        <div class="search-right">
            <input class="search-input" type="text"></input>
        </div>


        <div class="rectangle-container">
            <select class="search-by">
                <option class="filter-text">Search by Order ID</option>
                <option class="filter-text">Search by Customer ID</option>
                <option class="filter-text">Search by Order Date</option>
                <option class="filter-text">Search by Status</option>

            </select>
        </div>
        <div class="group-div">
            <select class="rectangle-div">
                <option class="filter-text">Filter by Status</option>
                <option class="filter-text">Filter by Order ID</option>
                <option class="filter-text">Filter by Customer ID</option>
                <option class="filter-text">Filter by Order Date</option>
                <option>Filter by Status</option>
            </select>

        </div>
    </div>
    <div class="group-parent">
        <div class="rectangle-parent1">
            <div class="group-child1"></div>
            <button type="button" class="new-order">+ NEW ORDER</button>
        </div>
        <div class="joining-date-mmddyyyy">Ordering Date (MM/DD/YYYY)</div>
        <div class="rectangle-parent2">
            <div class="group-child2"></div>
            <input class="from" type="date" id="dateInput">

            <img class="blank-calendar-blank-calendar-icon" alt=""
                src="./public/blankcalendarblankcalendardatedaymonthempty.svg" />
        </div>
        <div class="rectangle-parent3">

            <input class="to" type="date"></input>
            <img class="blank-calendar-blank-calendar-icon1" alt=""
                src="./public/blankcalendarblankcalendardatedaymonthempty-1.svg" />
        </div>
    </div>

    <!--display list order-->
        <div class="table-group">
            <div class="table1">
                <div class="table-child4"></div>
                <div class="table-child5"></div>
                <div class="table-child6"></div>
                <div class="table-child7"></div>
                <div class="table-child8"></div>
                <div class="table-child9"></div>
            </div>
            <div class="group-child27"></div>
            <div class="no-parent">
                <div class="no1">NO.</div>
                <div class="order-id">ORDER ID</div>
                <div class="customer-id1">CUSTOMER ID</div>
                <div class="order-date2">ORDER DATE</div>
                <div class="status1">STATUS</div>
                <div class="details11">DETAILS</div>
            </div>
            <!--print order-->
            <%
//                request.getRequestDispatcher("OrderController").forward(request, response);
                String[] status = {"Status","Confirmed","Delivering","Completed","Completed"};
                ArrayList<Order> list = (ArrayList<Order>) request.getAttribute("LISTORDER");
                int count = 10;
                if(list != null){
                    for(Order ord : list){
            %>
                        <div class="parent<%= count %>">
                            <div class="div22">1</div>
                            <div class="ord000000001"><%= ord.getOrderId() %></div>
                            <div class="cus0000000011"><%= ord.getCustomerId() %></div>
                            <div class="yyyy-mm-dd-hhmmss"><%= ord.getOrderDate() %></div>
                            <div class="confirmed"><%= status[ord.getOrderStatus()] %></div>
                            <div class="rectangle-parent30">
                                <div class="group-child28"></div>
                                <button class="details12">Details</button>
                            </div>
                        </div>
            <%
                        count++;
                    }
                }
            %>
        </div>

    <div class="group-container">
        <div class="rectangle-parent14">
            <div class="group-child15"></div>
            <div class="div12">1</div>
        </div>
        <div class="rectangle-parent15">
            <div class="group-child16"></div>
            <div class="div13">2</div>
        </div>
        <div class="rectangle-parent16">
            <div class="group-child17"></div>
            <div class="div14">3</div>
        </div>
        <div class="rectangle-parent17">
            <div class="group-child18"></div>
            <div class="div15">&lt;</div>
        </div>
        <div class="rectangle-parent18">
            <div class="group-child19"></div>
            <div class="div16">&gt;</div>
        </div>
    </div>



    <div class="group-parent2">
        <div class="rectangle-parent40">
            <button class="div32">1</button>
        </div>
        <div class="rectangle-parent41">
            <button class="div33">2</button>
        </div>
        <div class="rectangle-parent42">
            <button class="div34">3</button>
        </div>
        <div class="rectangle-parent43">
            <div class="group-child41"></div>
            <button class="div35">&lt;</button>
        </div>
        <div class="rectangle-parent44">
            <div class="group-child42"></div>
            <button class="div36">&gt;</button>
        </div>
    </div>


</body>

</html>