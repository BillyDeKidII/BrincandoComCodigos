import os
import pygame
import sys


class SlidePuzzle:
    def __init__(self,gs,ts,ms):
        self.gs,self.ts,self.ms = gs,ts,ms

    def update (self,dt):
        pass

    def draw(self,screen):
        pass

def main():
    pygame.init()
    os.environ['SDL_VIDEO_CENTERED'] = '1'
    pygame.display.set_caption('Slide Puzzle')
    screen = pygame.display.set_mode((800, 600))
    fpsclock = pygame.time.Clock()
    program = SlidePuzzle((3,3),100,5)

    while True:
        dt = fpsclock.tick()/1000

        screen.fill((0, 0, 0))
        program.draw(screen)
        pygame.display.flip()

        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit();
                sys.exit()
        
        program.update(dt)

if __name__ == '__main__':
    main()
