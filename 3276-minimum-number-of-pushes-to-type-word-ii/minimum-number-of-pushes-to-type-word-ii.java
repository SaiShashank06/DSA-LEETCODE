class Solution {
    public int minimumPushes(String word) {
 
        int[] arr = new int[26];
        int n=word.length();
        for(int i=0;i<n;i++){
            arr[word.charAt(i)-'a']++;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        int pushes=0;
        for(int i=0;i<arr.length;i++){

                pushes+=(i/8 + 1)*arr[i];
        }

        return pushes;
        
    }
}

/**

store freq of each chracter 

sort in decendinhg order
to minimize no of pushes char with more freq are pressed 1 time 

 */