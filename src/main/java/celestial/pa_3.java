/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.Ty_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rMN;
import celestial.rba_3;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.tT_2;

public class pa_3
extends qc_3<rba_3, tT_2<rba_3>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/fox/fox.png");
    private static final rqO_2 id_package = new rqO_2("textures/entity/fox/fox_sleep.png");
    private static final rqO_2 id_int = new rqO_2("textures/entity/fox/snow_fox.png");
    private static final rqO_2 id_new = new rqO_2("textures/entity/fox/snow_fox_sleep.png");

    public pa_3(pg_3 pg_32) {
        super(pg_32, new tT_2(), 0.4f);
        this.id_class(new Ty_1(this));
    }

    @Override
    protected void id_class(rba_3 rba_32, Ml_1 ml_1, float f, float f2, float f3) {
        super.id_class(rba_32, ml_1, f, f2, f3);
        if (rba_32.sd() || rba_32.sx()) {
            float f4 = -rfU_2.id_catch(f3, ((Float)rba_32.id_throws[18]).floatValue(), ((Float)rba_32.id_throws[16]).floatValue());
            ml_1.id_class(rje_3.id_break.id_byte(f4));
        }
    }

    @Override
    public rqO_2 id_class(rba_3 rba_32) {
        if (rba_32.n() == rMN.RED) {
            return rba_32.Sc() ? id_package : id_class;
        }
        return rba_32.Sc() ? id_new : id_int;
    }
}

