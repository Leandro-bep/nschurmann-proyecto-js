/* =========================
   ACORDEONES
========================= */
document.addEventListener('click', function (e) {

  const header = e.target.closest('.filter-header');
  if (header) {
    const accordion = header.closest('.filter-accordion');

    document.querySelectorAll('.filter-accordion').forEach(other => {
      if (other !== accordion) {
        other.classList.remove('open');
      }
    });

    accordion.classList.toggle('open');
    return;
  }

  const option = e.target.closest('.filter-option');
  if (option) {
    const accordion = option.closest('.filter-accordion');
    accordion.classList.remove('open');
  }

});

/* =========================
   FILTROS + UI
========================= */
const filterOptions = document.querySelectorAll(".filter-option");
const cards = document.querySelectorAll(".story-card");
const resultsCount = document.getElementById("resultsCount");
const activeFiltersContainer = document.getElementById("activeFilters");

let activeFilters = JSON.parse(localStorage.getItem("activeFilters")) || {};

/* Restaurar estado activo */
filterOptions.forEach(option => {
  const type = option.dataset.type;
  const value = option.dataset.value;

  if (activeFilters[type] === value) {
    option.classList.add("active");
  }

  option.addEventListener("click", () => {

    if (option.classList.contains("active")) {
      option.classList.remove("active");
      delete activeFilters[type];
    } else {
      document
        .querySelectorAll(`.filter-option[data-type="${type}"]`)
        .forEach(btn => btn.classList.remove("active"));

      option.classList.add("active");
      activeFilters[type] = value;
    }

    saveFilters();
    applyFilters();
  });
});

/* =========================
   APLICAR FILTROS
========================= */
function applyFilters() {
  let visibleCount = 0;

  cards.forEach(card => {
    let visible = true;

    for (const type in activeFilters) {
      if (card.dataset[type] !== activeFilters[type]) {
        visible = false;
      }
    }

    if (visible) {
      card.classList.remove("hidden");
      card.style.display = "block";
      visibleCount++;
    } else {
      card.classList.add("hidden");
      setTimeout(() => {
        card.style.display = "none";
      }, 250);
    }
  });

  updateResultsText(visibleCount);
  renderActiveFilters();
}

/* =========================
   TEXTO RESULTADOS
========================= */
function updateResultsText(count) {
  resultsCount.textContent =
    count === cards.length
      ? "Mostrando todas las historias"
      : `${count} historias encontradas`;
}

/* =========================
   CHIPS ACTIVOS
========================= */
function renderActiveFilters() {
  activeFiltersContainer.innerHTML = "";

  for (const type in activeFilters) {
    const chip = document.createElement("div");
    chip.className = "filter-chip";
    chip.textContent = `${type}: ${activeFilters[type]}`;

    chip.addEventListener("click", () => {
      delete activeFilters[type];

      document
        .querySelectorAll(`.filter-option[data-type="${type}"]`)
        .forEach(btn => btn.classList.remove("active"));

      saveFilters();
      applyFilters();
    });

    activeFiltersContainer.appendChild(chip);
  }
}

/* =========================
   STORAGE
========================= */
function saveFilters() {
  localStorage.setItem("activeFilters", JSON.stringify(activeFilters));
}

/* INIT */
applyFilters();

const clearBtn = document.getElementById("clearFilters");

clearBtn.addEventListener("click", () => {
  activeFilters = {};

  // quitar estado activo visual
  filterOptions.forEach(btn => btn.classList.remove("active"));

  // limpiar storage
  localStorage.removeItem("activeFilters");

  applyFilters();
});


card.classList.remove("show");

if (visible) {
  card.style.display = "block";
  requestAnimationFrame(() => card.classList.add("show"));
} else {
  card.style.display = "none";
}


