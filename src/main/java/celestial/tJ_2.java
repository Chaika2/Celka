/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rSY;
import celestial.tW_2;

public class tJ_2
extends tW_2<rSY> {
    public tJ_2(float f) {
        this(f, 64, 32);
    }

    protected tJ_2(float f, int n, int n2) {
        super(f, 0.0f, n, n2);
    }

    @Override
    public void id_class(rSY rSY2, float f, float f2, float f3, float f4, float f5) {
        this.id_class.id_case = (float)Math.PI / 180 * rSY2.id_final().id_break();
        this.id_class.id_catch = (float)Math.PI / 180 * rSY2.id_final().id_byte();
        this.id_class.id_private = (float)Math.PI / 180 * rSY2.id_final().id_protected();
        this.id_class.id_class(0.0f, 1.0f, 0.0f);
        this.id_byte.id_case = (float)Math.PI / 180 * rSY2.id_package().id_break();
        this.id_byte.id_catch = (float)Math.PI / 180 * rSY2.id_package().id_byte();
        this.id_byte.id_private = (float)Math.PI / 180 * rSY2.id_package().id_protected();
        this.id_throws.id_case = (float)Math.PI / 180 * rSY2.id_int().id_break();
        this.id_throws.id_catch = (float)Math.PI / 180 * rSY2.id_int().id_byte();
        this.id_throws.id_private = (float)Math.PI / 180 * rSY2.id_int().id_protected();
        this.id_protected.id_case = (float)Math.PI / 180 * rSY2.id_new().id_break();
        this.id_protected.id_catch = (float)Math.PI / 180 * rSY2.id_new().id_byte();
        this.id_protected.id_private = (float)Math.PI / 180 * rSY2.id_new().id_protected();
        this.id_catch.id_case = (float)Math.PI / 180 * rSY2.id_continue().id_break();
        this.id_catch.id_catch = (float)Math.PI / 180 * rSY2.id_continue().id_byte();
        this.id_catch.id_private = (float)Math.PI / 180 * rSY2.id_continue().id_protected();
        this.id_catch.id_class(1.9f, 11.0f, 0.0f);
        this.id_case.id_case = (float)Math.PI / 180 * rSY2.id_super().id_break();
        this.id_case.id_catch = (float)Math.PI / 180 * rSY2.id_super().id_byte();
        this.id_case.id_private = (float)Math.PI / 180 * rSY2.id_super().id_protected();
        this.id_case.id_class(-1.9f, 11.0f, 0.0f);
        this.id_break.id_class(this.id_class);
    }
}

