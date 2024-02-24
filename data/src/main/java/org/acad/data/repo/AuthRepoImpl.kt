package org.acad.data.repo

import org.acad.data.remote.auth.AuthFirebase
import org.acad.domain.repo.AuthRepo

/**
 * Created by Acad Bek on 2/24/2024
 */
class AuthRepoImpl constructor(
    private val authFirebase: AuthFirebase
): AuthRepo {
    override fun sendSmsCode(phone: String) {
        authFirebase.sendSmsCode(phone)
    }
}