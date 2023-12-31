public class First{
    public static void main(String []args){
        int num=1000;
        int dat = mfun(num);
		System.out.println(dat);	
      
		}
   
    
    static int mfun(int num){
       int value = 3;
       int sum = 0;
       int num1 =0;
       for(int i=1;i<1000;i++){
            sum = value * i;
            while(sum<49){
                num1+=sum;
                System.out.println(sum);
                break;
            }
            
       }
        int val = 5;
       int sum1 = 0;
       int num2 =0;
       for(int j=1;j<1000;j++){
            sum1 = val * j;
            while(sum1<49){
                 System.out.println(sum1);
                 num2 += sum1;
                break;
                
            }
           

       }
       System.out.println(num1);
       System.out.println(num2);
       int tre = num1+ num2;


        
        return tre;
    }
    }
