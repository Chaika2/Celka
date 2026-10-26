/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCY;
import celestial.rpa_3;
import celestial.rqd_3;

public class Wm_1 {
    public static final /* synthetic */ int[] id_class;
    public static final /* synthetic */ int[] id_break;
    public static final /* synthetic */ int[] id_byte;

    static {
        id_byte = new int[rpa_3.values().length];
        try {
            Wm_1.id_byte[rpa_3.LEFT_RIGHT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Wm_1.id_byte[rpa_3.FRONT_BACK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_break = new int[rqd_3.values().length];
        try {
            Wm_1.id_break[rqd_3.CLOCKWISE_180.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Wm_1.id_break[rqd_3.COUNTERCLOCKWISE_90.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Wm_1.id_break[rqd_3.CLOCKWISE_90.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_class = new int[rCY.values().length];
        try {
            Wm_1.id_class[rCY.UP.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Wm_1.id_class[rCY.SIDE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Wm_1.id_class[rCY.NONE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

