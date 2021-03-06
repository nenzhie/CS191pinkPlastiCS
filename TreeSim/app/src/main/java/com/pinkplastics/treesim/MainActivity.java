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
2/11/2015 - Created the initial MainActivity file
 */

/*
File Creation Date: 2/11/2015
Development Group: Pink Plastics
Client Group: 080419 Android
Code Summary: The root screen for the application
 */



package com.pinkplastics.treesim;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

     private ViewPager mViewPager;
     private ScreenPagerAdapter mScreenPagerAdapter;

     @Override
     /**
      * onCreate
      * Creation Date: 02/11/2015
      * Purpose: Default onCreate function for android
      *
      * @param savedInstanceState  for returning to this particular screen
      */
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(com.pinkplastics.treesim.R.layout.activity_main);

          setTitle("");

          ActionBar ab = getSupportActionBar();
          ab.setDisplayShowHomeEnabled(true);
          ab.setLogo(com.pinkplastics.treesim.R.drawable.ic_launcher);
          ab.setDisplayUseLogoEnabled(true);

          mViewPager = (ViewPager) findViewById(com.pinkplastics.treesim.R.id.main_pager);
          mScreenPagerAdapter = new ScreenPagerAdapter(getSupportFragmentManager());

          mViewPager.setAdapter(mScreenPagerAdapter);
     }

     @Override
     /**
      * onCreateOptionsMenu
      * Creation Date: 02/11/2015
      * Purpose: Default onCreateOptionsMenu for android activities
      *
      * @param menu the menu to be inflated
      * @return     boolean   always returns true if this method executes
      */
     public boolean onCreateOptionsMenu(Menu menu) {
          // Inflate the menu; this adds items to the action bar if it is present.
          getMenuInflater().inflate(R.menu.menu_main, menu);
          return true;
     }

     @Override
     /**
      * onOptionsItemSelected
      * Creation Date: 02/11/2015
      * Purpose: Default onOptionsItemSelected method for android activities
      *
      * @param      item      the menu item that was selected
      * @return     boolean   dependent on android item clicks
      */
     public boolean onOptionsItemSelected(MenuItem item) {
          // Handle action bar item clicks here. The action bar will
          // automatically handle clicks on the Home/Up button, so long
          // as you specify a parent activity in AndroidManifest.xml.
          int id = item.getItemId();

          //noinspection SimplifiableIfStatement
          if (id == R.id.action_settings) {
               return true;
          }

          return super.onOptionsItemSelected(item);
     }
}
