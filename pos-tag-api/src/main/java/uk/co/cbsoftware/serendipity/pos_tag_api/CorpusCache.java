package uk.co.cbray.msc.PartOfSpeechTagger;

import java.util.List;

public class CorpusCache {
	
	private static CorpusCache instance;
	
	private List<Tag> cache;
	
	private CorpusCache() {
		
	}
	
	public static CorpusCache getInstance() {
		if (instance == null) {
			instance = new CorpusCache();
		}
		
		return instance;
	}
	
	public List<Tag> getCache() {
		return cache;
	}

	public void setCache(List<Tag> cache) {
		this.cache = cache;
	}
	
}
