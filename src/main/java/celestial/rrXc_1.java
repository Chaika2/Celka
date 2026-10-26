/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.iB_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.qd_3;
import celestial.rrXf_1;

public final class rrXc_1
extends Enum<rrXc_1>
implements rrXf_1 {
    public static final /* enum */ rrXc_1 LIMB_SWING = new rrXc_1("limb_swing");
    public static final /* enum */ rrXc_1 LIMB_SWING_SPEED = new rrXc_1("limb_speed");
    public static final /* enum */ rrXc_1 AGE = new rrXc_1("age");
    public static final /* enum */ rrXc_1 HEAD_YAW = new rrXc_1("head_yaw");
    public static final /* enum */ rrXc_1 HEAD_PITCH = new rrXc_1("head_pitch");
    public static final /* enum */ rrXc_1 HEALTH = new rrXc_1("health");
    public static final /* enum */ rrXc_1 HURT_TIME = new rrXc_1("hurt_time");
    public static final /* enum */ rrXc_1 IDLE_TIME = new rrXc_1("idle_time");
    public static final /* enum */ rrXc_1 MAX_HEALTH = new rrXc_1("max_health");
    public static final /* enum */ rrXc_1 MOVE_FORWARD = new rrXc_1("move_forward");
    public static final /* enum */ rrXc_1 MOVE_STRAFING = new rrXc_1("move_strafing");
    public static final /* enum */ rrXc_1 PARTIAL_TICKS = new rrXc_1("partial_ticks");
    public static final /* enum */ rrXc_1 POS_X = new rrXc_1("pos_x");
    public static final /* enum */ rrXc_1 POS_Y = new rrXc_1("pos_y");
    public static final /* enum */ rrXc_1 POS_Z = new rrXc_1("pos_z");
    public static final /* enum */ rrXc_1 REVENGE_TIME = new rrXc_1("revenge_time");
    public static final /* enum */ rrXc_1 SWING_PROGRESS = new rrXc_1("swing_progress");
    private String name;
    private pg_3 renderManager;
    private static final rrXc_1[] VALUES;
    private static final /* synthetic */ rrXc_1[] $VALUES;

    private rrXc_1(String string2) {
        this.name = string2;
        this.renderManager = QY.id_instanceof().id_case();
    }

    static {
        $VALUES = rrXc_1.id_protected();
        VALUES = rrXc_1.values();
    }

    public static rrXc_1[] values() {
        return (rrXc_1[])$VALUES.clone();
    }

    public static rrXc_1 valueOf(String string) {
        return Enum.valueOf(rrXc_1.class, string);
    }

    @Override
    public float id_class() {
        pV_2 pV_22 = this.renderManager.id_throws;
        if (pV_22 == null) {
            return 0.0f;
        }
        if (pV_22 instanceof qd_3) {
            qd_3 qd_32 = (qd_3)pV_22;
            switch (this) {
                case LIMB_SWING: {
                    return qd_32.id_private;
                }
                case LIMB_SWING_SPEED: {
                    return qd_32.id_implements;
                }
                case AGE: {
                    return qd_32.id_finally;
                }
                case HEAD_YAW: {
                    return qd_32.id_extends;
                }
                case HEAD_PITCH: {
                    return qd_32.id_native;
                }
            }
            iB_2 iB_22 = qd_32.id_catch;
            if (iB_22 == null) {
                return 0.0f;
            }
            switch (this) {
                case HEALTH: {
                    return iB_22.Ss();
                }
                case HURT_TIME: {
                    return ((Integer)iB_22.id_private[10]).intValue();
                }
                case IDLE_TIME: {
                    return iB_22.BI();
                }
                case MAX_HEALTH: {
                    return iB_22.SK();
                }
                case MOVE_FORWARD: {
                    return ((Float)iB_22.id_private[44]).floatValue();
                }
                case MOVE_STRAFING: {
                    return ((Float)iB_22.id_private[42]).floatValue();
                }
                case POS_X: {
                    return (float)iB_22.rx();
                }
                case POS_Y: {
                    return (float)iB_22.re();
                }
                case POS_Z: {
                    return (float)iB_22.BO();
                }
                case REVENGE_TIME: {
                    return iB_22.Sb();
                }
                case SWING_PROGRESS: {
                    return iB_22.id_goto(qd_32.id_volatile);
                }
            }
        }
        return 0.0f;
    }

    public static rrXc_1 id_class(String string) {
        if (string == null) {
            return null;
        }
        for (int i = 0; i < VALUES.length; ++i) {
            rrXc_1 rrXc_12 = VALUES[i];
            if (!rrXc_12.id_break().equals(string)) continue;
            return rrXc_12;
        }
        return null;
    }

    public String id_break() {
        return this.name;
    }

    private static /* synthetic */ rrXc_1[] id_protected() {
        return new rrXc_1[]{LIMB_SWING, LIMB_SWING_SPEED, AGE, HEAD_YAW, HEAD_PITCH, HEALTH, HURT_TIME, IDLE_TIME, MAX_HEALTH, MOVE_FORWARD, MOVE_STRAFING, PARTIAL_TICKS, POS_X, POS_Y, POS_Z, REVENGE_TIME, SWING_PROGRESS};
    }
}

