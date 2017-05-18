package org.vipinmalik.misc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class MovieNameUpdater {
	static final String ROOT_DIR_NAME = "G:/Movies";
	static final String USER_AGENT = "Mozilla/5.0";
	
	public static void main (String[] args) {
		String docDirName = ROOT_DIR_NAME;
		File docsDir = new File(docDirName);
		File[] i = docsDir.listFiles();
		
		for (File f : i) {
			String name = f.getName();
			
			Pattern p = Pattern.compile("(19|20)(\\d){2}");
			Matcher m = p.matcher(name);
			String year = "0000";
			
			while (m.find()) {
				year = m.group();
			}
			
			//System.out.println(year);
			
			if (year != "0000") {				
				String movieName = name.split(year)[0].replaceAll("\\d\\.\\d\\s*-\\s*", "").replaceAll("\\(", "").replaceAll("\\.", " ");
				
				movieName = movieName.replaceAll("-", "");
				
				String newName = movieName + " - " + year;
				newName = newName.replaceAll("\\s+", " ");
				
				String extension = "";
				
				if (f.isFile() && name.lastIndexOf(".") > 0) {
					extension = name.substring(name.lastIndexOf(".") + 1);
				}
				
				com.google.gson.JsonObject imdbData = getImdbData(movieName, year);
				
				String rating = "";
				
				if (imdbData.get("imdbRating") != null) {
					rating = imdbData.get("imdbRating").toString();
					newName = rating.replaceAll("\"", "") + " - " + newName;
				}
				
				//System.out.println(newName);
				
				// Rename file
				if (f.isFile()) {
					File newFileDir = new File(docDirName + "/" + newName);
					if (!newFileDir.exists()) {
						newFileDir.mkdir();
					}
					
					String fileName = name + "." + extension;
					
					f.renameTo(new File(docDirName + "/" + newFileDir.getName() + "/" + fileName));
					
					//System.out.println(docDirName + "/" + newFileDir.getName() + "/" + fileName);
				} else {
					f.renameTo(new File(docDirName + "/" + newName));
					
					//System.out.println(docDirName + "/" + newName);
				}
				
				saveImdbData(imdbData, newName);
			}
		}
	}
	
	public static com.google.gson.JsonObject getImdbData(String title, String year) {
		com.google.gson.JsonObject imdbData = new JsonObject();
		
		try {

			String url = "http://www.omdbapi.com/?t=" + URLEncoder.encode(title.trim(), "UTF-8") + "&y=" + year;

			URL obj = new URL(url);
			
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			//add request header
			con.setRequestProperty("User-Agent", USER_AGENT);

			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			
			JsonParser parser = new JsonParser();
			
			imdbData = parser.parse(in).getAsJsonObject();
			
			in.close();

		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }
		
		return imdbData;
	}
	
	public static void saveImdbData(com.google.gson.JsonObject imdbData, String dirName) {
		String docsDir = ROOT_DIR_NAME + "/" + dirName;
		File myFile = new File(docsDir, "imdb.json");

		try {
			PrintWriter pw = new PrintWriter(myFile);

			BufferedWriter bw = new BufferedWriter(pw);

			bw.write(imdbData.toString());

			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
