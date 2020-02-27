import requests
from bs4 import BeautifulSoup

url = 'https://www.bonde.com.br'

req = requests.get(url)

soup = BeautifulSoup(req.content, 'html.parser')

listNews = soup.find_all('h1', class_='ticker-titulo')

print(listNews)