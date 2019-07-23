import re
import urllib.request
import sys
import sqlite3
from prettytable import PrettyTable
from urllib.request import Request, urlopen
t = PrettyTable(['Tytul', 'Rok', 'Srednia', 'Liczba glosow'])
URL1="https://www.filmweb.pl/ranking/netflix"
req = Request(URL1, headers={'User-Agent': 'Mozilla/5.0'})
web_byte = urlopen(req).read()
webpage = web_byte.decode()
pattern=re.compile(r'title=".*?"',re.DOTALL)
tytull=pattern.findall(webpage)
del tytull[:5]
del tytull[49:]

pattern_year=re.compile(r'">\(\d{4}')
rok=pattern_year.findall(webpage)

pattern_value=re.compile(r'rate__value">\d,\d{2}')
rating=pattern_value.findall(webpage)
    
pattern_count=re.compile(r'rate__count">\s\d+\s?\d*')
glosy=pattern_count.findall(webpage)

del rok[49:]
del rating[49:]
del glosy[49:]


con = sqlite3.connect('baza.db')
con.row_factory = sqlite3.Row

cur = con.cursor()

cur.execute("DROP TABLE IF EXISTS filmy;")
cur.execute("""
 CREATE TABLE IF NOT EXISTS filmy (
 tytul varchar(250) NOT NULL,
 rok INTEGER NOT NULL,
 srednia vatchar(250) NOT NULL,
 glosow INTEGER NOT NULL
 )""")


for i in range(0,49):
    tytul=re.sub('title=',"",tytull[i])
    rokk=re.sub('">\(','',rok[i])
    ratingg=re.sub('rate__value">','',rating[i])
    glosyy1=re.sub('rate__count">','',glosy[i])
    glosyy=re.sub(' ','',glosyy1)
    insert_tuple = (tytul, rokk, ratingg, glosyy)
    sql_insert_query = """ INSERT INTO `filmy`
                          (`tytul`, `rok`, `srednia`, `glosow`) VALUES (?,?,?,?)"""
    result  = cur.executemany(sql_insert_query, (insert_tuple,))
    con.commit()

def tytul_r():
    cur.execute('SELECT * FROM filmy ORDER BY tytul ASC')
    rows=cur.fetchall()
    t.clear_rows()
    for row in rows:
        t.add_row([row[0], row[1],row[2],row[3]])
    print(t)

def tytul_m():
    cur.execute('SELECT * FROM filmy ORDER BY tytul DESC')
    rows=cur.fetchall()
    t.clear_rows()
    for row in rows:
        t.add_row([row[0], row[1],row[2],row[3]])
    print(t)

def rok_r():
    cur.execute('SELECT * FROM filmy ORDER BY rok ASC')
    rows=cur.fetchall()
    t.clear_rows()
    for row in rows:
        t.add_row([row[0], row[1],row[2],row[3]])
    print(t)

def rok_m():
    cur.execute('SELECT * FROM filmy ORDER BY rok DESC')
    rows=cur.fetchall()
    t.clear_rows()
    for row in rows:
        t.add_row([row[0], row[1],row[2],row[3]])
    print(t)

def srednia_r():
    cur.execute('SELECT * FROM filmy ORDER BY srednia ASC')
    rows=cur.fetchall()
    t.clear_rows()
    for row in rows:
        t.add_row([row[0], row[1],row[2],row[3]])
    print(t)

def srednia_m():
    cur.execute('SELECT * FROM filmy ORDER BY srednia DESC')
    rows=cur.fetchall()
    t.clear_rows()
    for row in rows:
        t.add_row([row[0], row[1],row[2],row[3]])
    print(t)

def glosow_r():
    cur.execute('SELECT * FROM filmy ORDER BY glosow ASC')
    rows=cur.fetchall()
    t.clear_rows()
    for row in rows:
        t.add_row([row[0], row[1],row[2],row[3]])
    print(t)

def glosow_m():
    cur.execute('SELECT * FROM filmy ORDER BY glosow DESC')
    rows=cur.fetchall()
    t.clear_rows()
    for row in rows:
        t.add_row([row[0], row[1],row[2],row[3]])
    print(t)

while(1):
    print("----------------------------------------------------")
    print("Wpisz cyfrę, aby wybrać sposob wyswietlania tablicy:")
    print("1.Po tytule(rosnaco)\n2.Po tytule(malejaco")
    print("3.Po roku(rosnaco)\n4.Po roku(malejaco)")
    print("5.Srednia ocen(rosnaco)\n6.Srednia glosow(malejaco)")
    print("7.Liczba glosow(rosnaco)\n8.Liczba glosow(malejaco)")
    print("0.Wyjscie")
    print("----------------------------------------------------")
    wybor=input()
    if wybor == '0':
        con.close()
        sys.exit()
    elif wybor == '1':
        tytul_r()
    elif wybor == '2':
        tytul_m()
    elif wybor == '3':
        rok_r()
    elif wybor == '4':
        rok_m()
    elif wybor == '5':
        srednia_r()
    elif wybor == '6':
        srednia_m()
    elif wybor == '7':
        glosow_r()
    elif wybor == '8':
        glosow_m()
    else:
        print("\n##################################")
        print("Wprowadzono nieprawidlowa wartosc!")
        print("##################################\n")



