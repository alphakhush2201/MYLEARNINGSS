from tkinter import *
r = Tk()
r.title('Check button demo')
var1 = IntVar()
Checkbutton(r,text='male',variable=var1).grid(row=0,sticky=W)
var2 = IntVar()
Checkbutton(r,text='female',variable =var2).grid(row=2,sticky=W)
mainloop()