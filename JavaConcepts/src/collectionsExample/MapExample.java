package collectionsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("firstname", "ram");
		map.put("lastname", "sam");
		map.put("sub", "appium");
		map.put("lastname", "dam");
		
		System.out.println(map.size());
		System.out.println(map);
        System.out.println(map.get("lastname"));
        
        
        Set<String>  keys =map.keySet();
        for(String key :keys)
        {
        	System.out.println(key + "-"+ map.get(key));
        }
        
        System.out.println("------------");
        Map<String,List<String>> map1=  new HashMap<String,List<String>>();
        
        List<String> listofEmails= new ArrayList<String>();
        listofEmails.add("abd@gmail.com");
        listofEmails.add("ab1d@gmail.com");
        listofEmails.add("ab2d@gmail.com");        
        listofEmails.add("ab3d@gmail.com");
        map1.put("email", listofEmails);
        
       
        
	}

}
