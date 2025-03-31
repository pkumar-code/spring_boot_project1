package com.jlcindia.boot;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BookDAO extends JpaRepository<Book,Integer>{
	
	@Query("from Book mybook")
	  List<Book>getAllBook(Pageable pageable);
	
		public int countBookByBidNotNull();

}
