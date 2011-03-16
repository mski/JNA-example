package msk.example.jna;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class Dollar {
	public interface DollarC extends Library {
	     /** 
         * DLLのインスタンスです。これを通してDLLをアクセスします。
         * 物理ファイルのDLLへ実行パスが通るようにしておく必要があります。
         * 第1引数がDLLファイル名になります。拡張子の記述があっても動きます。
         * 絶対パスを指定してもOKです。こんな感じ→Native.loadLibrary("C:/jna/JnaEx", JnaExDLL.class);
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
