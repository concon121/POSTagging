package uk.co.cbray.msc.PartOfSpeechTagger;

import uk.co.cbray.msc.ml4j.api.Feature;
import uk.co.cbray.msc.ml4j.exceptions.InvalidArgumentException;

public class ObjectFactory {
	
	public static Tag newTag(String word, String tagStr) throws InvalidArgumentException {
		Tag tag = new Tag();
		
		tag.setWord(word);
		tag.setTag(tag.getTagEnum(tagStr));
		
		return tag;
	}

	public static Feature newWordFeature(String word) throws InvalidArgumentException {
		return new WordFeature(word);
	}
	
	public static Feature newTagFeature(TagEnum tag) throws InvalidArgumentException {
		return new TagFeature(tag.getTag());
	}

}
