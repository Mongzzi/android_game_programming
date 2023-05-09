package kr.mongzzi.myapplication;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import kr.mongzzi.myapplication.framework.objects.Sprite;
import kr.mongzzi.myapplication.framework.scene.BaseScene;
import kr.mongzzi.myapplication.framework.view.Metrics;

public class HorzScrollBackground extends Sprite {
    private final float speed;
    private final float width;
    private float scroll;

    public HorzScrollBackground(int bitmapResId, float speed) {
        super(bitmapResId, Metrics.game_width / 2, Metrics.game_height / 2, Metrics.game_width, Metrics.game_height);
        this.width = bitmap.getWidth() * Metrics.game_height / bitmap.getHeight();
        setSize(width, Metrics.game_height);
        this.speed = speed;
    }

    @Override
    public void update() {
        scroll += speed * BaseScene.frameTime;
        if (scroll > width) {
            scroll = scroll % width;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        dstRect.set(-scroll, 0, width - scroll, Metrics.game_height);
        canvas.drawBitmap(bitmap, null, dstRect, null);
        if (scroll > 0) {
            dstRect.set(width - scroll, 0, width, Metrics.game_height);
            canvas.drawBitmap(bitmap, null, dstRect, null);
        }
    }
}