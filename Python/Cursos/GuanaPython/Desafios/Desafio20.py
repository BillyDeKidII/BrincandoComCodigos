from random import shuffle
lista = [str(nome) for nome in input('Coloque nome dos 4 alunos, seguidos de espaços : ' ).split()]
shuffle(lista)
print('A ordem de apresentação é  : {}'.format(lista))
