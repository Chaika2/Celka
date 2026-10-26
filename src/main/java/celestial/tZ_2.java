/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rOQ;
import celestial.rbf_3;
import celestial.wB_2;
import celestial.wP_2;

public class tZ_2<T extends rbf_3>
extends wB_2<T> {
    private float id_finally;
    private float id_extends;
    private float id_native;

    public tZ_2(float f) {
        super(f);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        super.id_class(t, f, f2, f3, f4, f5);
        if (this.id_finally > 0.0f) {
            this.id_catch.id_private = wP_2.id_class(this.id_catch.id_private, -1.2707963f, this.id_finally);
            this.id_catch.id_catch = wP_2.id_class(this.id_catch.id_catch, 1.2707963f, this.id_finally);
            this.id_byte.id_case = -1.2707963f;
            this.id_protected.id_case = -0.47079635f;
            this.id_protected.id_private = -0.2f;
            this.id_protected.id_byte = -0.2f;
            this.id_class.id_case = -0.4f;
            this.id_break.id_case = 0.5f;
            this.id_break.id_private = -0.5f;
            this.id_break.id_byte = -0.3f;
            this.id_break.id_protected = 20.0f;
            this.id_throws.id_case = wP_2.id_class(this.id_throws.id_case, 0.8f, this.id_extends);
            this.id_case.id_case = wP_2.id_class(this.id_case.id_case, -0.4f, this.id_extends);
        }
        if (this.id_native > 0.0f) {
            this.id_catch.id_case = wP_2.id_class(this.id_catch.id_case, -0.58177644f, this.id_native);
        }
    }

    @Override
    public void id_class(T t, float f, float f2, float f3) {
        this.id_finally = ((rbf_3)t).id_throw(f3);
        this.id_extends = ((rbf_3)t).id_interface(f3);
        this.id_native = ((rbf_3)t).id_char(f3);
        if (this.id_finally <= 0.0f) {
            this.id_catch.id_case = 0.0f;
            this.id_catch.id_private = 0.0f;
            this.id_byte.id_case = 0.0f;
            this.id_byte.id_private = 0.0f;
            this.id_protected.id_case = 0.0f;
            this.id_protected.id_private = 0.0f;
            this.id_protected.id_byte = -1.2f;
            this.id_class.id_case = 0.0f;
            this.id_break.id_case = 0.0f;
            this.id_break.id_private = 0.0f;
            this.id_break.id_byte = -1.1f;
            this.id_break.id_protected = 18.0f;
        }
        super.id_class(t, f, f2, f3);
        if (((rOQ)t).Sc()) {
            this.id_private.id_case = 0.7853982f;
            this.id_private.id_protected += -4.0f;
            this.id_private.id_throws += 5.0f;
            this.id_catch.id_protected += -3.3f;
            this.id_catch.id_throws += 1.0f;
            this.id_throws.id_protected += 8.0f;
            this.id_throws.id_throws += -2.0f;
            this.id_case.id_protected += 2.0f;
            this.id_case.id_throws += -0.8f;
            this.id_throws.id_case = 1.7278761f;
            this.id_case.id_case = 2.670354f;
            this.id_byte.id_case = -0.15707964f;
            this.id_byte.id_protected = 16.1f;
            this.id_byte.id_throws = -7.0f;
            this.id_protected.id_case = -0.15707964f;
            this.id_protected.id_protected = 16.1f;
            this.id_protected.id_throws = -7.0f;
            this.id_class.id_case = -1.5707964f;
            this.id_class.id_protected = 21.0f;
            this.id_class.id_throws = 1.0f;
            this.id_break.id_case = -1.5707964f;
            this.id_break.id_protected = 21.0f;
            this.id_break.id_throws = 1.0f;
            this.id_implements = 3;
        }
    }
}

