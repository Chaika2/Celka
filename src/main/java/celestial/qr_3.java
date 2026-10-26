/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.TT;
import celestial.Tc_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rEw_1;
import celestial.rqO_2;
import celestial.tI_2;
import celestial.tW_2;

public class qr_3
extends qc_3<rEw_1, tW_2<rEw_1>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/zombie/zombie.png");
    private final float id_package;

    public qr_3(pg_3 pg_32, float f) {
        super(pg_32, new tI_2(), 0.5f * f);
        this.id_package = f;
        this.id_class(new TT<rEw_1, tW_2<rEw_1>>(this));
        this.id_class(new Tc_1<rEw_1, tW_2<rEw_1>, tI_2>(this, new tI_2(0.5f, true), new tI_2(1.0f, true)));
    }

    @Override
    protected void id_class(rEw_1 rEw_12, Ml_1 ml_1, float f) {
        ml_1.id_class(this.id_package, this.id_package, this.id_package);
    }

    @Override
    public rqO_2 id_class(rEw_1 rEw_12) {
        return id_class;
    }
}

