package uk.co.cbray.msc.PartOfSpeechTagger;

import uk.co.cbray.msc.ml4j.exceptions.InvalidArgumentException;
import uk.co.cbray.msc.ml4j.model.InstanceImpl;

public class Tag extends InstanceImpl{
	
	public String word;
	public TagEnum tag;
	
	public TagEnum getTagEnum(String tag) {
		TagEnum [] values = TagEnum.values();
		for (TagEnum currentTag : values) {
			if (currentTag.getTag().equalsIgnoreCase(tag)) {
				return currentTag;
			}
		}
		
		return null;
	}
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) throws InvalidArgumentException {
		this.word = word;
		getFeatures().add(ObjectFactory.newWordFeature(word));
	}
	public TagEnum getTag() {
		return tag;
	}
	public void setTag(TagEnum tag) throws InvalidArgumentException {
		this.tag = tag;
		getFeatures().add(ObjectFactory.newTagFeature(tag));
	}
	
}
