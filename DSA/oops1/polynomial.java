
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */

public class Polynomial {

	private int data[];
    private int nextElement;
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
    public Polynomial(){
        data = new int[0];
        nextElement=0;
    }
    
    public Polynomial(int degree){
        data = new int[degree];
        nextElement=degree-1;
    }
    
	public void setCoefficient(int degree, int coeff){
        if(nextElement<=degree){
            increasecap(degree);
            data[degree]=coeff;
            nextElement=degree;
        }else
        {
            data[degree]=coeff;
        }
	}
    
    private void increasecap(int degree) {
        int temp[]=data;
        data =new int[degree+1];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
        for(int i=temp.length;i<=degree;i++){
            data[i]=0;
        }
    }
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
        for(int i=0;i<=nextElement;i++){
            if(data[i]!=0){
        		System.out.print(data[i]+"x"+i+" ");
            }else 
                continue;
        }
	}

	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
       	int limit = Math.max(nextElement,p.nextElement);
        Polynomial pn = new Polynomial(limit+1);
        for(int i=0;i<=limit;i++){
            int sum=0;
            if (i<=nextElement)
            {
               sum=sum+(this.data[i]);
            }
            if (i<=p.nextElement)
            {
                sum=sum+(p.data[i]);
            }
            pn.setCoefficient(i,sum);
            //pn.data[i] = this.data[i]+p.data[i];
        }
        return pn;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
       	int limit=this.nextElement+p.nextElement;
        Polynomial pn = new Polynomial(limit+1);
        for(int i=0;i<=limit;i++){
            int sum=0;
            if (i<=nextElement)
            {
               sum=sum+(this.data[i]);
            }
            if (i<=p.nextElement)
            {
                sum=sum-(p.data[i]);
            }
            pn.setCoefficient(i,sum);
            //pn.data[i] = this.data[i]+p.data[i];
        }
        return pn;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		int limit=this.nextElement+p.nextElement;
        Polynomial polymul = new Polynomial(limit+1);   
        for (int i=0;i<=this.nextElement;i++)
        {
            int product=0;
            for (int j=0;j<=p.nextElement;j++)
            {
                product=polymul.data[i+j];
                product=product+(this.data[i]*p.data[j]);
                polymul.setCoefficient(i+j,product);
            } 
        }
        return polymul;
	}
}
