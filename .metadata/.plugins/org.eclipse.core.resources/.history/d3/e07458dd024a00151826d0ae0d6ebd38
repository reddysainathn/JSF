package com.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CustomInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {

		System.out
				.println("********CustomInterceptor::prerequest Processing********");
		// It will invoke the result from ActionClass
		String result = actionInvocation.invoke();

		System.out
		.println("********CustomInterceptor::postrequest Processing********");

		return result;
	}

}
