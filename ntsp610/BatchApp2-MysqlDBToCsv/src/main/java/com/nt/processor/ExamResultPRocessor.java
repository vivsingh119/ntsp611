package com.nt.processor;

import org.springframework.batch.item.ItemProcessor;

import com.nt.model.ExamResult;

public class ExamResultPRocessor implements ItemProcessor<ExamResult,ExamResult>{

	@Override
	public ExamResult process(ExamResult item) throws Exception {
		  if(item.getPercentage()>90)
			  return item;
		  else
     		return null;
		  
	}

}
