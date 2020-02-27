package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.UserData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var list = mutableListOf<UserData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = RecyclerViewAdapter(getList())
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }
}

private fun getList(): MutableList<UserData> {
    var list = mutableListOf<UserData>()
    list.add(UserData("Vikash", "Guindy, Chennai, Tamil-Nadu"))
    list.add(UserData("Vijay", "Poonamalai, Chennai, Tamil-Nadu"))
    list.add(UserData("Laxman", "Guindy, Chennai, Tamil-Nadu"))
    list.add(UserData("Dilip", "ECR Road, Chennai, Tamil-Nadu"))
    list.add(UserData("Jana JK", "Kutt Road, Chennai, Tamil-Nadu"))
    list.add(UserData("Akash", "Tambaram, Chennai, Tamil-Nadu"))
    list.add(UserData("Pranesh", "Phonix mall, Chennai, Tamil-Nadu"))

    list.add(UserData("Vikash", "Guindy, Chennai, Tamil-Nadu"))
    list.add(UserData("Vijay", "Poonamalai, Chennai, Tamil-Nadu"))
    list.add(UserData("Laxman", "Guindy, Chennai, Tamil-Nadu"))
    list.add(UserData("Dilip", "ECR Road, Chennai, Tamil-Nadu"))
    list.add(UserData("Jana JK", "Kutt Road, Chennai, Tamil-Nadu"))
    list.add(UserData("Akash", "Tambaram, Chennai, Tamil-Nadu"))
    list.add(UserData("Pranesh", "Phonix mall, Chennai, Tamil-Nadu"))

    list.add(UserData("Vikash", "Guindy, Chennai, Tamil-Nadu"))
    list.add(UserData("Vijay", "Poonamalai, Chennai, Tamil-Nadu"))
    list.add(UserData("Laxman", "Guindy, Chennai, Tamil-Nadu"))
    list.add(UserData("Dilip", "ECR Road, Chennai, Tamil-Nadu"))
    list.add(UserData("Jana JK", "Kutt Road, Chennai, Tamil-Nadu"))
    list.add(UserData("Akash", "Tambaram, Chennai, Tamil-Nadu"))
    list.add(UserData("Pranesh", "Phonix mall, Chennai, Tamil-Nadu"))

    list.add(UserData("Vikash", "Guindy, Chennai, Tamil-Nadu"))
    list.add(UserData("Vijay", "Poonamalai, Chennai, Tamil-Nadu"))
    list.add(UserData("Laxman", "Guindy, Chennai, Tamil-Nadu"))
    list.add(UserData("Dilip", "ECR Road, Chennai, Tamil-Nadu"))
    list.add(UserData("Jana JK", "Kutt Road, Chennai, Tamil-Nadu"))
    list.add(UserData("Akash", "Tambaram, Chennai, Tamil-Nadu"))
    list.add(UserData("Pranesh", "Phonix mall, Chennai, Tamil-Nadu"))

    list.add(UserData("Vikash", "Guindy, Chennai, Tamil-Nadu"))
    list.add(UserData("Vijay", "Poonamalai, Chennai, Tamil-Nadu"))
    list.add(UserData("Laxman", "Guindy, Chennai, Tamil-Nadu"))
    list.add(UserData("Dilip", "ECR Road, Chennai, Tamil-Nadu"))
    list.add(UserData("Jana JK", "Kutt Road, Chennai, Tamil-Nadu"))
    list.add(UserData("Akash", "Tambaram, Chennai, Tamil-Nadu"))
    list.add(UserData("Pranesh", "Phonix mall, Chennai, Tamil-Nadu"))

    list.add(UserData("Vikash", "Guindy, Chennai, Tamil-Nadu"))
    list.add(UserData("Vijay", "Poonamalai, Chennai, Tamil-Nadu"))
    list.add(UserData("Laxman", "Guindy, Chennai, Tamil-Nadu"))
    list.add(UserData("Dilip", "ECR Road, Chennai, Tamil-Nadu"))
    list.add(UserData("Jana JK", "Kutt Road, Chennai, Tamil-Nadu"))
    list.add(UserData("Akash", "Tambaram, Chennai, Tamil-Nadu"))
    list.add(UserData("Pranesh", "Phonix mall, Chennai, Tamil-Nadu"))

    return list
}