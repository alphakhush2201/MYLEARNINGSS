import mysql.connector as bkl
mycon = bkl.connect(host ="localhost",user ="root",password="Khush@2201",database="Khushwant")
if mycon.is_connected():
    print("connect ho gya h !")
else:
    print("error aa rha h bhai! ")
cursor = mycon.cursor()
cursor.execute("create table testingpythoninterface(name varchar(10))")
cursor.execute("insert into testingpythoninterface values('khushwant')")
mycon.commit()
cursor.execute("select * from testingpythoninterface")
data = cursor.fetchall()
for row in data:
    print(row)
cursor.close()
mycon.close()