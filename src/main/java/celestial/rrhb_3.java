/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qu_3;
import celestial.rrMa_1;
import celestial.rrhu_3;
import celestial.tL_2;

public class rrhb_3
extends rrhu_3 {
    public rrhb_3() {
        super(aI_2.b, "mooshroom", 0.7f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qu_3 qu_32 = new qu_3(pg_32);
        qu_32.id_throws = (tL_2)in_1;
        qu_32.id_byte = f;
        return qu_32;
    }

    @Override
    public In_1 id_throws() {
        return new tL_2();
    }
}

