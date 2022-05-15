package Practice;

public class Check_if_divisible_by_11 {

	int divisibleBy11 (String S)
    {
        // Your Code Here
        int odd = 0, even = 0;
        
        for(int i = 0; i < S.length(); i++)
        {
            if(i % 2 == 0)
            {
                odd += S.charAt(i)-'0';
            }
            else
            {
                even += S.charAt(i)-'0';
            }
        }
        int num=odd - even;
        if(num%11==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
