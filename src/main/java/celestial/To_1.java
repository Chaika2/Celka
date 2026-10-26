/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Tz_1;
import celestial.an_3;
import celestial.qE_2;
import celestial.rqO_2;
import celestial.wb_3;

public class To_1<T extends an_3>
extends Tz_1<T, wb_3<T>> {
    private static final HU id_class = HU.id_volatile(new rqO_2("textures/entity/phantom_eyes.png"));

    public To_1(qE_2<T, wb_3<T>> qE_22) {
        super(qE_22);
    }

    @Override
    public HU id_class() {
        return id_class;
    }
}

