/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rEg_1;
import celestial.rqO_2;
import celestial.tc_3;

public class qB_2
extends qc_3<rEg_1, tc_3<rEg_1>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/hoglin/hoglin.png");

    public qB_2(pg_3 pg_32) {
        super(pg_32, new tc_3(), 0.7f);
    }

    @Override
    protected /* synthetic */ boolean id_class(iB_2 iB_22) {
        return this.id_break((rEg_1)iB_22);
    }

    @Override
    public rqO_2 id_class(rEg_1 rEg_12) {
        return id_class;
    }

    @Override
    protected boolean id_break(rEg_1 rEg_12) {
        return rEg_12.sx();
    }
}

