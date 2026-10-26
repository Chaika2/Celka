/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aw_3;

public class rrEV {
    public static final /* synthetic */ int[] id_class;

    static {
        id_class = new int[aw_3.values().length];
        try {
            rrEV.id_class[aw_3.IN_WATER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrEV.id_class[aw_3.IN_LAVA.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrEV.id_class[aw_3.ON_GROUND.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

