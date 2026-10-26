/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpa_3;
import celestial.rqd_3;

public class rrPH {
    public static final /* synthetic */ int[] id_class;
    public static final /* synthetic */ int[] id_break;

    static {
        id_break = new int[rpa_3.values().length];
        try {
            rrPH.id_break[rpa_3.LEFT_RIGHT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrPH.id_break[rpa_3.FRONT_BACK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrPH.id_break[rpa_3.NONE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_class = new int[rqd_3.values().length];
        try {
            rrPH.id_class[rqd_3.COUNTERCLOCKWISE_90.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrPH.id_class[rqd_3.CLOCKWISE_90.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrPH.id_class[rqd_3.CLOCKWISE_180.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrPH.id_class[rqd_3.NONE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

