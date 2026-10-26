/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRq_1;
import celestial.rRx_1;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.ryH_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Arrays;

public final class Jl_1 {
    private static final rpr_3[] id_throws = rpr_3.values();
    private static final int id_case = ryH_2.values().length;
    protected final boolean id_class;
    public final boolean id_catch;
    public final int id_private;
    public final rjC_2[] id_implements;
    protected final rjC_2 id_break;
    protected final boolean id_byte;
    private final boolean[] id_finally;
    protected final boolean id_protected;

    public Jl_1(xc_3 xc_32) {
        xd_3 xd_32 = xc_32.id_break();
        this.id_class = xc_32.id_implements(rRx_1.INSTANCE, rfH_2.id_protected);
        this.id_catch = xd_32.a_(xc_32, rRx_1.INSTANCE, rfH_2.id_protected);
        this.id_private = xd_32.id_protected(xc_32, rRx_1.INSTANCE, rfH_2.id_protected);
        if (!xc_32.id_native()) {
            this.id_implements = null;
        } else {
            this.id_implements = new rjC_2[id_throws.length];
            rpr_3[] rpr_3Array = xd_32.id_class(xc_32, rRx_1.INSTANCE, rfH_2.id_protected);
            rpr_3[] rpr_3Array2 = id_throws;
            int n = rpr_3Array2.length;
            for (int i = 0; i < n; ++i) {
                ryH_2[] ryH_2Array = rpr_3Array2[i];
                this.id_implements[ryH_2Array.ordinal()] = rjw_3.id_class((rjC_2)rpr_3Array, (rpr_3)ryH_2Array);
            }
        }
        this.id_break = xd_32.id_break(xc_32, (rRq_1)rRx_1.INSTANCE, rfH_2.id_protected, rjm_3.id_break());
        this.id_byte = Arrays.stream(rpB_2.values()).anyMatch(rpB_22 -> this.id_break.id_break((rpB_2)rpB_22) < 0.0 || this.id_break.id_byte((rpB_2)rpB_22) > 1.0);
        this.id_finally = new boolean[id_throws.length * id_case];
        for (rpr_3 rpr_32 : id_throws) {
            for (ryH_2 ryH_22 : ryH_2.values()) {
                this.id_finally[Jl_1.id_break((rpr_3)rpr_32, (ryH_2)ryH_22)] = ryH_22.id_class(xc_32, rRx_1.INSTANCE, rfH_2.id_protected, rpr_32);
            }
        }
        this.id_protected = xd_3.id_class(xc_32.id_extends(rRx_1.INSTANCE, rfH_2.id_protected));
    }

    public boolean id_class(rpr_3 rpr_32, ryH_2 ryH_22) {
        return this.id_finally[Jl_1.id_break(rpr_32, ryH_22)];
    }

    private static int id_break(rpr_3 rpr_32, ryH_2 ryH_22) {
        return rpr_32.ordinal() * id_case + ryH_22.ordinal();
    }
}

