from random import shuffle
lista = [str(nomes) for nomes in input('Escreva os nomes seguidos por espaço : ').split()]
print('Lista Organizada pela entrada : {}'.format(lista))
lista.sort()
print('Lista Alfabetica : {}'.format(lista))
shuffle(lista)
print('Lista Aleatória : {}'.format(lista))
print('Aluno escolhido para apagar o quadro : {}'.format(lista.pop()))
