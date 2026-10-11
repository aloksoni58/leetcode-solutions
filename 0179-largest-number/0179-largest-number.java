class Solution {
    public String largestNumber(int[] nums) {
        
        String[] str = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            str[i] = nums[i] + ""; 
        }

        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = 0; j < nums.length-1-i; j++) {
        //         if((str[j+1] + str[j]).compareTo(str[j] + str[j+1]) > 0) {
        //             String temp = str[j];
        //             str[j] = str[j+1];
        //             str[j+1] = temp;
        //         }
        //     }
        // }

        Arrays.sort(str, (a, b) -> {return (b + a).compareTo(a + b);});

        if(str[0].equals("0"))
            return "0";

        StringBuilder res = new StringBuilder();
        for(int i = 0; i < str.length; i++) {
            if(str[i] != "0")
                res.append(str[i]);
        }
        
        return res.toString();
    }
}