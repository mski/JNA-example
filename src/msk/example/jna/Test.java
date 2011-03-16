package msk.example.jna;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Structure;
import com.sun.jna.Pointer;

public class Test {
    public interface TestSo extends Library {

	public static class TestPrivate extends Structure{
	    public int amount;
	}

	TestSo INSTANCE = (TestSo) Native.loadLibrary("/home/kan/JNAexample/test.so", TestSo.class);
	int add(int left, int right);
	TestPrivate create_Test(int amount);
	TestPrivate multiply(TestPrivate dollar, int multiplier);
	boolean equal(TestPrivate dollar, Pointer other);
    }

    public static void main(String[] args){
	TestSo tes = TestSo.INSTANCE;
	int addResult = tes.add(1,2);
	System.out.println(addResult);
	
	TestSo.TestPrivate test = tes.create_Test(5);
	System.out.println(test.amount);
	TestSo.TestPrivate test2 = tes.multiply(test,2);
	System.out.println(test2.amount);

	boolean flag = tes.equal(test, test2.getPointer());
	System.out.println(flag);
    }

}