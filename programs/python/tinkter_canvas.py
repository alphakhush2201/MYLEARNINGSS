from tkinter import *
r = Tk()
w = Canvas(r,width = 40,height=60)
w.pack()
canvas_height= 20
canvas_width=200
y = int(canvas_height/2)
w.create_line(0,y,canvas_width,y)
w.create_line(0,y+10,canvas_width,y+10)
mainloop()