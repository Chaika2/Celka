/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.IT;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Tf_1;
import celestial.an_3;
import celestial.iB_2;
import celestial.qd_3;
import celestial.rfU_2;
import celestial.wh_3;
import java.util.Random;

public abstract class tB_2<T extends iB_2, M extends wh_3<T>>
extends Tf_1<T, M> {
    public tB_2(qd_3<T, M> qd_32) {
        super(qd_32);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        int n2 = this.id_class(t);
        Random random = new Random(((an_3)t).V());
        if (n2 > 0) {
            for (int i = 0; i < n2; ++i) {
                ml_1.id_class();
                Iq_1 iq_1 = ((wh_3)this.id_byte()).id_class(random);
                IT iT = iq_1.id_class(random);
                iq_1.id_class(ml_1);
                float f7 = random.nextFloat();
                float f8 = random.nextFloat();
                float f9 = random.nextFloat();
                float f10 = rfU_2.id_catch(f7, iT.id_class, iT.id_protected) / 16.0f;
                float f11 = rfU_2.id_catch(f8, iT.id_break, iT.id_throws) / 16.0f;
                float f12 = rfU_2.id_catch(f9, iT.id_byte, iT.id_case) / 16.0f;
                ml_1.id_class((double)f10, (double)f11, (double)f12);
                f7 = -1.0f * (f7 * 2.0f - 1.0f);
                f8 = -1.0f * (f8 * 2.0f - 1.0f);
                f9 = -1.0f * (f9 * 2.0f - 1.0f);
                this.id_class(ml_1, hx_1, n, (an_3)t, f7, f8, f9, f3);
                ml_1.id_break();
            }
        }
    }

    protected abstract void id_class(Ml_1 var1, Hx_1 var2, int var3, an_3 var4, float var5, float var6, float var7, float var8);

    protected abstract int id_class(T var1);
}

