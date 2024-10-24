document.addEventListener('DOMContentLoaded', () => {

    // Get all "navbar-burger" elements
    const $navbarBurgers = Array.prototype.slice.call(document.querySelectorAll('.navbar-burger'), 0);
    const $dropdown = Array.prototype.slice.call(document.querySelectorAll('.dropdown'),0);
    // Add a click event on each of them
    $dropdown.forEach(el => {
        el.addEventListener('click',()=>{
            const target = el.dataset.target;
            el.classList.toggle('is-active');
        })
    })
    $navbarBurgers.forEach( el => {
        el.addEventListener('click', () => {
        // Get the target from the "data-target" attribute
        const target = el.dataset.target;
        const $target = document.getElementById(target);
        // Toggle the "is-active" class on both the "navbar-burger" and the "navbar-menu"
        el.classList.toggle('is-active');
        $target.classList.toggle('is-active');
    });
    });
});