function mostrarSenha() {
var senha = document.getElementById("txtSenha");

 if (senha.type === "password") {
  senha.type = "text";
   
 } else {
    senha.type = "password";
 }
}

let button = document.querySelector('button');
let icon = document.querySelector('img');

icon.addEventListener('click', function() {
    button.classList.toggle('visible');
    if(button.classList.contains('visible')) {
        icon.src = 'svg/eye-off.svg';
    } else {
        icon.src = 'svg/eye.svg';
    }
});


function mostrarSenhaC() {
  var senhaC = document.getElementById("txtSenhaC");

  if (senhaC.type === "password") {
    senhaC.type = "text";
  } else {
    senhaC.type = "password";
  }
}

