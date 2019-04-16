import cv2
import numpy as np


def show_image():
    while True:
        img = cv2.imread("color.png")
        cv2.imshow('Estudo OpenCV- Filtro', img)
        ret = cv2.waitKey(1)
        if ret == 27:
            break
        elif ret == -1:
            continue


cv2.destroyAllWindows()


def main():
    show_image()
    return 0


if __name__ == '__main__':
    main()
