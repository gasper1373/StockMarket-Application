package com.example.stockmarketapp.presentantion.company_listings

import androidx.room.Query

sealed class CompanyListingsEvent {
    object Refresh: CompanyListingsEvent()
    data class OnSearchQueryChange(val query: String): CompanyListingsEvent()
}
