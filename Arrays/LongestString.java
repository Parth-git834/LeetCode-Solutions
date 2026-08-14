public static String findLongestString(String[] stringList){
        if(stringList == null)return null;
        
        String longestString = "";
        for(String str : stringList){
            if(str != null && str.length() > longestString.length()){
                longestString = str;
            }
        }
        return longestString;
    }
