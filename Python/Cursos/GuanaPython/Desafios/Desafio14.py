temperatura = float(input('Qual é a temperatura em ºC: '))
fahrenheit = (temperatura * (9/5)) + 32
kelvin = temperatura + 273.15
print('a temperatura em {}ºC é {}ºF'.format(temperatura, fahrenheit))
print('a temperatura em {}ºC é {}ºK'.format(temperatura, kelvin))
