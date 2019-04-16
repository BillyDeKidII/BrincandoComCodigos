import cv2  # disponibiza as funções do opencv
import numpy as np


def show_image():
    filtro = 1
    while True:
        img = cv2.imread("color.png")
        if filtro == 1:
            cv2.imshow('Estudo OpenCV- Filtro', img)
        if filtro == 2:
            gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
            cv2.imshow('Estudo OpenCV- Filtro', gray)
        ret = cv2.waitKey(1)
        if ret == 27:
            break
        elif ret == -1:
            continue
        elif ret == 49:
            filtro = 1
        elif ret == 50:
            filtro = 2


cv2.destroyAllWindows()


def main():
    show_image()
    return 0


if __name__ == '__main__':
    main()