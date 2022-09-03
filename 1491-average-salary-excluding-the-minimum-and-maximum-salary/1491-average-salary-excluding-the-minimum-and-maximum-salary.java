class Solution {
    public double average(int[] salary) {
        double j=0;
        Arrays.sort(salary);
        for(int i=1;i<salary.length-1;i++){
            j+=salary[i];
        }
        double avg=j/(salary.length-2);
        return avg;
    }
}