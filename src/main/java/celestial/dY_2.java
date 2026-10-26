/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kX_2;
import celestial.rDg_1;
import celestial.rRq_1;
import celestial.rUm_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rls_3;
import celestial.rrEm_1;
import celestial.xF_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;
import java.util.function.Supplier;

public class dY_2
extends xF_2
implements kX_2 {
    protected static final rjC_2 id_volatile = xd_3.id_class(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
    private final Supplier<rDg_1<rUm_1, ?>> id_final;

    protected dY_2(Jq_1 jq_1, Supplier<rDg_1<rUm_1, ?>> supplier) {
        super(jq_1);
        this.id_final = supplier;
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        this.id_final.get().id_class(rrEm_12, rrEm_12.id_else().id_implements(), random, rfH_22);
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        xd_3 xd_32 = ((rUm_1)this.id_final.get().id_case).id_case.id_break();
        xd_3 xd_33 = rRq_12.id_byte(rfH_22.id_break()).id_break();
        return xd_33 == xd_32;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile;
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return (double)random.nextFloat() < 0.4;
    }

    @Override
    protected boolean id_catch(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_class(rls_3.c) || xc_32.id_class(xu_3.Bi) || xc_32.id_class(xu_3.Po) || super.id_catch(xc_32, rRq_12, rfH_22);
    }
}

