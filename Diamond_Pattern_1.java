
public class Main
{
	public static void main(String[] args) {
	    
	    		int i, j, k, n, space;
 
		space = 5;
		for (i = 1; i <= 5; i++)
		{
			for (j = space; j > 1; j--)
			{
				System.out.print(" ");
			}
			for (k = i; k != 0; k--)
			{
				System.out.print(k);
 
			}
		
			for (int l = 2; l <= i; l++)
			{
				System.out.print(l);
 
			}
				space--;
			System.out.println();
		}
	}
}
output:
    1                                                                                                                                  
   212                                                                                                                                 
  32123                                                                                                                                
 4321234                                                                                                                               
543212345  
