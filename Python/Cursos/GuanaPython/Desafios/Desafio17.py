from math import hypot
a = float(input('Valor do cateto oposto : '))
b = float(input('Valor do cateto adjacente : '))
result = int(hypot(a, b))
print('O comprimento da sua hipotenusa é {}'.format(result))
