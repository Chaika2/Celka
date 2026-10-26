/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hz_1;
import celestial.Lm_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.VR;
import celestial.cb_3;
import celestial.gM_2;
import celestial.mG_2;
import celestial.ms_3;
import celestial.rJI;
import celestial.rJr_1;
import celestial.rdn_3;
import celestial.rkw_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class mX_2
extends Lm_1 {
    private final gM_2 id_super;
    private float id_this;

    public mX_2(gM_2 gM_22) {
        super(0, 0, 35, 27, false);
        this.id_super = gM_22;
        this.id_class(153, 2, 35, 0, ms_3.id_class);
    }

    private void id_class(Hz_1 hz_1) {
        int n;
        List<rdn_3> list = this.id_super.id_class();
        int n2 = n = this.id_throws ? -2 : 0;
        if (list.size() == 1) {
            hz_1.id_break(list.get(0), this.id_volatile + 9 + n, this.id_final + 5);
        } else if (list.size() == 2) {
            hz_1.id_break(list.get(0), this.id_volatile + 3 + n, this.id_final + 5);
            hz_1.id_break(list.get(1), this.id_volatile + 14 + n, this.id_final + 5);
        }
    }

    public gM_2 id_class() {
        return this.id_super;
    }

    public boolean id_class(VR vR) {
        List<mG_2> list = vR.id_class(this.id_super);
        this.id_new = false;
        if (list != null) {
            for (mG_2 mG_22 : list) {
                if (!mG_22.id_class() || !mG_22.id_byte()) continue;
                this.id_new = true;
                break;
            }
        }
        return this.id_new;
    }

    public void id_class(QY qY) {
        VR vR = ((cb_3)qY.id_class[57]).Z();
        List<mG_2> list = vR.id_class(this.id_super);
        if ((rJr_1)((cb_3)qY.id_class[57]).id_implements[4] instanceof rJI) {
            for (mG_2 mG_22 : list) {
                for (rkw_3<?> rkw_32 : mG_22.id_class(vR.id_class((rJI)((rJr_1)((cb_3)qY.id_class[57]).id_implements[4])))) {
                    if (!vR.id_protected(rkw_32)) continue;
                    this.id_this = 15.0f;
                    return;
                }
            }
        }
    }

    @Override
    public void id_break(Ml_1 ml_1, int n, int n2, float f) {
        if (this.id_this > 0.0f) {
            float f2 = 1.0f + 0.1f * (float)Math.sin(this.id_this / 15.0f * (float)Math.PI);
            RenderSystem.pushMatrix();
            RenderSystem.translatef(this.id_volatile + 8, this.id_final + 12, 0.0f);
            RenderSystem.scalef(1.0f, f2, 1.0f);
            RenderSystem.translatef(-(this.id_volatile + 8), -(this.id_final + 12), 0.0f);
        }
        QY qY = QY.id_instanceof();
        qY.A().id_class(this.id_class);
        RenderSystem.disableDepthTest();
        int n3 = this.id_case;
        int n4 = this.id_catch;
        if (this.id_throws) {
            n3 += this.id_private;
        }
        if (this.B_()) {
            n4 += this.id_implements;
        }
        int n5 = this.id_volatile;
        if (this.id_throws) {
            n5 -= 2;
        }
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_break(ml_1, n5, this.id_final, n3, n4, this.id_extends, this.id_native);
        RenderSystem.enableDepthTest();
        this.id_class(qY.id_float());
        if (this.id_this > 0.0f) {
            RenderSystem.popMatrix();
            this.id_this -= f;
        }
    }
}

