package org.acad.data.remote.auth

/**
 * Created by Acad Bek on 2/24/2024
 */
interface AuthFirebase {
    fun sendSmsCode(phone: String)
}