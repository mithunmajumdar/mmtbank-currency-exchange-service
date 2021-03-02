package com.mmtbank.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MMTBankExchangeValueRepository extends JpaRepository<MMTBankExchangeValue, Long>  
{  
//creating query method  
	MMTBankExchangeValue findByFromAndTo(String from, String to);  
}  