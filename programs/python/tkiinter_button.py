import tkinter as tk
m=tk.Tk()
m.title('Button demo')
button = tk.Button(m,text= 'Stop', width=25,command= m.destroy)
button.pack()
m.mainloop()
