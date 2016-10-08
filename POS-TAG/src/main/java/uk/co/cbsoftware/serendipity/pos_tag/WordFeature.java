package uk.co.cbsoftware.serendipity.pos_tag;

import uk.co.cbsoftware.serendipity.classification.exceptions.InvalidArgumentException;
import uk.co.cbsoftware.serendipity.classification.model.LiteralFeatureImpl;

public class WordFeature extends LiteralFeatureImpl {
	
	public WordFeature(String word) throws InvalidArgumentException {
		this.setFeatureName("word");
		this.setValue(word);
	}
	
}
