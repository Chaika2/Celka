/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Tz_1;
import celestial.iB_2;
import celestial.qE_2;
import celestial.rqO_2;
import celestial.tH_2;

public class Tl_1<T extends iB_2>
extends Tz_1<T, tH_2<T>> {
    private static final HU id_class = HU.id_volatile(new rqO_2("textures/entity/enderman/enderman_eyes.png"));

    public Tl_1(qE_2<T, tH_2<T>> qE_22) {
        super(qE_22);
    }

    @Override
    public HU id_class() {
        return id_class;
    }
}

