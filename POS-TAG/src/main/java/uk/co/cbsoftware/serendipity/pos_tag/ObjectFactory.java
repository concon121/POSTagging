package uk.co.cbsoftware.serendipity.pos_tag;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.co.cbsoftware.serendipity.classification.api.Feature;
import uk.co.cbsoftware.serendipity.classification.exceptions.InvalidArgumentException;

public class ObjectFactory {
	
	private static final Logger log = LoggerFactory.getLogger(ObjectFactory.class);
	
	public static Tag newTag(String word, String tagStr) throws InvalidArgumentException {
		
		log.error("Creating tag {} for word {}", tagStr, word);
		
		Tag tag = new Tag();
		
		tag.setWord(word);
		tag.setTag(tag.getTagEnum(tagStr));
		
		return tag;
	}

	public static Feature newWordFeature(String word) throws InvalidArgumentException {
		return new WordFeature(word);
	}
	
	public static Feature newTagFeature(TagEnum tag) throws InvalidArgumentException {
		log.error("The tag is: " + tag);
		return new TagFeature(tag.getTag());
	}

}
