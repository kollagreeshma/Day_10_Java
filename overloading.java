class overloading{
    static void a()
    {
        System.out.println("hii");
    }
    static void a(int b)
    {
        System.out.println("hii"+b);
    }
    static void a(int b,int c)
    {
        System.out.println("hii"+b+" "+c+" ");
    }
    public static void main(String args[]){
        a();
        a(9);
        a(9,4);
    }
}