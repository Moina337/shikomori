package com.moinammaoueni.shikomori.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.moinammaoueni.shikomori.api.dto.word.WordCreateDTO;
import com.moinammaoueni.shikomori.api.dto.word.WordResponseDTO;
import com.moinammaoueni.shikomori.api.dto.word.WordUpdateDTO;
import com.moinammaoueni.shikomori.api.services.WordService;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/words")
@CrossOrigin("*")
public class WordController {

	private final WordService wordService;

	public WordController(WordService wordService) {
		this.wordService = wordService;
	}

	// CREATE WORD
	@Operation(summary = "Créer un mot")
	@PostMapping
	public ResponseEntity<WordResponseDTO> createWord(@Valid @RequestBody WordCreateDTO dto) {

		WordResponseDTO response = wordService.createWord(dto);

		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	// GET ALL WORDS
	@GetMapping
	public ResponseEntity<List<WordResponseDTO>> getAllWords() {

		List<WordResponseDTO> words = wordService.getAllWords();

		return ResponseEntity.ok(words);
	}

	// GET WORD BY ID
	@GetMapping("/{wordId}")
	public ResponseEntity<WordResponseDTO> getWordById(@PathVariable Long wordId) {

		WordResponseDTO response = wordService.getWordById(wordId);

		return ResponseEntity.ok(response);
	}

	// UPDATE WORD
	@PutMapping("/{wordId}")
	public ResponseEntity<WordResponseDTO> updateWord(@PathVariable Long wordId,
			@Valid @RequestBody WordUpdateDTO dto) {

		WordResponseDTO response = wordService.updateWord(wordId, dto);

		return ResponseEntity.ok(response);
	}

	// DELETE WORD
	@DeleteMapping("/{wordId}")
	public ResponseEntity<Void> deleteWord(@PathVariable Long wordId) {

		wordService.deleteWord(wordId);

		return ResponseEntity.noContent().build();
	}
}