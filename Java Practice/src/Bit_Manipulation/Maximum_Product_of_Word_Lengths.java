package Bit_Manipulation;

public class Maximum_Product_of_Word_Lengths {

	public int maxProduct(String[] words) {
        int n=words.length;
        int []temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=solve(words[i]);
        }
        int max_product=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((temp[i] & temp[j])==0){
                    if(words[i].length()*words[j].length()>max_product){
                        max_product=words[i].length()*words[j].length();
                    }
                }
            }
        }
        return max_product;
    }
    
    private int solve(String str){
        int state=0;
        for(char ch:str.toCharArray()){
            int ind=ch-'a';
            state|=1<<(ind);
        }
        return state; 
    }
}
