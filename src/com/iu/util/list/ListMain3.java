package com.iu.util.list;

import java.util.ArrayList;

import com.iu.lang.string.ex1.WorkerDTO;

public class ListMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WorkerDTO workerDTO = new WorkerDTO();
	WorkerDTO workerDTO2 = new WorkerDTO();
	
	ArrayList<WorkerDTO> ar = new ArrayList<>();
//	ArrayList<Integer> ar2 = ArrayList<Integer>();
	
	ListView listView = new ListView();
	
//	ar.add(workerDTO.getName());
//	ar.add(workerDTO.getDepartment());
//	ar.add(workerDTO.getJop());
//	ar.add(workerDTO.getPhone());
	ar.add(workerDTO);
	ar.add(workerDTO2);
	listView.view(ar);
	
	}
}