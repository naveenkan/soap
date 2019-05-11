package com.naveen.soap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="CatagoriesService",targetNamespace="naveen.com")
public class ProductCatalog {
	 List<String> catagories=new ArrayList<String>();
	
	 @WebMethod(exclude=false)
	public  List<String> getProductCatagories(){
	Collections.addAll(catagories,"books","music","pens");
	System.out.println(catagories);
	return  catagories;
	}

}
