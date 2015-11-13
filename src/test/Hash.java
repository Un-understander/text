package test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class Hash {
	public String jsHash(String str){
		char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		byte[] b=str.getBytes();
		try {
			MessageDigest mdInst=MessageDigest.getInstance("MD5");
			mdInst.update(b);
			byte[] md=mdInst.digest();
			int j=md.length;
			char s[]=new char[j*2];
			int k=0;
			for(int i=0;i<j;i++){
				byte byte0=md[i];
				s[k++]=a[byte0>>>4&0xf];
				s[k++]=a[byte0 & 0xf];
			}
			return new String(s);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public static void main(String args[]){
		Hash a=new Hash();
		System.out.println(a.jsHash("100099"));
	}

}
