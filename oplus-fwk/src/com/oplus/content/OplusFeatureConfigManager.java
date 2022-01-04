package com.oplus.content;

public class OplusFeatureConfigManager
{
    public static OplusFeatureConfigManager sInstance = null;

    private OplusFeatureConfigManager() {
    }

    public static OplusFeatureConfigManager getInstacne() {
        if (sInstance == null) {
            synchronized (OplusFeatureConfigManager.class) {
                if (sInstance == null) {
                    sInstance = new OplusFeatureConfigManager();
                }
                return sInstance;
            }
        }
        return sInstance;
    }

    public boolean hasFeature(final String s) {
        return "oplus.software.audio.dualspk_support".equals(s);
    }
}

