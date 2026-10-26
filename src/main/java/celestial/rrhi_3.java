/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.TO;
import celestial.aI_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrbb_3;
import celestial.rrhU_2;
import celestial.rrxr_3;
import celestial.wf_3;

public class rrhi_3
extends rrhU_2 {
    public rrhi_3() {
        super(aI_2.a, "witch", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        TO tO = new TO(pg_32);
        tO.id_throws = (wf_3)in_1;
        tO.id_byte = f;
        return tO;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wf_3)) {
            return null;
        }
        wf_3 wf_32 = (wf_3)in_1;
        return string.equals("mole") ? (Iq_1)rrxr_3.id_class(wf_32, rrxr_3.ET) : super.id_class((In_1)wf_32, string);
    }

    @Override
    public In_1 id_throws() {
        return new wf_3(0.0f);
    }

    @Override
    public String[] id_case() {
        Object[] objectArray = super.id_case();
        return (String[])rrbb_3.id_class(objectArray, (Object)"mole");
    }
}

