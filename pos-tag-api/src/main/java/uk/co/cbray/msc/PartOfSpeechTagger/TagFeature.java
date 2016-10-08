package uk.co.cbray.msc.PartOfSpeechTagger;

import uk.co.cbray.msc.ml4j.exceptions.InvalidArgumentException;
import uk.co.cbray.msc.ml4j.model.LiteralFeatureImpl;

public class TagFeature extends LiteralFeatureImpl {
	
	public TagFeature(String tag) throws InvalidArgumentException {
		this.setFeatureName("word");
		this.setValue(tag);
	}
	
}
