/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Fu_1;
import celestial.Ml_1;
import celestial.rJs_1;
import celestial.rgP_2;
import celestial.rhz_3;
import celestial.rqO_2;
import com.mojang.blaze3d.systems.RenderSystem;

public class Fn_1
extends Fu_1<rJs_1> {
    private static final rqO_2 id_class = new rqO_2("textures/gui/container/dispenser.png");

    public Fn_1(rJs_1 rJs_12, rhz_3 rhz_32, rgP_2 rgP_22) {
        super(rJs_12, rhz_32, rgP_22);
    }

    @Override
    protected void id_class(Ml_1 ml_1, float f, int n, int n2) {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(id_class);
        int n3 = (this.id_package - this.id_synchronized) / 2;
        int n4 = (this.id_int - this.id_return) / 2;
        this.id_break(ml_1, n3, n4, 0, 0, this.id_synchronized, this.id_return);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        super.id_class(ml_1, n, n2, f);
        this.id_break(ml_1, n, n2);
    }

    @Override
    protected void v_() {
        super.v_();
        this.id_public = (this.id_synchronized - this.id_super.id_class(this.id_extends)) / 2;
    }
}

