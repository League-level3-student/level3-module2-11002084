package _02_More_Algorithms;

import java.util.Arrays;
import java.util.List;

public class Algorithms {
	
	public static int findBrokenEgg(List<String> eggs) 	{
	
		for(int i=0; i<eggs.size(); i++) {
			if(eggs.get(i) == "cracked") {
				return i;
			}
		}
		
		return -1;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int numPearls = 0;
		
		for(boolean oyster : oysters) {
			if(oyster) {
				numPearls++;
			}
		}
		
		return numPearls;
	}
	
	public static double findTallest(List<Double> peeps) {
		double tallestHeight = -1;
		
		for(int i=0; i<peeps.size(); i++) {
			if(peeps.get(i) > tallestHeight) {
				tallestHeight = peeps.get(i);
			}
		}
		
		return tallestHeight;
	}
	
	public static String findLongestWord(List<String> words) {
		int index = -1;
		int currLongestCharCount = -1;
		
		for(int i=0; i<words.size(); i++) {
			if(words.get(i).length() > currLongestCharCount) {
				index = i;
				currLongestCharCount = words.get(i).length();
			}
		}
		
		return words.get(index);
	}
	
	public static boolean containsSOS(List<String> message) {
		for(int i=0; i<message.size(); i++) {
			if(message.get(i).equals("... --- ...")){
				return true;
			}
		}
		
		return false;
	}
	
	public static String translateMorseCode(List<String> message) {
		String finalMessage = "";
		
		for(int i=0; i<message.size(); i++) {
			List<String> word = Arrays.asList(message.get(i).split(" "));
			
			for(int j=0; j<word.size(); j++) {
				switch(word.get(j)) {
				case ".-": 
					finalMessage += 'A';
					break;
				case "-...":
					finalMessage += 'B';
					break;
				case "-.-.":
					finalMessage += 'C';
					break;
				case "-..":
					finalMessage += 'D';
					break;
				case ".":
					finalMessage += 'E';
					break;
				case "..-.":
					finalMessage += 'F';
					break;
				case "--.":
					finalMessage += 'G';
					break;
				case "....":
					finalMessage += 'H';
					break;
				case "..":
					finalMessage += 'I';
					break;
				case ".---":
					finalMessage += 'J';
					break;
				case "-.-":
					finalMessage += 'K';
					break;
				case ".-..":
					finalMessage += 'L';
					break;
				case "--":
					finalMessage += 'M';
					break;
				case "-.":
					finalMessage += 'N';
					break;
				case "---":
					finalMessage += 'O';
					break;
				case ".--.":
					finalMessage += 'P';
					break;
				case "--.-":
					finalMessage += 'Q';
					break;
				case ".-.":
					finalMessage += 'R';
					break;
				case "...":
					finalMessage += 'S';
					break;
				case "-":
					finalMessage += 'T';
					break;
				case "..-":
					finalMessage += 'U';
					break;
				case "...-":
					finalMessage += 'V';
					break;
				case ".--":
					finalMessage += 'W';
					break;
				case "-..-":
					finalMessage += 'X';
					break;
				case "-.--":
					finalMessage += 'Y';
					break;
				case "--..":
					finalMessage += 'Z';
					break;
				case "--..--":
					finalMessage += ',';
					break;
				case ".----.":
					finalMessage += '\'';
					break;
				default:
					finalMessage += word.get(j);
				}
			}
			
			if(i != message.size() - 1) {
				finalMessage += " ";
			}
		}
		
		System.out.println(finalMessage);
		return finalMessage;
	}
	
	public static List<Double> sortScores(List<Double> results) {	
		for(int i=1; i<results.size(); i++) {
			for(int j=i; j>0; j--) {
				if(results.get(j) < results.get(j-1)) {
					double x = results.get(j);
					double y = results.get(j-1);
					
					results.set(j, y);
					results.set(j-1, x);
				}
			}
		}
		
		return results;
	}
	
	public static List<String> sortDNA(List<String> sequences){
		int index;
		int minimum;
		
		for(int i=0; i<sequences.size() - 1; i++) {
			index = i;
			minimum = sequences.get(i).length();
			
			for(int j=i; j<sequences.size(); j++) {
				if(sequences.get(j).length() < minimum) {
					index = j;
					minimum = sequences.get(j).length();
				}
			}
			
			String x = sequences.get(index);
			sequences.set(index, sequences.get(i));
			sequences.set(i, x);
		}
		
		return sequences;
	}
	
	public static List<String> sortWords(List<String> words){
		for(int i=0; i<words.size(); i++) {
			for(int j=i; j>0; j--) {
				if(words.get(j).compareTo(words.get(j-1)) < 0){
					String x = words.get(j);
					words.set(j, words.get(j-1));
					words.set(j-1, x);
				}
			}
		}
		
		return words;
	}
}
