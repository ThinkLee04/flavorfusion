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
