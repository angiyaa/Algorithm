package com.spring.sample.web.test.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// 외부 저장소에 접근할거야 (DB 작업)
@Repository
public class TestDao implements ITestDao{
	@Autowired
	public SqlSession sqlSession;

	@Override
	public List<HashMap<String, String>> getSellList() throws Throwable {
		
		// selectList : 목록 받아올 때 (여러 줄) 
		// selectList("namespace.id") : 해당 namespace에 있는  id를 찾아서 조회 실행
		// test 에서 getSellList를 가져올거야 (Test_SQL에서 test로 지정했음)
		return sqlSession.selectList("test.getSellList");
	}

	@Override
	public HashMap<String, String> getSell(HashMap<String, String> params) throws Throwable {
		
		// selectOne : 한 줄만 받아올 때 
		// selectOne(쿼리, 데이터) : 해당 쿼리에 데이터를 전달하고 결과를 돌려받음
		// getSell쿼리 params 값을  받아올거야
		return sqlSession.selectOne("test.getSell", params) ;
	}

	@Override
	public List<HashMap<String, String>> getMgrList() throws Throwable {
		return sqlSession.selectList("test.getMgrList");
	}

	@Override
	public HashMap<String, String> getMgr(HashMap<String, String> params) throws Throwable {
		return sqlSession.selectOne("test.getMgr", params);
	}

	@Override
	public int insertSell(HashMap<String, String> params) throws Throwable {
		return sqlSession.insert("test.insertSell", params);
	}

	@Override
	public int deleteSell(HashMap<String, String> params) throws Throwable {
		return sqlSession.delete("test.deleteSell", params);
	}

	@Override
	public int updateSell(HashMap<String, String> params) throws Throwable {
		return sqlSession.update("test.updateSell", params);
	}

	@Override
	public int insertMgr(HashMap<String, String> params) throws Throwable {
		return sqlSession.insert("test.insertMgr", params);
	}

	@Override
	public int deleteMgr(HashMap<String, String> params) throws Throwable {
		return sqlSession.delete("test.deleteMgr", params);
	}

	@Override
	public int updateMgr(HashMap<String, String> params) throws Throwable {
		return sqlSession.update("test.updateMgr", params);
	}

	@Override
	public List<HashMap<String, String>> getDivList() throws Throwable {
		return sqlSession.selectList("test.getDivList");
	}

	@Override
	public HashMap<String, String> getDivDetail(HashMap<String, String> params) throws Throwable {
		return sqlSession.selectOne("test.getDivDetail", params);
	}

	@Override
	public int insertDiv(HashMap<String, String> params) throws Throwable {
		return sqlSession.insert("test.insertDiv", params);
	}

	@Override
	public int updateDiv(HashMap<String, String> params) throws Throwable {
		return sqlSession.update("test.updateDiv", params);
	}

	@Override
	public int deleteDiv(HashMap<String, String> params) throws Throwable {
		return sqlSession.delete("test.deleteDiv", params);
	}
}




