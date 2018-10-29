salario = float(input('Digite seu Salário : R$'))
valorAumento = 15
aumento = ((salario * valorAumento) / 100)
novoSalario = salario + aumento
print('Seu salário era R${:.2f} teve um aumento de {}%, então seu novo salário é R${:.2f}'.format(salario, valorAumento, novoSalario))
