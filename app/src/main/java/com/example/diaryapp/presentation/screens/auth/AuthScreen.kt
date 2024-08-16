package com.example.diaryapp.presentation.screens.auth

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AuthScreen(
    loadingState: Boolean,
//    oneTapState:OneTapSignInState,
    onButtonClicked: () -> Unit
){
    Scaffold(
        modifier = Modifier,
        content = {
            AuthContent(loadingState,onButtonClicked)
        }

    )
//    OneTapSignInWithGoogle(
//        state = oneTapState,
//        clientId = "756074391985-a7fhbu1f1effvjp896m4doec31cv6uiq.apps.googleusercontent.com",
//        onTokenIdReceived = { tokenId ->
//            Log.d("AUTH", getUserFromTokenId(tokenId).toString())
//        },
//        onDialogDismissed = { message ->
//            Log.d("LOG", message)
//        }
//    )


}