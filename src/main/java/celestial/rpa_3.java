/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjg_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqd_3;

public final class rpa_3
extends Enum<rpa_3> {
    public static final /* enum */ rpa_3 NONE = new rpa_3(rjg_3.IDENTITY);
    public static final /* enum */ rpa_3 LEFT_RIGHT = new rpa_3(rjg_3.INVERT_Z);
    public static final /* enum */ rpa_3 FRONT_BACK = new rpa_3(rjg_3.INVERT_X);
    private final rjg_3 orientation;
    private static final /* synthetic */ rpa_3[] $VALUES;

    private rpa_3(rjg_3 rjg_32) {
        this.orientation = rjg_32;
    }

    static {
        $VALUES = rpa_3.id_break();
    }

    public static rpa_3[] values() {
        return (rpa_3[])$VALUES.clone();
    }

    public static rpa_3 valueOf(String string) {
        return Enum.valueOf(rpa_3.class, string);
    }

    public rqd_3 id_class(rpr_3 rpr_32) {
        rpB_2 rpB_22 = rpr_32.id_final();
        return !(this == LEFT_RIGHT && rpB_22 == rpB_2.Z || this == FRONT_BACK && rpB_22 == rpB_2.X) ? rqd_3.NONE : rqd_3.CLOCKWISE_180;
    }

    public rjg_3 id_class() {
        return this.orientation;
    }

    public int id_class(int n, int n2) {
        int n3 = n2 / 2;
        int n4 = n > n3 ? n - n2 : n;
        switch (this) {
            case FRONT_BACK: {
                return (n2 - n4) % n2;
            }
            case LEFT_RIGHT: {
                return (n3 - n4 + n2) % n2;
            }
        }
        return n;
    }

    private static /* synthetic */ rpa_3[] id_break() {
        return new rpa_3[]{NONE, LEFT_RIGHT, FRONT_BACK};
    }

    public rpr_3 id_break(rpr_3 rpr_32) {
        if (this == FRONT_BACK && rpr_32.id_final() == rpB_2.X) {
            return rpr_32.id_case();
        }
        return this == LEFT_RIGHT && rpr_32.id_final() == rpB_2.Z ? rpr_32.id_case() : rpr_32;
    }
}

