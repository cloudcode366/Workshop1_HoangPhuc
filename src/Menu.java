import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    public Menu() {

        System.out.println("1.Find the index of an array element.");
        System.out.println("2.Remove a specific element from an array.");
        System.out.println("3.Insert an element (specific position) into an array.");
        System.out.println("4.Find the maximum value of an array.");
        System.out.println("5.Find the minimum value of an array.");
        System.out.println("6.Find the duplicate values of an array of integer values.");
        System.out.println("7.Show array");
        System.out.println("8.Exit");
    }

    public void option(Arr array, int i) throws Exception {
        int n;
        switch (i) {
            case 1 -> {
                System.out.print("Enter element(only integer):");
                n = sc.nextInt();
                int[] arr = new Func().findElement(array, n);
                System.out.print("Your element you enter appears in some index here:");
                for (int tmp : arr) System.out.print(tmp + "  ");
            }
            case 2 -> {
                System.out.print("Enter element you want to delete:");
                n = sc.nextInt();
                new Func().deleteElement(array, n);
            }
            case 3 -> {
                System.out.print("Enter element you wat to insert:");
                n = sc.nextInt();
                System.out.print("Enter index you want to insert:");
                int index = sc.nextInt();
                new Func().insert(array, n, index);
            }
            case 4 -> System.out.print("The maximum value of array is:" + new Func().max(array));
            case 5 -> System.out.print("The minimum value of array is:" + new Func().min(array));
            case 6 -> {
                System.out.print("The duplicate values of array is:");
                for (int tmp : new Func().findDuplicates(array)
                ) {
                    System.out.print(tmp + "  ");
                }
            }
            case 7 -> new Func().show(array);
            default -> {
                System.out.println("Error option, enter again.");
                throw new Exception();
            }
        }

    }
}
