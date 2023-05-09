package kr.mongzzi.myapplication;

import androidx.constraintlayout.helper.widget.Layer;

import kr.mongzzi.myapplication.framework.scene.BaseScene;
import kr.mongzzi.myapplication.framework.view.Metrics;

public class MainScene extends BaseScene {

    public enum Layer {
        bg, tower ,player ,COUNT
    }
    public MainScene() {
        Metrics.setGameSize(16.0f, 9.0f);
        initLayers(Layer.COUNT);

        add(Layer.bg, new HorzScrollBackground(R.mipmap.background_img, 1.0f));
        add(Layer.player, new Player());
        add(Layer.tower,new Tower(R.mipmap.tower,1,5,8,10f));

    }
}
