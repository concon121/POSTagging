package uk.co.cbray.msc.PartOfSpeechTagger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import uk.co.cbray.msc.ml4j.exceptions.InvalidArgumentException;

/**
 * Hello world!
 *
 */
public class ResourceLoader 
{
    public static void loadCorpus() throws FileNotFoundException, InvalidArgumentException
    {
        URL brownCorpusUrl = ResourceLoader.class.getResource("/src/main/resources/brown_corpus");
        File brownCorpus = new File(brownCorpusUrl.getFile());
        
        List<Tag> cache = CorpusCache.getInstance().getCache();
        
        FilenameFilter filter = new FilenameFilter() {
   
            public boolean accept(File dir, String name) {
            	if (name.equalsIgnoreCase("README") || name.equalsIgnoreCase("CONTENTS")) {
            		return false;
            	} else {
            		return true;
            	}
            }
         };
        
        String [] corpusFiles = brownCorpus.list(filter);
        
        for (String file : corpusFiles) {
        	System.out.println("loading file: " + file);
        	File currentFile = new File(brownCorpus.getPath() + File.pathSeparator + file);
        	Scanner scanner = new Scanner(currentFile);
        	
        	while(scanner.hasNextLine()) {
        		String line = scanner.nextLine();
        		String [] split = line.split(" ");
        		for (String element : split) {
        			String [] wordTag = element.split("/");
        			if (wordTag.length == 2) {
        				cache.add(ObjectFactory.newTag(wordTag[0], wordTag[1])); 
        			}
        		}
        	}
        	
        	scanner.close();
        }
    }
}
