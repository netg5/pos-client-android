package network.omisego.omgwallet.screen

import com.agoda.kakao.KImageView
import com.agoda.kakao.Screen
import network.omisego.omgwallet.R

/*
 * OmiseGO
 *
 * Created by Phuchit Sirimongkolsathien on 6/10/2018 AD.
 * Copyright © 2017-2018 OmiseGO. All rights reserved.
 */

class QRScreen: Screen<QRScreen>() {
    val ivQR: KImageView = KImageView {
        withId(R.id.ivQR)
    }
}
