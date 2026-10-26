/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Lg_1;
import celestial.Ml_1;
import celestial.ch_3;
import celestial.jI_2;
import celestial.mR_2;
import celestial.rKN;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class mY_2
extends Lg_1<mY_2> {
    public final /* synthetic */ mR_2 id_class;

    public mY_2(mR_2 mR_22) {
        this.id_class = mR_22;
    }

    private void id_class(Ml_1 ml_1, int n, int n2, rdn_3 rdn_32) {
        this.id_class(ml_1, n + 1, n2 + 1);
        RenderSystem.enableRescaleNormal();
        if (!rdn_32.id_class()) {
            this.id_class.id_class.id_final.id_class(rdn_32, (float)(n + 2), (float)(n2 + 2));
        }
        RenderSystem.disableRescaleNormal();
    }

    private void id_class(Ml_1 ml_1, int n, int n2) {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        mR_2.id_class(this.id_class).A().id_class(ch_3.id_byte);
        ch_3.id_class(ml_1, n, n2, this.id_class.id_class.h_(), 0.0f, 0.0f, 18, 18, 128, 128);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        rKN rKN2 = this.id_class.id_class.id_case.id_case().get(this.id_class.id_class.id_case.id_case().size() - n - 1);
        xc_3 xc_32 = rKN2.id_break();
        rdb_3 rdb_32 = xc_32.id_break().id_case();
        if (rdb_32 == rdy_3.id_class) {
            if (xc_32.id_class(xu_3.id_try)) {
                rdb_32 = rdy_3.hR;
            } else if (xc_32.id_class(xu_3.id_instanceof)) {
                rdb_32 = rdy_3.hY;
            }
        }
        rdn_3 rdn_32 = new rdn_3(rdb_32);
        this.id_class(ml_1, n3, n2, rdn_32);
        this.id_class.id_class.id_super.id_byte(ml_1, rdb_32.id_implements(rdn_32), n3 + 18 + 5, n2 + 3, 0xFFFFFF);
        String string = n == 0 ? jI_2.id_class("createWorld.customize.flat.layer.top", rKN2.id_class()) : (n == this.id_class.id_class.id_case.id_case().size() - 1 ? jI_2.id_class("createWorld.customize.flat.layer.bottom", rKN2.id_class()) : jI_2.id_class("createWorld.customize.flat.layer", rKN2.id_class()));
        this.id_class.id_class.id_super.id_break(ml_1, string, (float)(n3 + 2 + 213 - this.id_class.id_class.id_super.id_break(string)), (float)(n2 + 3), 0xFFFFFF);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (n == 0) {
            this.id_class.id_class(this);
            return true;
        }
        return false;
    }
}

