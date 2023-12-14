# modules that can access internet
import requests
from bs4 import BeautifulSoup


# writes lyrics from a genius song website to a text file
def write_file(url1):
    r1 = requests.get(url1)
    soup1 = BeautifulSoup(r1.content, 'html.parser')
    s = soup1.find_all('div', class_="Lyrics__Container-sc-1ynbvzw-1 kUgSbL")
    f = open("MIAMI.txt", "a")  # name of the text file changes manually for each album
    text = ""  # sets up empty string variable that lyrics will be appended to
    for txt in s:
        text += txt.get_text() + " "

    f.write(text)  # writes to the text file
    f.close()  # closes file


# sets up get request and soup object
r = requests.get("https://genius.com/albums/Pitbull/M-i-a-m-i")  # url changes manually depending on the album
soup = BeautifulSoup(r.content, 'html.parser')

# finds all of the links for the songs in the album and calls write_file()
links = soup.find_all('a', class_='u-display_block')
for link in links:
    url = link["href"]
    write_file(url)
