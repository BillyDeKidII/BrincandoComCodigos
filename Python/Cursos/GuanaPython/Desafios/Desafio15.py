trajeto = float(input('Quantos kilometros foram andados? '))
alugado = int(input('Quantos dias foram alugados? '))
custoTrajeto = float(trajeto * 60)
custoAluguel = float(alugado * 0.15)
custoTotal = float(custoTrajeto + custoAluguel)
print('Foram usados {} dias e percorridos {}km, custando ao total de R${:.2f}'.format(alugado, trajeto, custoTotal))