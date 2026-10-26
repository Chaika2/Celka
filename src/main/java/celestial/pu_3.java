/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.pg_3;
import celestial.qc_3;
import celestial.rbF_2;
import celestial.rqO_2;
import celestial.tk_3;

public class pu_3
extends qc_3<rbF_2, tk_3<rbF_2>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/bee/bee_angry.png");
    private static final rqO_2 id_package = new rqO_2("textures/entity/bee/bee_angry_nectar.png");
    private static final rqO_2 id_int = new rqO_2("textures/entity/bee/bee.png");
    private static final rqO_2 id_new = new rqO_2("textures/entity/bee/bee_nectar.png");

    public pu_3(pg_3 pg_32) {
        super(pg_32, new tk_3(), 0.4f);
    }

    @Override
    public rqO_2 id_class(rbF_2 rbF_22) {
        if (rbF_22.T_()) {
            return rbF_22.sc() ? id_package : id_class;
        }
        return rbF_22.sc() ? id_new : id_int;
    }
}

