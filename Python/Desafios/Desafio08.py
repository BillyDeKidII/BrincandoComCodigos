m = float(input('Insira um valor em metros(Apenas números): '))
km = m * 0.1
hm = m * 0.01
dam = m * 0.001
dm = m * 10
cm = m * 100
mm = m * 1000
print('Seus {} metros é {} kilometros , {} hectometros e {} decametros'.format(m, km, hm, dam))
print('Seus {} metros é {} decimetros , {:.0f} centímetros e {:.0f} milimetros'.format(m, dm, cm, mm))
