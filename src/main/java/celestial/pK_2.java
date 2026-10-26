/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.MH;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.fZ_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rjj_3;
import celestial.rqO_2;
import celestial.rrbN_2;
import celestial.rrbb_3;
import celestial.rsP_2;

public class pK_2
extends pV_2<rsP_2> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/experience_orb.png");
    private static final HU id_throws = HU.id_case(id_class);

    public pK_2(pg_3 pg_32) {
        super(pg_32);
        this.id_byte = 0.15f;
        this.id_protected = 0.75f;
    }

    @Override
    public rqO_2 id_class(rsP_2 rsP_22) {
        return id_class;
    }

    @Override
    protected int id_class(rsP_2 rsP_22, rfH_2 rfH_22) {
        return rfU_2.id_class(super.id_class(rsP_22, rfH_22) + 7, 0, 15);
    }

    private static void id_class(Ok_1 ok_1, rjV_2 rjV_22, rjj_3 rjj_32, float f, float f2, int n, int n2, int n3, float f3, float f4, int n4) {
        ok_1.id_class(rjV_22, f, f2, 0.0f).id_break(n, n2, n3, 128).id_class(f3, f4).id_byte(fZ_2.id_class).id_break(n4).id_class(rjj_32, 0.0f, 1.0f, 0.0f).id_class();
    }

    @Override
    public void id_class(rsP_2 rsP_22, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        int n2;
        ml_1.id_class();
        int n3 = rsP_22.id_throws();
        float f3 = (float)(n3 % 4 * 16 + 0) / 64.0f;
        float f4 = (float)(n3 % 4 * 16 + 16) / 64.0f;
        float f5 = (float)(n3 / 4 * 16 + 0) / 64.0f;
        float f6 = (float)(n3 / 4 * 16 + 16) / 64.0f;
        float f7 = 1.0f;
        float f8 = 0.5f;
        float f9 = 0.25f;
        float f10 = 255.0f;
        float f11 = ((float)rsP_22.id_class + f2) / 2.0f;
        if (rrbb_3.K()) {
            f11 = rrbN_2.id_class(f11);
        }
        int n4 = (int)((rfU_2.id_class(f11 + 0.0f) + 1.0f) * 0.5f * 255.0f);
        int n5 = 255;
        int n6 = (int)((rfU_2.id_class(f11 + 4.1887903f) + 1.0f) * 0.1f * 255.0f);
        ml_1.id_class(0.0, (double)0.1f, 0.0);
        ml_1.id_class(this.id_break.id_byte());
        ml_1.id_class(rje_3.id_protected.id_byte(180.0f));
        float f12 = 0.3f;
        ml_1.id_class(0.3f, 0.3f, 0.3f);
        Ok_1 ok_1 = hx_1.getBuffer(id_throws);
        MH mH = ml_1.id_byte();
        rjV_2 rjV_22 = mH.id_class();
        rjj_3 rjj_32 = mH.id_break();
        int n7 = n4;
        int n8 = 255;
        int n9 = n6;
        if (rrbb_3.K() && (n2 = rrbN_2.id_break(f11)) >= 0) {
            n7 = n2 >> 16 & 0xFF;
            n8 = n2 >> 8 & 0xFF;
            n9 = n2 >> 0 & 0xFF;
        }
        pK_2.id_class(ok_1, rjV_22, rjj_32, -0.5f, -0.25f, n7, n8, n9, f3, f6, n);
        pK_2.id_class(ok_1, rjV_22, rjj_32, 0.5f, -0.25f, n7, n8, n9, f4, f6, n);
        pK_2.id_class(ok_1, rjV_22, rjj_32, 0.5f, 0.75f, n7, n8, n9, f4, f5, n);
        pK_2.id_class(ok_1, rjV_22, rjj_32, -0.5f, 0.75f, n7, n8, n9, f3, f5, n);
        ml_1.id_break();
        super.id_class(rsP_22, f, f2, ml_1, hx_1, n);
    }
}

