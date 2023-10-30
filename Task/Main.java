package Task;

class ArrayList<E> {
    E arr[];
    int no_of_elem;
    int size;

    ArrayList() {
        no_of_elem = 0;
        size = 10;
        arr = (E[]) new Object[size];
    }

    void add(E item) {
        if (no_of_elem >= size) {
            newCapacity();
        }
        arr[no_of_elem++] = item;
    }

    void addAtFirst(E item) {
        for (int i = no_of_elem; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = item;
        no_of_elem++;
    }

    void addAtLast(E item) {
        if (no_of_elem >= size) {
            newCapacity();
        }
        arr[no_of_elem++] = item;
    }

    void addAtIndex(int index, E item) {
        if (index < 0 || index > no_of_elem) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + no_of_elem);
        }
        if (no_of_elem >= size) {
            newCapacity();
        }
        for (int i = no_of_elem; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = item;
        no_of_elem++;
    }

    void deleteElement(int index) {
        if (index < 0 || index >= no_of_elem) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + no_of_elem);
        }
        for (int i = index; i < no_of_elem - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--no_of_elem] = null;
    }

    void updateElement(int index, E newItem) {
        if (index < 0 || index >= no_of_elem) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + no_of_elem);
        }
        arr[index] = newItem;
    }

    void appendSubArray(E[] sub) {
        while (no_of_elem + sub.length > size) {
            newCapacity();
        }
        for (E item : sub) {
            arr[no_of_elem++] = item;
        }
    }

    void displayElements() {
        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < no_of_elem; i++) {
            System.out.println(arr[i]);
        }
    }

    void size() {
        System.out.println("Array size is " + size + " No of elem " + no_of_elem);
    }

    private void newCapacity() {
        int newCapacity = size * 2;
        E[] newArray = (E[]) new Object[newCapacity];
        for (int i = 0; i < no_of_elem; i++) {
            newArray[i] = arr[i];
        }
        arr = newArray;
        size = newCapacity;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(3);
        al.addAtFirst(1);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        Integer[] sub = {8, 9, 10};
        al.appendSubArray(sub);
        al.displayElements();
        al.size();
        al.addAtIndex(4, 11);
        al.displayElements();
        al.size();
        al.addAtIndex(7, 12);
        al.displayElements();
        al.size();

        ArrayList<String> as = new ArrayList<>();
        as.add("one");
        as.add("two");
        as.add("three");
        as.displayElements();

    }
}
