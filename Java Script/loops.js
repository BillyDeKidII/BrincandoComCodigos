// for, for in, while, do while

var x = 0;

// verifica e faz
while(x > 1)
{
   console.log("X é igual a " + x);
   x = x + 1;
}

// faz e verifica
do
{
    console.log("X é igual a " + x);
    x = x + 1;
} 
while(x > 1);


for(var y = 0; y < 10; y = y +1)
{
    console.log(y);
}

var obj = 
{
    nome: 'Jon',
    sobrenome: 'Snow'
}

for(var prop in obj)
{
    console.log(obj[prop]);
    console.log(prop);
}