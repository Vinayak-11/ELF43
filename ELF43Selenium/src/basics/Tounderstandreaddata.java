package basics;

import java.io.IOException;

import dataDriven.ReadData;

public class Tounderstandreaddata {
	public static void main(String[] args) throws IOException {
		System.out.println(ReadData.fromPropertyFile("url"));
	}

}
