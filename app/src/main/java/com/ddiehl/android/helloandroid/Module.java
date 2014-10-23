package com.ddiehl.android.helloandroid;

public class Module {
	private String mModuleName;
	private Class<?> mModuleClass;

	public Module(String name, Class<?> in_class) {
		setName(name);
		setModuleClass(in_class);
	}

	public String getName() {
		return mModuleName;
	}

	public void setName(String mName) {
		this.mModuleName = mName;
	}

	public Class<?> getModuleClass() {
		return mModuleClass;
	}

	public void setModuleClass(Class<?> mClass) {
		this.mModuleClass = mClass;
	}

}
