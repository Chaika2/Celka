/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrkm_1;

public class rrkZ {
    public static final /* synthetic */ int[] id_class;

    static {
        id_class = new int[rrkm_1.values().length];
        try {
            rrkZ.id_class[rrkm_1.BIOME.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrkZ.id_class[rrkm_1.BIOME_CATEGORY.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrkZ.id_class[rrkm_1.BIOME_PRECIPITATION.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrkZ.id_class[rrkm_1.TEMPERATURE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrkZ.id_class[rrkm_1.RAINFALL.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

