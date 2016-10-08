package uk.co.cbray.msc.PartOfSpeechTagger;

import uk.co.cbray.msc.ml4j.exceptions.InvalidArgumentException;
import uk.co.cbray.msc.ml4j.model.LiteralFeatureImpl;

public class WordFeature extends LiteralFeatureImpl {
	
	public WordFeature(String word) throws InvalidArgumentException {
		this.setFeatureName("word");
		this.setValue(word);
	}
	
}
