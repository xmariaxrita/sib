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