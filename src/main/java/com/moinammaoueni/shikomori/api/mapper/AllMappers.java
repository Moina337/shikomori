package com.moinammaoueni.shikomori.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.moinammaoueni.shikomori.api.dto.word.WordCreateDTO;
import com.moinammaoueni.shikomori.api.dto.word.WordResponseDTO;
import com.moinammaoueni.shikomori.api.dto.word.WordUpdateDTO;
import com.moinammaoueni.shikomori.api.entity.Word;

@Mapper(componentModel = "string")
public interface AllMappers {
	
	@Mapping(target = "id",ignore = true)
	@Mapping(target = "createdAt",ignore = true)
	Word wordCreateToEntity(WordCreateDTO dto);
	
	@Mapping(target = "id",ignore = true)
	@Mapping(target = "createdAt",ignore = true)
	Word wordUpdateToEntity(WordUpdateDTO dto);
	
	WordResponseDTO wordToWordResponse(Word word);
	
	

}
