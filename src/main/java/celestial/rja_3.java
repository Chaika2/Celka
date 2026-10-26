/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.eX_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rjU_2;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqR_2;
import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import java.util.stream.IntStream;

public class rja_3
implements Comparable<rja_3> {
    public static final Codec<rja_3> id_throws = Codec.INT_STREAM.comapFlatMap(intStream -> rqR_2.id_class(intStream, 3).map(nArray -> new rja_3(nArray[0], nArray[1], nArray[2])), rja_32 -> IntStream.of(rja_32.b_(), rja_32.c_(), rja_32.d_()));
    public static final rja_3 id_case = new rja_3(0, 0, 0);
    private int id_class;
    private int id_break;
    private int id_byte;

    public rja_3(int n, int n2, int n3) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
    }

    public rja_3(double d, double d2, double d3) {
        this(rfU_2.id_byte(d), rfU_2.id_byte(d2), rfU_2.id_byte(d3));
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rja_3)) {
            return false;
        }
        rja_3 rja_32 = (rja_3)object;
        if (this.b_() != rja_32.b_()) {
            return false;
        }
        if (this.c_() != rja_32.c_()) {
            return false;
        }
        return this.d_() == rja_32.d_();
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("x", this.b_()).add("y", this.c_()).add("z", this.d_()).toString();
    }

    public int hashCode() {
        return (this.c_() + this.d_() * 31) * 31 + this.b_();
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.id_catch((rja_3)object);
    }

    public String id_this() {
        return this.b_() + ", " + this.c_() + ", " + this.d_();
    }

    public double id_class(double d, double d2, double d3, boolean bl) {
        double d4 = bl ? 0.5 : 0.0;
        double d5 = (double)this.b_() + d4 - d;
        double d6 = (double)this.c_() + d4 - d2;
        double d7 = (double)this.d_() + d4 - d3;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double id_class(eX_2 eX_22, boolean bl) {
        return this.id_class(eX_22.id_class(), eX_22.id_break(), eX_22.id_byte(), bl);
    }

    public boolean id_class(eX_2 eX_22, double d) {
        return this.id_class(eX_22.id_class(), eX_22.id_break(), eX_22.id_byte(), true) < d * d;
    }

    public boolean id_class(rja_3 rja_32, double d) {
        return this.id_class(rja_32.b_(), rja_32.c_(), rja_32.d_(), false) < d * d;
    }

    public int id_class(rpB_2 rpB_22) {
        return rpB_22.id_class(this.id_class, this.id_break, this.id_byte);
    }

    public double id_break(rfl_3 rfl_32) {
        return this.id_class(rfl_32.id_class, rfl_32.id_break, rfl_32.id_byte, false);
    }

    public rja_3 id_break(rpr_3 rpr_32, int n) {
        return n == 0 ? this : new rja_3(this.b_() + rpr_32.id_implements() * n, this.c_() + rpr_32.id_finally() * n, this.d_() + rpr_32.id_extends() * n);
    }

    public rja_3 id_throws(rja_3 rja_32) {
        return new rja_3(this.c_() * rja_32.d_() - this.d_() * rja_32.c_(), this.d_() * rja_32.b_() - this.b_() * rja_32.d_(), this.b_() * rja_32.c_() - this.c_() * rja_32.b_());
    }

    public rja_3 id_catch() {
        return this.id_implements(1);
    }

    public int id_catch(rja_3 rja_32) {
        if (this.c_() == rja_32.c_()) {
            return this.d_() == rja_32.d_() ? this.b_() - rja_32.b_() : this.d_() - rja_32.d_();
        }
        return this.c_() - rja_32.c_();
    }

    public rja_3 id_case(int n) {
        return this.id_break(rpr_3.UP, n);
    }

    public eX_2 id_else() {
        return new rjU_2(this.b_(), this.c_(), this.d_());
    }

    public int id_implements(rja_3 rja_32) {
        float f = Math.abs(rja_32.b_() - this.b_());
        float f2 = Math.abs(rja_32.c_() - this.c_());
        float f3 = Math.abs(rja_32.d_() - this.d_());
        return (int)(f + f2 + f3);
    }

    public rja_3 id_implements(int n) {
        return this.id_break(rpr_3.DOWN, n);
    }

    public rja_3 id_implements() {
        return this.id_case(1);
    }

    public double id_protected(double d, double d2, double d3) {
        return this.id_class(d, d2, d3, true);
    }

    public double id_private(rja_3 rja_32) {
        return this.id_class(rja_32.b_(), rja_32.c_(), rja_32.d_(), true);
    }

    protected void a_(int n) {
        this.id_class = n;
    }

    public int c_() {
        return this.id_break;
    }

    protected void c_(int n) {
        this.id_byte = n;
    }

    public int b_() {
        return this.id_class;
    }

    protected void b_(int n) {
        this.id_break = n;
    }

    public int d_() {
        return this.id_byte;
    }
}

