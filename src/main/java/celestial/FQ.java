/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Fu_1;
import celestial.Ml_1;
import celestial.rXf_1;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rhz_3;
import celestial.rqO_2;
import com.mojang.blaze3d.systems.RenderSystem;

public class FQ
extends Fu_1<rXf_1> {
    private static final rqO_2 id_class = new rqO_2("textures/gui/container/brewing_stand.png");
    private static final int[] id_throws = new int[]{29, 24, 20, 16, 11, 6, 0};

    public FQ(rXf_1 rXf_12, rhz_3 rhz_32, rgP_2 rgP_22) {
        super(rXf_12, rhz_32, rgP_22);
    }

    @Override
    protected void id_class(Ml_1 ml_1, float f, int n, int n2) {
        int n3;
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(id_class);
        int n4 = (this.id_package - this.id_synchronized) / 2;
        int n5 = (this.id_int - this.id_return) / 2;
        this.id_break(ml_1, n4, n5, 0, 0, this.id_synchronized, this.id_return);
        int n6 = ((rXf_1)this.id_instanceof).id_class();
        int n7 = rfU_2.id_class((18 * n6 + 20 - 1) / 20, 0, 18);
        if (n7 > 0) {
            this.id_break(ml_1, n4 + 60, n5 + 44, 176, 29, n7, 4);
        }
        if ((n3 = ((rXf_1)this.id_instanceof).id_break()) > 0) {
            int n8 = (int)(28.0f * (1.0f - (float)n3 / 400.0f));
            if (n8 > 0) {
                this.id_break(ml_1, n4 + 97, n5 + 16, 176, 0, 9, n8);
            }
            if ((n8 = id_throws[n3 / 2 % 7]) > 0) {
                this.id_break(ml_1, n4 + 63, n5 + 14 + 29 - n8, 185, 29 - n8, 12, n8);
            }
        }
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

