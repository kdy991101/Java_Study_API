package com.iu.lang.string.ex1;

public class WorkerView {
	//뷰라는 메서드 워커디티오들을 받아서 정보를 출력
//	WorkerService ws = new WorkerService();
//	ws.init();
	public void view(WorkerDTO[] dtoArray) {
		for(WorkerDTO dto:dtoArray) {
			System.out.print("이름 : " + dto.getName());
			System.out.print(" 부서 : " + dto.getDepartment());
			System.out.print(" 직급 : " + dto.getJop());
			System.out.println(" 번호 : " + dto.getPhone());
			System.out.println("=============================");
		}
		
	}
}
