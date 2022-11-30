import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arr array = new Arr();
        System.out.print("Enter the number of element in the array:");
        int num = sc.nextInt();
        System.out.print("Enter element in the array:");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) arr[i] = sc.nextInt();
        array.setArray(arr);
        boolean check = true;
        while (check) {
            System.out.println();
            Menu menu = new Menu();
            try {
                int n = sc.nextInt();
                if (n == 8) {
                    throw new Exception();
                }
                menu.option(array, n);
            } catch (Exception e) {
                check = false;
            }
        }
//        for(int tmp:array.getArray()){
//            System.out.println(tmp);
//        }
    }
}
