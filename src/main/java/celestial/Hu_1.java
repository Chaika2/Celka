/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Od_1;
import celestial.Ok_1;

public class Hu_1
extends Od_1 {
    private final Ok_1 id_private;
    private double id_implements;
    private double id_finally;
    private double id_extends;
    private float id_native;
    private float id_volatile;

    @Override
    public Ok_1 id_byte(int n, int n2) {
        return this;
    }

    public Hu_1(Ok_1 ok_1, int n, int n2, int n3, int n4) {
        this.id_private = ok_1;
        super.id_class(n, n2, n3, n4);
    }

    @Override
    public Ok_1 id_class(float f, float f2) {
        this.id_native = f;
        this.id_volatile = f2;
        return this;
    }

    @Override
    public Ok_1 id_class(float f, float f2, float f3) {
        return this;
    }

    @Override
    public void id_class(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int n, int n2, float f10, float f11, float f12) {
        this.id_private.id_class((double)f, (double)f2, (double)f3).id_break(this.id_break, this.id_byte, this.id_protected, this.id_throws).id_class(f8, f9).id_class();
    }

    @Override
    public void id_class() {
        this.id_private.id_class(this.id_implements, this.id_finally, this.id_extends).id_break(this.id_break, this.id_byte, this.id_protected, this.id_throws).id_class(this.id_native, this.id_volatile).id_class();
    }

    @Override
    public Ok_1 id_class(double d, double d2, double d3) {
        this.id_implements = d;
        this.id_finally = d2;
        this.id_extends = d3;
        return this;
    }

    @Override
    public void id_class(int n, int n2, int n3, int n4) {
    }

    @Override
    public Ok_1 id_class(int n) {
        return this;
    }

    @Override
    public Ok_1 id_class(int n, int n2) {
        return this;
    }

    @Override
    public Ok_1 id_break(int n, int n2) {
        return this;
    }

    @Override
    public Ok_1 id_break(int n, int n2, int n3, int n4) {
        return this;
    }
}

