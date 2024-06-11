<%-- 
    Document   : ManageOrder
    Created on : Jun 11, 2024, 11:44:34 PM
    Author     : Admin
--%>

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
        <div class="parent10">
            <div class="div22">1</div>
            <div class="ord000000001">ORD00000000</div>
            <div class="cus0000000011">CUS00000000</div>
            <div class="yyyy-mm-dd-hhmmss">YYYY-MM-DD hh:mm:ss</div>
            <div class="confirmed">Confirmed</div>
            <div class="rectangle-parent30">
                <div class="group-child28"></div>
                <button class="details12">Details</button>
            </div>
        </div>
        <div class="parent11">
            <div class="div23">1</div>
            <div class="ord000000002">ORD00000000</div>
            <div class="cus0000000012">CUS00000000</div>
            <div class="yyyy-mm-dd-hhmmss1">YYYY-MM-DD hh:mm:ss</div>
            <div class="confirmed1">Confirmed</div>
            <div class="rectangle-parent31">
                <div class="group-child29"></div>
                <button class="details12">Details</button>
            </div>
        </div>
        <div class="parent12">
            <div class="div24">1</div>
            <div class="ord000000003">ORD00000000</div>
            <div class="cus0000000013">CUS00000000</div>
            <div class="yyyy-mm-dd-hhmmss2">YYYY-MM-DD hh:mm:ss</div>
            <div class="confirmed2">Confirmed</div>
            <div class="rectangle-parent32">
                <div class="group-child30"></div>
                <button class="details12">Details</button>
            </div>
        </div>
        <div class="parent13">
            <div class="div25">1</div>
            <div class="ord000000004">ORD00000000</div>
            <div class="cus0000000014">CUS00000000</div>
            <div class="yyyy-mm-dd-hhmmss3">YYYY-MM-DD hh:mm:ss</div>
            <div class="confirmed3">Confirmed</div>
            <div class="rectangle-parent33">
                <div class="group-child31"></div>
                <button class="details12">Details</button>
            </div>
        </div>
        <div class="parent14">
            <div class="div26">1</div>
            <div class="ord000000005">ORD00000000</div>
            <div class="cus0000000015">CUS00000000</div>
            <div class="yyyy-mm-dd-hhmmss4">YYYY-MM-DD hh:mm:ss</div>
            <div class="confirmed4">Confirmed</div>
            <div class="rectangle-parent34">
                <div class="group-child32"></div>
                <button class="details12">Details</button>
            </div>
        </div>
        <div class="parent15">
            <div class="div27">1</div>
            <div class="ord000000006">ORD00000000</div>
            <div class="cus0000000016">CUS00000000</div>
            <div class="yyyy-mm-dd-hhmmss5">YYYY-MM-DD hh:mm:ss</div>
            <div class="confirmed5">Confirmed</div>
            <div class="rectangle-parent35">
                <div class="group-child33"></div>
                <button class="details12">Details</button>
            </div>
        </div>
        <div class="parent16">
            <div class="div28">1</div>
            <div class="ord000000007">ORD00000000</div>
            <div class="cus0000000017">CUS00000000</div>
            <div class="yyyy-mm-dd-hhmmss6">YYYY-MM-DD hh:mm:ss</div>
            <div class="confirmed6">Confirmed</div>
            <div class="rectangle-parent36">
                <div class="group-child34"></div>
                <button class="details12">Details</button>
            </div>
        </div>
        <div class="parent17">
            <div class="div29">1</div>
            <div class="ord000000008">ORD00000000</div>
            <div class="cus0000000018">CUS00000000</div>
            <div class="yyyy-mm-dd-hhmmss7">YYYY-MM-DD hh:mm:ss</div>
            <div class="confirmed7">Confirmed</div>
            <div class="rectangle-parent37">
                <div class="group-child35"></div>
                <button class="details12">Details</button>
            </div>
        </div>
        <div class="parent18">
            <div class="div30">1</div>
            <div class="ord000000009">ORD00000000</div>
            <div class="cus0000000019">CUS00000000</div>
            <div class="yyyy-mm-dd-hhmmss8">YYYY-MM-DD hh:mm:ss</div>
            <div class="confirmed8">Confirmed</div>
            <div class="rectangle-parent38">
                <div class="group-child36"></div>
                <button class="details12">Details</button>
            </div>
        </div>
        <div class="parent19">
            <div class="div31">1</div>
            <div class="ord0000000010">ORD00000000</div>
            <div class="cus0000000020">CUS00000000</div>
            <div class="yyyy-mm-dd-hhmmss9">YYYY-MM-DD hh:mm:ss</div>
            <div class="confirmed9">Confirmed</div>
            <div class="rectangle-parent39">
                <div class="group-child37"></div>
                <button class="details12">Details</button>
            </div>
        </div>
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