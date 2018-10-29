from pygame import *

mixer.init()
mixer.music.load('musica.mp3')
mixer.music.play()

while mixer.music.get_busy():
    time.Clock()
