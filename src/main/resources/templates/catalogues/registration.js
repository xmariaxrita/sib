// Pega o elemento do input
const input = document.getElementById('imgCapa');

// Adiciona um evento de change
input.addEventListener('change', function (e) {
    // Pega o arquivo carregado
    const file = e.target.files[0];

    // Verifica se o arquivo é uma imagem
    if (!file.type.match('image.*')) return;

    // Cria um URL temporário para acessar a imagem
    const imgURL = URL.createObjectURL(file);

    // Pega o elemento de visualização de imagem
    const imagePreview = document.getElementById('imagePreview');

    // Define a URL da imagem de visualização
    imagePreview.src = imgURL;
});