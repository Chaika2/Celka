/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.JC;
import celestial.QP;
import celestial.aI_2;
import celestial.rHK;
import celestial.rHU;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUt_1;
import celestial.rfH_2;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rqR_2;
import celestial.rrrn_1;
import celestial.ryO_2;
import celestial.rzl_3;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rUr_1
extends rUO<rUt_1> {
    private static final Logger id_class = LogManager.getLogger();
    private static final aI_2<?>[] b = new aI_2[]{aI_2.A, aI_2.rs, aI_2.rs, aI_2.q};
    private static final xc_3 M = xu_3.hb.id_continue();

    public rUr_1(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        Object object;
        rfH_2 rfH_23;
        int n;
        int n2;
        int n3;
        int n4 = 3;
        int n5 = random.nextInt(2) + 2;
        int n6 = -n5 - 1;
        int n7 = n5 + 1;
        int n8 = -1;
        int n9 = 4;
        int n10 = random.nextInt(2) + 2;
        int n11 = -n10 - 1;
        int n12 = n10 + 1;
        int n13 = 0;
        for (n3 = n6; n3 <= n7; ++n3) {
            for (n2 = -1; n2 <= 4; ++n2) {
                for (n = n11; n <= n12; ++n) {
                    rfH_23 = rfH_22.id_break(n3, n2, n);
                    object = rRI2.id_byte(rfH_23).id_byte();
                    boolean bl = ((QP)object).id_break();
                    if (n2 == -1 && !bl) {
                        return false;
                    }
                    if (n2 == 4 && !bl) {
                        return false;
                    }
                    if (n3 != n6 && n3 != n7 && n != n11 && n != n12 || n2 != 0 || !rRI2.id_finally(rfH_23) || !rRI2.id_finally(rfH_23.id_final())) continue;
                    ++n13;
                }
            }
        }
        if (n13 >= 1 && n13 <= 5) {
            for (n3 = n6; n3 <= n7; ++n3) {
                for (n2 = 3; n2 >= -1; --n2) {
                    for (n = n11; n <= n12; ++n) {
                        rfH_23 = rfH_22.id_break(n3, n2, n);
                        object = rRI2.id_byte(rfH_23);
                        if (n3 != n6 && n2 != -1 && n != n11 && n3 != n7 && n2 != 4 && n != n12) {
                            if (((JC)object).id_class(xu_3.re) || ((JC)object).id_class(xu_3.rD)) continue;
                            rRI2.id_class(rfH_23, M, 2);
                            continue;
                        }
                        if (rfH_23.c_() >= 0 && !rRI2.id_byte(rfH_23.id_break()).id_byte().id_break()) {
                            rRI2.id_class(rfH_23, M, 2);
                            continue;
                        }
                        if (!((JC)object).id_byte().id_break() || ((JC)object).id_class(xu_3.re)) continue;
                        if (n2 == -1 && random.nextInt(4) != 0) {
                            rRI2.id_class(rfH_23, xu_3.rV.id_continue(), 2);
                            continue;
                        }
                        rRI2.id_class(rfH_23, xu_3.id_volatile.id_continue(), 2);
                    }
                }
            }
            block6: for (n3 = 0; n3 < 2; ++n3) {
                for (n2 = 0; n2 < 3; ++n2) {
                    int n14;
                    int n15;
                    n = rfH_22.b_() + random.nextInt(n5 * 2 + 1) - n5;
                    rfH_2 rfH_24 = new rfH_2(n, n15 = rfH_22.c_(), n14 = rfH_22.d_() + random.nextInt(n10 * 2 + 1) - n10);
                    if (!rRI2.id_finally(rfH_24)) continue;
                    int n16 = 0;
                    for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
                        if (!rRI2.id_byte(rfH_24.id_break(rpr_32)).id_byte().id_break()) continue;
                        ++n16;
                    }
                    if (n16 != true) continue;
                    rRI2.id_class(rfH_24, rrrn_1.id_class(rRI2, rfH_24, xu_3.re.id_continue()), 2);
                    rHK.id_class(rRI2, random, rfH_24, rzl_3.id_protected);
                    continue block6;
                }
            }
            rRI2.id_class(rfH_22, xu_3.rD.id_continue(), 2);
            ryO_2 ryO_22 = rRI2.id_class(rfH_22);
            if (ryO_22 instanceof rHU) {
                ((rHU)ryO_22).id_catch().id_class(this.id_class(random));
            } else {
                id_class.error("Failed to fetch mob spawner entity at ({}, {}, {})", (Object)rfH_22.b_(), (Object)rfH_22.c_(), (Object)rfH_22.d_());
            }
            return true;
        }
        return false;
    }

    private aI_2<?> id_class(Random random) {
        return rqR_2.id_class(b, random);
    }
}

