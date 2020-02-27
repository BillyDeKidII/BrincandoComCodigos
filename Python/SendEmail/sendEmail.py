from email.message import EmailMessage
import smtplib

EMAIL = "contaclashofclansii@gmail.com"
PASSWORD = "53248657"

msg = EmailMessage()

msg['Subject'] = 'Email usando python irmão'
msg['From'] = EMAIL
msg['To'] = ['thiaroll@gmail.com']

message = "Entra no meu github tem um codigo para mandar email com python"
msg.set_content(message)

attachments = ['C:\\Users\\defaultuser0\\Links\\dorime.jpg']

for path in attachments:
    with open(path, 'rb') as file:
        data = file.read()
        name = path.split("\\")[-1]

    msg.add_attachment(data, maintype='application',
                       subtype='octet-stream',
                       filename=name)
with smtplib.SMTP_SSL('smtp.gmail.com', 465) as smtp:
    smtp.login(EMAIL, PASSWORD)
    smtp.send_message(msg)