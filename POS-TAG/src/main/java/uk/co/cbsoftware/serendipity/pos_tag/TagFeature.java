package uk.co.cbsoftware.serendipity.pos_tag;

import uk.co.cbsoftware.serendipity.classification.exceptions.InvalidArgumentException;
import uk.co.cbsoftware.serendipity.classification.model.LiteralFeatureImpl;

public class TagFeature extends LiteralFeatureImpl {
	
	public TagFeature(String tag) throws InvalidArgumentException {
		this.setFeatureName("word");
		this.setValue(tag);
	}
	
}
