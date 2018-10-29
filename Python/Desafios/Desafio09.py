num = int(input('Insira o número : '))
aux = 1
print('> Tabuada do {} <'.format(num))
while aux < 11:
    tabuada = num * aux
    print('{} X {} = {}'.format(num, aux, tabuada))
    aux = aux + 1
print('> Fim da Tabuada <')
