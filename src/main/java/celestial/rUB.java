/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rHy_1;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUP;
import celestial.rfH_2;
import celestial.ryO_2;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUB
extends rUO<rUP> {
    public rUB(Codec<rUP> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUP rUP2) {
        for (rfH_2 rfH_24 : rfH_2.id_class(rfH_22.id_break(-1, -2, -1), rfH_22.id_break(1, 2, 1))) {
            boolean bl;
            boolean bl2 = rfH_24.b_() == rfH_22.b_();
            boolean bl3 = rfH_24.c_() == rfH_22.c_();
            boolean bl4 = rfH_24.d_() == rfH_22.d_();
            boolean bl5 = bl = Math.abs(rfH_24.c_() - rfH_22.c_()) == 2;
            if (bl2 && bl3 && bl4) {
                rfH_2 rfH_25 = rfH_24.id_int();
                this.id_class(rRI2, rfH_25, xu_3.bw.id_continue());
                rUP2.id_byte().ifPresent(rfH_23 -> {
                    ryO_2 ryO_22 = rRI2.id_class(rfH_25);
                    if (ryO_22 instanceof rHy_1) {
                        rHy_1 rHy_12 = (rHy_1)ryO_22;
                        rHy_12.id_class((rfH_2)rfH_23, rUP2.id_protected());
                        ryO_22.id_break();
                    }
                });
                continue;
            }
            if (bl3) {
                this.id_class(rRI2, rfH_24, xu_3.id_class.id_continue());
                continue;
            }
            if (bl && bl2 && bl4) {
                this.id_class(rRI2, rfH_24, xu_3.id_while.id_continue());
                continue;
            }
            if ((bl2 || bl4) && !bl) {
                this.id_class(rRI2, rfH_24, xu_3.id_while.id_continue());
                continue;
            }
            this.id_class(rRI2, rfH_24, xu_3.id_class.id_continue());
        }
        return true;
    }
}

