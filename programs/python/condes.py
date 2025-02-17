class condes:
    def __init__(self):
        self.strl = "king"
        print("srk",self.strl)
    def __del__(self):
        print("destructor deleted manually")
ob = condes()
del ob
