package com.sct.demo;

import lombok.Data;


public class Item {
	
	private String key;
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Item(String key)
	{
		this.key = key;
	}
	
	 public boolean equals(Object obj) {
		 	Item other = null;
		    if (obj == null) return false;
		    if (!(obj instanceof Item))
		        return false;
		    
		     other = (Item)obj;
		    
		    return other.getKey().replace("+", "_PLUS").replace("-", "_MINUS").equals(this.key.replace("+", "_PLUS").replace("-", "_MINUS"));
		   //return this.getKey().replace("+", "_PLUS").replace("-", "_MINUS") == ((Item) obj).getKey().replace("+", "_PLUS").replace("-", "_MINUS");
		    //return this.getKey() == ((Item) obj).getKey();	
	 }
	 
	 @Override
	 public int hashCode() {
		 
	     return this.key.replace("+", "_PLUS").replace("-", "_MINUS").hashCode();
		 //return key.hashCode();
	 }
	 
	    @Override 
	    public String toString() {
	        return this.key.replace("+", "_PLUS").replace("-", "_MINUS");
	    }
	


}