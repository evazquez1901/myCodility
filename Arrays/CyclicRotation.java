
/** 
 * @author Jesus Vazquez
 */

class CyclicRotation {
  public int[] solution(int[] A, int K) {
     if(A.length < 1)
	return A;	
	
    int n =  A.length;
    int result[] = new int[n];
    
    //Allocate first item.
    int d = (K>n? K%n :K);        
    
    int j = d;                
    for(int i= 0; i< n ; i++){            
        if(j>=n)
            j=0;  
          result[j++] = A[i];                      
        }
      return result;
    }            
}
