public static int[] findMaxMin(int[] myList){
        int max = myList[0];
        int min = myList[0];
        int[] result = new int[2];
        for(int j = 0 ; j < myList.length ; j++){
            int num = myList[j];
            if(num > max){
                max = num;
            }
            if( num < min){
                min = num;
            }
        }
        return new int[]{max , min};
    }
