package msk.example.jna;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

public class DollarJNA {
    public interface DollarC extends Library {
	
	public static class Dollar extends Structure {
	}
	 
        DollarC INSTANCE = (DollarC) Native.loadLibrary("/home/kan/JNAexample/dollar.so", DollarC.class);

        /**
         * @param amount
         * @return
         */
        Dollar create_dollar(int amount);
        //Dollar *create_dollar( unsigned int amount );
        
        //bool equal( const Dollar *dollar, const void *other );        
        boolean equal(DollarC dollar, Pointer other);
        
        Dollar multiply(DollarC dollar, int multiplier);
        //Dollar *multiply( const Dollar *dollar, unsigned int multiplier );
	}
	
	public static void main(String[] args) {
		int amount = 5;
		DollarC.Dollar fiveDollar = DollarC.INSTANCE.create_dollar(amount);
		
	}
}
