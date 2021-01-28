import java.util.Arrays;
import java.util.List;

public class ProblemSet8 {

    public static void main(String[] args) {

    }

    public boolean common(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return false;
        } else {
            if ((a[a.length-1] == b[b.length-1]) || (a[0] == b[0])) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    public int[] middleman(int[] a, int[] b) {
        if(a == null || b == null || a.length%2 == 0 || b.length%2 ==0){
            return null;
        }
        return new int[]{a[a.length/2], b[b.length/2]};
    }

    public int[] bigger(int[] a, int[] b) {
        int asum = 0;
        int bsum = 0;
        if (a == null || b == null) {
            return null;
        } else {
            for (int k = 0; k < a.length; k++) {
                asum += a[k];
            }
            for (int j = 0; j < b.length; j++) {
                bsum += b[j];
            }
            if (asum >= bsum) {
                return a;
            } else {
                return b;
            }
        }

    }

    public int[] doubleMiddle(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0 || a.length % 2 != 0 || b.length % 2 != 0) {
            return null;
        } else {
            int[] answer = new int[] {a[a.length/2-1], a[a.length/2], b[b.length/2-1], b[b.length/2]};
            return answer;
        }
    }

    public int[] swapMe(int[] a) {
        if (a == null){
            return null;
        }
        int first = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = first;
        return a;
    }

    public int[] threePoint(int[] a) {
        if (a == null || a.length == 0 || a.length % 2 != 1) {
            return null;
        } else {
            int[] answer = new int[] {a[0], a[a.length/2], a[a.length-1]};
            return answer;
        }
    }

    public int headHoncho(int[] a) {
        if(a == null || a.length == 0){
            return -1;
        } else {
            int max = 0;
            for(int i : a){
                if(i < 0){
                    return -1;
                }
                max = Math.max(max, i);
            }
            return max;
        }
    }


    public boolean tippingPoint(int[] a, int threshold) {
        if (a == null) {
            return false;
        } else {
            int arraySum = 0;
            for (int j = 0; j < a.length; j++) {
                arraySum += a[j];
            }
            if (arraySum > threshold) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static String halfway(int[] a) {
        if (a == null || a.length == 0 || a.length % 2 != 0) {
            return null;
        }
        int leftSum = 0;
        int rightSum = 0;
        for (int j = 0; j < a.length/2; j++) {
            leftSum += a[j];
        }
        for (int k = (a.length/2); k < a.length; k++) {
            rightSum += a[k];
        }
        if (leftSum > rightSum) {
            return "LEFT";
        } else {
            return "RIGHT";
        }
    }

    public int[] sequential(int[] a, int[] b) {
        if (a == null || b == null || (a.length + b.length < 3)) {
            return null;
        } else {
            int[] answer = new int[3];
            int length = a.length;
            int remaining = 3-length;
            for (int k = 0; k < length; k++) {
                answer[k] = a[k];
            }
            if (remaining > 0) {
                for (int j = 0; j < remaining; j++) {
                    answer[j+length] = b[j];
                }
            }
            return answer;
        }
    }
}