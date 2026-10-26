/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rFm_1;
import celestial.rnb_3;
import celestial.rvY_2;
import celestial.rvi_3;

public class AT {
    public static final /* synthetic */ int[] id_class;
    public static final /* synthetic */ int[] id_break;
    public static final /* synthetic */ int[] id_byte;
    public static final /* synthetic */ int[] id_protected;

    static {
        id_protected = new int[rnb_3.values().length];
        try {
            AT.id_protected[rnb_3.CHANGE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AT.id_protected[rnb_3.REMOVE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_byte = new int[rvY_2.values().length];
        try {
            AT.id_byte[rvY_2.ADD_PLAYER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AT.id_byte[rvY_2.UPDATE_GAME_MODE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AT.id_byte[rvY_2.UPDATE_LATENCY.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AT.id_byte[rvY_2.UPDATE_DISPLAY_NAME.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_break = new int[rFm_1.values().length];
        try {
            AT.id_break[rFm_1.TITLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AT.id_break[rFm_1.SUBTITLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AT.id_break[rFm_1.ACTIONBAR.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AT.id_break[rFm_1.RESET.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_class = new int[rvi_3.values().length];
        try {
            AT.id_class[rvi_3.REMOVE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AT.id_class[rvi_3.INIT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            AT.id_class[rvi_3.ADD.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

