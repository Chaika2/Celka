/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqi_3;

public class rrdK {
    public static final /* synthetic */ int[] id_class;

    static {
        id_class = new int[rqi_3.values().length];
        try {
            rrdK.id_class[rqi_3.WINDOWS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdK.id_class[rqi_3.OSX.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdK.id_class[rqi_3.LINUX.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

