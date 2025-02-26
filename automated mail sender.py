import random
import smtplib //simple mail transfer protocol
import datetime as dt

my_email = "your sender email"
password = "your sender password"
receiver = "your receiver email"
with open("quotes.txt", encoding="utf8") as file:
    content = file.readlines()
    quote = random.choice(content)
    print(quote)
my_date = dt.datetime(year=2024,month=12,day=28,hour=7,minute=43,second=00)
current_date = dt.datetime.now()
print(f"My date: {my_date}")
print(f"Current date: {current_date}")

while my_date == current_date:
    connection = smtplib.SMTP("smtp.gmail.com", port=587)
    connection.starttls()
    connection.login(user=my_email, password=password)
    connection.sendmail(from_addr=my_email, to_addrs=receiver, msg="Subject: Demo\n\n Check")
    connection.close() //to freeup some resources


