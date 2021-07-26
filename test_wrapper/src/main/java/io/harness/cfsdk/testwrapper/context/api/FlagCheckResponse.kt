package io.harness.cfsdk.testwrapper.context.api

import com.google.gson.annotations.SerializedName

data class FlagCheckResponse(

    @SerializedName("flag_key")
    val flagKey: String,

    @SerializedName("flag_value")
    val flagValue: String
)