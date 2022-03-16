package com.example.a003navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_c.view.*

/**
 * A simple [Fragment] subclass.
 */
class fragmentC : Fragment() {

    val args: fragmentCArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_c, container, false)

        val textMessage = args.message
        view.messageTextView.text = textMessage

        return view
    }

}