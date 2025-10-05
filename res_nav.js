<script>
    // ====== JAVASCRIPT TO TOGGLE MENU VISIBILITY ======

    // Select the hamburger icon element
    const hamburger = document.getElementById("hamburger");

    // Select the navigation links container (the <ul>)
    const navLinks = document.getElementById("nav-links");

    // Add a click event listener to the hamburger icon
    hamburger.addEventListener("click", () => {
        // Toggle the "show" class on the navigation links
        // This adds/removes the "show" class to display or hide links
        navLinks.classList.toggle("show");
    });
</script>
