package org.apache.cordova.xapkreader;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;

/**
 * This class demonstrates the minimal client implementation of the
 * DownloaderService from the Downloader library.
 */
public class XAPKDownloaderService extends DownloaderService {

    // stuff for LVL -- MODIFY FOR YOUR APPLICATION!
    private static final String BASE64_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuEosKOxsUJZ9svuscJASitakv9EvrQ23EhGZG1pskJiIyXVLhPkq5WDjPeTlAadZvx2hk8lzcidkJyFfdMW5hyqzn2BgIef5WtCHQ7qyRz6LoV4Lrort7xh8o/q6eYj62yJRqEsJLRukH5j78g2t/G8gjfsyac11n4cxpM2fXq4UCOcDhvD/UIKoOxTioNwgHU3KmMELFsyyOXS/rXKHdCmyqsret6tK4jrPfOZKiCpMQHvAwZR1MHnHLaRgk51/Y3V0d3x1VTthlxs3SsM6K0rB+kcplgaXDda6vvqlYsuXQ8+jLNkqVUeH5DuQiGcMoPySqApIulg25rrKKXFeFQIDAQAB";

    // used by the preference obfuscater
    private static final byte[] SALT = new byte[] {
        1, 43, -12, -1, 54, 98, -100, -12, 43, 2, -8, -4, 9, 5, -106, -108, -33, 45, -1, 84
    };

    /**
     * This public key comes from your Android Market publisher account, and it
     * used by the LVL to validate responses from Market on your behalf.
     */
    @Override
    public String getPublicKey() {
        return BASE64_PUBLIC_KEY;
    }

    /**
     * This is used by the preference obfuscater to make sure that your
     * obfuscated preferences are different than the ones used by other
     * applications.
     */
    @Override
    public byte[] getSALT() {
        return SALT;
    }

    /**
     * Fill this in with the class name for your alarm receiver. We do this
     * because receivers must be unique across all of Android (it's a good idea
     * to make sure that your receiver is in your unique package)
     */
    @Override
    public String getAlarmReceiverClassName() {
        return XAPKAlarmReceiver.class.getName();
    }

}