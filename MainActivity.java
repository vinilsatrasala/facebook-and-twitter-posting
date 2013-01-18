package com.example.samplesocialshareproject;

import com.rikt.and.social.share.fb.FaceBook;
//import com.rikt.and.social.share.twitter.TwitterApp;
//import com.rikt.and.social.share.twitter.TwitterApp.TwDialogListener;
import com.rikt.and.social.share.twitter.TwitterPost;

import android.os.Bundle;
//import android.os.Handler;
//import android.os.Message;
//import android.widget.Toast;
import android.app.Activity;
//import android.app.AlertDialog;
import android.content.Context;

//import android.content.DialogInterface;

public class MainActivity extends Activity {
	FaceBook fb;
	TwitterPost mTwitter;
	String username = "";
	static String TWEET_AUTH_Key, TWEET_AUTH_SECRET_Key;
	Context ct;
	String review = "twiiter";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// fb=new FaceBook("117119991727139",MainActivity.this);
		TWEET_AUTH_Key = "498749982-2XbXBR1JwNUbU7khWPw6Y9i0pUNTmo7oDfspI5hk";
		TWEET_AUTH_SECRET_Key = "NIYKNoTzNYTheNsHO4x802EO0GSfl4fvZ2KN0QAvaww";
		mTwitter = new TwitterPost(MainActivity.this, "64SgnF2ok9apOyDcdO0Uw",
				"HMTI3FbTQsS7TpXOBvCC5cpO4YOW7XEAcj9BHyks9K4",
				"twitterapp://connect", TWEET_AUTH_Key, TWEET_AUTH_SECRET_Key,review);
		
	}

	

}
