int altura,peso,imc;
escreva("digite sua altura");
leia altura;
escreva("digite seu peso");
leia peso;
imc = peso/ altura*altura;
if(imc<18,5){
    escreva("abaixo do peso");
}
 else{
    if(imc>18,5 ^imc<24,9){
        escreva("peso normal");
    }
    else{
        if(imc>25 ^ imc<29,9){
            escreva("sobrepeso");
        }else{
            escreva("obesidade");
            }
        }
    }
 }