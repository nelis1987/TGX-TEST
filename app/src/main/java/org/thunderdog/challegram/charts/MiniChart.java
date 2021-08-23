package org.thunderdog.challegram.charts;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

import org.drinkless.td.libcore.telegram.TdApi;

public class MiniChart {
    @StringRes public final int titleRes;
    @Nullable public final TdApi.DateRange dateRange;

    public MiniChart (@StringRes int titleRes, @Nullable TdApi.DateRange dateRange) {
        this.titleRes = titleRes;
        this.dateRange = dateRange;
    }
}
