package Patika.metot;

public class fibonacci {
    static int fibo(int n){
        if (n == 1||n==2) {
            return 1;
        }
        return fibo((n-1))+fibo((n-2));
    }
    public static void main(String[] args) {
        //1 1 2 3 5 8 13
        //  f(1)=1 f(2)=1
        // f(n)=f(n-1)+f(n-2)
        // n. fibonacci elemanını bulan recursive metod
        System.out.println(fibo(10));

    }
}
