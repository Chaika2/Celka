/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHf_1;
import celestial.rHw_1;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xu_3;

public class rHq_1
extends ryO_2
implements rHf_1,
rHw_1 {
    public float id_class;
    public float id_break;
    public int id_byte;
    private int id_protected;

    public rHq_1() {
        super(ryW_2.id_protected);
    }

    public boolean id_class(rhd_3 rhd_32) {
        if (this.id_extends.id_class(this.id_native) != this) {
            return false;
        }
        return !(rhd_32.id_class((double)this.id_native.b_() + 0.5, (double)this.id_native.c_() + 0.5, (double)this.id_native.d_() + 0.5) > 64.0);
    }

    @Override
    public float id_class(float f) {
        return rfU_2.id_catch(f, this.id_break, this.id_class);
    }

    @Override
    public void id_throws() {
        double d;
        if (++this.id_protected % 20 * 4 == 0) {
            this.id_extends.id_class(this.id_native, xu_3.SW, 1, this.id_byte);
        }
        this.id_break = this.id_class;
        int n = this.id_native.b_();
        int n2 = this.id_native.c_();
        int n3 = this.id_native.d_();
        float f = 0.1f;
        if (this.id_byte > 0 && this.id_class == 0.0f) {
            double d2 = (double)n + 0.5;
            d = (double)n3 + 0.5;
            this.id_extends.id_class((rhd_3)null, d2, (double)n2 + 0.5, d, rqn_3.Bc, rqL_2.BLOCKS, 0.5f, this.id_extends.id_int.nextFloat() * 0.1f + 0.9f);
        }
        if (this.id_byte == 0 && this.id_class > 0.0f || this.id_byte > 0 && this.id_class < 1.0f) {
            float f2 = this.id_class;
            this.id_class = this.id_byte > 0 ? (this.id_class += 0.1f) : (this.id_class -= 0.1f);
            if (this.id_class > 1.0f) {
                this.id_class = 1.0f;
            }
            float f3 = 0.5f;
            if (this.id_class < 0.5f && f2 >= 0.5f) {
                d = (double)n + 0.5;
                double d3 = (double)n3 + 0.5;
                this.id_extends.id_class((rhd_3)null, d, (double)n2 + 0.5, d3, rqn_3.BN, rqL_2.BLOCKS, 0.5f, this.id_extends.id_int.nextFloat() * 0.1f + 0.9f);
            }
            if (this.id_class < 0.0f) {
                this.id_class = 0.0f;
            }
        }
    }

    public void id_catch() {
        ++this.id_byte;
        this.id_extends.id_class(this.id_native, xu_3.SW, 1, this.id_byte);
    }

    public void id_private() {
        --this.id_byte;
        this.id_extends.id_class(this.id_native, xu_3.SW, 1, this.id_byte);
    }

    @Override
    public void aa_() {
        this.id_float();
        super.aa_();
    }

    @Override
    public boolean a_(int n, int n2) {
        if (n == 1) {
            this.id_byte = n2;
            return true;
        }
        return super.a_(n, n2);
    }
}

