/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Od_1;
import celestial.Ok_1;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rji_3;
import celestial.rjj_3;
import celestial.rpr_3;

public class Oz_1
extends Od_1 {
    private final Ok_1 id_private;
    private final rjV_2 id_implements;
    private final rjj_3 id_finally;
    private float id_extends;
    private float id_native;
    private float id_volatile;
    private int id_final;
    private int id_package;
    private int id_int;
    private float id_new;
    private float id_continue;
    private float id_super;

    @Override
    public Ok_1 id_byte(int n, int n2) {
        this.id_int = n | n2 << 16;
        return this;
    }

    public Oz_1(Ok_1 ok_1, rjV_2 rjV_22, rjj_3 rjj_32) {
        this.id_private = ok_1;
        this.id_implements = rjV_22.id_case();
        this.id_implements.id_throws();
        this.id_finally = rjj_32.id_case();
        this.id_finally.id_throws();
        this.id_case();
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
    public Ok_1 id_class(float f, float f2) {
        return this;
    }

    @Override
    public Ok_1 id_class(float f, float f2, float f3) {
        this.id_new = f;
        this.id_continue = f2;
        this.id_super = f3;
        return this;
    }

    @Override
    public void id_class() {
        rje_3 rje_32 = new rje_3(this.id_new, this.id_continue, this.id_super);
        rje_32.id_class(this.id_finally);
        rpr_3 rpr_32 = rpr_3.id_class(rje_32.id_class(), rje_32.id_break(), rje_32.id_byte());
        rji_3 rji_32 = new rji_3(this.id_extends, this.id_native, this.id_volatile, 1.0f);
        rji_32.id_class(this.id_implements);
        rji_32.id_class(rje_3.id_protected.id_byte(180.0f));
        rji_32.id_class(rje_3.id_break.id_byte(-90.0f));
        rji_32.id_class(rpr_32.id_break());
        float f = -rji_32.id_class();
        float f2 = -rji_32.id_break();
        this.id_private.id_class((double)this.id_extends, (double)this.id_native, (double)this.id_volatile).id_class(1.0f, 1.0f, 1.0f, 1.0f).id_class(f, f2).id_break(this.id_final, this.id_package).id_break(this.id_int).id_class(this.id_new, this.id_continue, this.id_super).id_class();
        this.id_case();
    }

    @Override
    public Ok_1 id_class(double d, double d2, double d3) {
        this.id_extends = (float)d;
        this.id_native = (float)d2;
        this.id_volatile = (float)d3;
        return this;
    }

    @Override
    public Ok_1 id_break(int n, int n2) {
        this.id_final = n;
        this.id_package = n2;
        return this;
    }

    @Override
    public Ok_1 id_break(int n, int n2, int n3, int n4) {
        return this;
    }

    private void id_case() {
        this.id_extends = 0.0f;
        this.id_native = 0.0f;
        this.id_volatile = 0.0f;
        this.id_final = 0;
        this.id_package = 10;
        this.id_int = 0xF000F0;
        this.id_new = 0.0f;
        this.id_continue = 1.0f;
        this.id_super = 0.0f;
    }
}

