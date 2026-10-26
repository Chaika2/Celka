/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Iq_1;
import celestial.rrbb_3;

public final class rrXk_1
extends Enum<rrXk_1> {
    public static final /* enum */ rrXk_1 POS_X = new rrXk_1("tx");
    public static final /* enum */ rrXk_1 POS_Y = new rrXk_1("ty");
    public static final /* enum */ rrXk_1 POS_Z = new rrXk_1("tz");
    public static final /* enum */ rrXk_1 ANGLE_X = new rrXk_1("rx");
    public static final /* enum */ rrXk_1 ANGLE_Y = new rrXk_1("ry");
    public static final /* enum */ rrXk_1 ANGLE_Z = new rrXk_1("rz");
    public static final /* enum */ rrXk_1 SCALE_X = new rrXk_1("sx");
    public static final /* enum */ rrXk_1 SCALE_Y = new rrXk_1("sy");
    public static final /* enum */ rrXk_1 SCALE_Z = new rrXk_1("sz");
    private String name;
    public static rrXk_1[] VALUES;
    private static final /* synthetic */ rrXk_1[] $VALUES;

    private rrXk_1(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rrXk_1.id_break();
        VALUES = rrXk_1.values();
    }

    public static rrXk_1[] values() {
        return (rrXk_1[])$VALUES.clone();
    }

    public static rrXk_1 valueOf(String string) {
        return Enum.valueOf(rrXk_1.class, string);
    }

    public float id_class(Iq_1 iq_1) {
        switch (this) {
            case POS_X: {
                return iq_1.id_byte;
            }
            case POS_Y: {
                return iq_1.id_protected;
            }
            case POS_Z: {
                return iq_1.id_throws;
            }
            case ANGLE_X: {
                return iq_1.id_case;
            }
            case ANGLE_Y: {
                return iq_1.id_catch;
            }
            case ANGLE_Z: {
                return iq_1.id_private;
            }
            case SCALE_X: {
                return iq_1.id_package;
            }
            case SCALE_Y: {
                return iq_1.id_int;
            }
            case SCALE_Z: {
                return iq_1.id_new;
            }
        }
        rrbb_3.id_protected("GetFloat not supported for: " + this);
        return 0.0f;
    }

    public static rrXk_1 id_class(String string) {
        for (int i = 0; i < VALUES.length; ++i) {
            rrXk_1 rrXk_12 = VALUES[i];
            if (!rrXk_12.id_class().equals(string)) continue;
            return rrXk_12;
        }
        return null;
    }

    public void id_class(Iq_1 iq_1, float f) {
        switch (this) {
            case POS_X: {
                iq_1.id_byte = f;
                return;
            }
            case POS_Y: {
                iq_1.id_protected = f;
                return;
            }
            case POS_Z: {
                iq_1.id_throws = f;
                return;
            }
            case ANGLE_X: {
                iq_1.id_case = f;
                return;
            }
            case ANGLE_Y: {
                iq_1.id_catch = f;
                return;
            }
            case ANGLE_Z: {
                iq_1.id_private = f;
                return;
            }
            case SCALE_X: {
                iq_1.id_package = f;
                return;
            }
            case SCALE_Y: {
                iq_1.id_int = f;
                return;
            }
            case SCALE_Z: {
                iq_1.id_new = f;
                return;
            }
        }
        rrbb_3.id_protected("SetFloat not supported for: " + this);
    }

    public String id_class() {
        return this.name;
    }

    private static /* synthetic */ rrXk_1[] id_break() {
        return new rrXk_1[]{POS_X, POS_Y, POS_Z, ANGLE_X, ANGLE_Y, ANGLE_Z, SCALE_X, SCALE_Y, SCALE_Z};
    }
}

