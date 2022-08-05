package com.spring.sample.web.test.dao;

import java.util.HashMap;
import java.util.List;

public interface ITestDao {

	public List<HashMap<String, String>> getSellList() throws Throwable;

	public HashMap<String, String> getSell(HashMap<String, String> params) throws Throwable;

	public List<HashMap<String, String>> getMgrList() throws Throwable;

	public HashMap<String, String> getMgr(HashMap<String, String> params) throws Throwable;

	public int insertSell(HashMap<String, String> params) throws Throwable;

	public int deleteSell(HashMap<String, String> params) throws Throwable;

	public int updateSell(HashMap<String, String> params) throws Throwable;

	public int insertMgr(HashMap<String, String> params) throws Throwable;

	public int deleteMgr(HashMap<String, String> params) throws Throwable;

	public int updateMgr(HashMap<String, String> params) throws Throwable;

	public List<HashMap<String, String>> getDivList() throws Throwable;

	public HashMap<String, String> getDivDetail(HashMap<String, String> params) throws Throwable;

	public int insertDiv(HashMap<String, String> params) throws Throwable;

	public int updateDiv(HashMap<String, String> params) throws Throwable;

	public int deleteDiv(HashMap<String, String> params) throws Throwable;
}
