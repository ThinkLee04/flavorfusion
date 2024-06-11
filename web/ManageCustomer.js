// Lấy ngày hiện tại
const today = new Date();
// Định dạng ngày thành MM/DD/YYYY
const formattedDate = (today.getMonth() + 1).toString().padStart(2, '0') + '/' +
    today.getDate().toString().padStart(2, '0') + '/' +
    today.getFullYear();

// Chèn ngày vào trong thẻ div
document.querySelector('.joining-date-mmddyyyy').textContent = `Ordering Date (${formattedDate})`;

const myModal = document.getElementById('myModal')
const myInput = document.getElementById('myInput')



document.getElementById('openModalButton').addEventListener('click', function () {
    var modalBody = document.querySelector('#addCustomerModal .modal-body');
    fetch('AddCustomer.html')
        .then(response => response.text())
        .then(data => {
            modalBody.innerHTML = data;
            var addCustomerModal = new bootstrap.Modal(document.getElementById('addCustomerModal'));
            addCustomerModal.show();
        })
        .catch(error => console.error('Error loading the modal content:', error));
});

