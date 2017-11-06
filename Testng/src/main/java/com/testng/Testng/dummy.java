package com.testng.Testng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;

public class dummy {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Vaishali\\Desktop\\insurance.txt"); //Linux path
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null)
		{
		System.out.println(str);
		
		
		if(str.contains("LACALHOST:8080")){
			Assert.assertTrue(str.contains("LACALHOST:8080"), "passed");
			System.out.println("passed");
		}else{
			System.out.println("failed");
		}
		/*Assert.assertTrue(str.contains("mvn --version"));
		System.out.println("passed");*/
		} 
		//Assert.assertTrue(str.contains("mvn --version"));
		//System.out.println("passed");

	}

}
