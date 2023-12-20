import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CustomList customList1 = new CustomList(new int[] {3,4, 8,3,1, 6, 0});


        System.out.println("Before sorting: " + Arrays.toString(customList1.list));
        customList1.selectionSort();
        System.out.println("After sorting:  " + Arrays.toString(customList1.list));


    }
}
