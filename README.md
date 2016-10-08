# Part of Speech Tagging

A basic implementation of a POS tagging API for java, based on the Brown Corpus.

# What is POS Tagging?

Part of Speech tagging is the computational process of assigning a token to a word, which represents what type of word it is based on the grammar of the language used.

For example, consider the following sentence:

> Every good boy plays football

A POS tagging system would take this sentence and attempt to determine how ths sentence is constructed.  For example, you may expect the following tags to be applied to each of the words:

|  Every   |   good   |    boy   |   plays  | football |
|----------|----------|----------|----------|----------|
|   DET    |   ADJ    |   NOUN   |   VERB   |   NOUN   |
