/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.pg_3;
import celestial.qc_3;
import celestial.rMi_1;
import celestial.rgF_2;
import celestial.rqO_2;
import celestial.wW_2;

public class qp_3
extends qc_3<rMi_1, wW_2<rMi_1>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/rabbit/brown.png");
    private static final rqO_2 id_package = new rqO_2("textures/entity/rabbit/white.png");
    private static final rqO_2 id_int = new rqO_2("textures/entity/rabbit/black.png");
    private static final rqO_2 id_new = new rqO_2("textures/entity/rabbit/gold.png");
    private static final rqO_2 id_continue = new rqO_2("textures/entity/rabbit/salt.png");
    private static final rqO_2 id_super = new rqO_2("textures/entity/rabbit/white_splotched.png");
    private static final rqO_2 id_this = new rqO_2("textures/entity/rabbit/toast.png");
    private static final rqO_2 id_else = new rqO_2("textures/entity/rabbit/caerbannog.png");

    public qp_3(pg_3 pg_32) {
        super(pg_32, new wW_2(), 0.3f);
    }

    @Override
    public rqO_2 id_class(rMi_1 rMi_12) {
        String string = rgF_2.id_class(rMi_12.g().getString());
        if (string != null && "Toast".equals(string)) {
            return id_this;
        }
        switch (rMi_12.sx()) {
            default: {
                return id_class;
            }
            case 1: {
                return id_package;
            }
            case 2: {
                return id_int;
            }
            case 3: {
                return id_super;
            }
            case 4: {
                return id_new;
            }
            case 5: {
                return id_continue;
            }
            case 99: 
        }
        return id_else;
    }
}

