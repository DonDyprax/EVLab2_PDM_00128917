package com.mramirez.evlab2_pdm_00128917.Fragments

import android.content.Context
import android.media.Image
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.mramirez.evlab2_pdm_00128917.R

/**
 * A fragment with a Google +1 button.
 * Activities that contain this fragment must implement the
 * [PlusOneFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [PlusOneFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DynamicImageFragment() : Fragment() {

    // TODO: Rename and change types of parameters
    private var mImage: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.slide_image, container, false)

        mImage = view.findViewById<View>(R.id.imageView) as ImageView

        return view
    }

    override fun onResume() {
        super.onResume()

        // Refresh the state of the +1 button each time the activity receives focus.
       // mPlusOneButton!!.initialize(PLUS_ONE_URL, PLUS_ONE_REQUEST_CODE)
    }

    // TODO: Rename method, update argument and hook method into UI event

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onDetach() {
        super.onDetach()
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments](http://developer.android.com/training/basics/fragments/communicating.html) for more information.
     */

    companion object {
        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PlusOneFragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(side : String): DynamicImageFragment {
            val fragment = DynamicImageFragment()
            val args = Bundle()
            fragment.arguments = args

            return fragment
        }
    }

}// Required empty public constructor
