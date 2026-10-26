/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Lg_1;
import celestial.Ml_1;
import celestial.ZH;
import celestial.Zl_1;
import celestial.Zy_1;
import celestial.ch_3;
import celestial.rVF;
import celestial.rVL;
import celestial.rYG;
import celestial.rdb_3;
import celestial.rdn_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class Zp_1
extends Lg_1<Zp_1> {
    public final /* synthetic */ Zy_1 id_class;

    public Zp_1(Zy_1 zy_1) {
        this.id_class = zy_1;
    }

    public void id_class() {
        this.id_class.id_class(this);
        ZH zH = Zl_1.id_throws.get(this.id_class.x_().indexOf(this));
        rVF<rYG> rVF2 = this.id_class.id_class.id_case.id_class.id_case.id_break().id_break(rVL.n);
        this.id_class.id_class.id_synchronized = zH.id_byte.apply(rVF2);
        this.id_class.id_class.id_else.id_class(Zl_1.id_class(rVF2, this.id_class.id_class.id_synchronized));
        this.id_class.id_class.id_else.id_extends();
    }

    private void id_class(Ml_1 ml_1, int n, int n2, rdb_3 rdb_32) {
        this.id_class(ml_1, n + 1, n2 + 1);
        RenderSystem.enableRescaleNormal();
        this.id_class.id_class.id_final.id_class(new rdn_3(rdb_32), (float)(n + 2), (float)(n2 + 2));
        RenderSystem.disableRescaleNormal();
    }

    private void id_class(Ml_1 ml_1, int n, int n2) {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        Zy_1.id_class(this.id_class).A().id_class(ch_3.id_byte);
        ch_3.id_class(ml_1, n, n2, this.id_class.id_class.h_(), 0.0f, 0.0f, 18, 18, 128, 128);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        ZH zH = Zl_1.id_throws.get(n);
        this.id_class(ml_1, n3, n2, zH.id_class);
        this.id_class.id_class.id_super.id_byte(ml_1, zH.id_break, n3 + 18 + 5, n2 + 6, 0xFFFFFF);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (n == 0) {
            this.id_class();
        }
        return false;
    }
}

