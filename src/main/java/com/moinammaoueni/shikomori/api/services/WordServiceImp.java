package com.moinammaoueni.shikomori.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moinammaoueni.shikomori.api.dto.word.WordCreateDTO;
import com.moinammaoueni.shikomori.api.dto.word.WordResponseDTO;
import com.moinammaoueni.shikomori.api.dto.word.WordUpdateDTO;
import com.moinammaoueni.shikomori.api.entity.Word;
import com.moinammaoueni.shikomori.api.mapper.AllMappers;
import com.moinammaoueni.shikomori.api.repository.WordRepository;

@Service
public class WordServiceImp implements WordService {
	
	private WordRepository wordRepository;
	private AllMappers mappers;
	
   public WordServiceImp(WordRepository wordRepository, AllMappers mappers) {
	   
	   this.mappers =mappers;
	   this.wordRepository =wordRepository;
   }

	@Override
	public WordResponseDTO createWord(WordCreateDTO dto) {
		
		Word word = mappers.wordCreateToEntity(dto);
		
	  	wordRepository.save(word);
		
		return mappers.wordToWordResponse(word);
	}

	@Override
	public List<WordResponseDTO> getAllWords() {
		
		List<Word> words = wordRepository.findAll();
		
		List<WordResponseDTO> dtos = words.stream()
				.map(mappers::wordToWordResponse)
				.toList();
		
		return dtos;
	}

	@Override
	public WordResponseDTO getWordById(Long wordId) {
		
		Word word = wordRepository.findById(wordId)
				.orElseThrow(()-> new RuntimeException("mot non trouvé !"));
		
		return mappers.wordToWordResponse(word);
	}

	@Override
	public WordResponseDTO updateWord(Long wordId, WordUpdateDTO dto) {
		
		Word word = wordRepository.findById(wordId)
				.orElseThrow(()-> new RuntimeException("mot non trouvé !"));
        
		mappers.updateWordFromDto(dto, word);
		
		
		return mappers.wordToWordResponse(word);
	}

	@Override
	public void deleteWord(Long wordId) {
		
		Word word = wordRepository.findById(wordId)
				.orElseThrow(()-> new RuntimeException("mot non trouvé !"));
		
		wordRepository.delete(word);
		
	}
	
	

}
