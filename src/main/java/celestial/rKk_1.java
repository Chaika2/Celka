/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rKf_1;
import celestial.rKu_1;
import celestial.rKv_1;
import celestial.rRE;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rVL;
import celestial.rVn_1;
import celestial.rYA;
import celestial.rYG;
import celestial.rYl_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.roC_2;
import celestial.ror_3;
import celestial.rrSq_1;
import celestial.rrrA;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class rKk_1
extends rKd_1 {
    public static final Codec<rKk_1> id_protected = rVn_1.id_class(rVL.n).xmap(rKk_1::new, rKk_1::id_catch).stable().codec();
    private static final List<xc_3> id_catch = StreamSupport.stream(rVL.id_strictfp.spliterator(), false).flatMap(xd_32 -> xd_32.id_new().id_class().stream()).collect(Collectors.toList());
    private static final int id_private = rfU_2.id_case(rfU_2.id_byte((float)id_catch.size()));
    private static final int id_implements = rfU_2.id_case((float)id_catch.size() / (float)id_private);
    protected static final xc_3 id_throws = xu_3.id_class.id_continue();
    protected static final xc_3 id_case = xu_3.Ec.id_continue();
    private final rVL<rYG> id_finally;

    public rKk_1(rVL<rYG> rVL2) {
        super(new ror_3(rVL2.id_byte(rYl_1.id_break)), new rrSq_1(false));
        this.id_finally = rVL2;
    }

    @Override
    public void id_class(rRg_1 rRg_12, rrrA rrrA2, roC_2 roC_22) {
    }

    @Override
    public int id_class(int n, int n2, rKv_1 rKv_12) {
        return 0;
    }

    @Override
    public rRq_1 id_class(int n, int n2) {
        return new rRE(new xc_3[0]);
    }

    @Override
    public void id_class(rKf_1 rKf_12, rrrA rrrA2) {
        rfw_3 rfw_32 = new rfw_3();
        int n = rKf_12.id_protected();
        int n2 = rKf_12.id_throws();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                int n3 = (n << 4) + i;
                int n4 = (n2 << 4) + j;
                rKf_12.id_class((rfH_2)rfw_32.id_class(n3, 60, n4), id_case, 2);
                xc_3 xc_32 = rKk_1.id_break(n3, n4);
                if (xc_32 == null) continue;
                rKf_12.id_class((rfH_2)rfw_32.id_class(n3, 70, n4), xc_32, 2);
            }
        }
    }

    @Override
    public rKd_1 id_class(long l) {
        return this;
    }

    @Override
    public void id_class(rKf_1 rKf_12, roC_2 roC_22) {
    }

    @Override
    public void id_class(long l, rYA rYA2, roC_2 roC_22, rKu_1 rKu_12) {
    }

    @Override
    protected Codec<? extends rKd_1> id_class() {
        return id_protected;
    }

    public static xc_3 id_break(int n, int n2) {
        int n3;
        xc_3 xc_32 = id_throws;
        if (n > 0 && n2 > 0 && n % 2 != 0 && n2 % 2 != 0 && (n /= 2) <= id_private && (n2 /= 2) <= id_implements && (n3 = rfU_2.id_class(n * id_private + n2)) < id_catch.size()) {
            xc_32 = id_catch.get(n3);
        }
        return xc_32;
    }

    public rVL<rYG> id_catch() {
        return this.id_finally;
    }
}

