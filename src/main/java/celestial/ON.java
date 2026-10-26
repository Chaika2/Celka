/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ok_1;
import celestial.rrxp_3;

public class ON
extends rrxp_3
implements Ok_1 {
    private final Ok_1 id_class;
    private final Ok_1 id_break;
    private boolean id_byte;

    @Override
    public Ok_1 id_byte(int n, int n2) {
        this.id_class.id_byte(n, n2);
        this.id_break.id_byte(n, n2);
        return this;
    }

    public ON(Ok_1 ok_1, Ok_1 ok_12) {
        super(ok_12);
        if (ok_1 == ok_12) {
            throw new IllegalArgumentException("Duplicate delegates");
        }
        this.id_class = ok_1;
        this.id_break = ok_12;
        this.id_catch();
    }

    @Override
    public void id_class(boolean bl) {
        super.id_class(bl);
        this.id_catch();
    }

    @Override
    public Ok_1 id_class(double d, double d2, double d3) {
        this.id_class.id_class(d, d2, d3);
        this.id_break.id_class(d, d2, d3);
        return this;
    }

    @Override
    public void id_class() {
        this.id_class.id_class();
        this.id_break.id_class();
    }

    @Override
    public void id_class(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2, float f10, float f11, float f12) {
        if (this.id_byte) {
            this.id_class.id_class(f, f2, f3, f4, f5, f6, f7, f8 / 32.0f, f9 / 32.0f, n, n2, f10, f11, f12);
        } else {
            this.id_class.id_class(f, f2, f3, f4, f5, f6, f7, f8, f9, n, n2, f10, f11, f12);
        }
        this.id_break.id_class(f, f2, f3, f4, f5, f6, f7, f8, f9, n, n2, f10, f11, f12);
    }

    @Override
    public Ok_1 id_class(float f, float f2, float f3) {
        this.id_class.id_class(f, f2, f3);
        this.id_break.id_class(f, f2, f3);
        return this;
    }

    @Override
    public Ok_1 id_class(int n) {
        this.id_class.id_class(n);
        this.id_break.id_class(n);
        return this;
    }

    @Override
    public Ok_1 id_class(int n, int n2) {
        this.id_class.id_class(n, n2);
        this.id_break.id_class(n, n2);
        return this;
    }

    @Override
    public Ok_1 id_class(float f, float f2) {
        this.id_class.id_class(f, f2);
        this.id_break.id_class(f, f2);
        return this;
    }

    @Override
    public Ok_1 id_break(int n, int n2, int n3, int n4) {
        this.id_class.id_break(n, n2, n3, n4);
        this.id_break.id_break(n, n2, n3, n4);
        return this;
    }

    @Override
    public Ok_1 id_break(int n, int n2) {
        this.id_class.id_break(n, n2);
        this.id_break.id_break(n, n2);
        return this;
    }

    @Override
    public Ok_1 id_throws() {
        return this.id_class;
    }

    private void id_catch() {
        this.id_byte = !this.id_class.id_break() && this.id_break.id_break();
    }
}

