/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.TH;
import celestial.qE_2;
import celestial.rSN;
import celestial.rfU_2;
import celestial.rqO_2;
import celestial.tp_3;
import celestial.wj_3;

public class tG_2
extends TH<rSN, wj_3<rSN>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/wither/wither_armor.png");
    private final wj_3<rSN> id_break = new wj_3(0.5f);

    public tG_2(qE_2<rSN, wj_3<rSN>> qE_22) {
        super(qE_22);
    }

    @Override
    protected float id_class(float f) {
        return rfU_2.id_break(f * 0.02f) * 3.0f;
    }

    @Override
    protected rqO_2 id_class() {
        return id_class;
    }

    @Override
    protected tp_3<rSN> id_break() {
        return this.id_break;
    }
}

