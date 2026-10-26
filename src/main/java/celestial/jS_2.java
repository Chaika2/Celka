/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ig_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.fJ_2;
import celestial.jW_2;
import celestial.jz_3;
import celestial.rHH;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.tm_3;

public class jS_2
extends jW_2<rHH> {
    public static final Ig_1 id_class = new Ig_1(fJ_2.id_class, new rqO_2("entity/enchanting_table_book"));
    private final tm_3 id_break = new tm_3();

    public jS_2(jz_3 jz_32) {
        super(jz_32);
    }

    @Override
    public void id_class(rHH rHH2, float f, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        float f2;
        ml_1.id_class();
        ml_1.id_class(0.5, 0.75, 0.5);
        float f3 = (float)rHH2.id_class + f;
        ml_1.id_class(0.0, (double)(0.1f + rfU_2.id_class(f3 * 0.1f) * 0.01f), 0.0);
        for (f2 = rHH2.id_private - rHH2.id_implements; f2 >= (float)Math.PI; f2 -= (float)Math.PI * 2) {
        }
        while (f2 < (float)(-Math.PI)) {
            f2 += (float)Math.PI * 2;
        }
        float f4 = rHH2.id_implements + f2 * f;
        ml_1.id_class(rje_3.id_protected.id_break(-f4));
        ml_1.id_class(rje_3.id_case.id_byte(80.0f));
        float f5 = rfU_2.id_catch(f, rHH2.id_byte, rHH2.id_break);
        float f6 = rfU_2.id_private(f5 + 0.25f) * 1.6f - 0.3f;
        float f7 = rfU_2.id_private(f5 + 0.75f) * 1.6f - 0.3f;
        float f8 = rfU_2.id_catch(f, rHH2.id_catch, rHH2.id_case);
        this.id_break.id_class(f3, rfU_2.id_class(f6, 0.0f, 1.0f), rfU_2.id_class(f7, 0.0f, 1.0f), f8);
        Ok_1 ok_1 = id_class.id_class(hx_1, HU::id_break);
        this.id_break.id_break(ml_1, ok_1, n, n2, 1.0f, 1.0f, 1.0f, 1.0f);
        ml_1.id_break();
    }
}

