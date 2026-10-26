/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.pg_3;
import celestial.qc_3;
import celestial.rMR;
import celestial.rfU_2;
import celestial.rqO_2;
import celestial.ws_3;

public class qF_2
extends qc_3<rMR, ws_3> {
    public static final rqO_2[] id_class = new rqO_2[]{new rqO_2("textures/entity/parrot/parrot_red_blue.png"), new rqO_2("textures/entity/parrot/parrot_blue.png"), new rqO_2("textures/entity/parrot/parrot_green.png"), new rqO_2("textures/entity/parrot/parrot_yellow_blue.png"), new rqO_2("textures/entity/parrot/parrot_grey.png")};

    public qF_2(pg_3 pg_32) {
        super(pg_32, new ws_3(), 0.3f);
    }

    @Override
    public rqO_2 id_class(rMR rMR2) {
        return id_class[rMR2.sJ()];
    }

    @Override
    public float id_class(rMR rMR2, float f) {
        float f2 = rfU_2.id_catch(f, rMR2.id_synchronized, rMR2.id_super);
        float f3 = rfU_2.id_catch(f, rMR2.id_else, rMR2.id_this);
        return (rfU_2.id_class(f2) + 1.0f) * f3;
    }
}

