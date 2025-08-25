

//blpkdmilbloblajiopfeflginnokggia

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> dup = new ArrayList<>();
        
        // Iterate through the array and find duplicates
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                // Check if the current element is a duplicate and hasn't been added yet
                if (dup.isEmpty() || dup.get(dup.size() - 1) != arr[i]) {
                    dup.add(arr[i]);
                }
            }
        }
        
        return dup;
    }
}
