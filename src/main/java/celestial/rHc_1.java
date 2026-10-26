/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rFy_1;
import celestial.rHf_1;
import celestial.rLQ;
import celestial.rXA;
import celestial.rXC;
import celestial.rXc_1;
import celestial.rXn_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rkC_2;
import celestial.rkj_3;
import celestial.rpr_3;
import celestial.rqs_3;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xc_3;
import celestial.xn_3;
import java.util.Optional;
import java.util.Random;

public class rHc_1
extends ryO_2
implements rHf_1,
rXc_1 {
    private final rqs_3<rdn_3> id_class = rqs_3.id_class(4, rdn_3.id_break);
    private final int[] id_break = new int[4];
    private final int[] id_byte = new int[4];

    public rHc_1() {
        super(ryW_2.id_abstract);
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        this.id_break(rcd_32);
        rcd_32.id_class("CookingTimes", this.id_break);
        rcd_32.id_class("CookingTotalTimes", this.id_byte);
        return rcd_32;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        int[] nArray;
        super.id_class(xc_32, rcd_32);
        this.id_class.clear();
        rXC.id_break(rcd_32, this.id_class);
        if (rcd_32.id_byte("CookingTimes", 11)) {
            nArray = rcd_32.id_final("CookingTimes");
            System.arraycopy(nArray, 0, this.id_break, 0, Math.min(this.id_byte.length, nArray.length));
        }
        if (rcd_32.id_byte("CookingTotalTimes", 11)) {
            nArray = rcd_32.id_final("CookingTotalTimes");
            System.arraycopy(nArray, 0, this.id_byte, 0, Math.min(this.id_byte.length, nArray.length));
        }
    }

    public Optional<rkC_2> id_class(rdn_3 rdn_32) {
        return this.id_class.stream().noneMatch(rdn_3::id_class) ? Optional.empty() : this.id_extends.id_implements().id_class(rkj_3.id_throws, new rXA(rdn_32), this.id_extends);
    }

    public boolean id_class(rdn_3 rdn_32, int n) {
        for (int i = 0; i < this.id_class.size(); ++i) {
            rdn_3 rdn_33 = this.id_class.get(i);
            if (!rdn_33.id_class()) continue;
            this.id_byte[i] = n;
            this.id_break[i] = 0;
            this.id_class.set(i, rdn_32.id_class(1));
            this.id_extends();
            return true;
        }
        return false;
    }

    public rqs_3<rdn_3> id_class() {
        return this.id_class;
    }

    private rcd_3 id_break(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rXC.id_class(rcd_32, this.id_class, true);
        return rcd_32;
    }

    @Override
    public void id_throws() {
        boolean bl = this.id_abstract().id_byte(xn_3.id_final);
        boolean bl2 = this.id_extends.id_continue;
        if (bl2) {
            if (bl) {
                this.id_finally();
            }
        } else if (bl) {
            this.id_private();
        } else {
            for (int i = 0; i < this.id_class.size(); ++i) {
                if (this.id_break[i] <= 0) continue;
                this.id_break[i] = rfU_2.id_class(this.id_break[i] - 2, 0, this.id_byte[i]);
            }
        }
    }

    private void id_finally() {
        rYB rYB2 = this.id_while();
        if (rYB2 != null) {
            int n;
            rfH_2 rfH_22 = this.id_char();
            Random random = rYB2.id_int;
            if (random.nextFloat() < 0.11f) {
                for (n = 0; n < random.nextInt(2) + 2; ++n) {
                    xn_3.id_class(rYB2, rfH_22, this.id_abstract().id_byte(xn_3.id_package), false);
                }
            }
            n = this.id_abstract().id_byte(xn_3.id_new).id_protected();
            for (int i = 0; i < this.id_class.size(); ++i) {
                if (this.id_class.get(i).id_class() || !(random.nextFloat() < 0.2f)) continue;
                rpr_3 rpr_32 = rpr_3.id_break(Math.floorMod(i + n, 4));
                float f = 0.3125f;
                double d = (double)rfH_22.b_() + 0.5 - (double)((float)rpr_32.id_implements() * 0.3125f) + (double)((float)rpr_32.id_catch().id_implements() * 0.3125f);
                double d2 = (double)rfH_22.c_() + 0.5;
                double d3 = (double)rfH_22.d_() + 0.5 - (double)((float)rpr_32.id_extends() * 0.3125f) + (double)((float)rpr_32.id_catch().id_extends() * 0.3125f);
                for (int j = 0; j < 4; ++j) {
                    rYB2.id_class(rLQ.id_double, d, d2, d3, 0.0, 5.0E-4, 0.0);
                }
            }
        }
    }

    public void id_catch() {
        if (this.id_extends != null) {
            if (!this.id_extends.id_continue) {
                rXn_1.id_class(this.id_extends, this.id_char(), this.id_class());
            }
            this.id_extends();
        }
    }

    private void id_extends() {
        this.id_break();
        this.id_while().id_class(this.id_char(), this.id_abstract(), this.id_abstract(), 3);
    }

    @Override
    public void id_public() {
        this.id_class.clear();
    }

    private void id_private() {
        for (int i = 0; i < this.id_class.size(); ++i) {
            rdn_3 rdn_32 = this.id_class.get(i);
            if (rdn_32.id_class()) continue;
            int n = i;
            this.id_break[n] = this.id_break[n] + 1;
            if (this.id_break[i] < this.id_byte[i]) continue;
            rXA rXA2 = new rXA(rdn_32);
            rdn_3 rdn_33 = this.id_extends.id_implements().id_class(rkj_3.id_throws, rXA2, this.id_extends).map(rkC_22 -> rkC_22.id_class(rXA2)).orElse(rdn_32);
            rfH_2 rfH_22 = this.id_char();
            rXn_1.id_class(this.id_extends, (double)rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_(), rdn_33);
            this.id_class.set(i, rdn_3.id_break);
            this.id_extends();
        }
    }

    @Override
    public rFy_1 Y_() {
        return new rFy_1(this.id_native, 13, this.Z_());
    }

    @Override
    public rcd_3 Z_() {
        return this.id_break(new rcd_3());
    }
}

