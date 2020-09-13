package com.doctics.dataStructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doctics.dataStructure.array.LowArray;

@SpringBootApplication
public class LibDataStructureApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibDataStructureApplication.class, args);
		
		LowArray arr;
		arr = new LowArray(100);
		
		int nElem = 0;
		int j;
		
		arr.setElem(0,  77);
		arr.setElem(1,  99);
		arr.setElem(2,  44);
		arr.setElem(3,  55);
		arr.setElem(4,  22);
		arr.setElem(5,  88);
		arr.setElem(6,  11);
		arr.setElem(7,  00);
		arr.setElem(8,  66);
		arr.setElem(9,  33);
		
		nElem = 10;
		
		for(j = 0; j < nElem; j++) {
			System.out.print(arr.getElem(j) + " ");
			System.out.println("");
		}
		
		int searchKey = 26;
		for(j=0; j < nElem; j ++) {
			if (arr.getElem(j) == searchKey) {
				break;
			}
			if (j == nElem)
				System.out.println("Can't find " + searchKey);
			else 
				System.out.println("Found " + searchKey);
			
		}
	}

}
