package Day3;

public class fseries {
    public static void main(String[] args) {
        int n =15,a=0,b=1;
        System.out.println("fibonacci series :");
        for (int i = 1; i<= n;++i){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
