/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.NT;

public class NV {
    public static final /* synthetic */ int[] id_class;

    static {
        id_class = new int[NT.values().length];
        try {
            NV.id_class[NT.FILE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            NV.id_class[NT.SOUND_EVENT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

