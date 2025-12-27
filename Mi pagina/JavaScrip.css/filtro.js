
document.querySelectorAll(".filter-header").forEach(header => {
    header.addEventListener("click", () => {
      header.parentElement.classList.toggle("open");
    });
  });
