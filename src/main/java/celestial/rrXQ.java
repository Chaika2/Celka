/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.iB_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.qd_3;
import celestial.rrXw_1;

public final class rrXQ
extends Enum<rrXQ>
implements rrXw_1 {
    public static final /* enum */ rrXQ IS_ALIVE = new rrXQ("is_alive");
    public static final /* enum */ rrXQ IS_BURNING = new rrXQ("is_burning");
    public static final /* enum */ rrXQ IS_CHILD = new rrXQ("is_child");
    public static final /* enum */ rrXQ IS_GLOWING = new rrXQ("is_glowing");
    public static final /* enum */ rrXQ IS_HURT = new rrXQ("is_hurt");
    public static final /* enum */ rrXQ IS_IN_LAVA = new rrXQ("is_in_lava");
    public static final /* enum */ rrXQ IS_IN_WATER = new rrXQ("is_in_water");
    public static final /* enum */ rrXQ IS_INVISIBLE = new rrXQ("is_invisible");
    public static final /* enum */ rrXQ IS_ON_GROUND = new rrXQ("is_on_ground");
    public static final /* enum */ rrXQ IS_RIDDEN = new rrXQ("is_ridden");
    public static final /* enum */ rrXQ IS_RIDING = new rrXQ("is_riding");
    public static final /* enum */ rrXQ IS_SNEAKING = new rrXQ("is_sneaking");
    public static final /* enum */ rrXQ IS_SPRINTING = new rrXQ("is_sprinting");
    public static final /* enum */ rrXQ IS_WET = new rrXQ("is_wet");
    private String name;
    private pg_3 renderManager;
    private static final rrXQ[] VALUES;
    private static final /* synthetic */ rrXQ[] $VALUES;

    private rrXQ(String string2) {
        this.name = string2;
        this.renderManager = QY.id_instanceof().id_case();
    }

    static {
        $VALUES = rrXQ.id_protected();
        VALUES = rrXQ.values();
    }

    public static rrXQ[] values() {
        return (rrXQ[])$VALUES.clone();
    }

    public static rrXQ valueOf(String string) {
        return Enum.valueOf(rrXQ.class, string);
    }

    public static rrXQ id_class(String string) {
        if (string == null) {
            return null;
        }
        for (int i = 0; i < VALUES.length; ++i) {
            rrXQ rrXQ2 = VALUES[i];
            if (!rrXQ2.id_class().equals(string)) continue;
            return rrXQ2;
        }
        return null;
    }

    public String id_class() {
        return this.name;
    }

    @Override
    public boolean id_break() {
        pV_2 pV_22 = this.renderManager.id_throws;
        if (pV_22 == null) {
            return false;
        }
        if (pV_22 instanceof qd_3) {
            qd_3 qd_32 = (qd_3)pV_22;
            iB_2 iB_22 = qd_32.id_catch;
            if (iB_22 == null) {
                return false;
            }
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

    private static /* synthetic */ rrXQ[] id_protected() {
        return new rrXQ[]{IS_ALIVE, IS_BURNING, IS_CHILD, IS_GLOWING, IS_HURT, IS_IN_LAVA, IS_IN_WATER, IS_INVISIBLE, IS_ON_GROUND, IS_RIDDEN, IS_RIDING, IS_SNEAKING, IS_SPRINTING, IS_WET};
    }
}

