document.addEventListener("DOMContentLoaded", () => {
  const overlay = document.getElementById("reglas-overlay");
  const cerrar = document.getElementById("cerrar-reglas");
  const checkbox = document.getElementById("no-mostrar");
  const botonHecho = document.getElementById("btn-hecho");

  // Si ya aceptó, no mostrar
  if (localStorage.getItem("reglasAceptadas") === "true") {
    overlay.style.display = "none";
  }

  // Cerrar con X (solo temporal)
  cerrar.addEventListener("click", () => {
    overlay.style.display = "none";
  });

  // Activar botón hecho
  checkbox.addEventListener("change", () => {
    botonHecho.disabled = !checkbox.checked;
  });

  // Guardar y cerrar definitivamente
  botonHecho.addEventListener("click", () => {
    if (checkbox.checked) {
      localStorage.setItem("reglasAceptadas", "true");
      overlay.style.display = "none";
    }
  });
});
