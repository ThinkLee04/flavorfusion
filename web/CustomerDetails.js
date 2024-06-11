document.addEventListener("DOMContentLoaded", function () {
    var includes = document.querySelectorAll('[data-include]');
    includes.forEach(function (include) {
        var file = include.getAttribute('data-include');
        fetch(file)
            .then(response => response.text())
            .then(data => {
                include.innerHTML = data;
            })
            .catch(err => console.error('Error loading file:', err));
    });
});
document.getElementById('openModalButton').addEventListener('click', function () {
    var modalBody = document.querySelector('#addCustomerModal .modal-body');
    fetch('AddAddress.html')
        .then(response => response.text())
        .then(data => {
            modalBody.innerHTML = data;
            var addCustomerModal = new bootstrap.Modal(document.getElementById('addCustomerModal'));
            addCustomerModal.show();
        })
        .catch(error => console.error('Error loading the modal content:', error));
});
