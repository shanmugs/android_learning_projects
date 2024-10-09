package com.example.myvideoplayer;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MainActivity extends AppCompatActivity {
    static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void playVideo(View view) {
        Log.println(Log.INFO, TAG, "********VIDEO Play Button Pressed  ");
        EditText videoIDInputText = findViewById(R.id.etYoutubeId);
        Button buttonPlay = findViewById(R.id.btPlay);
        YouTubePlayerView youtube_player_view = findViewById(R.id.youtube_player_view);
        String videoId = "INITIAL_VIDEO_PLAY_ID";
        String videoIDText = String.valueOf(videoIDInputText.getText());
        Log.println(Log.INFO, TAG, "********VIDEO ID given is " + videoIDText);
        youtube_player_view.getYouTubePlayerWhenReady(youTubePlayer -> {
            Log.println(Log.INFO, TAG, "********getYouTubePlayerWhenReady " + videoIDText);
            if (videoIDText.isEmpty()) {
                youTubePlayer.pause();
                youTubePlayer.loadVideo(videoId, 0);
                youTubePlayer.play();
            } else {
                videoIDInputText.setText(videoIDText);
                youTubePlayer.pause();
                youTubePlayer.loadVideo(videoIDText, 0);
                youTubePlayer.play();
            }
        });
    }
}