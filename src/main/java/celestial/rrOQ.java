/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.pl_3;
import celestial.rrMa_1;
import celestial.rrhu_3;
import celestial.tL_2;

public class rrOQ
extends rrhu_3 {
    public rrOQ() {
        super(aI_2.id_native, "cow", 0.7f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pl_3 pl_32 = new pl_3(pg_32);
        pl_32.id_throws = (tL_2)in_1;
        pl_32.id_byte = f;
        return pl_32;
    }

    @Override
    public In_1 id_throws() {
        return new tL_2();
    }
}

