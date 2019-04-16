import cv2
import numpy as np


def filtroRGB(src, r, g, b):
    if r == 0:
        src[:, :, 2] = 0  # elimina o vermelho
    if g == 0:
        src[:, :, 1] = 0  # elimina o verde
    if b == 0:
        src[:, :, 0] = 0  # elimina o azul


def show_image():
    cam = cv2.VideoCapture(0)

    filtro = 1

    while True:
        ret_val, img = cam.read()

        if filtro == 1:
            cv2.imshow('Estudo OpenCV- Filtro', img)

        if filtro == 2:
            gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
            cv2.imshow('Estudo OpenCV- Filtro', gray)

        if filtro == 3:  # vermelho e verde
            filtroRGB(img, 1, 1, 0)
            vermelhoverde_inferior = np.array([0, 127, 127])
            vermelhoverde_superior = np.array([255, 255, 255])
            mascara = cv2.inRange(img, vermelhoverde_inferior, vermelhoverde_superior)
            res = cv2.bitwise_and(img, img, mask=mascara)

            cv2.imshow('Estudo OpenCV- Filtro', res)

        if filtro == 4:  # vermelho e azul
            filtroRGB(img, 1, 0, 1)
            vermelhoazul_inferior = np.array([127, 0, 127])
            vermelhoazul_superior = np.array([255, 255, 255])
            mascara = cv2.inRange(img, vermelhoazul_inferior, vermelhoazul_superior)
            res = cv2.bitwise_and(img, img, mask=mascara)
            cv2.imshow('Estudo OpenCV- Filtro', res)

        if filtro == 5:  # verde e azul
            filtroRGB(img, 0, 1, 1)
            verdeazul_inferior = np.array([127, 127, 0])
            verdeazul_superior = np.array([255, 255, 255])
            mascara = cv2.inRange(img, verdeazul_inferior, verdeazul_superior)
            res = cv2.bitwise_and(img, img, mask=mascara)

            cv2.imshow('Estudo OpenCV- Filtro', res)

        if filtro == 6:  # vermelho
            filtroRGB(img, 1, 0, 0)
            vermelho_inferior = np.array([0, 0, 127])
            vermelho_superior = np.array([255, 255, 255])
            mascara = cv2.inRange(img, vermelho_inferior, vermelho_superior)
            res = cv2.bitwise_and(img, img, mask=mascara)
            cv2.imshow('Estudo OpenCV- Filtro', res)

        if filtro == 7:  # verde
            filtroRGB(img, 0, 1, 0)
            verde_inferior = np.array([0, 127, 0])
            verde_superior = np.array([255, 255, 255])
            mascara = cv2.inRange(img, verde_inferior, verde_superior)
            res = cv2.bitwise_and(img, img, mask=mascara)

            cv2.imshow('Estudo OpenCV- Filtro', res)

        if filtro == 8:  # azul
            filtroRGB(img, 0, 0, 1)
            azul_inferior = np.array([127, 0, 0])
            azul_superior = np.array([255, 255, 255])
            mascara = cv2.inRange(img, azul_inferior, azul_superior)
            res = cv2.bitwise_and(img, img, mask=mascara)

            cv2.imshow('Estudo OpenCV- Filtro', res)

        ret = cv2.waitKey(1)

        if ret == 27:
            break

        elif ret == -1:
            continue

        elif ret == 49:
            filtro = 1

        elif ret == 50:
            filtro = 2


        elif ret == 51:
            filtro = 3

        elif ret == 52:
            filtro = 4

        elif ret == 53:
            filtro = 5


        elif ret == 54:
            filtro = 6

        elif ret == 55:
            filtro = 7

        elif ret == 56:
            filtro = 8

    cam.release()
    cv2.destroyAllWindows()


def main():
    show_image()
    return 0


if __name__ == '__main__':
    main()
