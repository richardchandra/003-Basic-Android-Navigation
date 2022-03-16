package com.example.a003navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_b.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentB : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        sendMessageBtn.setOnClickListener{
            val message = textMessage.text.toString()
            if(message.isNotEmpty()){
                val action = fragmentBDirections.actionFragmentBToFragmentC(message)
                Navigation.findNavController(view).navigate(action)
            } else {
                Toast.makeText(activity, "Please enter a message", Toast.LENGTH_LONG).show()
            }
        }
    }
}