import datetime
today = datetime.datetime.now()
date_format = "%A %B %c %H:%M:%S IST %Y"
print(today.strftime(date_format))