package com.example.quizapp
object Constants {
    // Question repository
    const val Question1 = "How to pass the data between activities in Android?"
    const val Q1O1 = " Intent"
    const val Q1O2 = "Content Provider"
    const val Q1O3 = "Broadcast receiver"
    const val Q1O4 = "None of the Above"
    const val Question2 = "How to move services to foreground in android?"
    const val Q2O1 = "Services always work in Foreground only"
    const val Q2O2 = "No,We can't do this query"
    const val Q2O3 = "startForeground(int id, Notification notification)."
    const val Q2O4 = "Using startService(Intent intent)"
    const val Question3 = "What is broadcast receiver in android?"
    const val Q3O1 = "It will do background functionalities as services."
    const val Q3O2 = "It will pass the data between activities."
    const val Q3O3 = " It will react on broadcast announcements."
    const val Q3O4 = "None of the Above"
    const val Question4 = "How many broadcast receivers are available in android?"
    const val Q4O1 = "sendBroadcast(),sendOrderBroadcast(),and sendStickyBroadcast()."
    const val Q4O2 = "sendIntent()"
    const val Q4O3 = " onRecieve()"
    const val Q4O4 = "implicitBroadcast()"
    const val Question5 = " How to get current location in android?"
    const val Q5O1 = "A & B"
    const val Q5O2 = "A - Using with GPRS"
    const val Q5O3 = "B - Using location provider"
    const val Q5O4 = "C - SQlite"
    const val Question6 = "Does Kotlin works only for Java?"
    const val Q6O1 = "True"
    const val Q6O2 = "False"
    const val Question7 = "What is an HTTP client class in android?"
    const val Q7O1 = "Cookies management"
    const val Q7O2 = "httprequest(get/post) and returns response from the server)"
    const val Q7O3 = "Authentication management"
    const val Q7O4 = "None of the above"
    const val Question8 = "Can we execute Kotlin Code Without Jvm?"
    const val Q8O1 = "True"
    const val Q8O2 = "False"
    const val Question9 = " How many levels of securities are there in android?"
    const val Q9O1 = " Android level security"
    const val Q9O2 = "Java level security"
    const val Q9O3 = "App level security and kernel level security"
    const val Q9O4 = "None of the above"
    const val Question10 = "What is off-line synchronization in android?"
    const val Q10O1 = "Synchronization with internet"
    const val Q10O2 = "Synchronization without internet"
    const val Q10O3 = "Background synchronization"
    const val Q10O4 = "None of the above"

    // answer table
    const val ans1 = "a"
    const val ans2 = "c"
    const val ans3 = "c"
    const val ans4 = "a"
    const val ans5 = "a"
    const val ans6 = "b"
    const val ans7 = "b"
    const val ans8 = "a"
    const val ans9 = "c"
    const val ans10 = "b"

    // Solution repository
    const val Solution1 = "Solution:\n" +
            "An Intent is used to connect \n"+
            "one activity to another activity\n"+
            "and having a message passing mechanism \n"+
            "between activities."
    const val Solution2 = "Solution:\n" +
            "We have to call startFordgroud(int id,Notification notification) to make services as foreground services. When it comes to foreground, it will show a notification."
    const val Solution3 = "Solution:\n" +
            "It is a main component of android. It reacts on the system broadcast announcements, and it acts as a gateway between outside application environment with your application."
    const val Solution4 = "Solution:\n" +
            "sendBroadcast() &miuns; It's normal broadcast.\n" +
            "\n" +
            "sendOrderBroadcast() &miuns; It has an order priority\n" +
            "\n" +
            "sendStickyBroadcast() &miuns; Intent passed with broadcast for future users."
    const val Solution5 = "Solution:\n" +
            "GPRS and Location provider is used to fetch the current location of a phone as longitude and latitude"
    const val Solution6 = "Solution:\n" +
            "Not True, Kotlin is supported by all major Java IDEs including IntelliJ IDEA, Android Studio, and Eclipse."
    const val Solution7 = "Solution:\n" +
            "Http request has get and post methods and it returns the response from the servers."
    const val Solution8 = "Solution:\n" +
            " True,JetBrains has made available the Kotlin/Native technology, which creates native binaries for Kotlin code so they can run without a Java virtual machine."
    const val Solution9 = "Solution:\n" +
            "Android is having two levels of securities, they are as App level security and kernel level security"
    const val Solution10 = "Solution:\n" +
            "Synchronization without internet in which we can take the application data without internet."

}




