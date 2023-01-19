package com.example.finaluri

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter (

    val items: ArrayList<Fragment>,
    activity2: AppCompatActivity

    ):FragmentStateAdapter(activity2) {
    override fun getItemCount(): Int {
        return items.size
    }

    override fun createFragment(position: Int): Fragment {
      return items[position]
    }
}

