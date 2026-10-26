/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.TD;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rOb_1;
import celestial.rqO_2;
import celestial.wc_3;

public class qt_3
extends qc_3<rOb_1, wc_3<rOb_1>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/sheep/sheep.png");

    public qt_3(pg_3 pg_32) {
        super(pg_32, new wc_3(), 0.7f);
        this.id_class(new TD(this));
    }

    @Override
    public rqO_2 id_class(rOb_1 rOb_12) {
        return id_class;
    }
}

