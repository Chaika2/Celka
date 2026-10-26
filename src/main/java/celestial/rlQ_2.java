/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.rVL;
import celestial.rXs_1;
import celestial.rdb_3;
import celestial.rlA_2;
import celestial.rlN_2;
import celestial.rlW_2;
import celestial.ruu_3;
import celestial.xd_3;
import celestial.xu_3;

public interface rlQ_2 {
    public static final rlQ_2 id_class = rlQ_2.id_class(rlW_2.id_byte(), rlW_2.id_byte(), rlW_2.id_byte(), rlW_2.id_byte());

    public rlW_2<rXs_1> id_byte();

    public static rlQ_2 id_class(rlW_2<xd_3> rlW_22, rlW_2<rdb_3> rlW_23, rlW_2<rXs_1> rlW_24, rlW_2<aI_2<?>> rlW_25) {
        return new rlN_2(rlW_22, rlW_23, rlW_24, rlW_25);
    }

    default public void id_class(ruu_3 ruu_32) {
        this.id_class().id_class(ruu_32, rVL.id_strictfp);
        this.id_break().id_class(ruu_32, rVL.id_for);
        this.id_byte().id_class(ruu_32, rVL.id_default);
        this.id_protected().id_class(ruu_32, rVL.id_transient);
    }

    public rlW_2<xd_3> id_class();

    public rlW_2<rdb_3> id_break();

    public static rlQ_2 id_break(ruu_3 ruu_32) {
        rlW_2<xd_3> rlW_22 = rlW_2.id_class(ruu_32, rVL.id_strictfp);
        rlW_2<rdb_3> rlW_23 = rlW_2.id_class(ruu_32, rVL.id_for);
        rlW_2<rXs_1> rlW_24 = rlW_2.id_class(ruu_32, rVL.id_default);
        rlW_2<aI_2<?>> rlW_25 = rlW_2.id_class(ruu_32, rVL.id_transient);
        return rlQ_2.id_class(rlW_22, rlW_23, rlW_24, rlW_25);
    }

    default public void id_throws() {
        rlA_2.id_class(this);
        xu_3.id_class();
    }

    public rlW_2<aI_2<?>> id_protected();
}

