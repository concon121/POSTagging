package uk.co.cbsoftware.serendipity.pos_tag;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import uk.co.cbsoftware.serendipity.classification.api.Instance;
import uk.co.cbsoftware.serendipity.classification.impl.Classification4J;

public class PosTagTest {
	
	@Before
	public void setUp() throws Exception {
		ResourceLoader.loadCorpus();
	}
	
	@Test
	public void test() throws Exception {
		List<Instance> cache = CorpusCache.getInstance().getCache();
		Tag unclassified = new Tag();
		unclassified.setWord("hello");
		Classification4J.classify(unclassified, cache);
		System.out.println(unclassified.tag.getDescription());
		System.out.println(unclassified.tag.getTag());
		
	}

}
