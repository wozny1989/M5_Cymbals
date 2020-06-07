package com.example.cymbals;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
  private SoundPool sp;
  private int soundA;
  private int soundB;
  private int soundC;
  private int soundD;
  private int soundE;
  private int soundF;
  private int soundG;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    sp = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
    soundA = sp.load(getApplicationContext(), R.raw.note6_a, 1);
    soundB = sp.load(getApplicationContext(), R.raw.note7_b, 1);
    soundC = sp.load(getApplicationContext(), R.raw.note1_c, 1);
    soundD = sp.load(getApplicationContext(), R.raw.note2_d, 1);
    soundE = sp.load(getApplicationContext(), R.raw.note3_e, 1);
    soundF = sp.load(getApplicationContext(), R.raw.note4_f, 1);
    soundG = sp.load(getApplicationContext(), R.raw.note5_g, 1);
  }

  public void playA(View v) {
    sp.play(soundA, 1.0f, 1.0f, 0, 0, 1);
  }

  public void playB(View v) {
    sp.play(soundB, 1.0f, 1.0f, 0, 0, 1);
  }

  public void playC(View v) {
    sp.play(soundC, 1.0f, 1.0f, 0, 0, 1);
  }

  public void playD(View v) {
    sp.play(soundD, 1.0f, 1.0f, 0, 0, 1);
  }

  public void playE(View v) {
    sp.play(soundE, 1.0f, 1.0f, 0, 0, 1);
  }

  public void playF(View v) {
    sp.play(soundF, 1.0f, 1.0f, 0, 0, 1);
  }

  public void playG(View v) {
    sp.play(soundG, 1.0f, 1.0f, 0, 0, 1);
  }
}
