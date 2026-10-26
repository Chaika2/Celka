/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpB_2;
import celestial.ryB_2;

public class ryP_2 {
    public static final /* synthetic */ int[] id_class;
    public static final /* synthetic */ int[] id_break;

    static {
        id_break = new int[rpB_2.values().length];
        try {
            ryP_2.id_break[rpB_2.X.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ryP_2.id_break[rpB_2.Y.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ryP_2.id_break[rpB_2.Z.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_class = new int[ryB_2.values().length];
        try {
            ryP_2.id_class[ryB_2.CLOSED.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ryP_2.id_class[ryB_2.OPENING.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ryP_2.id_class[ryB_2.CLOSING.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ryP_2.id_class[ryB_2.OPENED.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

