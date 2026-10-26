/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.TG;
import celestial.aI_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrOY;
import celestial.tK_2;

public class rrhe_3
extends rrOY {
    public rrhe_3() {
        super(aI_2.U, "vindicator", 0.5f, new String[]{"vindication_illager"});
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        TG tG = new TG(pg_32);
        tG.id_throws = (tK_2)in_1;
        tG.id_byte = f;
        return tG;
    }

    @Override
    public In_1 id_throws() {
        return new tK_2(0.0f, 0.0f, 64, 64);
    }
}

