public class Solution {
    public int RomanToInt(string s) {
        int sum = 0;
        int num = 0;
        int lastNum = int.MaxValue;
        for(int i=0;i<s.Length;i++){
            char c = s[i];
            switch(c)
        {
            case 'I':num=1;break;
            case 'V':num=5;break;
            case 'X':num=10;break;
            case 'L':num=50;break;
            case 'C':num=100;break;
            case 'D':num=500;break;
            default:num=1000;break;
        }
            int value = num;

            if(num > lastNum){
                sum+=num-lastNum*2;         
            }else{
                sum+=num;
            }
            lastNum = num;
        }   
        return sum;
    }
}
