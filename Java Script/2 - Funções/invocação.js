function dizerOi(nome)
{
    console.log("Oi, " + nome);
    console.log(this);
}

dizerOi("Billy");

dizerOi.call({},"Arya");

dizerOi.apply({}, ["Anthem"]);