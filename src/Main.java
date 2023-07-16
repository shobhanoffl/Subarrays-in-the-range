import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("-");
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] nos = new int[c-b+1];
        for(int i=0; i<(c-b+1); i++){
            nos[i] = array[i];
            System.out.println(nos[i]);
        }

    }
}