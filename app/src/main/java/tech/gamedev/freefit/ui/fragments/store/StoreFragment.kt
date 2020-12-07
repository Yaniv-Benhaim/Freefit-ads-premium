package tech.gamedev.freefit.ui.fragments.store

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.store_fragment.*
import tech.gamedev.freefit.R

class StoreFragment : Fragment(R.layout.store_fragment) {

    private val viewModel: StoreViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        webViewSetup()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activity?.onBackPressedDispatcher?.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (wvStore.canGoBack()) wvStore.goBack() else {
                    findNavController().navigate(R.id.action_global_featuredFragment)
                }
            }
        })
    }


    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewSetup() {
        wvStore.webViewClient = WebViewClient()

        wvStore.apply {
            webChromeClient = WebChromeClient()
            loadUrl("https://www.muscleandstrength.com/")
            settings.javaScriptEnabled = true

            webViewClient = object : WebViewClient() {
                override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                    progressBarStore?.visibility = View.VISIBLE
                    super.onPageStarted(view, url, favicon)
                }

                override fun onPageFinished(view: WebView?, url: String?) {
                    progressBarStore?.visibility = View.GONE
                    super.onPageFinished(view, url)
                }
            }

        }
    }


}