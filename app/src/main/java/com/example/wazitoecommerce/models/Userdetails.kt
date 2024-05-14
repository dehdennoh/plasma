package com.example.wazitoecommerce.models

class Userdetails {
    var name:String = ""
    var email:String = ""
    var age:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, quantity: String, price: String, imageUrl: String, id: String) {
        this.name = name
        this.email = quantity
        this.age = price
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}