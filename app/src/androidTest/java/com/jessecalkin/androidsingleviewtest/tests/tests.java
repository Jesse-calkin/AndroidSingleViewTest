package com.jessecalkin.androidsingleviewtest.tests;
import android.test.ActivityInstrumentationTestCase2;
import com.singleviewtest.app.FullscreenActivity;

/**
 * Created by jesse on 5/12/14.
 */
public class tests extends ActivityInstrumentationTestCase2<FullscreenActivity>  {
    private FullscreenActivity mFullscreenActivity;

    @SuppressWarnings("deprecation")
    public tests() {
        super("com.singleviewtest.app", FullscreenActivity.class);
    }

    protected void setUp() throws Exception {
        super.setUp();

        mFullscreenActivity = getActivity();

    }
}
