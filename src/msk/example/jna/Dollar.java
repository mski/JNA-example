package msk.example.jna;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class Dollar {
	public interface DollarC extends Library {
	     /** 
         * DLL�̃C���X�^���X�ł��B�����ʂ���DLL���A�N�Z�X���܂��B
         * �����t�@�C����DLL�֎��s�p�X���ʂ�悤�ɂ��Ă����K�v������܂��B
         * ��1������DLL�t�@�C�����ɂȂ�܂��B�g���q�̋L�q�������Ă������܂��B
         * ��΃p�X���w�肵�Ă�OK�ł��B����Ȋ�����Native.loadLibrary("C:/jna/JnaEx", JnaExDLL.class);
         */
        DollarC INSTANCE = (DollarC) Native.loadLibrary("dollar", DollarC.class);

        /**
         * @param amount
         * @return
         */
        DollarC create_dollar(int amount);
        //Dollar *create_dollar( unsigned int amount );
        
        //bool equal( const Dollar *dollar, const void *other );        
        boolean equal(DollarC dollar, Pointer other);
        
        DollarC multiply(DollarC dollar, int multiplier);
        //Dollar *multiply( const Dollar *dollar, unsigned int multiplier );
	}
	
	public static void main(String[] args) {
		int amount = 5;
		DollarC fiveDollar = DollarC.INSTANCE.create_dollar(amount);
		
	}
}
