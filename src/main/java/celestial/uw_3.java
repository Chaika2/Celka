/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.uq_3;
import celestial.uy_3;

public class uw_3 {
    public static final /* synthetic */ int[] id_class;
    public static final /* synthetic */ int[] id_break;

    static {
        id_break = new int[uq_3.values().length];
        try {
            uw_3.id_break[uq_3.DOWN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            uw_3.id_break[uq_3.UP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            uw_3.id_break[uq_3.LEFT.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            uw_3.id_break[uq_3.RIGHT.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_class = new int[uy_3.values().length];
        try {
            uw_3.id_class[uy_3.HORIZONTAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            uw_3.id_class[uy_3.VERTICAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

