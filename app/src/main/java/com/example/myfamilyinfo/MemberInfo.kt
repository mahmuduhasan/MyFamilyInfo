package com.example.myfamilyinfo

data class MemberInfo(
    val id: Int,
    val name: String,
    val info: String,
    val poster: Int
)

val memberList = listOf<MemberInfo>(
    MemberInfo(1,"A.K.M. Hashmat Ullah","Worked at Islami Bank Bangladesh Limited.",R.drawable.abbu),
    MemberInfo(2,"Fatema Begum","Worked as a Housewife and mother of four children.",R.drawable.ammu),
    MemberInfo(3,"Khayrun Nahar","Worked as a Housewife and mother of three children.",R.drawable.munni),
    MemberInfo(4,"Hasan AL Banna","Worked at Islami Bank Agent Banking.",R.drawable.banna),
    MemberInfo(5,"Nazmun Nahar","Worked as a Housewife and mother of two children.",R.drawable.mili),
    MemberInfo(6,"Mahmudul Hasan","Searching for job!",R.drawable.me),
    MemberInfo(7,"Badrun Nahar","Studying at Chandpur Govt. College.",R.drawable.mouri),
    MemberInfo(8,"Tasin Ahmed Muhit","Studying at Motijhil School and College.",R.drawable.tasin),
    MemberInfo(9,"Ikramul Haque Hridoy","Works at SEBPO.",R.drawable.ikramul),
    MemberInfo(10,"Hridoy Pradhan","Works at an International Company.",R.drawable.hridoy),
    MemberInfo(11,"Mahedi Hasan Shawon","Studying at MBSTU",R.drawable.shawon),
)
