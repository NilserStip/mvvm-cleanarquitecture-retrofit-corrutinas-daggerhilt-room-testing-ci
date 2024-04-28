package com.nilserllamo.mvvm_cleanarchitecture_retrofit_corrutinas_daggerhilt_room_testing_ci

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals(
            "com.nilserllamo.mvvm_cleanarchitecture_retrofit_corrutinas_daggerhilt_room_testing_ci",
            appContext.packageName
        )
    }
}