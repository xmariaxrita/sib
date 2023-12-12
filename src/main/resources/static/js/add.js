const inputs = [
  {
    id: "imgCapa",
    txt: '<i class="fas fa-plus"></i><br> Adicione uma<br> imagem de capa',
  },
  {
    id: "estadoCapa",
    txt: '<i class="fas fa-plus"></i><br> Adicione uma foto <br>da capa do livro',
  },
  {
    id: "estadoContracapa",
    txt: '<i class="fas fa-plus"></i><br> Adicione uma foto da <br>contracapa do livro',
  },
  {
    id: "estadoLombada",
    txt: '<i class="fas fa-plus"></i><br> Adicione uma foto <br>da lombada do livro',
  },
  {
    id: "estadoMiolo",
    txt: '<i class="fas fa-plus"></i><br> Adicione uma foto <br>do miolo do livro',
  },
];

inputs.forEach(({ id, txt }) => {
  const inputFile = document.querySelector(`#${id}`);
  const pictureImage = document.querySelector(`.${id}`);

  pictureImage.innerHTML = txt;

  inputFile.addEventListener("change", function (e) {
    const inputTarget = e.target;
    const file = inputTarget.files[0];

    if (file) {
      const reader = new FileReader();

      reader.addEventListener("load", function (e) {
        const readerTarget = e.target;

        const img = document.createElement("img");
        img.src = readerTarget.result;
        img.classList.add(id);

        pictureImage.innerHTML = "";
        pictureImage.appendChild(img);
      });

      reader.readAsDataURL(file);
    } else {
      pictureImage.innerHTML = txt;
    }
  });
});
