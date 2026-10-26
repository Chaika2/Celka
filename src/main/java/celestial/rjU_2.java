/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.eX_2;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rjK_2;
import celestial.rja_3;
import celestial.rje_3;
import celestial.rpB_2;
import celestial.rrTR;
import java.util.EnumSet;

public class rjU_2
implements eX_2,
rrTR {
    public static final rjU_2 id_class = new rjU_2(0.0, 0.0, 0.0);
    public double id_break;
    public double id_byte;
    public double id_protected;

    public rjU_2 id_byte(float f) {
        float f2 = rfU_2.id_break(f);
        float f3 = rfU_2.id_class(f);
        double d = this.id_break * (double)f2 + this.id_byte * (double)f3;
        double d2 = this.id_byte * (double)f2 - this.id_break * (double)f3;
        double d3 = this.id_protected;
        return new rjU_2(d, d2, d3);
    }

    public static rjU_2 id_byte(rja_3 rja_32) {
        return new rjU_2(rja_32.b_(), rja_32.c_(), rja_32.d_());
    }

    public double id_byte(double d, double d2, double d3) {
        double d4 = d - this.id_break;
        double d5 = d2 - this.id_byte;
        double d6 = d3 - this.id_protected;
        return rfU_2.id_class(d4 * d4 + d5 * d5 + d6 * d6);
    }

    public rjU_2 id_byte(rjU_2 rjU_22) {
        return new rjU_2(this.id_byte * rjU_22.id_protected - this.id_protected * rjU_22.id_byte, this.id_protected * rjU_22.id_break - this.id_break * rjU_22.id_protected, this.id_break * rjU_22.id_byte - this.id_byte * rjU_22.id_break);
    }

    @Override
    public final double id_byte() {
        return this.id_protected;
    }

    public rjU_2(double d, double d2, double d3) {
        this.id_break = d;
        this.id_byte = d2;
        this.id_protected = d3;
    }

    public rjU_2(rfH_2 rfH_22) {
        this(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    public rjU_2(rfl_3 rfl_32) {
        rjU_2 rjU_22 = rfl_32.id_case();
        this.id_break = rjU_22.id_break;
        this.id_byte = rjU_22.id_byte;
        this.id_protected = rjU_22.id_protected;
    }

    public rjU_2(rja_3 rja_32) {
        this(rja_32.b_(), rja_32.c_(), rja_32.d_());
    }

    public rjU_2(rje_3 rje_32) {
        this(rje_32.id_class(), rje_32.id_break(), rje_32.id_byte());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rjU_2)) {
            return false;
        }
        rjU_2 rjU_22 = (rjU_2)object;
        if (Double.compare(rjU_22.id_break, this.id_break) != 0) {
            return false;
        }
        if (Double.compare(rjU_22.id_byte, this.id_byte) != 0) {
            return false;
        }
        return Double.compare(rjU_22.id_protected, this.id_protected) == 0;
    }

    public String toString() {
        return "(" + this.id_break + ", " + this.id_byte + ", " + this.id_protected + ")";
    }

    public int hashCode() {
        long l = Double.doubleToLongBits(this.id_break);
        int n = (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(this.id_byte);
        n = 31 * n + (int)(l ^ l >>> 32);
        l = Double.doubleToLongBits(this.id_protected);
        return 31 * n + (int)(l ^ l >>> 32);
    }

    public rjU_2 id_class(double d) {
        return this.id_throws(d, d, d);
    }

    public double id_class(rpB_2 rpB_22) {
        return rpB_22.id_class(this.id_break, this.id_byte, this.id_protected);
    }

    public rjU_2 id_class(float f, float f2, float f3) {
        this.id_break = f;
        this.id_byte = f2;
        this.id_protected = f3;
        return this;
    }

    public double id_class(rfH_2 rfH_22) {
        double d = (double)rfH_22.b_() - this.id_break;
        double d2 = (double)rfH_22.c_() - this.id_byte;
        double d3 = (double)rfH_22.d_() - this.id_protected;
        return rfU_2.id_class(d * d + d2 * d2 + d3 * d3);
    }

    public double id_class(an_3 an_32) {
        return this.id_private(an_32.Ps());
    }

    public static rjU_2 id_class(rjK_2 rjK_22) {
        return rjU_2.id_class(rjK_22.id_byte, rjK_22.id_protected);
    }

    public static rjU_2 id_class(rja_3 rja_32) {
        return new rjU_2((double)rja_32.b_() + 0.5, (double)rja_32.c_() + 0.5, (double)rja_32.d_() + 0.5);
    }

    public rjU_2 id_class(float f) {
        float f2 = rfU_2.id_break(f);
        float f3 = rfU_2.id_class(f);
        double d = this.id_break;
        double d2 = this.id_byte * (double)f2 + this.id_protected * (double)f3;
        double d3 = this.id_protected * (double)f2 - this.id_byte * (double)f3;
        return new rjU_2(d, d2, d3);
    }

    public static rjU_2 id_class(float f, float f2) {
        float f3 = rfU_2.id_break(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f4 = rfU_2.id_class(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = -rfU_2.id_break(-f * ((float)Math.PI / 180));
        float f6 = rfU_2.id_class(-f * ((float)Math.PI / 180));
        return new rjU_2(f4 * f5, f6, f3 * f5);
    }

    public rjU_2 id_class(EnumSet<rpB_2> enumSet) {
        double d = enumSet.contains(rpB_2.X) ? (double)rfU_2.id_byte(this.id_break) : this.id_break;
        double d2 = enumSet.contains(rpB_2.Y) ? (double)rfU_2.id_byte(this.id_byte) : this.id_byte;
        double d3 = enumSet.contains(rpB_2.Z) ? (double)rfU_2.id_byte(this.id_protected) : this.id_protected;
        return new rjU_2(d, d2, d3);
    }

    public boolean id_class(eX_2 eX_22, double d) {
        return this.id_protected(eX_22.id_class(), eX_22.id_break(), eX_22.id_byte()) < d * d;
    }

    public rjU_2 id_class(rjU_2 rjU_22) {
        return new rjU_2(rjU_22.id_break - this.id_break, rjU_22.id_byte - this.id_byte, rjU_22.id_protected - this.id_protected);
    }

    public rjU_2 id_class(double d, double d2, double d3) {
        return this.id_break(-d, -d2, -d3);
    }

    public rjU_2 id_class(rjU_2 rjU_22, float f) {
        return new rjU_2(rfU_2.id_protected((double)f, this.id_break, rjU_22.id_break), rfU_2.id_protected((double)f, this.id_byte, rjU_22.id_byte), rfU_2.id_protected((double)f, this.id_protected, rjU_22.id_protected));
    }

    public static rjU_2 id_class(rja_3 rja_32, double d) {
        return new rjU_2((double)rja_32.b_() + 0.5, (double)rja_32.c_() + d, (double)rja_32.d_() + 0.5);
    }

    public static rjU_2 id_class(int n) {
        double d = (double)(n >> 16 & 0xFF) / 255.0;
        double d2 = (double)(n >> 8 & 0xFF) / 255.0;
        double d3 = (double)(n & 0xFF) / 255.0;
        return new rjU_2(d, d2, d3);
    }

    @Override
    public final double id_class() {
        return this.id_break;
    }

    public rjU_2 id_break(float f) {
        float f2 = rfU_2.id_break(f);
        float f3 = rfU_2.id_class(f);
        double d = this.id_break * (double)f2 + this.id_protected * (double)f3;
        double d2 = this.id_byte;
        double d3 = this.id_protected * (double)f2 - this.id_break * (double)f3;
        return new rjU_2(d, d2, d3);
    }

    public rjU_2 id_break(double d, double d2, double d3) {
        return new rjU_2(this.id_break + d, this.id_byte + d2, this.id_protected + d3);
    }

    public double id_break(rjU_2 rjU_22) {
        return this.id_break * rjU_22.id_break + this.id_byte * rjU_22.id_byte + this.id_protected * rjU_22.id_protected;
    }

    @Override
    public final double id_break() {
        return this.id_byte;
    }

    public static rjU_2 id_break(rja_3 rja_32) {
        return new rjU_2(rja_32.b_(), rja_32.c_(), rja_32.d_());
    }

    public rjU_2 id_throws() {
        return this.id_class(-1.0);
    }

    public rjU_2 id_throws(double d, double d2, double d3) {
        return new rjU_2(this.id_break * d, this.id_byte * d2, this.id_protected * d3);
    }

    public rjU_2 id_throws(rjU_2 rjU_22) {
        return this.id_break(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    public rjU_2 id_finally(rjU_2 rjU_22) {
        return this.id_throws(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    public rja_3 id_finally() {
        return new rja_3(this.id_break, this.id_byte, this.id_protected);
    }

    public double id_catch() {
        return this.id_break * this.id_break + this.id_byte * this.id_byte + this.id_protected * this.id_protected;
    }

    public double id_catch(rjU_2 rjU_22) {
        double d = rjU_22.id_break - this.id_break;
        double d2 = rjU_22.id_protected - this.id_protected;
        return rfU_2.id_class(d * d + d2 * d2);
    }

    public rjU_2 id_extends() {
        return new rjU_2(this.id_break, this.id_byte, this.id_protected);
    }

    public double id_case(rjU_2 rjU_22) {
        double d = rjU_22.id_break - this.id_break;
        double d2 = rjU_22.id_byte - this.id_byte;
        double d3 = rjU_22.id_protected - this.id_protected;
        return rfU_2.id_class(d * d + d2 * d2 + d3 * d3);
    }

    public double id_case() {
        return rfU_2.id_class(this.id_break * this.id_break + this.id_byte * this.id_byte + this.id_protected * this.id_protected);
    }

    public rjU_2 id_implements() {
        return new rjU_2(Math.abs(this.id_break), Math.abs(this.id_byte), Math.abs(this.id_protected));
    }

    public double id_implements(rjU_2 rjU_22) {
        double d = rjU_22.id_break - this.id_break;
        double d2 = rjU_22.id_byte - this.id_byte;
        double d3 = rjU_22.id_protected - this.id_protected;
        return d * d + d2 * d2 + d3 * d3;
    }

    public rjU_2 id_protected() {
        double d = rfU_2.id_class(this.id_break * this.id_break + this.id_byte * this.id_byte + this.id_protected * this.id_protected);
        return d < 1.0E-4 ? id_class : new rjU_2(this.id_break / d, this.id_byte / d, this.id_protected / d);
    }

    public double id_protected(double d, double d2, double d3) {
        double d4 = d - this.id_break;
        double d5 = d2 - this.id_byte;
        double d6 = d3 - this.id_protected;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public static rjU_2 id_protected(rja_3 rja_32) {
        return new rjU_2((double)rja_32.b_() + 0.5, rja_32.c_(), (double)rja_32.d_() + 0.5);
    }

    public rjU_2 id_protected(rjU_2 rjU_22) {
        return this.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    public double id_private(rjU_2 rjU_22) {
        double d = rjU_22.id_break - this.id_break;
        double d2 = rjU_22.id_byte - this.id_byte;
        double d3 = rjU_22.id_protected - this.id_protected;
        return d * d + d2 * d2 + d3 * d3;
    }

    public rjU_2 id_private() {
        return new rjU_2((double)rfU_2.id_byte(this.id_break) + 0.5, (double)rfU_2.id_byte(this.id_byte) + 0.5, (double)rfU_2.id_byte(this.id_protected) + 0.5);
    }

    @Override
    public rjU_2 rr() {
        return this;
    }
}

