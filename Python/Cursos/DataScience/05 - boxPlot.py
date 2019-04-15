import matplotlib.pyplot as plt
import random as r

vetor = []

for i in range(100):
    aleatorio = r.randint(0, 50)
    vetor.append(aleatorio)

plt.boxplot(vetor)
plt.title("BoxPlot")
plt.show()
