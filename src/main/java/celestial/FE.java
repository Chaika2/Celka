/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Fu_1;
import celestial.Ll_1;
import celestial.Ml_1;
import celestial.mB_2;
import celestial.ms_3;
import celestial.rJI;
import celestial.rJY;
import celestial.rXH;
import celestial.rXa_1;
import celestial.rgP_2;
import celestial.rhz_3;
import celestial.rqO_2;
import celestial.ue_3;
import com.mojang.blaze3d.systems.RenderSystem;

public abstract class FE<T extends rXH>
extends Fu_1<T>
implements mB_2 {
    private static final rqO_2 id_throws = new rqO_2("textures/gui/recipe_button.png");
    public final ue_3 id_class;
    private boolean id_case;
    private final rqO_2 id_catch;

    public FE(T t, ue_3 ue_32, rhz_3 rhz_32, rgP_2 rgP_22, rqO_2 rqO_22) {
        super(t, rhz_32, rgP_22);
        this.id_class = ue_32;
        this.id_catch = rqO_22;
    }

    @Override
    public void id_class(rJY rJY2, int n, int n2, rXa_1 rXa_12) {
        super.id_class(rJY2, n, n2, rXa_12);
        this.id_class.id_class(rJY2);
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        return this.id_class.id_class(n, n2, n3) ? false : super.id_class(n, n2, n3);
    }

    @Override
    public boolean id_class(char c, int n) {
        return this.id_class.id_class(c, n) ? true : super.id_class(c, n);
    }

    @Override
    public void id_class() {
        this.id_class.id_finally();
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        if (this.id_class.id_private() && this.id_case) {
            this.id_class(ml_1, f, n, n2);
            this.id_class.id_class(ml_1, n, n2, f);
        } else {
            this.id_class.id_class(ml_1, n, n2, f);
            super.id_class(ml_1, n, n2, f);
            this.id_class.id_class(ml_1, this.id_char, this.id_abstract, true, f);
        }
        this.id_break(ml_1, n, n2);
        this.id_class.id_byte(ml_1, this.id_char, this.id_abstract, n, n2);
    }

    @Override
    protected boolean id_class(double d, double d2, int n, int n2, int n3) {
        boolean bl = d < (double)n || d2 < (double)n2 || d >= (double)(n + this.id_synchronized) || d2 >= (double)(n2 + this.id_return);
        return this.id_class.id_class(d, d2, this.id_char, this.id_abstract, this.id_synchronized, this.id_return, n3) && bl;
    }

    @Override
    protected void id_class(Ml_1 ml_1, float f, int n, int n2) {
        int n3;
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(this.id_catch);
        int n4 = this.id_char;
        int n5 = this.id_abstract;
        this.id_break(ml_1, n4, n5, 0, 0, this.id_synchronized, this.id_return);
        if (((rXH)this.id_instanceof).id_private()) {
            n3 = ((rXH)this.id_instanceof).id_catch();
            this.id_break(ml_1, n4 + 56, n5 + 36 + 12 - n3, 176, 12 - n3, 14, n3 + 1);
        }
        n3 = ((rXH)this.id_instanceof).id_case();
        this.id_break(ml_1, n4 + 79, n5 + 34, 176, 14, n3 + 1, 16);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (this.id_class.id_break(d, d2, n)) {
            return true;
        }
        return this.id_case && this.id_class.id_private() ? true : super.id_break(d, d2, n);
    }

    @Override
    public ms_3 id_break() {
        return this.id_class;
    }

    @Override
    public void id_private() {
        super.id_private();
        this.id_class.id_implements();
    }

    @Override
    public void v_() {
        super.v_();
        this.id_case = this.id_package < 379;
        this.id_class.id_class(this.id_package, this.id_int, this.id_volatile, this.id_case, (rJI)this.id_instanceof);
        this.id_char = this.id_class.id_class(this.id_case, this.id_package, this.id_synchronized);
        this.id_class(new Ll_1(this.id_char + 20, this.id_int / 2 - 49, 20, 18, 0, 0, 19, id_throws, lF -> {
            this.id_class.id_class(this.id_case);
            this.id_class.id_catch();
            this.id_char = this.id_class.id_class(this.id_case, this.id_package, this.id_synchronized);
            ((Ll_1)lF).id_class(this.id_char + 20, this.id_int / 2 - 49);
        }));
        this.id_public = (this.id_synchronized - this.id_super.id_class(this.id_extends)) / 2;
    }

    @Override
    public void w_() {
        super.w_();
        this.id_class.id_case();
    }
}

