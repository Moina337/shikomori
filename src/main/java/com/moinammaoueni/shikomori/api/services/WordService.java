package com.moinammaoueni.shikomori.api.services;

import java.util.List;

import com.moinammaoueni.shikomori.api.dto.word.WordCreateDTO;
import com.moinammaoueni.shikomori.api.dto.word.WordResponseDTO;
import com.moinammaoueni.shikomori.api.dto.word.WordUpdateDTO;

public interface WordService {

    WordResponseDTO createWord(WordCreateDTO dto);

    List<WordResponseDTO> getAllWords();

    WordResponseDTO getWordById(Long wordId);

    WordResponseDTO updateWord(Long wordId, WordUpdateDTO dto);

    void deleteWord(Long wordId);
}