package com.algorithm;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class UrlEncodeAndDecode {
	
	 // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
    	try {
    		longUrl = URLEncoder.encode(longUrl, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return longUrl;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
    	try {
			shortUrl = URLDecoder.decode(shortUrl, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return shortUrl;
        
    }
    
    public static void main(String[] args) {
		System.out.println(new UrlEncodeAndDecode().decode(new UrlEncodeAndDecode().encode("https://leetcode.com/problems/design-tinyurl")));
		int a = 4;
		int b = 1;
		System.out.println(a^b);
	}

}
