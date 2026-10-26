/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.Tx_1;
import celestial.aI_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.wV_2;

public class rrXS
extends rrMi_1 {
    public rrXS() {
        super(aI_2.rB, "wolf", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        Tx_1 tx_1 = new Tx_1(pg_32);
        tx_1.id_throws = (wV_2)in_1;
        tx_1.id_byte = f;
        return tx_1;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wV_2)) {
            return null;
        }
        wV_2 wV_22 = (wV_2)in_1;
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.Ej.id_class(wV_22, 0);
        }
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.Ej.id_class(wV_22, 2);
        }
        if (string.equals("leg1")) {
            return (Iq_1)rrxr_3.Ej.id_class(wV_22, 3);
        }
        if (string.equals("leg2")) {
            return (Iq_1)rrxr_3.Ej.id_class(wV_22, 4);
        }
        if (string.equals("leg3")) {
            return (Iq_1)rrxr_3.Ej.id_class(wV_22, 5);
        }
        if (string.equals("leg4")) {
            return (Iq_1)rrxr_3.Ej.id_class(wV_22, 6);
        }
        if (string.equals("tail")) {
            return (Iq_1)rrxr_3.Ej.id_class(wV_22, 7);
        }
        return string.equals("mane") ? (Iq_1)rrxr_3.Ej.id_class(wV_22, 9) : null;
    }

    @Override
    public In_1 id_throws() {
        return new wV_2();
    }

    @Override
    public String[] id_case() {
        return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4", "tail", "mane"};
    }
}

