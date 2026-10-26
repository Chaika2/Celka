/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.Ts_1;
import celestial.aI_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrOG;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.ww_3;

public class rrhD_2
extends rrOG {
    public rrhD_2() {
        super(aI_2.K, "vex", 0.3f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        Ts_1 ts_1 = new Ts_1(pg_32);
        ts_1.id_throws = (ww_3)in_1;
        ts_1.id_byte = f;
        return ts_1;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof ww_3)) {
            return null;
        }
        Iq_1 iq_1 = super.id_class(in_1, string);
        if (iq_1 != null) {
            return iq_1;
        }
        ww_3 ww_32 = (ww_3)in_1;
        if (string.equals("left_wing")) {
            return (Iq_1)rrxr_3.id_class(ww_32, rrxr_3.El);
        }
        return string.equals("right_wing") ? (Iq_1)rrxr_3.id_class(ww_32, rrxr_3.EH) : null;
    }

    @Override
    public In_1 id_throws() {
        return new ww_3();
    }

    @Override
    public String[] id_case() {
        Object[] objectArray = super.id_case();
        return (String[])rrbb_3.id_class(objectArray, (Object[])new String[]{"left_wing", "right_wing"});
    }
}

