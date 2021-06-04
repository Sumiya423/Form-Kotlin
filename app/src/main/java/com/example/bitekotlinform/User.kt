package com.example.bitekotlinform

import android.net.Uri
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User( val uri: Uri?, val name:String?,val email:String?,val gender:String?,val date:String?,
                 val time:String?, val blood:String?,val skill:String?) : Parcelable
