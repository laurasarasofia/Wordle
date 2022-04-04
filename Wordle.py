import json

def lueTiedosto():
    f = open('sanat.json')
    data = json.load(f)
    for i in data['sanat']:
        print(i)