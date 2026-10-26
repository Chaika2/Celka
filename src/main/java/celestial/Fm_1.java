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
import celestial.rJa_1;
import celestial.rXa_1;
import celestial.rgP_2;
import celestial.rhz_3;
import celestial.rqO_2;
import com.mojang.blaze3d.systems.RenderSystem;

public class Fm_1
extends Fu_1<rJa_1>
implements mB_2 {
    private static final rqO_2 id_class = new rqO_2("textures/gui/container/crafting_table.png");
    private static final rqO_2 id_throws = new rqO_2("textures/gui/recipe_button.png");
    private final ms_3 id_case = new ms_3();
    private boolean id_catch;

    public Fm_1(rJa_1 rJa_12, rhz_3 rhz_32, rgP_2 rgP_22) {
        super(rJa_12, rhz_32, rgP_22);
    }

    @Override
    protected boolean id_class(int n, int n2, int n3, int n4, double d, double d2) {
        return (!this.id_catch || !this.id_case.id_private()) && super.id_class(n, n2, n3, n4, d, d2);
    }

    @Override
    protected boolean id_class(double d, double d2, int n, int n2, int n3) {
        boolean bl = d < (double)n || d2 < (double)n2 || d >= (double)(n + this.id_synchronized) || d2 >= (double)(n2 + this.id_return);
        return this.id_case.id_class(d, d2, this.id_char, this.id_abstract, this.id_synchronized, this.id_return, n3) && bl;
    }

    @Override
    public void id_class() {
        this.id_case.id_finally();
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        if (this.id_case.id_private() && this.id_catch) {
            this.id_class(ml_1, f, n, n2);
            this.id_case.id_class(ml_1, n, n2, f);
        } else {
            this.id_case.id_class(ml_1, n, n2, f);
            super.id_class(ml_1, n, n2, f);
            this.id_case.id_class(ml_1, this.id_char, this.id_abstract, true, f);
        }
        this.id_break(ml_1, n, n2);
        this.id_case.id_byte(ml_1, this.id_char, this.id_abstract, n, n2);
    }

    @Override
    public void id_class(rJY rJY2, int n, int n2, rXa_1 rXa_12) {
        super.id_class(rJY2, n, n2, rXa_12);
        this.id_case.id_class(rJY2);
    }

    @Override
    protected void id_class(Ml_1 ml_1, float f, int n, int n2) {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(id_class);
        int n3 = this.id_char;
        int n4 = (this.id_int - this.id_return) / 2;
        this.id_break(ml_1, n3, n4, 0, 0, this.id_synchronized, this.id_return);
    }

    @Override
    public ms_3 id_break() {
        return this.id_case;
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (this.id_case.id_break(d, d2, n)) {
            this.id_class(this.id_case);
            return true;
        }
        return this.id_catch && this.id_case.id_private() ? true : super.id_break(d, d2, n);
    }

    @Override
    public void id_private() {
        super.id_private();
        this.id_case.id_implements();
    }

    @Override
    protected void v_() {
        super.v_();
        this.id_catch = this.id_package < 379;
        this.id_case.id_class(this.id_package, this.id_int, this.id_volatile, this.id_catch, (rJI)this.id_instanceof);
        this.id_char = this.id_case.id_class(this.id_catch, this.id_package, this.id_synchronized);
        this.id_native.add(this.id_case);
        this.id_break(this.id_case);
        this.id_class(new Ll_1(this.id_char + 5, this.id_int / 2 - 49, 20, 18, 0, 0, 19, id_throws, lF -> {
            this.id_case.id_class(this.id_catch);
            this.id_case.id_catch();
            this.id_char = this.id_case.id_class(this.id_catch, this.id_package, this.id_synchronized);
            ((Ll_1)lF).id_class(this.id_char + 5, this.id_int / 2 - 49);
        }));
        this.id_public = 29;
    }

    @Override
    public void w_() {
        super.w_();
        this.id_case.id_case();
    }
}

