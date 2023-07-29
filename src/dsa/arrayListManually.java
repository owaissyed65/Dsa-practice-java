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

    public int max() {
        int result = this.arr[0];
        for (int i = 1; i < this.currentIndex; i++) {
            if (this.arr[i] > result) {
                result = this.arr[i];
            }
        }
        return result;
    }

    public int min() {
        int result = this.arr[0];
        for (int i = 1; i < this.currentIndex; i++) {
            if (this.arr[i] < result) {
                result = this.arr[i];
            }
        }
        return result;
    }

//    reverse an array
    public void reverse() {
//time complexity is n/2
//and space complexity is o(1)
        for (int i = 0; i < this.currentIndex / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[this.currentIndex - i - 1];
            arr[this.currentIndex - i - 1] = temp;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[ ");
        for (int i = 0; i < this.currentIndex; i++) {
            str.append(this.arr[i]).append(",");
        }
        str.append("\b").append("]");
        return str.toString();
    }
//    getter method of currentIndex
    protected int getCurrentIndex(){
        return this.currentIndex;
    }
}
