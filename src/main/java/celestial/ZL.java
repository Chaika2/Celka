/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCD;
import celestial.rpa_3;
import celestial.rqd_3;

public class ZL {
    public static final /* synthetic */ int[] id_class;
    public static final /* synthetic */ int[] id_break;
    public static final /* synthetic */ int[] id_byte;

    static {
        id_byte = new int[rCD.values().length];
        try {
            ZL.id_byte[rCD.SAVE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ZL.id_byte[rCD.LOAD.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ZL.id_byte[rCD.CORNER.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ZL.id_byte[rCD.DATA.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_break = new int[rqd_3.values().length];
        try {
            ZL.id_break[rqd_3.NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ZL.id_break[rqd_3.CLOCKWISE_180.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ZL.id_break[rqd_3.COUNTERCLOCKWISE_90.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ZL.id_break[rqd_3.CLOCKWISE_90.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_class = new int[rpa_3.values().length];
        try {
            ZL.id_class[rpa_3.NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ZL.id_class[rpa_3.LEFT_RIGHT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ZL.id_class[rpa_3.FRONT_BACK.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

