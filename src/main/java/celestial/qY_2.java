/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ti_1;
import celestial.iB_2;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rGw_1;
import celestial.rqO_2;
import celestial.wC_2;

public class qY_2<T extends rGw_1>
extends qc_3<T, wC_2<T>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/spider/spider.png");

    @Override
    protected /* synthetic */ float id_byte(iB_2 iB_22) {
        return this.id_break((T)((rGw_1)iB_22));
    }

    public qY_2(pg_3 pg_32) {
        super(pg_32, new wC_2(), 0.8f);
        this.id_class(new Ti_1(this));
    }

    @Override
    public rqO_2 id_class(T t) {
        return id_class;
    }

    protected float id_break(T t) {
        return 180.0f;
    }
}

