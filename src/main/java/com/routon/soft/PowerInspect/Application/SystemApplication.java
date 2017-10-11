package com.routon.soft.PowerInspect.Application;

import android.app.Application;
import android.content.Context;


public class SystemApplication extends Application {

	public static Context applicationContext;
	private static SystemApplication instance;


	@Override
	public void onCreate() {
		super.onCreate();
	}

	public static SystemApplication getInstance() {
		return instance;
	}


}
