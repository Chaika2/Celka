/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.TH;
import celestial.qE_2;
import celestial.rEJ;
import celestial.rqO_2;
import celestial.tA_2;
import celestial.tp_3;

public class Tv_1
extends TH<rEJ, tA_2<rEJ>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/creeper/creeper_armor.png");
    private final tA_2<rEJ> id_break = new tA_2(2.0f);

    public Tv_1(qE_2<rEJ, tA_2<rEJ>> qE_22) {
        super(qE_22);
    }

    @Override
    protected float id_class(float f) {
        return f * 0.01f;
    }

    @Override
    protected rqO_2 id_class() {
        return id_class;
    }

    @Override
    protected tp_3<rEJ> id_break() {
        return this.id_break;
    }
}

