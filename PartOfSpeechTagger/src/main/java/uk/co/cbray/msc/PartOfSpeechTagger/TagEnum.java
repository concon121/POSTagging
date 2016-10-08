package uk.co.cbray.msc.PartOfSpeechTagger;

public enum TagEnum {
	
	DOT (".","sentence closer (. ; ? *)"),
	LEFT_PAREN ("(","left paren"),
	RIGHT_PAREN (")","right paren"),
	NOT ("*","not, n't"),
	DASH ("--","dash"),
	COMMA (",","comma"),
	COLON (":","colon"),
	ABL ("ABL","pre-qualifier (quite, rather)"),
	ABN ("ABN","pre-quantifier (half, all)"),
	ABX ("ABX","pre-quantifier (both)"),
	AP ("AP","post-determiner (many, several, next)"),
	AT ("AT","article (a, the, no)"),
	BE ("BE","be"),
	BED ("BED","were"),
	BEDZ ("BEDZ","was"),
	BEG ("BEG","being"),
	BEM ("BEM","am"),
	BEN ("BEN","been"),
	BER ("BER","are, art"),
	BEZ ("BEZ","is"),
	CC ("CC","coordinating conjunction (and, or)"),
	CD ("CD","cardinal numeral (one, two, 2, etc.)"),
	CS ("CS","subordinating conjunction (if, although)"),
	DO ("DO","do"),
	DOD ("DOD","did"),
	DOZ ("DOZ","does"),
	DT("DT","singular determiner/quantifier (this, that)"),
	DTI ("DTI","singular or plural determiner/quantifier (some, any)"),
	DTS ("DTS","plural determiner (these, those)"),
	DTX ("DTX","determiner/double conjunction (either)"),
	EX ("EX","existential there"),
	FW ("FW","foreign word (hyphenated before regular tag)"),
	HV ("HV","have"),
	HVD ("HVD","had (past tense)"),
	HVG ("HVG","having"),
	HVN ("HVN","had (past participle)"),
	IN ("IN","preposition"),
	JJ ("JJ","adjective"),
	JJR ("JJR","comparative adjective"),
	JJS ("JJS","semantically superlative adjective (chief, top)"),
	JJT ("JJT","morphologically superlative adjective (biggest)"),
	MD ("MD","modal auxiliary (can, should, will)"),
	NC ("NC","cited word (hyphenated after regular tag)"),
	NN ("NN","singular or mass noun"),
	NN$ ("NN$","possessive singular noun"),
	NNS ("NNS","plural noun"),
	NNS$ ("NNS$","possessive plural noun"),
	NP ("NP","proper noun or part of name phrase"),
	NP$ ("NP$","possessive proper noun"),
	NPS ("NPS","plural proper noun"),
	NPS$ ("NPS$","possessive plural proper noun"),
	NR ("NR","adverbial noun (home, today, west)"),
	OD ("OD","ordinal numeral (first, 2nd)"),
	PN ("PN","nominal pronoun (everybody, nothing)"),
	PN$ ("PN$","possessive nominal pronoun"),
	PPS$ ("PP$","possessive personal pronoun (my, our)"),
	PP$$ ("PP$$","second (nominal) possessive pronoun (mine, ours)"),
	PPL ("PPL","singular reflexive/intensive personal pronoun (myself)"),
	PPLS ("PPLS","plural reflexive/intensive personal pronoun (ourselves)"),
	PPO ("PPO","objective personal pronoun (me, him, it, them)"),
	PPS ("PPS","3rd. singular nominative pronoun (he, she, it, one)"),
	PPSS ("PPSS","other nominative personal pronoun (I, we, they, you)"),
	PRP ("PRP","Personal pronoun"),
	PRP$ ("PRP$","Possessive pronoun"),
	QL ("QL","qualifier (very, fairly)"),
	QLP ("QLP","post-qualifier (enough, indeed)"),
	RB ("RB","adverb"),
	RBR ("RBR","comparative adverb"),
	RBT ("RBT","superlative adverb"),
	RN ("RN","nominal adverb (here, then, indoors)"),
	RP ("RP","adverb/particle (about, off, up)"),
	TO ("TO","infinitive marker to"),
	UH ("UH","interjection, exclamation"),
	VB ("VB","verb, base form"),
	VBD ("VBD","verb, past tense"),
	VBG ("VBG","verb, present participle/gerund"),
	VBN ("VBN","verb, past participle"),
	VBP ("VBP","verb, non 3rd person, singular, present"),
	VBZ ("VBZ","verb, 3rd. singular present"),
	WDT ("WDT","wh- determiner (what, which)"),
	WP$ ("WP$","possessive wh- pronoun (whose)"),
	WPO ("WPO","objective wh- pronoun (whom, which, that)"),
	WPS ("WPS","nominative wh- pronoun (who, which, that)"),
	WQL ("WQL","wh- qualifier (how)"),
	WRB ("WRB","wh- adverb (how, where, when)");
	
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String tag;
	private String description;
	
	private TagEnum(String tag, String description) {
		this.tag = tag;
		this.description = description;
	}
	
	

}
