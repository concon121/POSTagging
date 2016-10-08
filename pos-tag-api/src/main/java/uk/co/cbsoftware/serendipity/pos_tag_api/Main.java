package uk.co.cbray.msc.PartOfSpeechTagger;

import java.util.List;

public class Main {
	
	public static void main(String [] args) {
		System.out.println("Begin");
		
		try {
			ResourceLoader.loadCorpus();
			List<Tag> cache = CorpusCache.getInstance().getCache();
			System.out.println(cache.size());
		}catch (Exception e) {
			System.err.println(e);
		}
	}

}
