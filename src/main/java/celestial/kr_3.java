/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCH;

public class kr_3 {
    public static final /* synthetic */ int[] id_class;

    static {
        id_class = new int[rCH.values().length];
        try {
            kr_3.id_class[rCH.FLOOR.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            kr_3.id_class[rCH.WALL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            kr_3.id_class[rCH.CEILING.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

