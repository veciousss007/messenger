package org.acad.data.remote.auth

/**
 * Created by Acad Bek on 11/29/2023
 */
interface AuthFirebase {
    fun sendSmsCode(phone: String)
}