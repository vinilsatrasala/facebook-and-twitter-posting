package com.example.samplesocialshareproject;

import com.rikt.and.social.share.fb.FaceBook;
import com.rikt.and.social.share.fscheckin.FourSquareCheckin;
import com.rikt.and.social.share.twitter.TwitterPost;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Context

public class MainActivity extends Activity {
	FaceBook fb;
	TwitterPost mTwitter;
	String username = "";
	static String TWEET_AUTH_Key, TWEET_AUTH_SECRET_Key;
	Context ct;
	String review = "twiiter";
   FourSquareCheckin fschckin;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
      //for posting into facebook please send the app_id and message,title,link,icon link,description and application context respectively as parameters
      
	fb = new FaceBook("117119991727139", "message","title","www.google.com","http://mojoimage.com/free-image-hosting-11/403157x57.png",review,MainActivity.this);

    
    //for posting into twitter please send the application context,consumer key, secret key,callbackurl,twitterauthkey,twittersecretauthkey and data respectively as parameters
    
		TWEET_AUTH_Key = "498749982-2XbXBR1JwNUbU7khWPw6Y9i0pUNTmo7oDfspI5hk";
		TWEET_AUTH_SECRET_Key = "NIYKNoTzNYTheNsHO4x802EO0GSfl4fvZ2KN0QAvaww";
		mTwitter = new TwitterPost(MainActivity.this, "64SgnF2ok9apOyDcdO0Uw",
				"HMTI3FbTQsS7TpXOBvCC5cpO4YOW7XEAcj9BHyks9K4",
				"twitterapp://connect", TWEET_AUTH_Key, TWEET_AUTH_SECRET_Key,review);
            
    // for foursquare checkin you need to pass application context, client id, clientsecret key.        
            
    fschckin = new FourSquareCheckin(MainActivity.this,
				"OGCPZDVYJY12K25K1V3GE3FCTUV4COXPOHCUHNBFWJKKBRYR",
				"MTPOS0E0GAJVWEK2YGP0ANRXYDLFWBWUHHHUJB3KPKTFJME5");
		
	}

	

}
