/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rja_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.ryF_2;

public class rfw_3
extends rfH_2 {
    public rfw_3 id_byte(int n, int n2, int n3) {
        return this.id_class(this.b_() + n, this.c_() + n2, this.d_() + n3);
    }

    public rfw_3 id_byte(rpr_3 rpr_32, int n) {
        return this.id_class(this.b_() + rpr_32.id_implements() * n, this.c_() + rpr_32.id_finally() * n, this.d_() + rpr_32.id_extends() * n);
    }

    @Override
    public rfH_2 id_byte(double d, double d2, double d3) {
        return super.id_byte(d, d2, d3).id_int();
    }

    @Override
    public rfH_2 id_int() {
        return new rfH_2(this);
    }

    public rfw_3() {
        this(0, 0, 0);
    }

    public rfw_3(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    public rfw_3(double d, double d2, double d3) {
        this(rfU_2.id_byte(d), rfU_2.id_byte(d2), rfU_2.id_byte(d3));
    }

    public rfw_3 id_class(rja_3 rja_32, rpr_3 rpr_32) {
        return this.id_class(rja_32.b_() + rpr_32.id_implements(), rja_32.c_() + rpr_32.id_finally(), rja_32.d_() + rpr_32.id_extends());
    }

    public rfw_3 id_class(rja_3 rja_32, int n, int n2, int n3) {
        return this.id_class(rja_32.b_() + n, rja_32.c_() + n2, rja_32.d_() + n3);
    }

    public rfw_3 id_class(ryF_2 ryF_22, int n, int n2, int n3) {
        return this.id_class(ryF_22.id_class(n, n2, n3, rpB_2.X), ryF_22.id_class(n, n2, n3, rpB_2.Y), ryF_22.id_class(n, n2, n3, rpB_2.Z));
    }

    public rfw_3 id_class(rpr_3 rpr_32) {
        return this.id_byte(rpr_32, 1);
    }

    public rfw_3 id_class(rpB_2 rpB_22, int n, int n2) {
        switch (rpB_22) {
            case X: {
                return this.id_class(rfU_2.id_class(this.b_(), n, n2), this.c_(), this.d_());
            }
            case Y: {
                return this.id_class(this.b_(), rfU_2.id_class(this.c_(), n, n2), this.d_());
            }
            case Z: {
                return this.id_class(this.b_(), this.c_(), rfU_2.id_class(this.d_(), n, n2));
            }
        }
        throw new IllegalStateException("Unable to clamp axis " + rpB_22);
    }

    @Override
    public rfH_2 id_class(rpB_2 rpB_22, int n) {
        return super.id_class(rpB_22, n).id_int();
    }

    @Override
    public rfH_2 id_class(rqd_3 rqd_32) {
        return super.id_class(rqd_32).id_int();
    }

    public rfw_3 id_class(int n, int n2, int n3) {
        this.a_(n);
        this.b_(n2);
        this.c_(n3);
        return this;
    }

    @Override
    public rfH_2 id_class(rpr_3 rpr_32, int n) {
        return super.id_class(rpr_32, n).id_int();
    }

    public rfw_3 id_class(rja_3 rja_32) {
        return this.id_class(rja_32.b_(), rja_32.c_(), rja_32.d_());
    }

    @Override
    public /* synthetic */ rja_3 id_break(rpr_3 rpr_32, int n) {
        return this.id_class(rpr_32, n);
    }

    @Override
    public rfH_2 id_break(int n, int n2, int n3) {
        return super.id_break(n, n2, n3).id_int();
    }

    public rfw_3 id_break(double d, double d2, double d3) {
        return this.id_class(rfU_2.id_byte(d), rfU_2.id_byte(d2), rfU_2.id_byte(d3));
    }

    @Override
    public /* synthetic */ rja_3 id_throws(rja_3 rja_32) {
        return super.id_protected(rja_32);
    }

    @Override
    public /* synthetic */ rja_3 id_catch() {
        return super.id_break();
    }

    public rfw_3 id_case(long l) {
        return this.id_class(rfw_3.id_class(l), rfw_3.id_break(l), rfw_3.id_byte(l));
    }

    @Override
    public /* synthetic */ rja_3 id_case(int n) {
        return super.id_break(n);
    }

    public rfw_3 id_case(rja_3 rja_32) {
        return this.id_class(this.b_() + rja_32.b_(), this.c_() + rja_32.c_(), this.d_() + rja_32.d_());
    }

    @Override
    public /* synthetic */ rja_3 id_implements(int n) {
        return super.id_catch(n);
    }

    @Override
    public /* synthetic */ rja_3 id_implements() {
        return super.id_final();
    }

    @Override
    public void a_(int n) {
        super.a_(n);
    }

    @Override
    public void c_(int n) {
        super.c_(n);
    }

    @Override
    public void b_(int n) {
        super.b_(n);
    }
}

