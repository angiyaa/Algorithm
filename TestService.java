package com.spring.sample.web.test.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.sample.web.test.dao.ITestDao;

@Service
public class TestService implements ITestService{
	@Autowired
	public ITestDao iTestDao;

	@Override
	public List<HashMap<String, String>> getSellList() throws Throwable {
		// Dao interface 에서 가져올거야
		return iTestDao.getSellList();
	}

	@Override
	public HashMap<String, String> getSell(HashMap<String, String> params) throws Throwable {
		return iTestDao.getSell(params);
	}

	@Override
	public List<HashMap<String, String>> getMgrList() throws Throwable {
		return iTestDao.getMgrList();
	}

	@Override
	public HashMap<String, String> getMgr(HashMap<String, String> params) throws Throwable {
		return iTestDao.getMgr(params);
	}

	@Override
	public int insertSell(HashMap<String, String> params) throws Throwable {
		return iTestDao.insertSell(params);
	}

	@Override
	public int deleteSell(HashMap<String, String> params) throws Throwable {
		return iTestDao.deleteSell(params);
	}

	@Override
	public int updateSell(HashMap<String, String> params) throws Throwable {
		return iTestDao.updateSell(params);
	}

	@Override
	public int insertMgr(HashMap<String, String> params) throws Throwable {
		return iTestDao.insertMgr(params);
	}

	@Override
	public int deleteMgr(HashMap<String, String> params) throws Throwable {
		return iTestDao.deleteMgr(params);
	}

	@Override
	public int updateMgr(HashMap<String, String> params) throws Throwable {
		return iTestDao.updateMgr(params);
	}

	@Override
	public List<HashMap<String, String>> getDivList() throws Throwable {
		return iTestDao.getDivList();
	}

	@Override
	public HashMap<String, String> getDivDetail(HashMap<String, String> params) throws Throwable {
		return iTestDao.getDivDetail(params);
	}

	@Override
	public int insertDiv(HashMap<String, String> params) throws Throwable {
		// TODO Auto-generated method stub
		return iTestDao.insertDiv(params);
	}

	@Override
	public int updateDiv(HashMap<String, String> params) throws Throwable {
		return iTestDao.updateDiv(params);
	}

	@Override
	public int deleteDiv(HashMap<String, String> params) throws Throwable {
		return iTestDao.deleteDiv(params);
	}


}
