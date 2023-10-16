package Task;

class ArrayList {
    Object arr[];
    int no_of_elem;
    int size;

    ArrayList() {
        no_of_elem = 0;
        size = 10;
        arr = new Object[size];
    }
    void add(Object item) {
        if (no_of_elem >= size) {
            newCapacity();
        }
        arr[no_of_elem++] = item;
    }

    void addAtFirst(Object item) {
        for (int i = no_of_elem; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = item;
        no_of_elem++;
    }

    void addAtLast(Object item) {
        if (no_of_elem >= size) {
            newCapacity();
        }
        arr[no_of_elem++] = item;
    }

     void addAtIndex(int index, Object item) {
        if (index < 0 || index > no_of_elem) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + no_of_elem);
        }
        newCapacity();
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
     void updateElement(int index, Object newItem) {
        if (index < 0 || index >= no_of_elem) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + no_of_elem);
        }
        arr[index] = newItem;
    }
      void appendSubArray(Object[] sub) {
        while (no_of_elem + sub.length > size) {
            newCapacity();
        }
        for (Object item : sub) {
            arr[no_of_elem++] = item;
        }
    }
    void displayElements() {
        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < no_of_elem; i++) {
            System.out.println(arr[i]);
        }
    }

    private void  newCapacity() {
        int newCapacity = size * 2;
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < no_of_elem; i++) {
            newArray[i] = arr[i];
        }
        arr = newArray;
        size = newCapacity;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(42);
        al.add("Hello");
        al.addAtLast("New Element");
        al.addAtFirst(9);
        al.addAtIndex(2,"hi");
        al.deleteElement(3);
        al.updateElement(2, 23);
        Object[] sub = {1,2,3};
        al.appendSubArray(sub);
        al.displayElements();
    }
}
