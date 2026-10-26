/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ok_1;
import celestial.fj_3;
import celestial.rrMh_1;
import celestial.rrxp_3;

public class yE_2
extends rrxp_3
implements Ok_1 {
    private final Ok_1 id_class;
    private final fj_3 id_break;

    @Override
    public Ok_1 id_byte(int n, int n2) {
        return this.id_class.id_byte(n, n2);
    }

    public yE_2(Ok_1 ok_1, fj_3 fj_32) {
        super(ok_1);
        if (rrMh_1.id_class()) {
            rrMh_1.id_class(fj_32);
        }
        this.id_class = ok_1;
        this.id_break = fj_32;
    }

    @Override
    public Ok_1 id_class(float f, float f2) {
        return this.id_class.id_class(this.id_break.id_class((double)(f * 16.0f)), this.id_break.id_break((double)(f2 * 16.0f)));
    }

    @Override
    public Ok_1 id_class(float f, float f2, float f3) {
        return this.id_class.id_class(f, f2, f3);
    }

    @Override
    public void id_class() {
        this.id_class.id_class();
    }

    @Override
    public void id_class(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2, float f10, float f11, float f12) {
        this.id_class.id_class(f, f2, f3, f4, f5, f6, f7, this.id_break.id_class((double)(f8 * 16.0f)), this.id_break.id_break((double)(f9 * 16.0f)), n, n2, f10, f11, f12);
    }

    @Override
    public Ok_1 id_class(double d, double d2, double d3) {
        return this.id_class.id_class(d, d2, d3);
    }

    @Override
    public Ok_1 id_class(int n, int n2) {
        return this.id_class.id_class(n, n2);
    }

    @Override
    public Ok_1 id_class(int n) {
        return this.id_class.id_class(n);
    }

    @Override
    public Ok_1 id_break(int n, int n2, int n3, int n4) {
        return this.id_class.id_break(n, n2, n3, n4);
    }

    @Override
    public Ok_1 id_break(int n, int n2) {
        return this.id_class.id_break(n, n2);
    }
}

