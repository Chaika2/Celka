/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.fe_3;
import celestial.jW_2;
import celestial.jz_3;
import celestial.rrMI;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.ryW_2;

public class rrOS
extends rrMi_1 {
    public rrOS() {
        super(ryW_2.id_public, "bed", 0.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        jz_3 jz_32 = jz_3.id_break;
        jW_2 jW_22 = jz_32.id_class(ryW_2.id_public);
        if (!(jW_22 instanceof fe_3)) {
            return null;
        }
        if (jW_22.id_byte() == null) {
            jW_22 = new fe_3(jz_32);
        }
        if (!(in_1 instanceof rrMI)) {
            rrbb_3.id_protected("Not a BedModel: " + in_1);
            return null;
        }
        rrMI rrMI2 = (rrMI)in_1;
        return rrMI2.id_class(jW_22);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof rrMI)) {
            return null;
        }
        rrMI rrMI2 = (rrMI)in_1;
        if (string.equals("head")) {
            return rrMI2.id_class;
        }
        if (string.equals("foot")) {
            return rrMI2.id_break;
        }
        Iq_1[] iq_1Array = rrMI2.id_byte;
        if (iq_1Array != null) {
            if (string.equals("leg1")) {
                return iq_1Array[0];
            }
            if (string.equals("leg2")) {
                return iq_1Array[1];
            }
            if (string.equals("leg3")) {
                return iq_1Array[2];
            }
            if (string.equals("leg4")) {
                return iq_1Array[3];
            }
        }
        return null;
    }

    @Override
    public In_1 id_throws() {
        return new rrMI();
    }

    @Override
    public String[] id_case() {
        return new String[]{"head", "foot", "leg1", "leg2", "leg3", "leg4"};
    }
}

