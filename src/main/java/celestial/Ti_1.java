/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Tz_1;
import celestial.an_3;
import celestial.qE_2;
import celestial.rqO_2;
import celestial.wC_2;

public class Ti_1<T extends an_3, M extends wC_2<T>>
extends Tz_1<T, M> {
    private static final HU id_class = HU.id_volatile(new rqO_2("textures/entity/spider_eyes.png"));

    public Ti_1(qE_2<T, M> qE_22) {
        super(qE_22);
    }

    @Override
    public HU id_class() {
        return id_class;
    }
}

