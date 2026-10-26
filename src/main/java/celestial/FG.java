/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Fu_1;
import celestial.Ml_1;
import celestial.rJr_1;
import celestial.rJu_1;
import celestial.rXy_1;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rhz_3;
import celestial.rqO_2;
import celestial.rqs_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class FG<T extends rXy_1>
extends Fu_1<T>
implements rJu_1 {
    private rqO_2 id_class;

    public FG(T t, rhz_3 rhz_32, rgP_2 rgP_22, rqO_2 rqO_22) {
        super(t, rhz_32, rgP_22);
        this.id_class = rqO_22;
    }

    @Override
    public void id_class(rJr_1 rJr_12, int n, rdn_3 rdn_32) {
    }

    @Override
    protected void id_class(Ml_1 ml_1, float f, int n, int n2) {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(this.id_class);
        int n3 = (this.id_package - this.id_synchronized) / 2;
        int n4 = (this.id_int - this.id_return) / 2;
        this.id_break(ml_1, n3, n4, 0, 0, this.id_synchronized, this.id_return);
        this.id_break(ml_1, n3 + 59, n4 + 20, 0, this.id_return + (((rXy_1)this.id_instanceof).id_class(0).id_break() ? 0 : 16), 110, 16);
        if ((((rXy_1)this.id_instanceof).id_class(0).id_break() || ((rXy_1)this.id_instanceof).id_class(1).id_break()) && !((rXy_1)this.id_instanceof).id_class(2).id_break()) {
            this.id_break(ml_1, n3 + 99, n4 + 45, this.id_synchronized, 0, 28, 21);
        }
    }

    @Override
    public void id_class(rJr_1 rJr_12, rqs_3<rdn_3> rqs_32) {
        this.id_class(rJr_12, 0, rJr_12.id_class(0).id_class());
    }

    @Override
    public void id_class(rJr_1 rJr_12, int n, int n2) {
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        super.id_class(ml_1, n, n2, f);
        RenderSystem.disableBlend();
        this.id_break(ml_1, n, n2, f);
        this.id_break(ml_1, n, n2);
    }

    protected void id_break(Ml_1 ml_1, int n, int n2, float f) {
    }

    protected void id_native() {
    }

    @Override
    protected void v_() {
        super.v_();
        this.id_native();
        ((rXy_1)this.id_instanceof).id_class(this);
    }

    @Override
    public void w_() {
        super.w_();
        ((rXy_1)this.id_instanceof).id_break(this);
    }
}

