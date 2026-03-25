
/* ================================
   CARGAR FAVORITOS GUARDADOS
================================ */
let favoritos = JSON.parse(localStorage.getItem("favoritos")) || [];


/* ================================
   BOTONES CORAZON
================================ */
document.querySelectorAll(".btn-fav").forEach(btn => {

    const card = btn.closest(".card");
    const id = card.dataset.id;

    /* marcar si ya era favorito */
    if(favoritos.includes(id)){
        btn.style.color = "red";
    }

    btn.addEventListener("click", () => {

        if(favoritos.includes(id)){
            favoritos = favoritos.filter(f => f !== id);
            btn.style.color = "white";
        }else{
            favoritos.push(id);
            btn.style.color = "red";
        }

        localStorage.setItem("favoritos", JSON.stringify(favoritos));
    });

});


/* ================================
   MOSTRAR SOLO FAVORITOS
================================ */
document.getElementById("btnMostrarFavoritos").oncl
