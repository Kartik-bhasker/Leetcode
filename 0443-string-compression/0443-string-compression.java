class Solution {
    public int compress(char[] chars) {
        int readindex=0;
        int writeindex=0;
        while(readindex<chars.length){
            char currentChar=chars[readindex];
            int count=0;
            while(readindex<chars.length && currentChar==chars[readindex]){
                readindex++;
                count++;
            }
            //put ch in existing arr 
            chars[writeindex]=currentChar;
            writeindex++;

            //now put cnt of that ch by converting cnt to string then ch
            if(count>1){
                String countStr=String.valueOf(count);
                for(char digit:countStr.toCharArray()){
                    chars[writeindex]=digit;
                    writeindex++;
                }
            }
        }return writeindex;
    }
}