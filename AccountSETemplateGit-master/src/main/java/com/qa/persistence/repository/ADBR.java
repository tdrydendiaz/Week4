package com.qa.persistence.repository;

import java.util.List;

import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

@Transactional(TxType.SUPPORTS)
@Default
public class ADBR implements AccountRepository {
	
	
 
	@PersistenceContext(unitName="primary")
	private EntityManager manager;
	
	@Transactional(TxType.REQUIRED)
    @Override
	public String createAccount(String account) {
		new JSONUtil();
		Account util = JSONUtil.getObjectForJSON(account, Account.class);
		manager.persist(util);
		return "{\"message\": \"account sucessfully added\"}";
	}

	
	@Override
	public String getAllAccounts() {
		TypedQuery<Account> query = manager.createQuery("SELECT a FROM ACCOUNT a ORDER BY a.id DESC", Account.class);
		return query.getResultList().toString();
	}
	
	public String findAnAccount(int accountNumber) {
		return util.getJSONForObject(manager.find(Account.class, accountNumber));
	
	}
	
	
	@Transactional(TxType.REQUIRED)
	@Override
	public String deleteAccount(int accountNumber) {
    Account account= manager.find(Account.class, accountNumber);
    manager.remove(account);
		return "{\"message\": \"account sucessfully deleted\"}";
		
//		Movie movieInDB = util.getObjectForJSON(getAMovie(id), Movie.class);
//
//		if (manager.contains(manager.find(Movie.class, id))) {
//
//			manager.remove(manager.find(Movie.class, id));
//		}
//		return "{\"message\": \"movie sucessfully deleted\"}";
//		
	
	}
	@Transactional(TxType.REQUIRED)
	@Override
	public String updateAccount(int accountNumber, String account) {
		
		return null;
	}
	
	
}
