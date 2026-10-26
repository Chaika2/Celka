/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.fU_2;
import celestial.jE_2;
import celestial.jz_3;
import celestial.rHy_1;
import celestial.rfU_2;
import celestial.rqO_2;
import celestial.rrAe_1;
import celestial.rrQX;
import celestial.rxL_2;

public class js_3
extends jE_2<rHy_1> {
    private static final rqO_2 id_byte = new rqO_2("textures/entity/end_gateway_beam.png");

    public js_3(jz_3 jz_32) {
        super(jz_32);
    }

    @Override
    protected float id_class() {
        return 1.0f;
    }

    @Override
    public void id_class(rHy_1 rHy_12, float f, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAe_1.id_class()).id_byte()) {
            return;
        }
        if (rHy_12.id_catch() || rHy_12.id_private()) {
            float f2 = rHy_12.id_catch() ? rHy_12.id_class(f) : rHy_12.id_break(f);
            double d = rHy_12.id_catch() ? 256.0 : 50.0;
            f2 = rfU_2.id_class(f2 * (float)Math.PI);
            int n3 = rfU_2.id_byte((double)f2 * d);
            float[] fArray = rHy_12.id_catch() ? rxL_2.MAGENTA.id_protected() : rxL_2.PURPLE.id_protected();
            long l = rHy_12.id_while().r();
            fU_2.id_class(ml_1, hx_1, id_byte, f, f2, l, 0, n3, fArray, 0.15f, 0.175f);
            fU_2.id_class(ml_1, hx_1, id_byte, f, f2, l, 0, -n3, fArray, 0.15f, 0.175f);
        }
        super.id_class(rHy_12, f, ml_1, hx_1, n, n2);
    }

    @Override
    protected int id_class(double d) {
        return super.id_class(d) + 1;
    }
}

