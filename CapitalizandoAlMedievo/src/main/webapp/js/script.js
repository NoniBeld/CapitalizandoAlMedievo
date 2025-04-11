/**
 * 
 */

console.log("Pagina Cargada correctamente.");

document.addEventListener("DOMContentLoaded", () => {
    console.log("Página cargada correctamente.");

    const title = document.querySelector("h1");

    setInterval(() => {
        title.style.color = title.style.color === "red" ? "black" : "red";
    }, 1000);
});