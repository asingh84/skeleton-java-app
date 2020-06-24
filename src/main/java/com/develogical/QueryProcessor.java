package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare";
        }
        if (query.toLowerCase().contains("what is ")) {
        	
        	String[] parts = query.split(" ");
        	Integer t = Integer.parseInt(parts[3]) + Integer.parseInt(parts[5]);
        	return t.toString();
        }
        return "";
    }
}
