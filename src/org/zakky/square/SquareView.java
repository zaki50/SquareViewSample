
package org.zakky.square;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class SquareView extends View {

    public SquareView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public SquareView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareView(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);

        int smaller = Math.min(width, height);

        setMeasuredDimension(smaller, smaller);
    }

}
