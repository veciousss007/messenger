package org.acad.domain.usecase

import org.acad.domain.repo.AuthRepo

/**
 * Created by Acad Bek on 11/29/2023
 */
class SSCUseCase constructor(
    private val authRepo: AuthRepo
) {
    operator fun invoke(phone: String) {
        authRepo.sendSmsCode(phone)
    }
}