package com.moinammaoueni.shikomori.api.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.moinammaoueni.shikomori.api.dto.word.WordCreateDTO;
import com.moinammaoueni.shikomori.api.dto.word.WordResponseDTO;
import com.moinammaoueni.shikomori.api.dto.word.WordUpdateDTO;
import com.moinammaoueni.shikomori.api.entity.Word;

@Mapper(componentModel = "spring")
public interface AllMappers {
	
	@Mapping(target = "id",ignore = true)
	@Mapping(target = "createdAt",ignore = true)
	Word wordCreateToEntity(WordCreateDTO dto);
	
	
	
	WordResponseDTO wordToWordResponse(Word word);
	
	@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
	@Mapping(target = "id", ignore = true)
	@Mapping(target = "createdAt", ignore = true)
	void updateWordFromDto(WordUpdateDTO dto, @MappingTarget Word word);

}
