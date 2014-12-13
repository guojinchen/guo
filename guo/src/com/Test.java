package com;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {
	
		public static void main(String[] args) throws IOException {
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("3");
		set.add("b");
		Iterator it =  set.iterator();
		
		while(it.hasNext()){
		
		 
		System.out.println(it.next());
		}
		
		for(String str : set){
			System.out.println(str);
			}
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		for(String st : list){
			System.out.println(st);
		}
	Iterator i= list.iterator();
	while(i.hasNext()){
		System.out.println(i.next());
	}
		System.out.println("----------------------");
		byte[] aa=new byte[10];
		aa[0]='a';
		ByteArrayInputStream input=new ByteArrayInputStream(aa);
		File file=new File("d:\\debug_log.txt");
		FileInputStream in=new FileInputStream(file);
		InputStreamReader reader=new InputStreamReader(in);
		int ch=input.read();
		System.out.println(ch);
		String str="";
		while((ch=reader.read())!=-1){
			str=str+(char)ch;
		}
		System.out.println(str);
		File file1 = new  File("D:\\a.txt");
		file1.createNewFile();
		FileOutputStream out=new FileOutputStream(file1);
		FileWriter fw = new FileWriter(file1);
		fw.write(str);
		fw.append("123213123");
		fw.flush();
		System.out.println("==================================");
		
		File file2 = new File("d:\\农行卡号.txt");
		FileInputStream fs = new FileInputStream(file2);
		InputStreamReader ir=new  InputStreamReader(fs);
		String st = "";
		int a;
		while((a=ir.read())!=-1){
			st+=(char)a;
		}
		System.out.println(st);		
		System.out.println("++++++++++++++++++++++++++++++++");
		
		FileWriter os = new FileWriter("D:\\b.txt");
		os.write("我们今天很舒服。");
		os.append("lalallalalallaa");
		os.flush();
		os.close();
	}
}
