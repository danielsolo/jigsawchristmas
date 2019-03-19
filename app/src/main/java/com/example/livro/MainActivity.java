package com.example.livro;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextToSpeech tts;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                tts.setLanguage(Locale.US);
            }
        });


    }

    public void onclick1(View v){
        tts.speak("The Grinch Stole the Christmas", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onclick2(View v){
        tts.speak("Santa stole it back", TextToSpeech.QUEUE_FLUSH, null);
    }

    public void onclick3(View v){
        tts.speak("JigSaw split the Christmas into two equal size parts, so everybody is Happy", TextToSpeech.QUEUE_FLUSH, null);
    }





}