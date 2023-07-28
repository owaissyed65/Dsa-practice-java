/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

/**
 *
 * @author
 */
public class arrayListManually {

    private int[] arr;
    private int currentIndex;

    arrayListManually(int initialState) {
        this.arr = new int[initialState];
        this.currentIndex = 0;
    }

    public void insert(int value) {
        this.arr[currentIndex] = value;
        this.currentIndex++;

    }

    public int indexOf(int num) {
        // linearSearch
        for (int i = 0; i < this.currentIndex; i++) {
            if (this.arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public void removeByIndex(int index) {

        for (int i = index; i < this.currentIndex - 1; i++) {
            this.arr[i] = this.arr[i + 1];
        }
        this.currentIndex--;
        this.arr[this.currentIndex] = 0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[ ");
        for (int i = 0; i < this.currentIndex; i++) {
            str.append(this.arr[i]).append(",");
        }
        str.append("\b").append("\b").append("]");
        return str.toString();
    }
}
