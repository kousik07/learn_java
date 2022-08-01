import requests
from lxml import html
import time


url = "https://www.mygov.in/covid-19/"

r = requests.post(url)
time.sleep(2)
root = html.fromstring(r.content)
print(root.xpath("//div[@class='block-active-cases']/span/text()"))
print(root.xpath("//div[@class='iblock t_case']//span[@class='icount']/text()"))
