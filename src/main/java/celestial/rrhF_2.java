/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qt_3;
import celestial.rrMa_1;
import celestial.rrhu_3;
import celestial.wc_3;

public class rrhF_2
extends rrhu_3 {
    public rrhF_2() {
        super(aI_2.Z, "sheep", 0.7f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qt_3 qt_32 = new qt_3(pg_32);
        qt_32.id_throws = (wc_3)in_1;
        qt_32.id_byte = f;
        return qt_32;
    }

    @Override
    public In_1 id_throws() {
        return new wc_3();
    }
}

