from tkinter import *

class Tela(Frame):
    def say_hi(self):
        print("Olá Mundo, Eu Funciono!")

    def say_bot(self):
        print("Acho que esta msg diz que você sabe programar seu primeiro botão em python!:3")

    def criandoTela(self):
        self.ENTRAR = Button(self)
        self.ENTRAR["text"] = " > Botão Criado do Zero <"
        self.ENTRAR["fg"] = "blue"
        self.ENTRAR["command"] = self.say_bot

        self.ENTRAR.pack(side="left")
        self.ENTRAR.pack(expand=2)

        self.SAIR = Button(self)
        self.SAIR["text"] = "Mata o processo !"
        self.SAIR["fg"] = "red"
        self.SAIR["command"] = self.quit

        self.SAIR.pack(side="right")
        self.SAIR.pack(expand=1)

    def __init__(self, master=None):
        Frame.__init__(self, master)
        self.pack()
        self.criandoTela()

root = Tk()
app = Tela(master=root)
app.mainloop()
root.destroy()