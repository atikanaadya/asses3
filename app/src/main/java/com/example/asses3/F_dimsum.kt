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

class F_dimsum : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_f_dimsum, container, false)
        val imageList = ArrayList<SlideModel>() // Create image list

        imageList.add(SlideModel("https://images.unsplash.com/photo-1496116218417-1a781b1c416c?q=80&w=1770&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "Dim sum is a large range of small Cantonese dishes."))
        imageList.add(SlideModel("https://images.unsplash.com/photo-1563245370-63ffc97abdbd?q=80&w=1770&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "A type of steamed dumpling that is usually filled with pork and shrimp."))

        val imageSlider = view.findViewById<ImageSlider>(R.id.imageslider2)
        imageSlider.setImageList(imageList)
        imageSlider.startSliding(1000)

        val btnShowBottomSheet : Button = view.findViewById(R.id.midimsum)


        btnShowBottomSheet.setOnClickListener {
            // Show the BottomSheetDialogFragment when the button is clicked
            val bottomSheetFragment = F_buttonsheet_dimsum()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
            }

        return view
    }
}