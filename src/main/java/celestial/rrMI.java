/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.In_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.fe_3;
import celestial.jW_2;
import celestial.jz_3;
import celestial.rrbb_3;
import celestial.rrxr_3;

public class rrMI
extends In_1 {
    public Iq_1 id_class;
    public Iq_1 id_break;
    public Iq_1[] id_byte = new Iq_1[4];

    public rrMI() {
        super(HU::id_protected);
        jz_3 jz_32 = jz_3.id_break;
        fe_3 fe_32 = new fe_3(jz_32);
        this.id_class = (Iq_1)rrxr_3.Gx.id_class(fe_32);
        this.id_break = (Iq_1)rrxr_3.Gd.id_class(fe_32);
        this.id_byte = (Iq_1[])rrxr_3.Gk.id_class(fe_32);
    }

    @Override
    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
    }

    public jW_2 id_class(jW_2 jW_22) {
        if (!rrxr_3.Gx.id_protected()) {
            rrbb_3.id_protected("Field not found: TileEntityBedRenderer.head");
            return null;
        }
        if (!rrxr_3.Gd.id_protected()) {
            rrbb_3.id_protected("Field not found: TileEntityBedRenderer.footModel");
            return null;
        }
        if (!rrxr_3.Gk.id_protected()) {
            rrbb_3.id_protected("Field not found: TileEntityBedRenderer.legModels");
            return null;
        }
        rrxr_3.id_class((Object)jW_22, rrxr_3.Gx, (Object)this.id_class);
        rrxr_3.id_class((Object)jW_22, rrxr_3.Gd, (Object)this.id_break);
        rrxr_3.id_class((Object)jW_22, rrxr_3.Gk, (Object)this.id_byte);
        return jW_22;
    }
}

