package com.mustafagur.nfcapplication

import android.content.Intent
import android.health.connect.ReadRecordsRequest
import android.nfc.cardemulation.HostApduService
import android.os.Bundle
import android.util.Log

class HCEService : HostApduService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.e("HCEService", "onStartCommand çalıştı.")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun processCommandApdu(p0: ByteArray?, p1: Bundle?): ByteArray {
        Log.e("HCEService", "processCommandApdu çalıştı")
        TODO("Not yet implemented")
    }

    override fun onDeactivated(p0: Int) {
        Log.e("HCEService", "onDeactivated çalıştı")
        TODO("Not yet implemented")
    }
}