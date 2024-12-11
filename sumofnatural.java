class sum{
    int sum(int n){
        if(n==0) return 0;
        return n+sum(n-1);
    }
    public static void main(String args[]){
        sum s=new sum();
        int res=s.sum(10);
        System.out.println(res);
    }
}