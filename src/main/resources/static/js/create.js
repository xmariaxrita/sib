document.getElementById("mostrarSenha").addEventListener("click", function () {
  var passwordInput = document.getElementById("txtSenha");
  var visibilidadeIcon = document.getElementById("visibilidadeIcon");

  if (passwordInput.type === "password") {
    passwordInput.type = "text";
    visibilidadeIcon.classList.remove("fa-eye");
    visibilidadeIcon.classList.add("fa-eye-slash");
  } else {
    passwordInput.type = "password";
    visibilidadeIcon.classList.remove("fa-eye-slash");
    visibilidadeIcon.classList.add("fa-eye");
  }
});

document.getElementById("mostrarSenhaC").addEventListener("click", function () {
  var passwordInput = document.getElementById("txtSenhaC");
  var visibilidadeIconC = document.getElementById("visibilidadeIconC");

  if (passwordInput.type === "password") {
    passwordInput.type = "text";
    visibilidadeIconC.classList.remove("fa-eye");
    visibilidadeIconC.classList.add("fa-eye-slash");
  } else {
    passwordInput.type = "password";
    visibilidadeIconC.classList.remove("fa-eye-slash");
    visibilidadeIconC.classList.add("fa-eye");
  }
});

function confirmarSenha() { 
  var senha = document.getElementById("txtSenha").value;
  var confirmarSenha = document.getElementById("txtSenhaC").value;
  var mensagemErro = document.getElementById("error-message");

  if (senha === confirmarSenha) {
    mensagemErro.innerHTML = "";
  } else {
    mensagemErro.innerHTML = "As senhas não correspondem. Por favor, tente novamente.";
  }
}