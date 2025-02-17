class test{
    void mnumbers(){
        System.out.println("20423545345");
    }
    final void atmPIN(){
        System.out.println("1234");
    }
}
class thief extends test{
    @Override 
    void mnumbers(){
        System.out.println("9594850989");
    }
    @Override 
    void atmPIN(){
        System.out.println("1243");
    }
}
class finals{
    public static void main(String[] args) {
    thief r = new thief();
    r.mnumbers();
    r.atmPIN();
    }
}