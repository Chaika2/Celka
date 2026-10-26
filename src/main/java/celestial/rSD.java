/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rSU;
import celestial.rSe_1;

public class rSD {
    public static final /* synthetic */ int[] id_class;
    public static final /* synthetic */ int[] id_break;

    static {
        id_break = new int[rSU.values().length];
        try {
            rSD.id_break[rSU.IN_WATER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rSD.id_break[rSU.UNDER_WATER.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rSD.id_break[rSU.UNDER_FLOWING_WATER.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rSD.id_break[rSU.ON_LAND.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rSD.id_break[rSU.IN_AIR.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_class = new int[rSe_1.values().length];
        try {
            rSD.id_class[rSe_1.OAK.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rSD.id_class[rSe_1.SPRUCE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rSD.id_class[rSe_1.BIRCH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rSD.id_class[rSe_1.JUNGLE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rSD.id_class[rSe_1.ACACIA.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rSD.id_class[rSe_1.DARK_OAK.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

