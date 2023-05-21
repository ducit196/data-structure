package org.zac.array;

public class DynamicArray <String>{

    private int size;
    private int initialCapacity;
    private Object[] data;

    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    public String get(int index) {
        return (String) data[index];
    }

    public void set(int index, String value) {
        data[index] = value;
    }

    public void add(String value) {
        if(this.size == this.initialCapacity) {
            reSize();
        }
        data[this.size] = value;
        this.size++;
    }

    public void insert(int index, String value) {
        //check capacity
        if (size == initialCapacity) {
            reSize();
        }
        //copy up the data
        for (int j = size; j > index; j--) {
            data[j] = data[j - 1];
        }
        //set data to array
        data[index] = value;
    }

    public void reSize() {
        //initial a double capacity array
        Object[] newArray = new Object[initialCapacity*2];

        //copy all element to new array
        for (int i = 0; i < this.size; i++) {
            newArray[i] = data[i];
        }
        data = newArray;
        this.initialCapacity = this.initialCapacity*2;
    }

    public void delete(int index) {
        //copy down data
        for (int i = index; i < this.size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[this.size - 1] = null;
        this.size--;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean contains(String value) {
        for (int i = 0; i < this.size; i++) {
            if(data[i] == value) {
               return true;
            }
        }
        return false;
    }

    public int size() {
        return this.size;
    }
}
