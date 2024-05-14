package com.example.wazitoecommerce

import com.google.firebase.database.Exclude

data class Donors(
    @Exclude var courseID: String? = "",
    var donorName: String? = "",
    var emailAddress: String? = "",
    var contactInfo: String? = ""
)
