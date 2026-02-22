class Solution {
    public int binaryGap(int n) {
        // List<Integer> l = new ArrayList<>();
        int[] a = new int[1000];
        int c = 0;
        while(n>0){
            int k = n%2;
            a[c] = k;
            c++;
            n/=2;
        }

        int maxi = 0;
        int last = -1;
        for (int i = 0; i < c; i++) {
            if (a[i] == 1) {
                if (last != -1) {
                    maxi = Math.max(maxi, i - last);
                }
                last = i;
            }
        }

        return maxi;
    }
}