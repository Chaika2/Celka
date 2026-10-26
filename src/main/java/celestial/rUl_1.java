/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.QP;
import celestial.rDq_1;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rRo_1;
import celestial.rUO;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rjh_3;
import celestial.rrrZ;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUl_1
extends rUO<rDq_1> {
    private static final xc_3 id_class = xu_3.hb.id_continue();

    public rUl_1(Codec<rDq_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rDq_1 rDq_12) {
        Object object;
        int n;
        int n2;
        while (rfH_22.c_() > 5 && rRI2.id_finally(rfH_22)) {
            rfH_22 = rfH_22.id_break();
        }
        if (rfH_22.c_() <= 4) {
            return false;
        }
        if (rRI2.id_class(rjh_3.id_class(rfH_22 = rfH_22.id_catch(4)), rrrZ.id_new).findAny().isPresent()) {
            return false;
        }
        boolean[] blArray = new boolean[2048];
        int n3 = random.nextInt(4) + 4;
        for (n2 = 0; n2 < n3; ++n2) {
            double d = random.nextDouble() * 6.0 + 3.0;
            double d2 = random.nextDouble() * 4.0 + 2.0;
            double d3 = random.nextDouble() * 6.0 + 3.0;
            double d4 = random.nextDouble() * (16.0 - d - 2.0) + 1.0 + d / 2.0;
            double d5 = random.nextDouble() * (8.0 - d2 - 4.0) + 2.0 + d2 / 2.0;
            double d6 = random.nextDouble() * (16.0 - d3 - 2.0) + 1.0 + d3 / 2.0;
            for (int i = 1; i < 15; ++i) {
                for (int j = 1; j < 15; ++j) {
                    for (int k = 1; k < 7; ++k) {
                        double d7 = ((double)i - d4) / (d / 2.0);
                        double d8 = ((double)k - d5) / (d2 / 2.0);
                        double d9 = ((double)j - d6) / (d3 / 2.0);
                        double d10 = d7 * d7 + d8 * d8 + d9 * d9;
                        if (!(d10 < 1.0)) continue;
                        blArray[(i * 16 + j) * 8 + k] = true;
                    }
                }
            }
        }
        for (n2 = 0; n2 < 16; ++n2) {
            for (int i = 0; i < 16; ++i) {
                for (n = 0; n < 8; ++n) {
                    boolean bl;
                    boolean bl2 = bl = !blArray[(n2 * 16 + i) * 8 + n] && (n2 < 15 && blArray[((n2 + 1) * 16 + i) * 8 + n] || n2 > 0 && blArray[((n2 - 1) * 16 + i) * 8 + n] || i < 15 && blArray[(n2 * 16 + i + 1) * 8 + n] || i > 0 && blArray[(n2 * 16 + (i - 1)) * 8 + n] || n < 7 && blArray[(n2 * 16 + i) * 8 + n + 1] || n > 0 && blArray[(n2 * 16 + i) * 8 + (n - 1)]);
                    if (!bl) continue;
                    object = rRI2.id_byte(rfH_22.id_break(n2, n, i)).id_byte();
                    if (n >= 4 && ((QP)object).id_class()) {
                        return false;
                    }
                    if (n >= 4 || ((QP)object).id_break() || rRI2.id_byte(rfH_22.id_break(n2, n, i)) == rDq_12.id_break) continue;
                    return false;
                }
            }
        }
        for (n2 = 0; n2 < 16; ++n2) {
            for (int i = 0; i < 16; ++i) {
                for (n = 0; n < 8; ++n) {
                    if (!blArray[(n2 * 16 + i) * 8 + n]) continue;
                    rRI2.id_class(rfH_22.id_break(n2, n, i), n >= 4 ? id_class : rDq_12.id_break, 2);
                }
            }
        }
        for (n2 = 0; n2 < 16; ++n2) {
            for (int i = 0; i < 16; ++i) {
                for (n = 4; n < 8; ++n) {
                    rfH_2 rfH_23;
                    if (!blArray[(n2 * 16 + i) * 8 + n] || !rUl_1.id_break(rRI2.id_byte(rfH_23 = rfH_22.id_break(n2, n - 1, i)).id_break()) || rRI2.id_class(rRo_1.SKY, rfH_22.id_break(n2, n, i)) <= 0) continue;
                    object = rRI2.id_implements(rfH_23);
                    if (((rYG)object).id_throws().id_throws().id_class().id_class(xu_3.Bi)) {
                        rRI2.id_class(rfH_23, xu_3.Bi.id_continue(), 2);
                        continue;
                    }
                    rRI2.id_class(rfH_23, xu_3.id_implements.id_continue(), 2);
                }
            }
        }
        if (rDq_12.id_break.id_byte() == QP.id_native) {
            for (n2 = 0; n2 < 16; ++n2) {
                for (int i = 0; i < 16; ++i) {
                    for (n = 0; n < 8; ++n) {
                        boolean bl;
                        boolean bl3 = bl = !blArray[(n2 * 16 + i) * 8 + n] && (n2 < 15 && blArray[((n2 + 1) * 16 + i) * 8 + n] || n2 > 0 && blArray[((n2 - 1) * 16 + i) * 8 + n] || i < 15 && blArray[(n2 * 16 + i + 1) * 8 + n] || i > 0 && blArray[(n2 * 16 + (i - 1)) * 8 + n] || n < 7 && blArray[(n2 * 16 + i) * 8 + n + 1] || n > 0 && blArray[(n2 * 16 + i) * 8 + (n - 1)]);
                        if (!bl || n >= 4 && random.nextInt(2) == 0 || !rRI2.id_byte(rfH_22.id_break(n2, n, i)).id_byte().id_break()) continue;
                        rRI2.id_class(rfH_22.id_break(n2, n, i), xu_3.id_break.id_continue(), 2);
                    }
                }
            }
        }
        if (rDq_12.id_break.id_byte() == QP.id_finally) {
            for (n2 = 0; n2 < 16; ++n2) {
                for (int i = 0; i < 16; ++i) {
                    n = 4;
                    rfH_2 rfH_24 = rfH_22.id_break(n2, 4, i);
                    if (!rRI2.id_implements(rfH_24).id_class(rRI2, rfH_24, false)) continue;
                    rRI2.id_class(rfH_24, xu_3.PT.id_continue(), 2);
                }
            }
        }
        return true;
    }
}

