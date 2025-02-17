 interface a {
    void show();
 } 
 interface b {
    void disp();
 }
 class multipleinheritance implements a,b {
    public void show(){
        System.out.println("interface a !");
    }
   public void disp(){
    System.out.println("interface b !");
   }
   public static void main(String[] args) {
    multipleinheritance m = new multipleinheritance();
    m.show();
    m.disp();
   }
}
