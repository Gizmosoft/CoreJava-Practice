package com.tech.ninzaz.singleton;

	public class MySingleton {
	     
	    private static MySingleton myObj;
	    /**
	     * Create private constructor
	     */
	    private MySingleton(){
	         
	    }
	    /**
	     * Create a static method to get instance.
	     */
	    public static MySingleton getInstance(){
	        if(myObj == null){
	            myObj = new MySingleton();
	        }
	        return myObj;
	    }
	     
	    public void getSomeThing(){
	        // do something here
	        System.out.println("I am here....");
	    }
	     
	    public static void main(String a[]){
	        MySingleton st = MySingleton.getInstance();
	        st.getSomeThing();
	    }
}
