package com.nexes.manager;

import java.util.ArrayList;

public class fileman_stub implements fileman{

	
	public String searchInDirectory(String dir, String pathName){
		ArrayList<String> names = new ArrayList<String>();
		search_file(dir, pathName, names);

		return names;
	}
}
