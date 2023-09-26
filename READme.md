*** OBJECT ***
* In java we care about two areas 1)objects 2)method invocations
* 1) Instance Variable : are declared inside aclass but not inside the method 
   ex: public class duck{ 
 int size;
 }
* 2) Local VAriable : are declared inside a method including method parameter
  ex: public void foo(int x){
    int i = x+2;
    boolean b = true;
   }
*  A non premitive variable holds a refernce to an object, not the object itself.
* If the local variable is a reference to an object,only the variable goes on the stack.
* A call to super()  calls the superclass constructor . It can also take arguments
* can't have this() and super() in the same constructor as they each must be first statement 
* ex: public Mini(){
   this(color.Red); 
 }
* ex: public mini (color c){
 super ("mini"); color = c;}
* **life**
* A local variable is alive until the method complets
* **scope**
* A local variable is in scope only with in the method
* An object becomes eligible for garbage collection when its last live reference disappears 



***Chapter 10**
* Utility methods like math does not require to have instance of the class 
* ex: Math.min(43,46);
* static final variables are constants 
* public static final double PI = 3.141;
* Final can be used for non static variables ,class,methods means the value can't be changed 
* If the class is final then all the methods in it are also final 
* **Math methods**
* Math.random();//returns a double b/w 0.0 and 1.0
* Math.abs(); // returns absolute value of the argument 
* MAth.round();// rounded to the nearest int 
* primitive data types and their respective classes might be different 
* eX:int and Integer 