/*

“This is a course requirement for CS 192 Software Engineering II under the supervision of Asst.
Prof. Ma. Rowena C. Solamo of the Department of Computer Science, College of Engineering,
University of the Philippines, Diliman for the AY 2014-2015”

Copyright (c) 2015, Members of Pink Plastics Development
All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are permitted
provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this list of conditions
and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions
and the following disclaimer in the documentation and/or other materials provided with the distribution.

3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse
or promote products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
 AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER
 OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 POSSIBILITY OF SUCH DAMAGE.
 */

/*
Code History:
Jeynald Endaya      2/11/15        Created the initial version of this screen.
*/

/*Documentation
     File Creation Date: 02/11/15
     Development Group: Pink Plastics
     Client Group: 080419 Android

 */

package com.pinkplastics.treesim;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link android.app.Fragment} subclass.
 * Use the {@link com.pinkplastics.treesim.UsageTrackerScreen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UsageTrackerScreen extends Fragment {
     // TODO: Rename parameter arguments, choose names that match
     // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
     private static final String ARG_PARAM1 = "param1";

     // TODO: Rename and change types of parameters
     private String mParam1;


     /**
      * Use this factory method to create a new instance of
      * this fragment using the provided parameters.
      *
      * @param param1 Parameter 1.
      * @return A new instance of fragment MCGIScreen.
      */
     // TODO: Rename and change types and number of parameters
     public static UsageTrackerScreen newInstance(String param1) {
          UsageTrackerScreen fragment = new UsageTrackerScreen();
          Bundle args = new Bundle();
          args.putString(ARG_PARAM1, param1);
          fragment.setArguments(args);
          return fragment;
     }

     public UsageTrackerScreen() {
          // Required empty public constructor
     }

     @Override
     public void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          if (getArguments() != null) {
               mParam1 = getArguments().getString(ARG_PARAM1);
          }
     }

     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
          // Inflate the layout for this fragment

          View view = inflater.inflate(R.layout.fragment_usage_tracker_screen, container, false);

          Typeface heroFont = Typeface.createFromAsset(getActivity().getAssets(), "fonts/hero.otf");
          TextView builders = (TextView) view.findViewById(R.id.usagetracker_name);
          builders.setTypeface(heroFont);

          TextView desc = (TextView) view.findViewById(R.id.usagetracker_description);
          desc.setTypeface(heroFont);

          TextView reminder = (TextView) view.findViewById(R.id.usagetracker_tapscreen);
          reminder.setTypeface(heroFont);

          view.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), UsageTracker.class);
                    startActivity(intent);
               }
          });

          return view;
     }

}
