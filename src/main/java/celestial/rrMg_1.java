/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.In_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.jP_2;
import celestial.jW_2;
import celestial.jz_3;
import celestial.rrbb_3;
import celestial.rrxr_3;

public class rrMg_1
extends In_1 {
    public Iq_1 id_class;
    public Iq_1 id_break;
    public Iq_1 id_byte;
    public Iq_1 id_protected;

    public rrMg_1() {
        super(HU::id_byte);
        jz_3 jz_32 = jz_3.id_break;
        jP_2 jP_22 = new jP_2(jz_32);
        this.id_class = (Iq_1)rrxr_3.GZ.id_class(jP_22, 0);
        this.id_break = (Iq_1)rrxr_3.GZ.id_class(jP_22, 1);
        this.id_byte = (Iq_1)rrxr_3.GZ.id_class(jP_22, 2);
        this.id_protected = (Iq_1)rrxr_3.GZ.id_class(jP_22, 3);
    }

    public jW_2 id_class(jW_2 jW_22) {
        if (!rrxr_3.GZ.id_protected()) {
            rrbb_3.id_protected("Field not found: TileEntityConduitRenderer.modelRenderers");
            return null;
        }
        rrxr_3.GZ.id_class(jW_22, 0, this.id_class);
        rrxr_3.GZ.id_class(jW_22, 1, this.id_break);
        rrxr_3.GZ.id_class(jW_22, 2, this.id_byte);
        rrxr_3.GZ.id_class(jW_22, 3, this.id_protected);
        return jW_22;
    }

    @Override
    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
    }
}

