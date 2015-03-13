package com.ai.genpwd;

import java.util.Random;

public class jpwd {

	public static void main(String[] args) {
		String enstr="1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] enstr2=enstr.toCharArray();
		StringBuffer sbf=new StringBuffer();
		int pw_len=16;
		if(args.length>0 && args[0]!=null){
			pw_len=Integer.parseInt(args[0]);
		}
		Random pwrand=new  Random();
		sbf=new StringBuffer();
		for (int i = 0; i < pw_len; i++) {
			int pwd_sk=pwrand.nextInt(enstr.length());
			sbf.append(enstr2[pwd_sk]);
		}
		System.out.println(sbf.toString());
	}

}
