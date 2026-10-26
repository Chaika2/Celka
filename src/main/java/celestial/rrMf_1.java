/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.In_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.fa_3;
import celestial.jW_2;
import celestial.jz_3;
import celestial.rrbb_3;
import celestial.rrxr_3;

public class rrMf_1
extends In_1 {
    public Iq_1 id_class;

    public rrMf_1() {
        super(HU::id_protected);
        jz_3 jz_32 = jz_3.id_break;
        fa_3 fa_32 = new fa_3(jz_32);
        this.id_class = (Iq_1)rrxr_3.Gz.id_class(fa_32);
    }

    public jW_2 id_class(jW_2 jW_22) {
        if (!rrxr_3.Gz.id_protected()) {
            rrbb_3.id_protected("Field not found: TileEntityBellRenderer.modelRenderer");
            return null;
        }
        rrxr_3.Gz.id_class(jW_22, this.id_class);
        return jW_22;
    }

    @Override
    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
    }
}

