var obj = 
{ 
    nome: "Jon", 
    sobrenome: "Snow", 
    idade: 16,
    apresentar: apresentacao
};

function apresentacao()
{
    console.log("Olá, eu sou " + this.nome + ' ' + this.sobrenome + '.');
}

console.log(obj.nome);
console.log(obj.sobrenome);
console.log(obj.idade);
obj.apresentar();