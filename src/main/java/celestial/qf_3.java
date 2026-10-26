/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rGZ;
import celestial.rqO_2;
import celestial.wF_2;

public class qf_3
extends qc_3<rGZ, wF_2<rGZ>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/silverfish.png");

    @Override
    protected /* synthetic */ float id_byte(iB_2 iB_22) {
        return this.id_class((rGZ)iB_22);
    }

    public qf_3(pg_3 pg_32) {
        super(pg_32, new wF_2(), 0.3f);
    }

    @Override
    public /* synthetic */ rqO_2 id_class(an_3 an_32) {
        return this.id_break((rGZ)an_32);
    }

    protected float id_class(rGZ rGZ2) {
        return 180.0f;
    }

    public rqO_2 id_break(rGZ rGZ2) {
        return id_class;
    }
}

