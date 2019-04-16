def html(name):
    entrada = open("{}.fasta").read().format(name)
    saida = open("{}.html", "w").format(name)

    cont = {}
    sequencia = ['A', 'T', 'C', 'G']

    for i in sequencia:
        for j in sequencia:
            cont[i + j] = 0

    entrada = entrada.replace("\n", "")

    for k in range(len(entrada) - 1):
        cont[entrada[k] + entrada[k + 1]] += 1

    i = 1
    for k in cont:
        transparencia = cont[k] / max(cont.values())
        saida.write("<div style='white-space: pre-wrap; width:100px; border:1px solid #111; height:100px; float:left; "
                    "background-color:rgba(0, 0, 255, " + str(transparencia) + "')></div>")

        if i % 4 == 0:
            saida.write("<div style='clear:both'></div>")
        i += 1

    saida.close()


html('human')
