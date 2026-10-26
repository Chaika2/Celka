/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 */
package celestial;

import celestial.NO;
import celestial.NQ;
import celestial.NW;
import celestial.Nf_1;
import celestial.Np_1;
import celestial.cb_3;
import celestial.cr_3;
import celestial.rRo_1;
import celestial.rYA;
import celestial.rYB;
import celestial.rYG;
import celestial.rYg_1;
import celestial.rYj_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rqA_2;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import java.util.Random;

public class NM
implements NW {
    private final cb_3 id_class;
    private final Nf_1 id_break;
    private final rYA id_byte;
    private final Random id_protected;
    private Object2ObjectArrayMap<rYG, NO> id_throws = new Object2ObjectArrayMap();
    private Optional<rYj_1> id_case = Optional.empty();
    private Optional<rYg_1> id_catch = Optional.empty();
    private float id_private;
    private rYG id_implements;

    public NM(cb_3 cb_32, Nf_1 nf_1, rYA rYA2) {
        this.id_protected = ((rYB)cb_32.id_throws[7]).id_long();
        this.id_class = cb_32;
        this.id_break = nf_1;
        this.id_byte = rYA2;
    }

    public float id_class() {
        return this.id_private;
    }

    @Override
    public void id_break() {
        this.id_throws.values().removeIf(cr_3::id_continue);
        rYG rYG2 = this.id_byte.id_class(this.id_class.rx(), this.id_class.re(), this.id_class.BO());
        if (rYG2 != this.id_implements) {
            this.id_implements = rYG2;
            this.id_case = rYG2.id_new();
            this.id_catch = rYG2.id_continue();
            this.id_throws.values().forEach(NO::id_class);
            rYG2.id_int().ifPresent(rqA_22 -> {
                NO nO2 = (NO)this.id_throws.compute((Object)rYG2, (rYG2, nO) -> {
                    if (nO == null) {
                        nO = new NO((rqA_2)rqA_22);
                        this.id_break.id_class((NQ)nO);
                    }
                    nO.id_break();
                    return nO;
                });
            });
        }
        this.id_catch.ifPresent(rYg_12 -> {
            if (this.id_protected.nextDouble() < rYg_12.id_break()) {
                this.id_break.id_class(Np_1.id_break(rYg_12.id_class()));
            }
        });
        this.id_case.ifPresent(rYj_12 -> {
            rYB rYB2 = (rYB)this.id_class.id_throws[7];
            int n = rYj_12.id_byte() * 2 + 1;
            rfH_2 rfH_22 = new rfH_2(this.id_class.rx() + (double)this.id_protected.nextInt(n) - (double)rYj_12.id_byte(), this.id_class.rH() + (double)this.id_protected.nextInt(n) - (double)rYj_12.id_byte(), this.id_class.BO() + (double)this.id_protected.nextInt(n) - (double)rYj_12.id_byte());
            int n2 = rYB2.id_class(rRo_1.SKY, rfH_22);
            this.id_private = n2 > 0 ? (this.id_private -= (float)n2 / (float)rYB2.id_while() * 0.001f) : (this.id_private -= (float)(rYB2.id_class(rRo_1.BLOCK, rfH_22) - 1) / (float)rYj_12.id_break());
            if (this.id_private >= 1.0f) {
                double d = (double)rfH_22.b_() + 0.5;
                double d2 = (double)rfH_22.c_() + 0.5;
                double d3 = (double)rfH_22.d_() + 0.5;
                double d4 = d - this.id_class.rx();
                double d5 = d2 - this.id_class.rH();
                double d6 = d3 - this.id_class.BO();
                double d7 = rfU_2.id_class(d4 * d4 + d5 * d5 + d6 * d6);
                double d8 = d7 + rYj_12.id_protected();
                Np_1 np_1 = Np_1.id_break(rYj_12.id_class(), this.id_class.rx() + d4 / d7 * d8, this.id_class.rH() + d5 / d7 * d8, this.id_class.BO() + d6 / d7 * d8);
                this.id_break.id_class(np_1);
                this.id_private = 0.0f;
            } else {
                this.id_private = Math.max(this.id_private, 0.0f);
            }
        });
    }
}

