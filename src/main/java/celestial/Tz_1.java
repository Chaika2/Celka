/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.In_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.Tf_1;
import celestial.an_3;
import celestial.fZ_2;
import celestial.qE_2;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.tp_3;

public abstract class Tz_1<T extends an_3, M extends tp_3<T>>
extends Tf_1<T, M> {
    public Tz_1(qE_2<T, M> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        Ok_1 ok_1 = hx_1.getBuffer(this.id_class());
        if (rrbb_3.rs()) {
            rrdZ.id_double();
        }
        rrbb_3.z().id_case = true;
        ((In_1)this.id_byte()).id_class(ml_1, ok_1, 0xF00000, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 1.0f);
        rrbb_3.z().id_case = false;
        if (rrbb_3.rs()) {
            rrdZ.id_switch();
        }
    }

    public abstract HU id_class();
}

