<script>
const secao = document.querySelector("#habilidades");

const observer = new IntersectionObserver((entries) => {

    if (entries[0].isIntersecting) {

        document.querySelectorAll(".progresso").forEach(barra => {

            barra.style.animation = "none";

            void barra.offsetWidth;

            barra.style.animation = "crescerBarra 2s ease forwards";
        });

    }

}, {
    threshold: 0.3
});

observer.observe(secao);
</script>