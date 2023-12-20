import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CustomList customList1 = new CustomList(new int[] {3,4, 8,3,1, 6, 0});


        System.out.println(customList1);
        customList1.bubbleSort();
        System.out.println(customList1);


    }
}
