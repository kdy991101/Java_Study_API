package com.iu.lang.string.ex1;

import java.util.StringTokenizer;

public class WorkerService {
//	private String info;
	private StringBuffer sb;
	
	public WorkerService(){
		sb = new StringBuffer();
		sb.append("iu-인사과-과장-0101111");
		sb.append(", suji-IT-대리-0102222");
		sb.append(", choa-영업-부장-0103333");
		sb.append(", hani-마케팅-사원-0104444");
//		System.out.println(info);
		//결과 iu-인사과-과장-0101111, suji-IT-대리-0102222, choa-영업-부장-0103333, hani-마케팅-사원-0104444
//		String result = sb.toString();
//		System.out.println(result);
	}
	
	public WorkerDTO[] init() {
		//info를 파싱해서 WorkerDTO에 대입
		//WorkerDTO를 모든 배열에 리턴
		String info = sb.toString();//toString = 주소값 안에있는 내용으로 바꿔줌
		String newInfo = info.replace(",", "-");//,을 -로 변경
		StringTokenizer st = new StringTokenizer(newInfo, "-");
		WorkerDTO [] workerDTOs = new WorkerDTO[st.countTokens()/4];
		int i = 0;
		while(st.hasMoreTokens())
		{
			WorkerDTO workerDTO = new WorkerDTO();
				workerDTO.setName(st.nextToken());
				workerDTO.setDepartment(st.nextToken());
				workerDTO.setJop(st.nextToken());
				workerDTO.setPhone(st.nextToken());
				workerDTOs[i] = workerDTO;
				i++;
		}
		return workerDTOs;
	}
	//WorkerDTO[]
//	public WorkerDTO[] init() {
//		//인포에있는 데이터를 parsing해서 워커 디키오에 대입하고 
//		//워커 디키오를 모은 배열을 리턴해준다
////		info.split(",");
//		WorkerService ws;
//		String info = sb.toString();
//		String[] names = info.split(",");  // ws info 정보를 names배열에 대입
//		//String[] infos = ws.info.split("-");
//		StringTokenizer st = new StringTokenizer(info, "-");
//		WorkerDTO[] workerDTOs = new WorkerDTO[st.countTokens()/4];
//		int index = 0;
//		while(st.hasMoreTokens()) {
//		WorkerDTO workerDTO = new WorkerDTO();
//		workerDTO.setName(st.nextToken());
//		workerDTO.setDepartment(st.nextToken());
//		workerDTO.setJop(st.nextToken());
//		workerDTO.setPhone(st.nextToken());
//			workerDTOs[index] = workerDTO;
//			index++;
//		}
////		System.out.println(st.countTokens());
//		
//		
//		int i = 0;
////		String info;
//		WorkerDTO[] dtoArray = new WorkerDTO[names.length];//새로운 배열을 만듬 새로운 배열의 길이는 names의 길이만큼
//		for(i = 0; i<names.length; i++) // names의 길이만큼 반복
//		{
////			System.out.println(names[i]);
////			dto = info[i];
//			names[i] = names[i].trim();//공백을 지워줌
//			
//			String[] worker = names[i].split("-"); //worker라는 배열에 names에 i번째 인덱스에 있는 -를 대입
//			WorkerDTO dto = new WorkerDTO();// dto라는 새로운 배열을 만듬
//			dto.setName(worker[0]);	
//			dto.setDepartment(worker[1]);
//			dto.setJop(worker[2]);
//			dto.setPhone(worker[3]);
//			
//		}
//		return dtoArray;
//		
//		
		
	}

