package com.example.myapplication

import android.app.Application
import androidx.compose.material.rememberScaffoldState
import androidx.compose.ui.test.junit4.createComposeRule
import io.mockk.mockk
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(instrumentedPackages = ["androidx.loader.content"], application = Application::class)
class ExampleUnitTest {

    @get:Rule
    val rule = createComposeRule()

    @Test
    fun greeting_with_mock_bundle() {
        rule.setContent {
            Greeting(
                mockk(relaxed = true)
            )
        }
    }
}
