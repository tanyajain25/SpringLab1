package com.capg.assign.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebApplicationInitializer  extends
AbstractAnnotationConfigDispatcherServletInitializer 
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {WebMVCConfig.class};
		
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
				return new String[] {"/"};
	}

	
}
