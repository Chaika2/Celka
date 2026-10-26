/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.In_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.pt_3;
import celestial.rrbb_3;
import celestial.rrxr_3;

public class rrMe_1
extends In_1 {
    public Iq_1 id_class;
    public Iq_1 id_break;
    public Iq_1 id_byte;

    public rrMe_1() {
        super(HU::id_protected);
        pt_3 pt_32 = new pt_3(QY.id_instanceof().id_case());
        this.id_class = (Iq_1)rrxr_3.SD.id_class(pt_32, 0);
        this.id_break = (Iq_1)rrxr_3.SD.id_class(pt_32, 1);
        this.id_byte = (Iq_1)rrxr_3.SD.id_class(pt_32, 2);
    }

    public pt_3 id_class(pt_3 pt_32) {
        if (!rrxr_3.SD.id_protected()) {
            rrbb_3.id_protected("Field not found: RenderEnderCrystal.modelEnderCrystal");
            return null;
        }
        rrxr_3.SD.id_class(pt_32, 0, this.id_class);
        rrxr_3.SD.id_class(pt_32, 1, this.id_break);
        rrxr_3.SD.id_class(pt_32, 2, this.id_byte);
        return pt_32;
    }

    @Override
    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2, float f, float f2, float f3, float f4) {
    }
}

