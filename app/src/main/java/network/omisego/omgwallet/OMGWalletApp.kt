package network.omisego.omgwallet

/*
 * OmiseGO
 *
 * Created by Phuchit Sirimongkolsathien on 13/9/2018 AD.
 * Copyright © 2017-2018 OmiseGO. All rights reserved.
 */

import android.app.Application
import com.facebook.stetho.Stetho
import network.omisego.omgwallet.network.ClientProvider
import network.omisego.omgwallet.network.ProductionClientSetup
import network.omisego.omgwallet.util.ContextUtil

class OMGWalletApp : Application() {

    override fun onCreate() {
        super.onCreate()
        ContextUtil.context = applicationContext
        ClientProvider.init(ProductionClientSetup())
        Stetho.initializeWithDefaults(this)
    }
}