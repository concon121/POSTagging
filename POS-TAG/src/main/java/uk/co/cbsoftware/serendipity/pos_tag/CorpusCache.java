package uk.co.cbsoftware.serendipity.pos_tag;

import java.util.ArrayList;
import java.util.List;

import uk.co.cbsoftware.serendipity.classification.api.Instance;

public class CorpusCache {
	
	private static CorpusCache instance;
	
	private List<Instance> cache;
	
	private CorpusCache() {
		
	}
	
	public static CorpusCache getInstance() {
		if (instance == null) {
			instance = new CorpusCache();
		}
		
		return instance;
	}
	
	public List<Instance> getCache() {
		if (cache == null) {
			cache = new ArrayList<>();
		}
		return cache;
	}

	public void setCache(List<Instance> cache) {
		this.cache = cache;
	}
	
}
