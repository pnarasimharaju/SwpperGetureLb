package com.learnthoughts.narasimha.swppergeturelb;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;
import com.learnthoughts.narasimha.library.Swipper;
public class MainActivity extends Swipper {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       videoView = (VideoView) findViewById(R.id.videoView);
        Uri video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView.setVideoURI(video1);
        videoView.start();
        Brightness(Orientation.HORIZONTAL);
        Volume(Orientation.VERTICAL,videoView);
       //Seek(Orientation.HORIZONTAL, videoView);
        set(this);
    }
}