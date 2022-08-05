package com.spring.sample.web.test.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.sample.web.test.service.ITestService;

@Controller
public class TestController {
	@Autowired
	public ITestService iTestService;
	
	
	
	/*
	 * throws Throwable
	 * Database나 파일 같이 외부에 접근하는 경우 외적요인으로 문제가 발생할 수 있으므로
	 * 예외처리가 반드시 필요하다 => Spring이 알아서 처리하게
	 */
	@RequestMapping(value="/sellList")
	public ModelAndView sellList(ModelAndView mav) throws Throwable {
		// 데이터 취득
		List<HashMap<String, String>> list = iTestService.getSellList();
		
		mav.addObject("list", list);
		
		mav.setViewName("test/sellList");
		
		return mav;
	}
	
	@RequestMapping(value="/sellDetail")
	public ModelAndView sellDetail(
			// no 넘길거니까 hashmap으로 받아와 params라는 이름에 넣어서 
			@RequestParam HashMap<String, String> params,
			ModelAndView mav) throws Throwable {
		
		// 필수항목이 null 이거나 공란일 때 처리
		// no 값이 안넘어오거나 no 자체가 안넘어온 경우
		if(params.get("no") == null || params.get("no") == "") {
			
			// redirect: 주소 => 주소로 돌아가(단순이동)/ 단 GET 방식만 이용 가능
			// no값 없으면 상세보기 열지말고 목록으로 돌아가
			mav.setViewName("redirect:sellList");
			
		} else {
		// 확인용 => 콘솔에 {no=14(사용자가 클릭한 열의 판매번호)} 라고 뜸
		System.out.println(params.toString());
		// getSell 메소드 생성
		HashMap<String, String> data = iTestService.getSell(params);
		
		// 받아온 data를 add 하고 출력할 주소는 test/sellDetail
		mav.addObject("data", data);
		mav.setViewName("test/sellDetail");
		}
		
		return mav;
	}
	
	   @RequestMapping(value = "/sellInsert")
	   public ModelAndView sellInsert(ModelAndView mav) {

	      mav.setViewName("test/sellInsert");
	      return mav;
	   }
	   
	   @RequestMapping(value="/sellRes")
	   public ModelAndView sellInsertRes(
			   @RequestParam HashMap<String, String> params,
			   ModelAndView mav) throws Throwable{
		   
		   // 안전장치 : 사용자에게 에러가 떴음을 알리는 예외 처리
		   try {
			   // 등록하고 개수를 받을거야
			   int cnt = 0; 
			   switch(params.get("gbn")) {
			   case "i" : 
				   cnt = iTestService.insertSell(params);
				   break;
			   case "u" : 
				   cnt = iTestService.updateSell(params);
				   break;
			   case "d" : 
				   cnt = iTestService.deleteSell(params);
				   break;
			   }
			   
			   // 상태에 따른 세가지의 상태값
			   if(cnt > 0) {
				   // 1건 이상 등록
				   mav.addObject("res", "success");
			   } else {
				   // 등록실패
				   mav.addObject("res", "failed");
			   }
			   
		   } catch(Exception e) {
			   // 예외 발생
			   e.printStackTrace();
			   mav.addObject("res", "error");
		   }
		   
		   mav.setViewName("test/sellRes");
		   return mav;
	   }
	   
	   @RequestMapping(value="/sellUpdate")
	   public ModelAndView sellUpdate(
			   @RequestParam HashMap<String, String> params,
			   ModelAndView mav) throws Throwable {

		   // 어차피 상세보기 조회 = 수정을 위한 조회
		   // 굳이 sellUpdate 할 필요 없이 getSell(params)
		   HashMap<String, String> data = iTestService.getSell(params);
		   
		   mav.addObject("data", data);
		   mav.setViewName("test/sellUpdate");
		   return mav;
	   }

	   @RequestMapping(value="/mgrList")
	   public ModelAndView mgrList(ModelAndView mav) throws Throwable{
		   
		   List <HashMap<String, String>> list = iTestService.getMgrList();
		   
		   mav.addObject("list", list);
		   mav.setViewName("test/mgrList");
		   
		   return mav;
	   }
	   
	   @RequestMapping(value="/mgrDetail")
	   public ModelAndView mgrDetail(
			   @RequestParam HashMap<String, String> params,
			   ModelAndView mav) throws Throwable {
		   
		   if(params.get("no") == null || params.get("no") == "") {
			   mav.setViewName("redirect:mgrList");
		   } else {
			   HashMap<String, String> data = iTestService.getMgr(params);
			   mav.addObject("data", data);
			   mav.setViewName("test/mgrDetail");
		   }
		   return mav;
	   }
	   
	   @RequestMapping(value="/mgrInsert")
	   public ModelAndView mgrInsert(ModelAndView mav) throws Throwable {
		   
		   mav.setViewName("test/mgrInsert");
		   return mav;
	   }
	   
	   @RequestMapping(value="/mgrRes")
	   public ModelAndView mgrRes(
			   @RequestParam HashMap<String, String> params,
			   ModelAndView mav) throws Throwable {
		   int cnt = 0;
		   try {
			   switch(params.get("gbn")) {
			   case "i" :
				   cnt = iTestService.insertMgr(params);
				   break;
			   case "u" : 
				   cnt = iTestService.updateMgr(params);
				   break;
			   case "d" : 
				   cnt = iTestService.deleteMgr(params);
				   break;
			   	};
			   	
			   	if(cnt > 0) {
			   		mav.addObject("res", "success");
			   	} else 
			   		mav.addObject("res", "failed");
			   		
		   } catch(Exception e) {
			   // 예외 발생
			   e.printStackTrace();
			   mav.addObject("res", "error");
		   }
		   		   
		   mav.setViewName("test/mgrRes");
		   return mav;
	   }
	   
	   @RequestMapping(value="/mgrUpdate")
	   public ModelAndView mgrUpdate(
				@RequestParam HashMap<String, String> params
				, ModelAndView mav) throws Throwable {

			HashMap<String, String> data = iTestService.getMgr(params);

			mav.addObject("data", data);
			mav.setViewName("test/mgrUpdate");
			 return mav; 
	   }
	   
	   @RequestMapping(value="/divList")
	   public ModelAndView divList(ModelAndView mav) throws Throwable{
		   
		   List<HashMap<String, String>> list = iTestService.getDivList();
		   
		   mav.addObject("list", list);
		   mav.setViewName("test/divList");
		   return mav;
	   }
	   
	   @RequestMapping(value="/divDetail")
	   public ModelAndView divDetail(
			   @RequestParam HashMap<String, String> params,
			   ModelAndView mav) throws Throwable{
		   
		   HashMap<String, String> data = iTestService.getDivDetail(params);
		   
		   
		   mav.addObject("data", data);
		   mav.setViewName("test/divDetail");
		   return mav;
	   }
	   
	   @RequestMapping(value="/divAction")
	   public ModelAndView divAction(
			   @RequestParam HashMap<String, String> params,
			   ModelAndView mav) throws Throwable{

		   	   int cnt = 0;
			   try {
				   
				   switch(params.get("gbn")) {
				   case "i":
					   cnt = iTestService.insertDiv(params);
					   break;
				   case "u":
					   cnt = iTestService.updateDiv(params);
					   break;
				   case "d":
					   cnt = iTestService.deleteDiv(params);
					   break;
				   }
				   
				   if(cnt > 0) {
					   mav.addObject("action", "succeed");
				   } else
					   mav.addObject("action", "failed");
				   
			} catch (Exception e) {
				mav.addObject("action", "error");
				e.printStackTrace();
			}
		   
		   mav.setViewName("test/divAction");
		   return mav;
	   }
	   
	   @RequestMapping(value="/divInsert")
	   public ModelAndView divInsert(ModelAndView mav) {
		   mav.setViewName("test/divInsert");
		   return mav;
	   }
	   
	   @RequestMapping(value="/divUpdate")
	   public ModelAndView divUpdate(
			   @RequestParam HashMap<String, String> params,
			   ModelAndView mav) throws Throwable{
		   // 가져올 데이터는 getDiveDetail()과 동일하고 작성할 jsp는 insert와 유사함
		   HashMap<String, String> data = iTestService.getDivDetail(params);
		   mav.addObject("data", data);
		   mav.setViewName("test/divUpdate");
		   return mav;
	   }
}