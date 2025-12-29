document.querySelectorAll('.destacada-card').forEach(card => {
    card.addEventListener('mousemove', e => {
        const rect = card.getBoundingClientRect();
        const x = ((e.clientX - rect.left) / rect.width) * 100;
        const y = ((e.clientY - rect.top) / rect.height) * 100;

        card.style.setProperty('--x', `${x}%`);
        card.style.setProperty('--y', `${y}%`);
    });

    card.addEventListener('mouseleave', () => {
        card.style.setProperty('--x', `50%`);
        card.style.setProperty('--y', `50%`);
    });
});

document.documentElement.classList.remove('no-js');

document.addEventListener("DOMContentLoaded", () => {

    const elementos = document.querySelectorAll('.scroll-reveal');

    const observer = new IntersectionObserver((entries) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                entry.target.classList.add('visible');
                observer.unobserve(entry.target);
            }
        });
    }, {
        threshold: 0.15
    });

    elementos.forEach(el => observer.observe(el));

});