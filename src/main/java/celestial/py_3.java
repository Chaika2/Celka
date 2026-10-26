/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.TA;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rbo_3;
import celestial.rqO_2;
import celestial.tn_3;

public class py_3
extends qc_3<rbo_3, tn_3<rbo_3>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/dolphin.png");

    public py_3(pg_3 pg_32) {
        super(pg_32, new tn_3(), 0.7f);
        this.id_class(new TA(this));
    }

    @Override
    public rqO_2 id_class(rbo_3 rbo_32) {
        return id_class;
    }
}

