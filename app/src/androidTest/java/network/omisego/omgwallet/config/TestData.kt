package network.omisego.omgwallet.config

import java.util.UUID

/*
 * OmiseGO
 *
 * Created by Phuchit Sirimongkolsathien on 5/10/2018 AD.
 * Copyright © 2017-2018 OmiseGO. All rights reserved.
 */

object TestData {
    const val USER_EMAIL = "ripzery@gmail.com"
    const val USER_PASSWORD = "Tt123###"

    const val CONSUME_TX_USER_EMAIL = "phuchit.sir@gmail.com"
    const val CONSUME_TX_USER_PASSWORD = "Tt123###"

    val REGISTER_USER_EMAIL = "test${UUID.randomUUID().toString().take(5)}@omise.co"
}
