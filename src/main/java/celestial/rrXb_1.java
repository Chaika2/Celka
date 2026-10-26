/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.TW;
import celestial.aI_2;
import celestial.pg_3;
import celestial.rAv_1;
import celestial.rrMa_1;
import celestial.rrOG;
import celestial.wR_2;

public class rrXb_1
extends rrOG {
    public rrXb_1() {
        super(aI_2.rG, "zombie_villager", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        rAv_1 rAv_12 = (rAv_1)QY.id_instanceof().F();
        pg_3 pg_32 = QY.id_instanceof().id_case();
        TW tW = new TW(pg_32, rAv_12);
        tW.id_throws = (wR_2)in_1;
        tW.id_byte = f;
        return tW;
    }

    @Override
    public In_1 id_throws() {
        return new wR_2(0.0f, false);
    }
}

