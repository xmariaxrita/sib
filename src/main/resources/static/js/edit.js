var tel = document.getElementById('txtFone')
tel.addEventListener('change',() => {
    const telFormatA = tel.value.split('')
    telFormatA.splice(0,0,'(')
    telFormatA.splice(3,0,')')
    telFormatA.splice(9,0,'-')

    const telA = telFormatA.join('')

    document.getElementById('txtFone').value = telA
});

var cep = document.getElementById('txtCep')
cep.addEventListener('change',() => {
    const cepFormatA = cep.value.split('')
    cepFormatA.splice(5,0,'-')

    const cepA = cepFormatA.join('')

    document.getElementById('txtCep').value = cepA
});