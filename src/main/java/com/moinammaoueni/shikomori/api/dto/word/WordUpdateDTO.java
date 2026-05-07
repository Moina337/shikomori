package com.moinammaoueni.shikomori.api.dto.word;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WordUpdateDTO {

	private String comorianWord;
	private String frenchTranslation;
	private String category;
	private String exampleSentenceComorian;
	private String exampleSentenceFrench;
	private String pronunciation;

}
