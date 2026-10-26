/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.pt_3;
import celestial.rrMa_1;
import celestial.rrMe_1;
import celestial.rrMi_1;
import celestial.rrbb_3;

public class rrOL
extends rrMi_1 {
    public rrOL() {
        this("end_crystal");
    }

    protected rrOL(String string) {
        super(aI_2.id_super, string, 0.5f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof rrMe_1)) {
            return null;
        }
        rrMe_1 rrMe_12 = (rrMe_1)in_1;
        if (string.equals("cube")) {
            return rrMe_12.id_class;
        }
        if (string.equals("glass")) {
            return rrMe_12.id_break;
        }
        return string.equals("base") ? rrMe_12.id_byte : null;
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pV_2 pV_22 = pg_32.id_throws().get(aI_2.id_super);
        if (!(pV_22 instanceof pt_3)) {
            rrbb_3.id_protected("Not an instance of RenderEnderCrystal: " + pV_22);
            return null;
        }
        pt_3 pt_32 = (pt_3)pV_22;
        if (pt_32.id_byte() == null) {
            pt_32 = new pt_3(pg_32);
        }
        if (!(in_1 instanceof rrMe_1)) {
            rrbb_3.id_protected("Not a EnderCrystalModel model: " + in_1);
            return null;
        }
        rrMe_1 rrMe_12 = (rrMe_1)in_1;
        pt_32 = rrMe_12.id_class(pt_32);
        pt_32.id_byte = f;
        return pt_32;
    }

    @Override
    public In_1 id_throws() {
        return new rrMe_1();
    }

    @Override
    public String[] id_case() {
        return new String[]{"cube", "glass", "base"};
    }
}

