import pygame, sys
from pygame.locals import *

# Inicialização do jogo
print('Inicialização do jogo')
pygame.init()

# Inicialização direta do jogo
print('Inicialização direta do jogo')
pygame.font.init()

# Imitando paisagem com lista
print('Imitando paisagem com lista')
screen = [1, 1, 2, 2, 2, 1]
print(screen)
screen[3] = 8
print(screen)

# Movendo o Heroi '8'
print('Movendo o Heroi "8" ')
playerpos = 3
screen[playerpos] = 8
print(screen)
playerpos = playerpos - 1
screen[playerpos] = 8
print(screen)

# Criando um mapa
print('Criando um mapa')
background = [1, 1, 2, 2, 2, 1]
screen = [0] * 6
for i in range(6):
    screen[i] = background[i]
print(screen)
playerpos = 3
screen[playerpos] = 8
print(screen)

# Movendo o Heroi '8' e apagando sua posição original
print('Movendo o Heroi "8" e apagando sua posição original')
print(screen)
screen[playerpos] = background[playerpos]
playerpos = playerpos - 1
screen[playerpos] = 8
print(screen)
screen[playerpos] = background[playerpos]
playerpos = playerpos - 1
screen[playerpos] = 8
print(screen)

# Indo da Lista para a Tela
print('Indo da Lista para a Tela')
background = [terrain1, terrain1, terrain2, terrain2, terrain2, terrain1]
screen = create_graphics_screen()
for i in range(6):
    screen.blit(background[i], (i * 10, 0))
playerpos = 3
screen.blit(playerimage, (playerpos * 10, 0))
screen.blit(background[playerpos], (playerpos * 10, 0))
playerpos = playerpos - 1
screen.blit(playerimage, (playerpos * 10, 0))

# Movimentação suave
print('Movimentação suave')
screen = create_screen()
player = load_player_image()
background = load_background_image()
screen.blit(background, (0, 0))
position = player.get_rect()
screen.blit(player, position)
pygame.display.update()
for x in range(100):
    screen.blit(background, position, position)
    position = position.move(2, 0)
    screen.blit(player, position)
    pygame.display.update()
    pygame.time.delay(100)

# Funções
print('Funções')
player = pygame.image.load('player.bmp').convert()
background = pygame.image.load('liquid.bmp').convert()

# Create_Screen
screen = pygame.display.set_mode((640, 480))

# Movendo Imagens Múltiplas
print('Movendo Imagens Múltiplas')


class GameObject:
    def __init__(self, image, height, speed):
        self.speed = speed
        self.image = image
        self.pos = image.get_rect.move(0, height)

    def move(self):
        self.pos = self.pos.move(0, self.speed)
        if self.pos.right > 600:
            self.pos.left = 0


# Main
screen = pygame.display.set_mode((640, 480))
player = pygame.image.load('player.bmp').convert()
background = pygame.image.load('background.bmp').convert()
screen.blit(background, (0, 0))
objects = []
for x in range(10):
    o = GameObject(player, x*40, x)
    objects.append(o)
while 1:
    for event in pygame.event.get():
        if event.type in (QUIT, KEYDOWN):
            sys.exit()
    for o in objects:
        screen.blit(background, o.pos, o.pos)
    for o in objects:
        o.move()
        screen.blit(o.image, o.pos)
    pygame.display.update()
    pygame.time.delay(100)


# Manipulando Entrada
print('Manipulando Entrada')
while 1:
    for event in pygame.event.get():
        if event.type in (QUIT, KEYDOWN):
            sys.exit()
    move_and_draw_all_game_objects()
