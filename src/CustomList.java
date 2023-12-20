import java.util.Arrays;

public class CustomList {
    int[] list;

    public CustomList(int[] array) {
        this.list = array;
    }

    public CustomList() {
        this.list = new int[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(this.list);
    }

    public int indexOf(int number) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int number) {
        for (int i = list.length - 1; i >= 0; i--) {
            if (this.list[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public int get(int index, int number) {
        if (index >= 0 && index < this.list.length) {
            return this.list[index];
        } else {
            return number;
        }
    }

    public int get(int index) {
        return get(index, 0);
    }


    public void add(int number) {
        int[] newList = new int[this.list.length + 1];
        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }
        newList[newList.length - 1] = number;
        this.list = newList;
    }

    public int getMax() {
        int max = this.list[0];
        for (int number : this.list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }


    public int pop() {
        int[] newArray = new int[this.list.length - 1];
        int lastelem = this.list[this.list.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = this.list[i];
        }
        this.list = newArray;
        return lastelem;

    }

    private void coppyArray(int[] unit, int[] result) {
        int[] shorter = (unit.length > result.length) ? result : unit;
        int[] longer = (unit.length < result.length) ? result : unit;

        for (int i = 0; i < shorter.length; i++) {
            result[i] = unit[i];
        }
    }

    public void remove(int number) {
        int index = -1;
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == number) {
                shiftByIndex(i);
                pop();
                return;
            }
        }
    }

    public void shiftByIndex(int index) {
        for (int i = index; i < this.list.length - 1; i++) {
            this.list[i] = this.list[i + 1];

        }

    }

    public void removeRight(int number) {
        for (int i = this.list.length - 1; i >= 0; i--) {
            if (this.list[i] == number) {
                shiftByIndex(i);
                pop();
                return;
            }
        }
    }

    public void removeAll(int number) {
        for (int i = 0; i < this.list.length - 1; i++) {
            if (this.list[i] == number) {
                shiftByIndex(i);
                pop();
            }
        }
    }

    public void RemoveByIndex(int index) {
        if (index < 0 || index >= this.list.length) {
            System.out.println("ВЫ указали неверный индекс");
        } else {
            shiftByIndex(index);
            pop();
        }
    }

    public void RemoveAllByIndex(int index) {
        if (index < 0 || index >= this.list.length) {
            int target = this.list[index];
            removeAll(target);
        } else {
            System.out.println("ВЫ указали неверный индекс");
        }
    }

    public void reverse() {
        int i = 0;
        while (i < this.list.length - 1 - i) {


            int change = this.list[i];
            this.list[i] = this.list[this.list.length - 1 - i];
            this.list[this.list.length - 1 - i] = change;

            i++;
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < this.list.length - 1 - i; j++) {
                if (this.list[j] > this.list[j + 1]) {
                    int change = this.list[j];
                    this.list[j] = this.list[j + 1];
                    this.list[j + 1] = change;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < this.list.length; i++) {
            int max = this.list[0];
            int maxIndex = 0;
            for (int j = 0; j < this.list.length - i; j++) {
                if (this.list[j] > max) {
                    max = this.list[j];
                    maxIndex = j;
                }
            }
            int Index1 = this.list.length - i - 1;
            int change = this.list[Index1];
            this.list[Index1] = max;
            this.list[maxIndex] = change;

            swap(maxIndex, this.list.length - i - 1);
        }
        System.out.println();
    }


    public void swap(int number, int index) {
        if (number >= 0 && number < this.list.length && index >= 0 && index < this.list.length) {
            int temp = this.list[number];
            this.list[number] = this.list[index];
            this.list[index] = temp;
        } else {
            System.out.println(" ");
        }
    }

    public boolean bubbleSort(boolean desc) {
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < this.list.length - 1 - i; j++) {
                boolean Sw = desc ? this.list[j] < this.list[j + 1] : this.list[j] > this.list[j + 1];

                if (Sw) {
                    swap(j, j + 1);
                }
            }
        }
        return desc;
    }
}
















