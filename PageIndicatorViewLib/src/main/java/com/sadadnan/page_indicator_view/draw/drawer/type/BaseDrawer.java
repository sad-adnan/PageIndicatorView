package com.sadadnan.page_indicator_view.draw.drawer.type;

import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.sadadnan.page_indicator_view.draw.data.Indicator;

class BaseDrawer {

    Paint paint;
    Indicator indicator;

    BaseDrawer(@NonNull Paint paint, @NonNull Indicator indicator) {
        this.paint = paint;
        this.indicator = indicator;
    }
}
