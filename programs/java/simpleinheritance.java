class test{
   int roll, marks;
   String name;
   void input(){
    System.out.println("Enter roll no:, marks and name");
   }
}
class simpleinheritance extends test{
    void disp(){
        roll=1;
        name= "Khushwant";
        marks=89;
    }
   public static void main(String[] args) {
    System.out.println("this is sub class ");
    simpleinheritance r = new simpleinheritance();
    System.out.println();
    r.input();
   }
}
