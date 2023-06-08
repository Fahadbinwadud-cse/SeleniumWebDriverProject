package EncoderAndDecord;

import org.apache.commons.net.util.Base64;

public class EncodingAndDecodingString {
	public static void main(String[] args) {
		String str = "test123";
		// Base64 is encode class , encodeBase64 is it's method converting string to byte getBytes() methods
		byte[] encodeString = Base64.encodeBase64(str.getBytes());
		// new String is type casting or converting string format 
		System.out.println("Encoded string is : "+new String(encodeString));
		
		//Converting encode to decode format
		byte[] decode = Base64.decodeBase64(encodeString);
		//converting byte to string format
		System.out.println("Decode string is : "+new String(decode));
		
	}

}
