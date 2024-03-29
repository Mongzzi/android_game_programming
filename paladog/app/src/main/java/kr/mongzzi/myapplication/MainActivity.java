package kr.mongzzi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import kr.mongzzi.myapplication.framework.view.GameView;

public class MainActivity extends AppCompatActivity {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameView = new GameView(this);
        gameView.setFullScreen();
        setContentView(gameView);

        new MainScene().pushScene();
    }
}