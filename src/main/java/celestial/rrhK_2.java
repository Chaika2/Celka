/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.TB;
import celestial.aI_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrbb_3;
import celestial.rrhu_3;
import celestial.rrxr_3;
import celestial.wk_3;
import celestial.wt_3;

public class rrhK_2
extends rrhu_3 {
    public rrhK_2() {
        super(aI_2.o, "turtle", 0.7f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        TB tB = new TB(pg_32);
        tB.id_throws = (wt_3)in_1;
        tB.id_byte = f;
        return tB;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wk_3)) {
            return null;
        }
        wt_3 wt_32 = (wt_3)in_1;
        return string.equals("body2") ? (Iq_1)rrxr_3.En.id_class(wt_32) : super.id_class(in_1, string);
    }

    @Override
    public In_1 id_throws() {
        return new wt_3(0.0f);
    }

    @Override
    public String[] id_case() {
        Object[] objectArray = super.id_case();
        return (String[])rrbb_3.id_class(objectArray, (Object)"body2");
    }
}

