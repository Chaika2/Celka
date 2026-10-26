/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLT;

public class dT_2 {
    public static final /* synthetic */ int[] id_class;

    static {
        id_class = new int[rLT.values().length];
        try {
            dT_2.id_class[rLT.LAND.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dT_2.id_class[rLT.WATER.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dT_2.id_class[rLT.AIR.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

