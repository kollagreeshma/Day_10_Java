class cons{
    int c;
    String b;
    cons(){
        this.c=345;
        this.b="Hello greeshu";
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
public static void main(String args[]){
    cons c=new cons();
    c.display();
}
}