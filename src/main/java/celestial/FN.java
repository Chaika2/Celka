/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Fu_1;
import celestial.Hd_1;
import celestial.Hh_1;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.gm_3;
import celestial.rXR;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rgP_2;
import celestial.rhz_3;
import celestial.rqO_2;
import celestial.rrGb_1;
import celestial.rxI_2;
import celestial.yb_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class FN
extends Fu_1<rXR> {
    private static final rqO_2 id_class = new rqO_2("textures/gui/container/cartography_table.png");

    public FN(rXR rXR2, rhz_3 rhz_32, rgP_2 rgP_22) {
        super(rXR2, rhz_32, rgP_22);
        this.id_goto -= 2;
    }

    private void id_class(Ml_1 ml_1, rrGb_1 rrGb_12, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n = this.id_char;
        int n2 = this.id_abstract;
        if (bl2 && !bl4) {
            this.id_break(ml_1, n + 67, n2 + 13, this.id_synchronized, 66, 66, 66);
            this.id_class(rrGb_12, n + 85, n2 + 31, 0.226f);
        } else if (bl) {
            this.id_break(ml_1, n + 67 + 16, n2 + 13, this.id_synchronized, 132, 50, 66);
            this.id_class(rrGb_12, n + 86, n2 + 16, 0.34f);
            this.id_volatile.A().id_class(id_class);
            RenderSystem.pushMatrix();
            RenderSystem.translatef(0.0f, 0.0f, 1.0f);
            this.id_break(ml_1, n + 67, n2 + 13 + 16, this.id_synchronized, 132, 50, 66);
            this.id_class(rrGb_12, n + 70, n2 + 32, 0.34f);
            RenderSystem.popMatrix();
        } else if (bl3) {
            this.id_break(ml_1, n + 67, n2 + 13, this.id_synchronized, 0, 66, 66);
            this.id_class(rrGb_12, n + 71, n2 + 17, 0.45f);
            this.id_volatile.A().id_class(id_class);
            RenderSystem.pushMatrix();
            RenderSystem.translatef(0.0f, 0.0f, 1.0f);
            this.id_break(ml_1, n + 66, n2 + 12, 0, this.id_return, 66, 66);
            RenderSystem.popMatrix();
        } else {
            this.id_break(ml_1, n + 67, n2 + 13, this.id_synchronized, 0, 66, 66);
            this.id_class(rrGb_12, n + 71, n2 + 17, 0.45f);
        }
    }

    private void id_class(rrGb_1 rrGb_12, int n, int n2, float f) {
        if (rrGb_12 != null) {
            RenderSystem.pushMatrix();
            RenderSystem.translatef(n, n2, 1.0f);
            RenderSystem.scalef(f, f, 1.0f);
            Hd_1 hd_1 = Hx_1.id_class(yb_3.id_class().id_byte());
            ((Hh_1)this.id_volatile.id_class[16]).id_catch().id_class(new Ml_1(), hd_1, rrGb_12, true, 0xF000F0);
            hd_1.id_break();
            RenderSystem.popMatrix();
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        super.id_class(ml_1, n, n2, f);
        this.id_break(ml_1, n, n2);
    }

    @Override
    protected void id_class(Ml_1 ml_1, float f, int n, int n2) {
        rrGb_1 rrGb_12;
        this.id_class(ml_1);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(id_class);
        int n3 = this.id_char;
        int n4 = this.id_abstract;
        this.id_break(ml_1, n3, n4, 0, 0, this.id_synchronized, this.id_return);
        rdb_3 rdb_32 = ((rXR)this.id_instanceof).id_class(1).id_class().id_break();
        boolean bl = rdb_32 == rdy_3.dM;
        boolean bl2 = rdb_32 == rdy_3.Xb;
        boolean bl3 = rdb_32 == rdy_3.BD;
        rdn_3 rdn_32 = ((rXR)this.id_instanceof).id_class(0).id_class();
        boolean bl4 = false;
        if (rdn_32.id_break() == rdy_3.JX) {
            rrGb_12 = rxI_2.id_class(rdn_32, (gm_3)this.id_volatile.id_class[56]);
            if (rrGb_12 != null) {
                if (rrGb_12.id_private) {
                    bl4 = true;
                    if (bl2 || bl3) {
                        this.id_break(ml_1, n3 + 35, n4 + 31, this.id_synchronized + 50, 132, 28, 21);
                    }
                }
                if (bl2 && rrGb_12.id_case >= 4) {
                    bl4 = true;
                    this.id_break(ml_1, n3 + 35, n4 + 31, this.id_synchronized + 50, 132, 28, 21);
                }
            }
        } else {
            rrGb_12 = null;
        }
        this.id_class(ml_1, rrGb_12, bl, bl2, bl3, bl4);
    }
}

