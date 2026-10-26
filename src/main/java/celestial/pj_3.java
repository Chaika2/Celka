/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rEL;
import celestial.rqO_2;
import celestial.ty_3;

public class pj_3
extends qc_3<rEL, ty_3<rEL>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/endermite.png");

    @Override
    protected /* synthetic */ float id_byte(iB_2 iB_22) {
        return this.id_class((rEL)iB_22);
    }

    public pj_3(pg_3 pg_32) {
        super(pg_32, new ty_3(), 0.3f);
    }

    @Override
    public /* synthetic */ rqO_2 id_class(an_3 an_32) {
        return this.id_break((rEL)an_32);
    }

    protected float id_class(rEL rEL2) {
        return 180.0f;
    }

    public rqO_2 id_break(rEL rEL2) {
        return id_class;
    }
}

