/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYG;
import celestial.rfH_2;
import celestial.rrWr_1;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.rrkA;
import celestial.rrkC;
import celestial.rrkF;
import celestial.rrkL;
import celestial.rrkl_1;
import celestial.rrkn_1;
import celestial.rrkp_1;
import celestial.rrky_1;

public final class rrkm_1
extends Enum<rrkm_1> {
    public static final /* enum */ rrkm_1 BIOME = new rrkm_1("biome");
    public static final /* enum */ rrkm_1 BIOME_CATEGORY = new rrkm_1("biome_category");
    public static final /* enum */ rrkm_1 BIOME_PRECIPITATION = new rrkm_1("biome_precipitation");
    public static final /* enum */ rrkm_1 TEMPERATURE = new rrkm_1("temperature");
    public static final /* enum */ rrkm_1 RAINFALL = new rrkm_1("rainfall");
    public static final /* enum */ rrkm_1 HELD_ITEM_ID = new rrkm_1(rrdZ.rg);
    public static final /* enum */ rrkm_1 HELD_BLOCK_LIGHT_VALUE = new rrkm_1(rrdZ.rR);
    public static final /* enum */ rrkm_1 HELD_ITEM_ID2 = new rrkm_1(rrdZ.rY);
    public static final /* enum */ rrkm_1 HELD_BLOCK_LIGHT_VALUE2 = new rrkm_1(rrdZ.ro);
    public static final /* enum */ rrkm_1 WORLD_TIME = new rrkm_1(rrdZ.ra);
    public static final /* enum */ rrkm_1 WORLD_DAY = new rrkm_1(rrdZ.ri);
    public static final /* enum */ rrkm_1 MOON_PHASE = new rrkm_1(rrdZ.Pr);
    public static final /* enum */ rrkm_1 FRAME_COUNTER = new rrkm_1(rrdZ.PP);
    public static final /* enum */ rrkm_1 FRAME_TIME = new rrkm_1(rrdZ.PB);
    public static final /* enum */ rrkm_1 FRAME_TIME_COUNTER = new rrkm_1(rrdZ.PS);
    public static final /* enum */ rrkm_1 SUN_ANGLE = new rrkm_1(rrdZ.Ps);
    public static final /* enum */ rrkm_1 SHADOW_ANGLE = new rrkm_1(rrdZ.PE);
    public static final /* enum */ rrkm_1 RAIN_STRENGTH = new rrkm_1(rrdZ.PG);
    public static final /* enum */ rrkm_1 ASPECT_RATIO = new rrkm_1(rrdZ.Pb);
    public static final /* enum */ rrkm_1 VIEW_WIDTH = new rrkm_1(rrdZ.PM);
    public static final /* enum */ rrkm_1 VIEW_HEIGHT = new rrkm_1(rrdZ.PO);
    public static final /* enum */ rrkm_1 NEAR = new rrkm_1(rrdZ.Ph);
    public static final /* enum */ rrkm_1 FAR = new rrkm_1(rrdZ.PX);
    public static final /* enum */ rrkm_1 WETNESS = new rrkm_1(rrdZ.Pn);
    public static final /* enum */ rrkm_1 EYE_ALTITUDE = new rrkm_1(rrdZ.PC);
    public static final /* enum */ rrkm_1 EYE_BRIGHTNESS = new rrkm_1(rrdZ.Pl, new String[]{"x", "y"});
    public static final /* enum */ rrkm_1 TERRAIN_TEXTURE_SIZE = new rrkm_1(rrdZ.Py, new String[]{"x", "y"});
    public static final /* enum */ rrkm_1 TERRRAIN_ICON_SIZE = new rrkm_1(rrdZ.Pp);
    public static final /* enum */ rrkm_1 IS_EYE_IN_WATER = new rrkm_1(rrdZ.Pq);
    public static final /* enum */ rrkm_1 NIGHT_VISION = new rrkm_1(rrdZ.PT);
    public static final /* enum */ rrkm_1 BLINDNESS = new rrkm_1(rrdZ.Pt);
    public static final /* enum */ rrkm_1 SCREEN_BRIGHTNESS = new rrkm_1(rrdZ.Pw);
    public static final /* enum */ rrkm_1 HIDE_GUI = new rrkm_1(rrdZ.PI);
    public static final /* enum */ rrkm_1 CENTER_DEPT_SMOOTH = new rrkm_1(rrdZ.Pf);
    public static final /* enum */ rrkm_1 ATLAS_SIZE = new rrkm_1(rrdZ.Pj, new String[]{"x", "y"});
    public static final /* enum */ rrkm_1 PLAYER_MOOD = new rrkm_1(rrdZ.PY);
    public static final /* enum */ rrkm_1 CAMERA_POSITION = new rrkm_1(rrdZ.Pz, new String[]{"x", "y", "z"});
    public static final /* enum */ rrkm_1 PREVIOUS_CAMERA_POSITION = new rrkm_1(rrdZ.PW, new String[]{"x", "y", "z"});
    public static final /* enum */ rrkm_1 SUN_POSITION = new rrkm_1(rrdZ.PJ, new String[]{"x", "y", "z"});
    public static final /* enum */ rrkm_1 MOON_POSITION = new rrkm_1(rrdZ.Px, new String[]{"x", "y", "z"});
    public static final /* enum */ rrkm_1 SHADOW_LIGHT_POSITION = new rrkm_1(rrdZ.Pd, new String[]{"x", "y", "z"});
    public static final /* enum */ rrkm_1 UP_POSITION = new rrkm_1(rrdZ.Pk, new String[]{"x", "y", "z"});
    public static final /* enum */ rrkm_1 SKY_COLOR = new rrkm_1(rrdZ.re, new String[]{"r", "g", "b"});
    public static final /* enum */ rrkm_1 GBUFFER_PROJECTION = new rrkm_1(rrdZ.Pu, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ rrkm_1 GBUFFER_PROJECTION_INVERSE = new rrkm_1(rrdZ.Pm, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ rrkm_1 GBUFFER_PREVIOUS_PROJECTION = new rrkm_1(rrdZ.Pc, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ rrkm_1 GBUFFER_MODEL_VIEW = new rrkm_1(rrdZ.PQ, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ rrkm_1 GBUFFER_MODEL_VIEW_INVERSE = new rrkm_1(rrdZ.PN, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ rrkm_1 GBUFFER_PREVIOUS_MODEL_VIEW = new rrkm_1(rrdZ.PZ, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ rrkm_1 SHADOW_PROJECTION = new rrkm_1(rrdZ.Pv, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ rrkm_1 SHADOW_PROJECTION_INVERSE = new rrkm_1(rrdZ.PF, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ rrkm_1 SHADOW_MODEL_VIEW = new rrkm_1(rrdZ.PL, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    public static final /* enum */ rrkm_1 SHADOW_MODEL_VIEW_INVERSE = new rrkm_1(rrdZ.PA, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});
    private String name;
    private rrky_1 uniform;
    private String[] indexNames1;
    private String[] indexNames2;
    private static final /* synthetic */ rrkm_1[] $VALUES;

    public String[] id_byte() {
        return this.indexNames1;
    }

    private rrkm_1(rrky_1 rrky_12, String[] stringArray) {
        this.name = rrky_12.id_byte();
        this.uniform = rrky_12;
        this.indexNames1 = stringArray;
        if (!rrkm_1.id_class(rrky_12, rrkn_1.class, rrkA.class, rrkC.class, rrkl_1.class)) {
            throw new IllegalArgumentException("Invalid uniform type for enum: " + this + ", uniform: " + rrky_12.getClass().getName());
        }
    }

    private rrkm_1(rrky_1 rrky_12, String[] stringArray, String[] stringArray2) {
        this.name = rrky_12.id_byte();
        this.uniform = rrky_12;
        this.indexNames1 = stringArray;
        this.indexNames2 = stringArray2;
        if (!rrkm_1.id_class(rrky_12, rrkp_1.class)) {
            throw new IllegalArgumentException("Invalid uniform type for enum: " + this + ", uniform: " + rrky_12.getClass().getName());
        }
    }

    private rrkm_1(String string2) {
        this.name = string2;
    }

    private rrkm_1(rrky_1 rrky_12) {
        this.name = rrky_12.id_byte();
        this.uniform = rrky_12;
        if (!rrkm_1.id_class(rrky_12, rrkF.class, rrkL.class)) {
            throw new IllegalArgumentException("Invalid uniform type for enum: " + this + ", uniform: " + rrky_12.getClass().getName());
        }
    }

    static {
        $VALUES = rrkm_1.id_throws();
    }

    public static rrkm_1[] values() {
        return (rrkm_1[])$VALUES.clone();
    }

    public static rrkm_1 valueOf(String string) {
        return Enum.valueOf(rrkm_1.class, string);
    }

    private static boolean id_class(Object object, Class ... classArray) {
        if (object == null) {
            return false;
        }
        Class<?> clazz = object.getClass();
        for (int i = 0; i < classArray.length; ++i) {
            Class clazz2 = classArray[i];
            if (!clazz2.isAssignableFrom(clazz)) continue;
            return true;
        }
        return false;
    }

    public float id_class(int n, int n2) {
        if (this.indexNames1 == null || n >= 0 && n <= this.indexNames1.length) {
            if (this.indexNames2 == null || n2 >= 0 && n2 <= this.indexNames2.length) {
                switch (this) {
                    case BIOME: {
                        rfH_2 rfH_22 = rrdZ.D();
                        rYG rYG2 = rrdZ.K().id_implements(rfH_22);
                        return rrWr_1.id_break(rYG2);
                    }
                    case BIOME_CATEGORY: {
                        rfH_2 rfH_23 = rrdZ.D();
                        rYG rYG3 = rrdZ.K().id_implements(rfH_23);
                        return rYG3 != null ? (float)rYG3.id_this().ordinal() : 0.0f;
                    }
                    case BIOME_PRECIPITATION: {
                        rfH_2 rfH_24 = rrdZ.D();
                        rYG rYG4 = rrdZ.K().id_implements(rfH_24);
                        return rYG4 != null ? (float)rYG4.id_byte().ordinal() : 0.0f;
                    }
                    case TEMPERATURE: {
                        rfH_2 rfH_25 = rrdZ.D();
                        rYG rYG5 = rrdZ.K().id_implements(rfH_25);
                        return rYG5 != null ? rYG5.id_class(rfH_25) : 0.0f;
                    }
                    case RAINFALL: {
                        rfH_2 rfH_26 = rrdZ.D();
                        rYG rYG6 = rrdZ.K().id_implements(rfH_26);
                        return rYG6 != null ? rYG6.id_implements() : 0.0f;
                    }
                }
                if (this.uniform instanceof rrkF) {
                    return ((rrkF)this.uniform).id_class();
                }
                if (this.uniform instanceof rrkL) {
                    return ((rrkL)this.uniform).id_class();
                }
                if (this.uniform instanceof rrkn_1) {
                    return ((rrkn_1)this.uniform).id_class()[n];
                }
                if (this.uniform instanceof rrkA) {
                    return ((rrkA)this.uniform).id_class()[n];
                }
                if (this.uniform instanceof rrkC) {
                    return ((rrkC)this.uniform).id_class()[n];
                }
                if (this.uniform instanceof rrkl_1) {
                    return ((rrkl_1)this.uniform).id_class()[n];
                }
                if (this.uniform instanceof rrkp_1) {
                    return ((rrkp_1)this.uniform).id_class(n, n2);
                }
                throw new IllegalArgumentException("Unknown uniform type: " + this);
            }
            rrbb_3.id_protected("Invalid index2, parameter: " + this + ", index: " + n2);
            return 0.0f;
        }
        rrbb_3.id_protected("Invalid index1, parameter: " + this + ", index: " + n);
        return 0.0f;
    }

    public String id_class() {
        return this.name;
    }

    public rrky_1 id_break() {
        return this.uniform;
    }

    private static /* synthetic */ rrkm_1[] id_throws() {
        return new rrkm_1[]{BIOME, BIOME_CATEGORY, BIOME_PRECIPITATION, TEMPERATURE, RAINFALL, HELD_ITEM_ID, HELD_BLOCK_LIGHT_VALUE, HELD_ITEM_ID2, HELD_BLOCK_LIGHT_VALUE2, WORLD_TIME, WORLD_DAY, MOON_PHASE, FRAME_COUNTER, FRAME_TIME, FRAME_TIME_COUNTER, SUN_ANGLE, SHADOW_ANGLE, RAIN_STRENGTH, ASPECT_RATIO, VIEW_WIDTH, VIEW_HEIGHT, NEAR, FAR, WETNESS, EYE_ALTITUDE, EYE_BRIGHTNESS, TERRAIN_TEXTURE_SIZE, TERRRAIN_ICON_SIZE, IS_EYE_IN_WATER, NIGHT_VISION, BLINDNESS, SCREEN_BRIGHTNESS, HIDE_GUI, CENTER_DEPT_SMOOTH, ATLAS_SIZE, PLAYER_MOOD, CAMERA_POSITION, PREVIOUS_CAMERA_POSITION, SUN_POSITION, MOON_POSITION, SHADOW_LIGHT_POSITION, UP_POSITION, SKY_COLOR, GBUFFER_PROJECTION, GBUFFER_PROJECTION_INVERSE, GBUFFER_PREVIOUS_PROJECTION, GBUFFER_MODEL_VIEW, GBUFFER_MODEL_VIEW_INVERSE, GBUFFER_PREVIOUS_MODEL_VIEW, SHADOW_PROJECTION, SHADOW_PROJECTION_INVERSE, SHADOW_MODEL_VIEW, SHADOW_MODEL_VIEW_INVERSE};
    }

    public String[] id_protected() {
        return this.indexNames2;
    }
}

