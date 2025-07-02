import requests

url = "http://52.24.3.242:3000/gemini/generate"
data = {"prompt": "Prime number cpp code only without any comments give only code in respone dont give any words about describing it in response"}

response = requests.post(url, json=data)
print(response.json())