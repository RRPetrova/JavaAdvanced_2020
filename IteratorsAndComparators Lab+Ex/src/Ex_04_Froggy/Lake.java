package Ex_04_Froggy;

import java.util.Iterator;

public class Lake implements Iterable<Integer> {

    private int[] nums;
    private int index;

    public Lake(int[] nums) {
        this.nums = nums;
        this.index = 0;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }


    private class Frog implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return index < nums.length;
        }

        @Override
        public Integer next() {
            int position = nums[index];
            index += 2;
            if (index >= nums.length && index % 2 == 0) {
                index = 1;
            }
            return position;
        }

    }


}



