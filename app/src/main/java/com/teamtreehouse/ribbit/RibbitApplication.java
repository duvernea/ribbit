package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, 
	    	"gE2MYReRlxxWH7wlRt2NNzDfQdMPTXwO5dCfseo5",
	    	"jI4J4SQIWGA8TWsG1VEI4kwAU3Ibnfcgpb4zbYKt");
	}
}
