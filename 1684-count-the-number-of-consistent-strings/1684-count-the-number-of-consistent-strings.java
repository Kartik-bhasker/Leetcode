class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            boolean isValid=true;
            int j=0;
            while(j<words[i].length()){
                if(!allowed.contains(String.valueOf(words[i].charAt(j)))){
                    isValid=false;
                    break;
                }
                j++;
            }
            if(isValid)count++;
        }return count;
    }
}