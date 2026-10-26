/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qw_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.wZ_2;

public class rrhC_2
extends rrMi_1 {
    public rrhC_2() {
        super(aI_2.F, "shulker_bullet", 0.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qw_3 qw_32 = new qw_3(pg_32);
        if (!rrxr_3.GB.id_protected()) {
            rrbb_3.id_protected("Field not found: RenderShulkerBullet.model");
            return null;
        }
        rrxr_3.id_class((Object)qw_32, rrxr_3.GB, (Object)in_1);
        qw_32.id_byte = f;
        return qw_32;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wZ_2)) {
            return null;
        }
        wZ_2 wZ_22 = (wZ_2)in_1;
        return string.equals("bullet") ? (Iq_1)rrxr_3.EB.id_class(wZ_22) : null;
    }

    @Override
    public In_1 id_throws() {
        return new wZ_2();
    }

    @Override
    public String[] id_case() {
        return new String[]{"bullet"};
    }
}

