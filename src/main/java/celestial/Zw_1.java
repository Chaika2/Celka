/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ZI;
import celestial.rRl_1;

public class Zw_1 {
    public static final /* synthetic */ int[] id_class;
    public static final /* synthetic */ int[] id_break;

    static {
        id_break = new int[rRl_1.values().length];
        try {
            Zw_1.id_break[rRl_1.SPECTATOR.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Zw_1.id_break[rRl_1.SURVIVAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Zw_1.id_break[rRl_1.CREATIVE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Zw_1.id_break[rRl_1.ADVENTURE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_class = new int[ZI.values().length];
        try {
            Zw_1.id_class[ZI.CREATIVE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Zw_1.id_class[ZI.SURVIVAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Zw_1.id_class[ZI.ADVENTURE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

