public class Func {
    public int[] findElement(Arr array, int n) {
        int count = 0;
        for (int tmp : array.getArray()) if (n == tmp) count++;
        int[] i = new int[count];
        count = -1;
        for (int tmp = 0; tmp < array.getArray().length; tmp++) if (n == array.getArray()[tmp]) i[++count] = tmp;
        return i;
    }

    public void deleteElement(Arr array, int n) {
//        System.out.println("in delete func");
        int[] i = findElement(array, n);
        int[] arr = new int[array.getArray().length - i.length];

        int t = 0;
//        boolean check = true;
        for (int k = 0; k < array.getArray().length; k++) {
            boolean check = true;
            for (int j : i)
                if (k == j) {
                    check = false;
                    break;
                }

            if (check) {
                arr[t++] = array.getArray()[k];
            }

        }
        array.setArray(arr);
    }

    public void insert(Arr array, int n, int index) {
        int[] tmp = new int[array.getArray().length + 1];
        for (int l = 0; l < index; l++) {
            tmp[l] = array.getArray()[l];
        }
        tmp[index] = n;
        for (int i = index; i < array.getArray().length; i++) {
            tmp[i + 1] = array.getArray()[i];
        }
        array.setArray(tmp);
    }

    public int max(Arr array) {
        int max = array.getArray()[0];
        for (int tmp : array.getArray()) {
            if (tmp > max) {
                max = tmp;
            }
        }

        return max;
    }

    public int min(Arr array) {
        int min = array.getArray()[0];
        for (int tmp : array.getArray()) {
            if (tmp < min) {
                min = tmp;
            }
        }

        return min;
    }

    public int[] findDuplicates(Arr array) {
        Arr arr = new Arr();
        arr.setArray(array.getArray());
        boolean check = true;
        int cout = 0;
        while (check) {
            int tmp = arr.getArray()[cout];
            for (int i = 0; i < arr.getArray().length; i++) {
                if (tmp == array.getArray()[i]) {
                    deleteElement(arr, tmp);
                    cout = -1;
                    break;
                }
            }
            if (cout == arr.getArray().length - 1) {
                check = false;
            } else cout++;
        }
        Arr arr2 = new Arr();
        arr2.setArray(array.getArray());
        for (int i = 1; i < arr.getArray().length; i++) {


            deleteElement(arr2, arr.getArray()[i]);
        }
        return arr2.getArray();
    }

    public void show(Arr array) {
        for (int tmp : array.getArray()
        ) {
            System.out.print(tmp + "  ");
        }
    }
}
