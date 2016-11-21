/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Sajeed
 */
import java.io.Serializable;
	
public class Student implements Serializable 
{
	
  public Student(float a1,float a2,float a3,float a4,float a5,float a6,float a7,float a8,float a9,float a10,float a11,float a12,float a13,float a14,float a15,float a16,float a17,float a18,float a19) {
	
       this.f1=a1;
       this.f2=a2;
       this.f3=a3;
       this.f4=a4;
       this.f5=a5;
       this.f6=a6;
       this.f7=a7;
       this.f8=a8;
       this.f9=a9;
       this.f10=a10;
       this.f11=a11;
       this.f12=a12;
       this.f13=a13;
       this.f14=a14;
       this.f15=a15;
       this.f16=a16;
       this.f17=a17;
       this.f18=a18;
       this.f19=a19;
        
    }
	
 
	
    private static final long serialVersionUID = 1L;
	
   public float f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18,f19;
	
   public float getn_1() {
	
        return f1;
	
    }	
    public float getn_2() {
	
        return f2;
	
    }
   public float getn_3() {
	
        return f3;
	
    }
   public float getn_4() {
	
        return f4;
	
    }
   public float getn_5() {
	
        return f5;
	
    }
   public float getn_6() {
	
        return f6;
	
    }
   public float getn_7() {
	
        return f7;
	
    }
   public float getn_8() {
	
        return f8;
	
    }
    public float getn_9() {
	
        return f9;
	
    }
   public float getn_10() {
	
        return f10;
	
    }
   public float getn_11() {
	
        return f11;
	
    }   
   public float getn_12() {
	
        return f12;
	
    }
   public float getn_13() {
	
        return f13;
	
    }
   public float getn_14() {
	
        return f14;
	
    }
   public float getn_15() {
	
        return f15;
	
    }
   public float getn_16() {
	
        return f16;
	
    }
    public float getn_17() {
	
        return f17;
	
    }
   public float getn_18() {
	
        return f18;
	
    }
   public float getn_19() {
	
        return f19;
	
    }
    public String toString() {
	
	//System.out.println("where");
        return  getn_1() + " " + getn_2() + " " + getn_3() + " " + getn_4() + " " + getn_5() + " " + getn_6() + " " + getn_7() + " " + getn_8() + " " + getn_9() + " " + getn_10() + " " + getn_11() + " " + getn_12() + " " + getn_13() + " " + getn_14() + " " + getn_15() + " " + getn_16() + " " + getn_17() + " " + getn_18() + " " + getn_19();
	
    }
	
}
