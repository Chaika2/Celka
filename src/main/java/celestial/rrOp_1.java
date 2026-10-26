/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qr_3;
import celestial.rrMa_1;
import celestial.rrXE;
import celestial.tI_2;

public class rrOp_1
extends rrXE {
    public rrOp_1() {
        super(aI_2.id_char, "giant", 3.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qr_3 qr_32 = new qr_3(pg_32, 6.0f);
        qr_32.id_throws = (tI_2)in_1;
        qr_32.id_byte = f;
        return qr_32;
    }

    @Override
    public In_1 id_throws() {
        return new tI_2();
    }
}

