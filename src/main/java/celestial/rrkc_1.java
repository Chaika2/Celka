/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.an_3;
import celestial.iB_2;
import celestial.pg_3;
import celestial.rrXw_1;

public final class rrkc_1
extends Enum<rrkc_1>
implements rrXw_1 {
    public static final /* enum */ rrkc_1 IS_ALIVE = new rrkc_1("is_alive");
    public static final /* enum */ rrkc_1 IS_BURNING = new rrkc_1("is_burning");
    public static final /* enum */ rrkc_1 IS_CHILD = new rrkc_1("is_child");
    public static final /* enum */ rrkc_1 IS_GLOWING = new rrkc_1("is_glowing");
    public static final /* enum */ rrkc_1 IS_HURT = new rrkc_1("is_hurt");
    public static final /* enum */ rrkc_1 IS_IN_LAVA = new rrkc_1("is_in_lava");
    public static final /* enum */ rrkc_1 IS_IN_WATER = new rrkc_1("is_in_water");
    public static final /* enum */ rrkc_1 IS_INVISIBLE = new rrkc_1("is_invisible");
    public static final /* enum */ rrkc_1 IS_ON_GROUND = new rrkc_1("is_on_ground");
    public static final /* enum */ rrkc_1 IS_RIDDEN = new rrkc_1("is_ridden");
    public static final /* enum */ rrkc_1 IS_RIDING = new rrkc_1("is_riding");
    public static final /* enum */ rrkc_1 IS_SNEAKING = new rrkc_1("is_sneaking");
    public static final /* enum */ rrkc_1 IS_SPRINTING = new rrkc_1("is_sprinting");
    public static final /* enum */ rrkc_1 IS_WET = new rrkc_1("is_wet");
    private String name;
    private pg_3 renderManager;
    private static final rrkc_1[] VALUES;
    private static final /* synthetic */ rrkc_1[] $VALUES;

    private rrkc_1(String string2) {
        this.name = string2;
        this.renderManager = QY.id_instanceof().id_case();
    }

    static {
        $VALUES = rrkc_1.id_protected();
        VALUES = rrkc_1.values();
    }

    public static rrkc_1[] values() {
        return (rrkc_1[])$VALUES.clone();
    }

    public static rrkc_1 valueOf(String string) {
        return Enum.valueOf(rrkc_1.class, string);
    }

    public static rrkc_1 id_class(String string) {
        if (string == null) {
            return null;
        }
        for (int i = 0; i < VALUES.length; ++i) {
            rrkc_1 rrkc_12 = VALUES[i];
            if (!rrkc_12.id_class().equals(string)) continue;
            return rrkc_12;
        }
        return null;
    }

    public String id_class() {
        return this.name;
    }

    @Override
    public boolean id_break() {
        an_3 an_32 = QY.id_instanceof().id_catch();
        if (an_32 instanceof iB_2) {
            iB_2 iB_22 = (iB_2)an_32;
            switch (this) {
                case IS_ALIVE: {
                    return iB_22.BM();
                }
                case IS_BURNING: {
                    return iB_22.Pz();
                }
                case IS_CHILD: {
                    return iB_22.n_();
                }
                case IS_GLOWING: {
                    return iB_22.w();
                }
                case IS_HURT: {
                    return (Integer)iB_22.id_private[10] > 0;
                }
                case IS_IN_LAVA: {
                    return iB_22.ry();
                }
                case IS_IN_WATER: {
                    return iB_22.rT();
                }
                case IS_INVISIBLE: {
                    return iB_22.Pp();
                }
                case IS_ON_GROUND: {
                    return iB_22.BL();
                }
                case IS_RIDDEN: {
                    return iB_22.BP();
                }
                case IS_RIDING: {
                    return iB_22.Pm();
                }
                case IS_SNEAKING: {
                    return iB_22.x();
                }
                case IS_SPRINTING: {
                    return iB_22.PF();
                }
                case IS_WET: {
                    return iB_22.Pf();
                }
            }
        }
        return false;
    }

    private static /* synthetic */ rrkc_1[] id_protected() {
        return new rrkc_1[]{IS_ALIVE, IS_BURNING, IS_CHILD, IS_GLOWING, IS_HURT, IS_IN_LAVA, IS_IN_WATER, IS_INVISIBLE, IS_ON_GROUND, IS_RIDDEN, IS_RIDING, IS_SNEAKING, IS_SPRINTING, IS_WET};
    }
}

