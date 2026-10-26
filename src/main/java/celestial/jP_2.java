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
import celestial.ly_3;
import celestial.rHA;
import celestial.rfU_2;
import celestial.rjY_2;
import celestial.rje_3;
import celestial.rqO_2;

public class jP_2
extends jW_2<rHA> {
    public static final Ig_1 id_class = new Ig_1(fJ_2.id_class, new rqO_2("entity/conduit/base"));
    public static final Ig_1 id_break = new Ig_1(fJ_2.id_class, new rqO_2("entity/conduit/cage"));
    public static final Ig_1 id_byte = new Ig_1(fJ_2.id_class, new rqO_2("entity/conduit/wind"));
    public static final Ig_1 id_protected = new Ig_1(fJ_2.id_class, new rqO_2("entity/conduit/wind_vertical"));
    public static final Ig_1 id_throws = new Ig_1(fJ_2.id_class, new rqO_2("entity/conduit/open_eye"));
    public static final Ig_1 id_case = new Ig_1(fJ_2.id_class, new rqO_2("entity/conduit/closed_eye"));
    private final Iq_1 id_private = new Iq_1(16, 16, 0, 0);
    private final Iq_1 id_implements;
    private final Iq_1 id_finally;
    private final Iq_1 id_extends;

    public jP_2(jz_3 jz_32) {
        super(jz_32);
        this.id_private.id_class(-4.0f, -4.0f, 0.0f, 8.0f, 8.0f, 0.0f, 0.01f);
        this.id_implements = new Iq_1(64, 32, 0, 0);
        this.id_implements.id_class(-8.0f, -8.0f, -8.0f, 16.0f, 16.0f, 16.0f);
        this.id_finally = new Iq_1(32, 16, 0, 0);
        this.id_finally.id_class(-3.0f, -3.0f, -3.0f, 6.0f, 6.0f, 6.0f);
        this.id_extends = new Iq_1(32, 16, 0, 0);
        this.id_extends.id_class(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f);
    }

    @Override
    public void id_class(rHA rHA2, float f, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        float f2 = (float)rHA2.id_class + f;
        if (!rHA2.id_catch()) {
            float f3 = rHA2.id_class(0.0f);
            Ok_1 ok_1 = id_class.id_class(hx_1, HU::id_break);
            ml_1.id_class();
            ml_1.id_class(0.5, 0.5, 0.5);
            ml_1.id_class(rje_3.id_protected.id_byte(f3));
            this.id_finally.id_class(ml_1, ok_1, n, n2);
            ml_1.id_break();
        } else {
            float f4 = rHA2.id_class(f) * 57.295776f;
            float f5 = rfU_2.id_class(f2 * 0.1f) / 2.0f + 0.5f;
            f5 = f5 * f5 + f5;
            ml_1.id_class();
            ml_1.id_class(0.5, (double)(0.3f + f5 * 0.2f), 0.5);
            rje_3 rje_32 = new rje_3(0.5f, 1.0f, 0.5f);
            rje_32.id_protected();
            ml_1.id_class(new rjY_2(rje_32, f4, true));
            this.id_extends.id_class(ml_1, id_break.id_class(hx_1, HU::id_protected), n, n2);
            ml_1.id_break();
            int n3 = rHA2.id_class / 66 % 3;
            ml_1.id_class();
            ml_1.id_class(0.5, 0.5, 0.5);
            if (n3 == 1) {
                ml_1.id_class(rje_3.id_break.id_byte(90.0f));
            } else if (n3 == 2) {
                ml_1.id_class(rje_3.id_case.id_byte(90.0f));
            }
            Ok_1 ok_1 = (n3 == 1 ? id_protected : id_byte).id_class(hx_1, HU::id_protected);
            this.id_implements.id_class(ml_1, ok_1, n, n2);
            ml_1.id_break();
            ml_1.id_class();
            ml_1.id_class(0.5, 0.5, 0.5);
            ml_1.id_class(0.875f, 0.875f, 0.875f);
            ml_1.id_class(rje_3.id_break.id_byte(180.0f));
            ml_1.id_class(rje_3.id_case.id_byte(180.0f));
            this.id_implements.id_class(ml_1, ok_1, n, n2);
            ml_1.id_break();
            ly_3 ly_32 = this.id_catch.id_throws;
            ml_1.id_class();
            ml_1.id_class(0.5, (double)(0.3f + f5 * 0.2f), 0.5);
            ml_1.id_class(0.5f, 0.5f, 0.5f);
            float f6 = -ly_32.id_throws();
            ml_1.id_class(rje_3.id_protected.id_byte(f6));
            ml_1.id_class(rje_3.id_break.id_byte(ly_32.id_protected()));
            ml_1.id_class(rje_3.id_case.id_byte(180.0f));
            float f7 = 1.3333334f;
            ml_1.id_class(1.3333334f, 1.3333334f, 1.3333334f);
            this.id_private.id_class(ml_1, (rHA2.id_private() ? id_throws : id_case).id_class(hx_1, HU::id_protected), n, n2);
            ml_1.id_break();
        }
    }
}

