import matplotlib.pyplot as plt

x = [1, 2, 3, 4, 5]
y = [2, 3, 7, 1, 0]
z = [100, 150, 200, 250, 300]

titulo = "Gráfico Python"
eixox = "Eixo X"
eixoy = "Eixo Y"

plt.title(titulo)
plt.xlabel(eixox)
plt.ylabel(eixoy)

# para salvar a imagem deve ser removido .show e .draw , eles fazem com que o savefig saia blank
plt.plot(x, y, color="purple", linestyle="-")
plt.scatter(x, y, label="Pontos", color="black", marker=".", s=z)
plt.legend()
#plt.show()
#plt.draw()
plt.savefig("figura1.png", dpi=300)
