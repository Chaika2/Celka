/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Me_1;
import celestial.OE;
import celestial.Os_1;

public class Mt_1 {
    public static final /* synthetic */ int[] id_class;
    public static final /* synthetic */ int[] id_break;
    public static final /* synthetic */ int[] id_byte;

    static {
        id_byte = new int[OE.values().length];
        try {
            Mt_1.id_byte[OE.S.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Mt_1.id_byte[OE.T.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Mt_1.id_byte[OE.R.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Mt_1.id_byte[OE.Q.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_break = new int[Os_1.values().length];
        try {
            Mt_1.id_break[Os_1.BASE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Mt_1.id_break[Os_1.EXT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Mt_1.id_break[Os_1.NONE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_class = new int[Me_1.values().length];
        try {
            Mt_1.id_class[Me_1.BASE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Mt_1.id_class[Me_1.ARB.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Mt_1.id_class[Me_1.EXT.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

