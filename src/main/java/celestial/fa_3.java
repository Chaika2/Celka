/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ig_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.fJ_2;
import celestial.jW_2;
import celestial.jz_3;
import celestial.rHW;
import celestial.rfU_2;
import celestial.rpr_3;
import celestial.rqO_2;

public class fa_3
extends jW_2<rHW> {
    public static final Ig_1 id_class = new Ig_1(fJ_2.id_class, new rqO_2("entity/bell/bell_body"));
    private final Iq_1 id_break = new Iq_1(32, 32, 0, 0);

    public fa_3(jz_3 jz_32) {
        super(jz_32);
        this.id_break.id_class(-3.0f, -6.0f, -3.0f, 6.0f, 7.0f, 6.0f);
        this.id_break.id_class(8.0f, 12.0f, 8.0f);
        Iq_1 iq_1 = new Iq_1(32, 32, 0, 13);
        iq_1.id_class(4.0f, 4.0f, 4.0f, 8.0f, 2.0f, 8.0f);
        iq_1.id_class(-8.0f, -12.0f, -8.0f);
        this.id_break.id_break(iq_1);
    }

    @Override
    public void id_class(rHW rHW2, float f, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        float f2 = (float)rHW2.id_class + f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        if (rHW2.id_break) {
            float f5 = rfU_2.id_class(f2 / (float)Math.PI) / (4.0f + f2 / 3.0f);
            if (rHW2.id_byte == rpr_3.NORTH) {
                f3 = -f5;
            } else if (rHW2.id_byte == rpr_3.SOUTH) {
                f3 = f5;
            } else if (rHW2.id_byte == rpr_3.EAST) {
                f4 = -f5;
            } else if (rHW2.id_byte == rpr_3.WEST) {
                f4 = f5;
            }
        }
        this.id_break.id_case = f3;
        this.id_break.id_private = f4;
        Ok_1 ok_1 = id_class.id_class(hx_1, HU::id_break);
        this.id_break.id_class(ml_1, ok_1, n, n2);
    }
}

