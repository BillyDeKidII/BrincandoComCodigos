preco = float(input('Valor do produto : R$'))
valorDesconto = 5
desconto = ((preco * valorDesconto) / 100)
novoPreco = preco - desconto
print('Seu produto de R${:.2f} com {}% de desconto sai por R${:.2f}'.format(preco, valorDesconto, novoPreco))
