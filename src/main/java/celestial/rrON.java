/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pH_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.tA_2;

public class rrON
extends rrMi_1 {
    public rrON() {
        super(aI_2.id_volatile, "creeper", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pH_2 pH_22 = new pH_2(pg_32);
        pH_22.id_throws = (tA_2)in_1;
        pH_22.id_byte = f;
        return pH_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tA_2)) {
            return null;
        }
        tA_2 tA_22 = (tA_2)in_1;
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.SR.id_class(tA_22, 0);
        }
        if (string.equals("armor")) {
            return (Iq_1)rrxr_3.SR.id_class(tA_22, 1);
        }
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.SR.id_class(tA_22, 2);
        }
        if (string.equals("leg1")) {
            return (Iq_1)rrxr_3.SR.id_class(tA_22, 3);
        }
        if (string.equals("leg2")) {
            return (Iq_1)rrxr_3.SR.id_class(tA_22, 4);
        }
        if (string.equals("leg3")) {
            return (Iq_1)rrxr_3.SR.id_class(tA_22, 5);
        }
        return string.equals("leg4") ? (Iq_1)rrxr_3.SR.id_class(tA_22, 6) : null;
    }

    @Override
    public In_1 id_throws() {
        return new tA_2();
    }

    @Override
    public String[] id_case() {
        return new String[]{"head", "armor", "body", "leg1", "leg2", "leg3", "leg4"};
    }
}

