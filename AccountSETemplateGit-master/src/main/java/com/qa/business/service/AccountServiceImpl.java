package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.AccountRepository;

public class AccountServiceImpl implements AccountService{

	@Inject
	private AccountRepository repo;

	public String getAllAccounts() {
		return repo.getAllAccounts();
	}

	@Override
	public String createAccount(String account) {
		
         if(account.contains("9999")) {
			return "{\"message\" :\"This account is blocked\"}";
		}
		return repo.createAccount(account);
	}
	
//		@Override
//	    public String createAccount(String account) {
//	        if(account.contains("9999")) {
////	        return "Can't Add This Account";
//	    }
//	        return repo.createAccount(account);
	    
	

	@Override
	public String deleteAccount(int accountNumber) {
		return repo.deleteAccount(accountNumber);
		
	}

	@Override
	public String updateAccount(int accountNumber, String account) {
		return repo.updateAccount(accountNumber, account);
	}


}
