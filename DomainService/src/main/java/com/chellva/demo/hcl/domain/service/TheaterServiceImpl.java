package com.chellva.demo.hcl.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chellva.demo.hcl.domain.model.Theater;
import com.chellva.demo.hcl.domain.repository.TheaterRepository;

@Service
public class TheaterServiceImpl implements TheaterService {
	
	@Autowired
	TheaterRepository theaterRepository;
	
	@Override
	public List<Theater> listTheaters() {
		// TODO Connect To H2 after testing by hard-coded values
		
		List<Theater> theatersList = new ArrayList<>();
		
/*		Theater theaterChennai = new Theater();
		theaterChennai.setName("Mayajall");
		theaterChennai.setCity("Chennai");
		theaterChennai.setPincode(600100);
		
		Theater theaterKaraikudi = new Theater();
		theaterKaraikudi.setName("Pandian");
		theaterKaraikudi.setCity("Karaikudi");
		theaterKaraikudi.setPincode(630002);
		
		theatersList.add(theaterChennai);
		theatersList.add(theaterKaraikudi);
		return theatersList;*/
		
		return (List<Theater>) theaterRepository.findAll();

	}

}
