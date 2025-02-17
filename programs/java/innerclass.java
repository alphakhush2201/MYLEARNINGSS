class outer_demo{
private class inner_demo{
    public void print(){
        System.out.println("This is an inner class");
    }
}
void display_inner(){
    inner_demo inclass = new inner_demo();
    inclass.print();
}
}
public class innerclass{
    public static void main(String[] args) {
        outer_demo outclass = new outer_demo();
        outclass.display_inner();
    }
}
