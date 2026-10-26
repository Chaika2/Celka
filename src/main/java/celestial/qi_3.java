/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.pN_2;
import celestial.pg_3;
import celestial.rhF_2;
import celestial.rqO_2;

public class qi_3
extends pN_2<rhF_2> {
    public static final rqO_2 id_class = new rqO_2("textures/entity/projectiles/arrow.png");
    public static final rqO_2 id_throws = new rqO_2("textures/entity/projectiles/tipped_arrow.png");

    public qi_3(pg_3 pg_32) {
        super(pg_32);
    }

    @Override
    public rqO_2 id_class(rhF_2 rhF_22) {
        return rhF_22.id_super() > 0 ? id_throws : id_class;
    }
}

