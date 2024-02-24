package org.acad.presentation.screen.phone

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import org.acad.domain.model.User
import org.acad.presentation.base.BaseFragment
import org.acad.presentation.databinding.FragmentPhoneBinding
import org.acad.presentation.screen.phone.PhoneVM.*
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Created by Acad Bek on 2/24/2024
 */
class PhoneFragment : BaseFragment<FragmentPhoneBinding>(FragmentPhoneBinding::inflate) {

    private lateinit var viewmodel: PhoneVM

    @SuppressLint("CheckResult")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewmodel.state.observe(::renderUser) { it.user!! }
        viewmodel.effects.doOnNext(::handEffects)
    }

    private fun handEffects(effect: Effect) {  }

    private fun renderUser(user: User) {  }
}