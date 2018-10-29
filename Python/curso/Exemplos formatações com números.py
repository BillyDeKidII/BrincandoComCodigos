num1 = int(input('Digite primeiro valor '))
num2 = int(input('Digite segundo valor '))
soma = num1 + num2
multi = num1 * num2
divi = num1 / num2
diviInt = num1 // num2
potencia = num1 ** num2
print('A some vale {},\n o produto vale {} e a \n divisão vale {}'.format(soma, multi, divi), end='')
print('\n Temos também a divisão inteira {}, e a \n porência {}'.format(diviInt, potencia), end='')
print(' Exemplo de divisão com 3 casas decimais {:.3f}'.format(divi))
