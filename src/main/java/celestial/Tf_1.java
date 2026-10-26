/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.an_3;
import celestial.iB_2;
import celestial.qE_2;
import celestial.qd_3;
import celestial.rqO_2;
import celestial.tp_3;

public abstract class Tf_1<T extends an_3, M extends tp_3<T>> {
    private final qE_2<T, M> id_class;

    public M id_byte() {
        return this.id_class.id_class();
    }

    public Tf_1(qE_2<T, M> qE_22) {
        this.id_class = qE_22;
    }

    public abstract void id_class(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10);

    protected rqO_2 id_class(T t) {
        return this.id_class.id_class(t);
    }

    protected static <T extends iB_2> void id_class(tp_3<T> tp_32, tp_3<T> tp_33, rqO_2 rqO_22, Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (!t.Pp()) {
            tp_32.id_class(tp_33);
            tp_33.id_class(t, f, f2, f6);
            tp_33.id_class(t, f, f2, f3, f4, f5);
            Tf_1.id_class(tp_33, rqO_22, ml_1, hx_1, n, t, f7, f8, f9);
        }
    }

    protected static <T extends iB_2> void id_class(tp_3<T> tp_32, rqO_2 rqO_22, Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3) {
        Ok_1 ok_1 = hx_1.getBuffer(HU.id_protected(rqO_22));
        tp_32.id_class(ml_1, ok_1, n, qd_3.id_byte(t, 0.0f), f, f2, f3, 1.0f);
    }
}

