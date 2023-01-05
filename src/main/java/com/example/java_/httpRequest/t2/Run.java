package com.example.java_.httpRequest.t2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Run {
	public static void main(String[] args) throws Exception {

//		String url = "https://www.oracle.com/index.html";
		String url = "https://ctgs.ktovisitkorea.com/api/visitkorea/lc01/7601e8b78aed45ec852059cc5b766947/api.do";
		urlOpenStream(url);

	}

	public static void urlOpenStream(String _url) throws Exception {
		URL url = new URL(_url);

		BufferedReader in = new BufferedReader(
				new InputStreamReader(url.openStream(), "UTF8"));

		String inputLine;
		while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
		in.close();
	}
}
