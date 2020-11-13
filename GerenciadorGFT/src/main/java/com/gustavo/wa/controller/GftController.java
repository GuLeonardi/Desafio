package com.gustavo.wa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gustavo.wa.model.Gft;
import com.gustavo.wa.repository.GftRepository;

@Controller
@RequestMapping(value = "/popular")
public class GftController {
	
	@Autowired
	private GftRepository gftRepository;
	
	@GetMapping
	public String popular() {
		Gft gft = new Gft(1L, "80250-210", "Curitiba", "Av. Sete de Setembro, 2451 Torre Trinity Corporate 6º andar", "PR", "Gustavo", "41 4009 5700");
		Gft gft1 = new Gft(2L, "06454-000", "Barueri", "Alameda Rio Negro, n° 585 Ed. Padauiri, 10° andar", "SP", "Henrique", "11 2176-3253");
		Gft gft2 = new Gft(3L, "18095-450", "Sorocaba", "Av. São Francisco, 98 Jardim Sta. Rosália", "SP", "Clecio", "11 2176-3253");
		gftRepository.save(gft);
		gftRepository.save(gft1);
		gftRepository.save(gft2);
		return "GftPopular";	
	}
	
}