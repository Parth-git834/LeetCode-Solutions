public int lengthOfLongestSubstring(String s) {
        int[]freq=new int[256];

        int left=0,length=0;
        for(int right=0;right<s.length();right++)
        {
            freq[s.charAt(right)]++;
            while(freq[s.charAt(right)]>1)
            {
                freq[s.charAt(left)]--;
                left++;
            }
            if(freq[s.charAt(right)]==1)
            {
                length=Math.max(length,right-left+1);
            }        
        }
        return length;
    }
