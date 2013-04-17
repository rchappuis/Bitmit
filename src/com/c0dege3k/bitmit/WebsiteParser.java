package com.c0dege3k.bitmit;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.PrettyXmlSerializer;
import org.htmlcleaner.TagNode;

import android.util.Log;

public class WebsiteParser {
	private final String TAG = "WebsiteParser";
	
	HtmlCleaner pageParser;
	CleanerProperties props;

	URL cateURL;
	
	public WebsiteParser() {
		try {
			cateURL = new URL("https://www.bimit.net/en/");
		} catch (MalformedURLException e) {
			Log.d(TAG, "URL to Bimit is bad!");
		}
		
		pageParser = new HtmlCleaner();
		props = pageParser.getProperties();
		props.setAllowHtmlInsideAttributes(true);
		props.setAllowMultiWordAttributes(true);
		props.setRecognizeUnicodeChars(true);
		props.setOmitComments(true);
	}
	public ArrayList<String> getCategories(){
		ArrayList<String> categories = new ArrayList<String>();
		TagNode tagNode;
		try {
			tagNode = new HtmlCleaner(props).clean(cateURL);
		} catch (IOException e) {
			Log.d(TAG, "TagNode ran IOException");
			e.printStackTrace();
		}
		
		try {
			new PrettyXmlSerializer(props).writeToFile(tagNode, "bitmit_home.xml", "utf-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
