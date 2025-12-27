
document.addEventListener('click', function (e) {

  // CLICK EN HEADER
  const header = e.target.closest('.filter-header');
  if (header) {
    const accordion = header.closest('.filter-accordion');

    // cerrar otros acordeones
    document.querySelectorAll('.filter-accordion').forEach(other => {
      if (other !== accordion) {
        other.classList.remove('open');
      }
    });

    // abrir / cerrar actual
    accordion.classList.toggle('open');
    return;
  }

  // CLICK EN OPCIÓN → cerrar acordeón
  const option = e.target.closest('.filter-option');
  if (option) {
    const accordion = option.closest('.filter-accordion');
    accordion.classList.remove('open');
  }

});
  



