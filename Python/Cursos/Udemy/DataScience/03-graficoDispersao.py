import matplotlib.pyplot as plt

x = [1, 2, 3, 4, 5]
y = [2, 3, 7, 1, 0]

titulo = "Gráfico Python"
eixox = "Eixo X"
eixoy = "Eixo Y"

plt.title(titulo)
plt.xlabel(eixox)
plt.ylabel(eixoy)

plt.scatter(x, y, label = "Pontos", color = "green")
plt.plot(x, y)
plt.legend()
plt.show()