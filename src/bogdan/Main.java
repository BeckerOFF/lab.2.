
public class Main {
    public static void task1(){
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.print("result = "+ result);
    }

    public static void task2(){
        byte b = 42;
        int k = (int)(0.5+b);
        System.out.print("\nk = "+ k);
        int w=258;
        byte g=(byte)w;
        System.out.print("\nk = "+ k);
    }

    public static void task3(){
        int b = 5;
        int c = 7;
        int d = 9;
        int a = (b++) + (c++) + (++d);
        System.out.print("\na = "+ a);
    }

    public static void task4(){
        float z=1f / 0f;
        System.out.print("\nz = "+ z);
        double q=-1d / 0d;
        System.out.print("\nq = "+ q);
    }

    public static void task5(){
        double t= 0.0/0.0;
        System.out.print("\nt = "+ t);
    }

    public static void task6(){
        double х = 4;
        double у = 12;
        double v= Math.pow (х , 2) + Math.pow (у , 2);
        double r= Math.sqrt (v);
        System.out.print("\nr = "+ r);
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
}
