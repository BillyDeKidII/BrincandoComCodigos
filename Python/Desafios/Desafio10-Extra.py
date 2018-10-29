moeda = float(input('Quantos reais você tem ? R$'))
dolarC = 3.71
euroC = 4.27
dolar = moeda / dolarC
euro = moeda / euroC
print('Cotação do Dolar {}'.format(dolarC))
print('Cotação do Euro {}'.format(euroC))
print('Com R${:.2f} você compra US${:.2f}'.format(moeda, dolar))
print('Com R${:.2f} você compra €{:.2f}'.format(moeda, euro))
