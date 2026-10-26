/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLT;
import celestial.rpr_3;

public class zF_2 {
    public static final /* synthetic */ int[] id_class;
    public static final /* synthetic */ int[] id_break;

    static {
        id_break = new int[rLT.values().length];
        try {
            zF_2.id_break[rLT.LAND.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zF_2.id_break[rLT.WATER.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zF_2.id_break[rLT.AIR.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_class = new int[rpr_3.values().length];
        try {
            zF_2.id_class[rpr_3.NORTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zF_2.id_class[rpr_3.SOUTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zF_2.id_class[rpr_3.WEST.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zF_2.id_class[rpr_3.EAST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

