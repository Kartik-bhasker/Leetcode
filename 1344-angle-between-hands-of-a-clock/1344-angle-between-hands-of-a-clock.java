class Solution {
    public double angleClock(int hour, int minutes) {
        double hourS=hour*30+minutes*0.5;
        double minS=minutes*6;
        double diff;
        if(hourS>minS) {
            diff=hourS-minS;
        } 
        else {
            diff=minS-hourS;
        }
        return Math.min(diff,360-diff);
    }
}