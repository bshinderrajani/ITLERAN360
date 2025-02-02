package com.itlearn360Frameworks.Constants;

public final  class frameworkConstant {
	
	private frameworkConstant()
	{
		
	}
	private static final String configfilepath= "./Confugration/config.properties";
	private static final int imlicitwait=30;
    private static final 	String  fileName=System.getProperty("user.dir")+"/Data/TestInfo.xlsx";
	
	
	public static String getConfigfilepath() {
		return configfilepath;
	}
	
	public static int getImlicitwait() {
		return imlicitwait;
	}

	public static String getFilename() {
		return fileName;
	}
	
	
	

}
