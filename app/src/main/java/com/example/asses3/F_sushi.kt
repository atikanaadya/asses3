package com.example.asses3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.asses3.buttonsheet.F_buttonsheet_dimsum

class F_sushi : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_f_sushi, container, false)
        val imageList = ArrayList<SlideModel>() // Create image list

        imageList.add(SlideModel("https://images.unsplash.com/photo-1607301405390-d831c242f59b?q=80&w=1770&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "Sushi is a Japanese dish made of vinegared rice and various ingredients."))
        imageList.add(SlideModel("https://images.unsplash.com/photo-1617196034738-26c5f7c977ce?q=80&w=1770&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "Sashimi is a Japanese delicacy consisting of fresh raw fish or meat sliced into thin pieces."))

        val imageSlider = view.findViewById<ImageSlider>(R.id.imageslider)
        imageSlider.setImageList(imageList)
        imageSlider.startSliding(1000)

        val btnShowBottomSheet : Button = view.findViewById(R.id.misushi)


        btnShowBottomSheet.setOnClickListener {
            // Show the BottomSheetDialogFragment when the button is clicked
            val bottomSheetFragment = F_buttonsheet_dimsum()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }
        return view
    }
}