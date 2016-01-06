package Iteration;


/** 
 * @author Jesus Vazquez
 */

public class BynaryGap {
    
    public static void main(String args[]){
        
        System.out.println(solution(9));
        System.out.println(solution(529));
        System.out.println(solution(15));
        
    }
    
    public static int solution(int N) {
        
        //transform the integer in to a binary representation.
        String s = Integer.toBinaryString(N);
        
        int max = 0;
        int l = -1;           
        
        //compare the last observed position against the current
        for(int i = 0; i < s.length() ; i++){            
            if(s.charAt(i) == '1'){
                if(l == -1)
                    l = i;
                
                else{
                    if( (i-l-1)>max )
                        max = i-l-1;
                    l = i;
                }                    
            }            
        }
        
        return max;        
    }
    
    
}
