dinheiro = float(input('Quantos reais você tem na sua carteira? : R$'))
dolar = 3.27
compra = dinheiro / dolar
print('Com este R${:.2f} você compra US${:.2f}'.format(dinheiro, compra))
