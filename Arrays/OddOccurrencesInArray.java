/** 
 * @author Jesus Vazquez
 */
 
import java.util.Arrays;

class OddOccurrencesInArray {
    public int solution(int[] A) {
        Arrays.sort(A); //nlogn
        int counter = 0;
        int current = 1000001;
        
        for(int a:A){            
            if(a==current){
                counter++;    
            }else{
                if(counter == 0 || counter%2 == 0){
                    counter = 1;
                    current = a;                    
                }else{
                    return current;                    
                }                    
            }                
        }
        return A[A.length -1];        
    }
}
