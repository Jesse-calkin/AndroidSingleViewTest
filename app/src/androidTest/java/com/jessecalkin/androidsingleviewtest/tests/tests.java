package com.jessecalkin.androidsingleviewtest.tests;
import android.test.ActivityInstrumentationTestCase2;

import com.singleviewtest.app.FullscreenActivity;
import com.singleviewtest.app.R;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onData;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.pressBack;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.closeSoftKeyboard;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.typeText;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isDisplayed;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;




/**
 * Created by jesse on 5/12/14.
 * use ./gradlew connectedCheck in console to run
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
//    public void testShouldPass() {
//        assertTrue(true);
//    }
//    public void testShouldFail() {
//        assertTrue(false);
//    }

    public void testSomethingReal() {
        mFullscreenActivity.runOnUiThread(
                new Runnable() {
                    @Override
                    public void run() {
                        onView(withId(R.id.fullscreen_content))
                                .check(matches(isDisplayed()))
                                .perform(click());
                    }
                });
    }
}
