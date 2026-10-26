/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eX_2;
import celestial.rfl_3;
import celestial.rjV_2;
import celestial.rji_3;
import celestial.rrxN_2;

public class yt_3
implements rrxN_2 {
    private final rji_3[] id_break = new rji_3[6];
    private double id_byte;
    private double id_protected;
    private double id_throws;
    public boolean id_class = false;

    public double id_byte() {
        return this.id_protected;
    }

    public yt_3(rjV_2 rjV_22, rjV_2 rjV_23) {
        this.id_class(rjV_22, rjV_23);
    }

    public boolean id_class(eX_2 eX_22) {
        return this.id_break(eX_22.id_class(), eX_22.id_break(), eX_22.id_byte(), eX_22.id_class(), eX_22.id_break(), eX_22.id_byte());
    }

    private boolean id_class(float f, float f2, float f3, float f4, float f5, float f6) {
        for (int i = 0; i < 6; ++i) {
            float f7;
            float f8;
            float f9;
            rji_3 rji_32 = this.id_break[i];
            float f10 = rji_32.id_class();
            if (!(f10 * f + (f9 = rji_32.id_break()) * f2 + (f8 = rji_32.id_byte()) * f3 + (f7 = rji_32.id_protected()) <= 0.0f) || !(f10 * f4 + f9 * f2 + f8 * f3 + f7 <= 0.0f) || !(f10 * f + f9 * f5 + f8 * f3 + f7 <= 0.0f) || !(f10 * f4 + f9 * f5 + f8 * f3 + f7 <= 0.0f) || !(f10 * f + f9 * f2 + f8 * f6 + f7 <= 0.0f) || !(f10 * f4 + f9 * f2 + f8 * f6 + f7 <= 0.0f) || !(f10 * f + f9 * f5 + f8 * f6 + f7 <= 0.0f) || !(f10 * f4 + f9 * f5 + f8 * f6 + f7 <= 0.0f)) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean id_class(double d, double d2, double d3, double d4, double d5, double d6) {
        if (this.id_class) {
            return true;
        }
        float f = (float)d;
        float f2 = (float)d2;
        float f3 = (float)d3;
        float f4 = (float)d4;
        float f5 = (float)d5;
        float f6 = (float)d6;
        for (int i = 0; i < 6; ++i) {
            rji_3 rji_32 = this.id_break[i];
            float f7 = rji_32.id_class();
            float f8 = rji_32.id_break();
            float f9 = rji_32.id_byte();
            float f10 = rji_32.id_protected();
            if (!(i < 4 ? f7 * f + f8 * f2 + f9 * f3 + f10 <= 0.0f || f7 * f4 + f8 * f2 + f9 * f3 + f10 <= 0.0f || f7 * f + f8 * f5 + f9 * f3 + f10 <= 0.0f || f7 * f4 + f8 * f5 + f9 * f3 + f10 <= 0.0f || f7 * f + f8 * f2 + f9 * f6 + f10 <= 0.0f || f7 * f4 + f8 * f2 + f9 * f6 + f10 <= 0.0f || f7 * f + f8 * f5 + f9 * f6 + f10 <= 0.0f || f7 * f4 + f8 * f5 + f9 * f6 + f10 <= 0.0f : f7 * f + f8 * f2 + f9 * f3 + f10 <= 0.0f && f7 * f4 + f8 * f2 + f9 * f3 + f10 <= 0.0f && f7 * f + f8 * f5 + f9 * f3 + f10 <= 0.0f && f7 * f4 + f8 * f5 + f9 * f3 + f10 <= 0.0f && f7 * f + f8 * f2 + f9 * f6 + f10 <= 0.0f && f7 * f4 + f8 * f2 + f9 * f6 + f10 <= 0.0f && f7 * f + f8 * f5 + f9 * f6 + f10 <= 0.0f && f7 * f4 + f8 * f5 + f9 * f6 + f10 <= 0.0f)) continue;
            return false;
        }
        return true;
    }

    public rji_3[] id_class() {
        return this.id_break;
    }

    @Override
    public void id_class(double d, double d2, double d3) {
        this.id_byte = d;
        this.id_protected = d2;
        this.id_throws = d3;
    }

    private void id_class(rjV_2 rjV_22, rjV_2 rjV_23) {
        rjV_2 rjV_24 = rjV_23.id_case();
        rjV_24.id_class(rjV_22);
        rjV_24.id_protected();
        this.id_class(rjV_24, -1, 0, 0, 0);
        this.id_class(rjV_24, 1, 0, 0, 1);
        this.id_class(rjV_24, 0, -1, 0, 2);
        this.id_class(rjV_24, 0, 1, 0, 3);
        this.id_class(rjV_24, 0, 0, -1, 4);
        this.id_class(rjV_24, 0, 0, 1, 5);
    }

    private void id_class(rjV_2 rjV_22, int n, int n2, int n3, int n4) {
        rji_3 rji_32 = new rji_3(n, n2, n3, 1.0f);
        rji_32.id_class(rjV_22);
        rji_32.id_throws();
        this.id_break[n4] = rji_32;
    }

    @Override
    public boolean id_class(rfl_3 rfl_32) {
        return this.id_break(rfl_32.id_class, rfl_32.id_break, rfl_32.id_byte, rfl_32.id_protected, rfl_32.id_throws, rfl_32.id_case);
    }

    public double id_break() {
        return this.id_byte;
    }

    private boolean id_break(double d, double d2, double d3, double d4, double d5, double d6) {
        if (this.id_class) {
            return true;
        }
        float f = (float)(d - this.id_byte);
        float f2 = (float)(d2 - this.id_protected);
        float f3 = (float)(d3 - this.id_throws);
        float f4 = (float)(d4 - this.id_byte);
        float f5 = (float)(d5 - this.id_protected);
        float f6 = (float)(d6 - this.id_throws);
        return this.id_class(f, f2, f3, f4, f5, f6);
    }

    public boolean id_break(double d, double d2, double d3) {
        return this.id_break(d, d2, d3, d, d2, d3);
    }

    public double id_protected() {
        return this.id_throws;
    }
}

