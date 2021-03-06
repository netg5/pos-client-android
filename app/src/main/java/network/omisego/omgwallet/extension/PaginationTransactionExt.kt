package network.omisego.omgwallet.extension

/*
 * OmiseGO
 *
 * Created by Phuchit Sirimongkolsathien on 1/10/2018 AD.
 * Copyright © 2017-2018 OmiseGO. All rights reserved.
 */

import co.omisego.omisego.model.pagination.PaginationList
import co.omisego.omisego.model.transaction.Transaction
import network.omisego.omgwallet.state.TransactionListState

val PaginationList<Transaction>.state: TransactionListState
    get() {
        return when {
            arrayOf(pagination.isFirstPage, pagination.isLastPage, data.isEmpty()).all { it } -> TransactionListState.STATE_EMPTY_PAGE
            arrayOf(pagination.currentPage > 1, data.isEmpty()).all { it } -> TransactionListState.STATE_OUT_BOUND_PAGE
            else -> TransactionListState.STATE_CONTENT_PAGE
        }
    }