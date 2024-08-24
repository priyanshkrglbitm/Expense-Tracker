package com.example.expensetracker

import com.example.expensetracker.data.model.ExpenseEntity
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


object Utils {

    fun formatDateToHumanReadableForm(dateInMillis: Long): String {
        val dateFormatter = SimpleDateFormat("dd/MM/YYYY", Locale.getDefault())
        return dateFormatter.format(dateInMillis)
    }

    fun formatDateForChart(dateInMillis: Long): String {
        val dateFormatter = SimpleDateFormat("dd-MMM", Locale.getDefault())
        return dateFormatter.format(dateInMillis)
    }

    fun formatDayMonth(dateInMillis: Long): String {
        val dateFormatter = SimpleDateFormat("dd/MMM", Locale.getDefault())
        return dateFormatter.format(dateInMillis)
    }

    fun formatToDecimalValue(d: Double): String {
        return String.format("%.2f", d)
    }


    fun getMillisFromDate(date: String): Long {
        return getMilliFromDate(date)
    }
    fun getMilliFromDate(dateFormat: String?): Long {
        var date = Date()
        val formatter = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        try {
            date = dateFormat?.let { formatter.parse(it) }!!
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        println("Today is $date")
        return date.time
    }

    fun getItemIcon(item: ExpenseEntity): Int {
        return if (item.category == "Electricity") {
            R.drawable.ic_electricity
        }
        else if (item.category == "Rent") {
            R.drawable.ic_rent
        }
        else if (item.category == "Vegetables") {
            R.drawable.ic_vegetables
        }else if (item.category=="Guard") {
            R.drawable.ic_security
        }
        else if (item.category == "Tanki Water"||item.category=="tanki water") {
            R.drawable.ic_tankiwater
        }
        else if (item.category == "Grocery"||item.category=="grocery") {
            R.drawable.ic_grocery
        }
        else if (item.category == "RO Water") {
            R.drawable.ic_rowater
        }
        else if (item.category == "Cook") {
            R.drawable.ic_cook
        }
        else if (item.category == "Fridge Rent") {
            R.drawable.ic_fridge
        }
        else if (item.category == "Transportation") {
            R.drawable.ic_transport
        }
        else if (item.category=="LPG") {
            R.drawable.ic_cylinder
        }
        else if (item.category=="Food Out") {
            R.drawable.ic_foodout
        }
        else if (item.category=="Grooming") {
            R.drawable.ic_haircut
        }
        else if (item.category=="Fruits") {
            R.drawable.ic_fruits
        }
        else if (item.category == "Miscellaneous") {
            R.drawable.ic_miscellaneous
        }
        else if (item.category == "Pocket Money") {
            R.drawable.ic_pocketmoney
        }
        else if (item.category == "Savings Last Month") {
            R.drawable.ic_savings
        }
        else if (item.category == "CashBack") {
            R.drawable.ic_cashback
        }
        else {
            R.drawable.ic_personal
        }
    }
}