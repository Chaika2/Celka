/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.TV;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rhP_2;
import celestial.rqO_2;
import celestial.te_3;

public class qW_2
extends qc_3<rhP_2, te_3<rhP_2>> {
    private static final rqO_2[] id_class = new rqO_2[]{new rqO_2("textures/entity/llama/creamy.png"), new rqO_2("textures/entity/llama/white.png"), new rqO_2("textures/entity/llama/brown.png"), new rqO_2("textures/entity/llama/gray.png")};

    public qW_2(pg_3 pg_32) {
        super(pg_32, new te_3(0.0f), 0.7f);
        this.id_class(new TV(this));
    }

    @Override
    public rqO_2 id_class(rhP_2 rhP_22) {
        return id_class[rhP_22.se()];
    }
}

