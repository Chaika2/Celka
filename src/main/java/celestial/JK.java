/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCR;

public class JK {
    public static final /* synthetic */ int[] id_class;

    static {
        id_class = new int[rCR.values().length];
        try {
            JK.id_class[rCR.ASCENDING_EAST.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            JK.id_class[rCR.ASCENDING_WEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            JK.id_class[rCR.ASCENDING_NORTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            JK.id_class[rCR.ASCENDING_SOUTH.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

