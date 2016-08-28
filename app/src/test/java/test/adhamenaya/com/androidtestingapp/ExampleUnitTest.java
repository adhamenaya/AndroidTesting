package test.adhamenaya.com.androidtestingapp;

import android.content.Context;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */

@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {

    @Mock
    Context mContext;

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test_boolean() throws Exception {
        assertTrue(5>1);
    }

    @Test
    public void test_getAppName() {
        String appNameShouldBe = "AndroidTestingApp";

        // Create instance of class under test
        TestAndroidStringRes testAndroidStringRes = new TestAndroidStringRes();

        // Set fake value from the string in the mocked context
        Mockito.when(mContext.getString(R.string.app_name)).thenReturn(appNameShouldBe);

        // Check the app return the text from the string resources
        assertEquals(appNameShouldBe, testAndroidStringRes.getString(mContext));
    }
}