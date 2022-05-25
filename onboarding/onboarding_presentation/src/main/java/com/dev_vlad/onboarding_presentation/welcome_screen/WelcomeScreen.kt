package com.dev_vlad.onboarding_presentation.welcome_screen
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.dev_vlad.core.R
import com.dev_vlad.core_ui.theme.LocalSpacing
import com.dev_vlad.core_ui.theme.CoreTypography
import com.dev_vlad.onboarding_presentation.components.MainBtn

@Composable
fun welcomeScreen() {
  val mdSpace = LocalSpacing.current.mdSpace
  Column(
      modifier = Modifier.fillMaxSize().padding(mdSpace),
      verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally,
  ){
      Text(
          text = stringResource(id= R.string.welcome_text),
          textAlign = TextAlign.Center,
          style = CoreTypography.h1
      )
      Spacer(
          modifier = Modifier.height(mdSpace)
      )
      MainBtn(
          text = stringResource(R.string.next),
          onClick = {/*Todo*/},
          modifier = Modifier.align(
              alignment = Alignment.CenterHorizontally
          )
      )
  }
}