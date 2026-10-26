/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.In_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.jW_2;
import celestial.jr_3;
import celestial.jz_3;
import celestial.rrbb_3;
import celestial.rrxr_3;

public class rrMV
extends In_1 {
    public Iq_1 id_class;
    public Iq_1 id_break;
    public Iq_1 id_byte;

    public rrMV() {
        super(HU::id_byte);
        jz_3 jz_32 = jz_3.id_break;
        jr_3 jr_32 = new jr_3(jz_32);
        this.id_class = (Iq_1)rrxr_3.Gu.id_class(jr_32, 0);
        this.id_break = (Iq_1)rrxr_3.Gu.id_class(jr_32, 1);
        this.id_byte = (Iq_1)rrxr_3.Gu.id_class(jr_32, 2);
    }

    public jW_2 id_class(jW_2 jW_22) {
        if (!rrxr_3.Gu.id_protected()) {
            rrbb_3.id_protected("Field not found: TileEntityChestRenderer.modelRenderers");
            return null;
        }
        rrxr_3.Gu.id_class(jW_22, 0, this.id_class);
        rrxr_3.Gu.id_class(jW_22, 1, this.id_break);
        rrxr_3.Gu.id_class(jW_22, 2, this.id_byte);
        return jW_22;
    }

    @Override
    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
    }
}

