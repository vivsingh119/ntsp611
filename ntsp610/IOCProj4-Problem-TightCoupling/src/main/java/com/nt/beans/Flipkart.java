package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	//private DTDC dtdc;
	private BlueDart bDart;
	
	public Flipkart() {
		System.out.println("Flipkart: 0-param constructor");
	}
	/*public void setDtdc(DTDC dtdc) {
		System.out.println("Flipkart.setDtdc(-)");
		this.dtdc = dtdc;
	}*/
	
	public void setBDart(BlueDart bDart) {
		System.out.println("Flipkart.setBlueDart(-)");
		this.bDart = bDart;
	}

	
	public  String shopping(String[] items) {
		System.out.println("Flipkart:: shopping(-)");
		float billAmt=0.0f;
		Random rad=null;
		int oid=0;
		//calc bill Amount
		billAmt=items.length*1000;
		//generate orderId
		rad=new Random();
		oid=rad.nextInt(10000);
		//deliver product
		//dtdc.deliver(oid);
		bDart.deliver(oid);
		return Arrays.toString(items)+" Bill Amount:: "+billAmt;
	}
	

}
