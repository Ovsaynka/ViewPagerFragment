package com.example.viewpagerfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.airbnb.lottie.LottieAnimationView

class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.a_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //search animation in xml file
        val ribbon = view.findViewById(R.id.lottieAnimation) as LottieAnimationView

        with(ribbon) {
            if (!this.isAnimating) {    //if animation is search
                setAnimation(R.raw.stay_home)
                playAnimation()        //animation start
                repeatCount =
                    com.airbnb.lottie.LottieDrawable.INFINITE  //the animation will not stop
            }
        }
    }
}