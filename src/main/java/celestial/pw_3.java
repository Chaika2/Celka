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
import celestial.pI_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.pt_3;
import celestial.rSu_1;
import celestial.rfU_2;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rjj_3;
import celestial.rqO_2;
import celestial.rrbb_3;
import celestial.rrdZ;
import java.util.Random;

public class pw_3
extends pV_2<rSu_1> {
    public static final rqO_2 id_class = new rqO_2("textures/entity/end_crystal/end_crystal_beam.png");
    private static final rqO_2 id_throws = new rqO_2("textures/entity/enderdragon/dragon_exploding.png");
    private static final rqO_2 id_case = new rqO_2("textures/entity/enderdragon/dragon.png");
    private static final rqO_2 id_catch = new rqO_2("textures/entity/enderdragon/dragon_eyes.png");
    private static final HU id_private = HU.id_protected(id_case);
    private static final HU id_implements = HU.id_finally(id_case);
    private static final HU id_finally = HU.id_volatile(id_catch);
    private static final HU id_extends = HU.id_implements(id_class);
    private static final float id_native = (float)(Math.sqrt(3.0) / 2.0);
    private final pI_2 id_volatile = new pI_2();

    private static void id_byte(Ok_1 ok_1, rjV_2 rjV_22, float f, float f2) {
        ok_1.id_class(rjV_22, 0.0f, f, 1.0f * f2).id_break(255, 0, 255, 0).id_class();
    }

    public pw_3(pg_3 pg_32) {
        super(pg_32);
        this.id_byte = 0.5f;
    }

    @Override
    public rqO_2 id_class(rSu_1 rSu_12) {
        return id_case;
    }

    private static void id_class(Ok_1 ok_1, rjV_2 rjV_22, int n) {
        ok_1.id_class(rjV_22, 0.0f, 0.0f, 0.0f).id_break(255, 255, 255, n).id_class();
        ok_1.id_class(rjV_22, 0.0f, 0.0f, 0.0f).id_break(255, 255, 255, n).id_class();
    }

    private static void id_class(Ok_1 ok_1, rjV_2 rjV_22, float f, float f2) {
        ok_1.id_class(rjV_22, -id_native * f2, f, -0.5f * f2).id_break(255, 0, 255, 0).id_class();
    }

    @Override
    public void id_class(rSu_1 rSu_12, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        ml_1.id_class();
        float f3 = (float)rSu_12.id_class(7, f2)[0];
        float f4 = (float)(rSu_12.id_class(5, f2)[1] - rSu_12.id_class(10, f2)[1]);
        ml_1.id_class(rje_3.id_protected.id_byte(-f3));
        ml_1.id_class(rje_3.id_break.id_byte(f4 * 10.0f));
        ml_1.id_class(0.0, 0.0, 1.0);
        ml_1.id_class(-1.0f, -1.0f, 1.0f);
        ml_1.id_class(0.0, (double)-1.501f, 0.0);
        boolean bl = (Integer)rSu_12.id_private[10] > 0;
        this.id_volatile.id_class(rSu_12, 0.0f, 0.0f, f2);
        if (rSu_12.id_return > 0) {
            float f5 = (float)rSu_12.id_return / 200.0f;
            Ok_1 ok_1 = hx_1.getBuffer(HU.id_class(id_throws, f5));
            this.id_volatile.id_class(ml_1, ok_1, n, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 1.0f);
            Ok_1 ok_12 = hx_1.getBuffer(id_implements);
            this.id_volatile.id_class(ml_1, ok_12, n, fZ_2.id_class(0.0f, bl), 1.0f, 1.0f, 1.0f, 1.0f);
        } else {
            Ok_1 ok_1 = hx_1.getBuffer(id_private);
            this.id_volatile.id_class(ml_1, ok_1, n, fZ_2.id_class(0.0f, bl), 1.0f, 1.0f, 1.0f, 1.0f);
        }
        Ok_1 ok_1 = hx_1.getBuffer(id_finally);
        if (rrbb_3.rs()) {
            rrdZ.id_double();
        }
        rrbb_3.z().id_case = true;
        this.id_volatile.id_class(ml_1, ok_1, n, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 1.0f);
        rrbb_3.z().id_case = false;
        if (rrbb_3.rs()) {
            rrdZ.id_switch();
        }
        if (rSu_12.id_return > 0) {
            float f6 = ((float)rSu_12.id_return + f2) / 200.0f;
            float f7 = Math.min(f6 > 0.8f ? (f6 - 0.8f) / 0.2f : 0.0f, 1.0f);
            Random random = new Random(432L);
            Ok_1 ok_13 = hx_1.getBuffer(HU.id_else());
            ml_1.id_class();
            ml_1.id_class(0.0, -1.0, -2.0);
            int n2 = 0;
            while ((float)n2 < (f6 + f6 * f6) / 2.0f * 60.0f) {
                ml_1.id_class(rje_3.id_break.id_byte(random.nextFloat() * 360.0f));
                ml_1.id_class(rje_3.id_protected.id_byte(random.nextFloat() * 360.0f));
                ml_1.id_class(rje_3.id_case.id_byte(random.nextFloat() * 360.0f));
                ml_1.id_class(rje_3.id_break.id_byte(random.nextFloat() * 360.0f));
                ml_1.id_class(rje_3.id_protected.id_byte(random.nextFloat() * 360.0f));
                ml_1.id_class(rje_3.id_case.id_byte(random.nextFloat() * 360.0f + f6 * 90.0f));
                float f8 = random.nextFloat() * 20.0f + 5.0f + f7 * 10.0f;
                float f9 = random.nextFloat() * 2.0f + 1.0f + f7 * 2.0f;
                rjV_2 rjV_22 = ml_1.id_byte().id_class();
                int n3 = (int)(255.0f * (1.0f - f7));
                pw_3.id_class(ok_13, rjV_22, n3);
                pw_3.id_class(ok_13, rjV_22, f8, f9);
                pw_3.id_break(ok_13, rjV_22, f8, f9);
                pw_3.id_class(ok_13, rjV_22, n3);
                pw_3.id_break(ok_13, rjV_22, f8, f9);
                pw_3.id_byte(ok_13, rjV_22, f8, f9);
                pw_3.id_class(ok_13, rjV_22, n3);
                pw_3.id_byte(ok_13, rjV_22, f8, f9);
                pw_3.id_class(ok_13, rjV_22, f8, f9);
                ++n2;
            }
            ml_1.id_break();
        }
        ml_1.id_break();
        if (rSu_12.id_goto != null) {
            ml_1.id_class();
            float f10 = (float)(rSu_12.id_goto.rx() - rfU_2.id_protected((double)f2, (Double)rSu_12.id_throws[8], rSu_12.rx()));
            float f11 = (float)(rSu_12.id_goto.re() - rfU_2.id_protected((double)f2, (Double)rSu_12.id_throws[9], rSu_12.re()));
            float f12 = (float)(rSu_12.id_goto.BO() - rfU_2.id_protected((double)f2, (Double)rSu_12.id_throws[10], rSu_12.BO()));
            pw_3.id_class(f10, f11 + pt_3.id_class(rSu_12.id_goto, f2), f12, f2, (Integer)rSu_12.id_throws[41], ml_1, hx_1, n);
            ml_1.id_break();
        }
        super.id_class(rSu_12, f, f2, ml_1, hx_1, n);
    }

    public static void id_class(float f, float f2, float f3, float f4, int n, Ml_1 ml_1, Hx_1 hx_1, int n2) {
        float f5 = rfU_2.id_byte(f * f + f3 * f3);
        float f6 = rfU_2.id_byte(f * f + f2 * f2 + f3 * f3);
        ml_1.id_class();
        ml_1.id_class(0.0, 2.0, 0.0);
        ml_1.id_class(rje_3.id_protected.id_break((float)(-Math.atan2(f3, f)) - 1.5707964f));
        ml_1.id_class(rje_3.id_break.id_break((float)(-Math.atan2(f5, f2)) - 1.5707964f));
        Ok_1 ok_1 = hx_1.getBuffer(id_extends);
        float f7 = 0.0f - ((float)n + f4) * 0.01f;
        float f8 = rfU_2.id_byte(f * f + f2 * f2 + f3 * f3) / 32.0f - ((float)n + f4) * 0.01f;
        int n3 = 8;
        float f9 = 0.0f;
        float f10 = 0.75f;
        float f11 = 0.0f;
        MH mH = ml_1.id_byte();
        rjV_2 rjV_22 = mH.id_class();
        rjj_3 rjj_32 = mH.id_break();
        for (int i = 1; i <= 8; ++i) {
            float f12 = rfU_2.id_class((float)i * ((float)Math.PI * 2) / 8.0f) * 0.75f;
            float f13 = rfU_2.id_break((float)i * ((float)Math.PI * 2) / 8.0f) * 0.75f;
            float f14 = (float)i / 8.0f;
            ok_1.id_class(rjV_22, f9 * 0.2f, f10 * 0.2f, 0.0f).id_break(0, 0, 0, 255).id_class(f11, f7).id_byte(fZ_2.id_class).id_break(n2).id_class(rjj_32, 0.0f, -1.0f, 0.0f).id_class();
            ok_1.id_class(rjV_22, f9, f10, f6).id_break(255, 255, 255, 255).id_class(f11, f8).id_byte(fZ_2.id_class).id_break(n2).id_class(rjj_32, 0.0f, -1.0f, 0.0f).id_class();
            ok_1.id_class(rjV_22, f12, f13, f6).id_break(255, 255, 255, 255).id_class(f14, f8).id_byte(fZ_2.id_class).id_break(n2).id_class(rjj_32, 0.0f, -1.0f, 0.0f).id_class();
            ok_1.id_class(rjV_22, f12 * 0.2f, f13 * 0.2f, 0.0f).id_break(0, 0, 0, 255).id_class(f14, f7).id_byte(fZ_2.id_class).id_break(n2).id_class(rjj_32, 0.0f, -1.0f, 0.0f).id_class();
            f9 = f12;
            f10 = f13;
            f11 = f14;
        }
        ml_1.id_break();
    }

    private static void id_break(Ok_1 ok_1, rjV_2 rjV_22, float f, float f2) {
        ok_1.id_class(rjV_22, id_native * f2, f, -0.5f * f2).id_break(255, 0, 255, 0).id_class();
    }
}

