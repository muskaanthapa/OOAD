
package Lab5;


interface Calculation {
  void add(int a,int b);
  int multiply(int a,int b);
}

class CalculationDemo implements Calculation {
   public void add(int a,int b) {
      int c=a+b;
      System.out.println("Sum is : "+c);
   }
   public int multiply(int a,int b) {
      int c=a*b;
      return c;
   }
 }

