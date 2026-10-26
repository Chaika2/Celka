/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.pg_3;
import celestial.qc_3;
import celestial.rbR_2;
import celestial.rfU_2;
import celestial.rqO_2;
import celestial.tv_3;

public class pn_3
extends qc_3<rbR_2, tv_3<rbR_2>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/chicken.png");

    public pn_3(pg_3 pg_32) {
        super(pg_32, new tv_3(), 0.3f);
    }

    @Override
    public rqO_2 id_class(rbR_2 rbR_22) {
        return id_class;
    }

    @Override
    protected float id_class(rbR_2 rbR_22, float f) {
        float f2 = rfU_2.id_catch(f, rbR_22.id_synchronized, rbR_22.id_super);
        float f3 = rfU_2.id_catch(f, rbR_22.id_else, rbR_22.id_this);
        return (rfU_2.id_class(f2) + 1.0f) * f3;
    }
}

