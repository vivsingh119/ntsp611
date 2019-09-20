package com.nt.processor;

import org.springframework.batch.item.ItemProcessor;

import com.nt.model.ExamResult;

public class ExamResultProcessor implements ItemProcessor<ExamResult, ExamResult> {

	@Override
	public ExamResult process(ExamResult item) throws Exception {
	       if(item.getPercentage()>=95)
	    	   return item;
	       else
		     return null;
	}

}
