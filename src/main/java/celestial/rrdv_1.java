/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrdM;
import celestial.rrdy_1;
import celestial.rrke_1;

public class rrdv_1 {
    public static final /* synthetic */ int[] id_class;
    public static final /* synthetic */ int[] id_break;
    public static final /* synthetic */ int[] id_byte;

    static {
        id_byte = new int[rrdM.values().length];
        try {
            rrdv_1.id_byte[rrdM.GBUFFERS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_byte[rrdM.SHADOWCOMP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_byte[rrdM.PREPARE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_byte[rrdM.DEFERRED.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_byte[rrdM.COMPOSITE.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_byte[rrdM.SHADOW.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_break = new int[rrke_1.values().length];
        try {
            rrdv_1.id_break[rrke_1.TEXTURE_1D.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_break[rrke_1.TEXTURE_2D.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_break[rrke_1.TEXTURE_3D.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_break[rrke_1.TEXTURE_RECTANGLE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        id_class = new int[rrdy_1.values().length];
        try {
            rrdv_1.id_class[rrdy_1.ANTIALIASING.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.NORMAL_MAP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.SPECULAR_MAP.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.RENDER_RES_MUL.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.SHADOW_RES_MUL.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.HAND_DEPTH_MUL.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.CLOUD_SHADOW.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.OLD_HAND_LIGHT.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.OLD_LIGHTING.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.SHADER_PACK.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.TWEAK_BLOCK_DAMAGE.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.SHADOW_CLIP_FRUSTRUM.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.TEX_MIN_FIL_B.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.TEX_MIN_FIL_N.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.TEX_MIN_FIL_S.ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.TEX_MAG_FIL_B.ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.TEX_MAG_FIL_N.ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            rrdv_1.id_class[rrdy_1.TEX_MAG_FIL_S.ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

