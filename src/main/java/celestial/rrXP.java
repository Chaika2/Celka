/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.TX;
import celestial.aI_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrOG;
import celestial.wL_2;

public class rrXP
extends rrOG {
    public rrXP() {
        super(aI_2.rr, "wither_skeleton", 0.7f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        TX tX = new TX(pg_32);
        tX.id_throws = (wL_2)in_1;
        tX.id_byte = f;
        return tX;
    }

    @Override
    public In_1 id_throws() {
        return new wL_2();
    }
}

