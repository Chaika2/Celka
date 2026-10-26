/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.Ml_1;
import celestial.QY;
import celestial.rgN_2;
import celestial.rqO_2;
import com.mojang.blaze3d.systems.RenderSystem;

public class Lm_1
extends LZ {
    protected rqO_2 id_class;
    protected boolean id_throws;
    protected int id_case;
    protected int id_catch;
    protected int id_private;
    protected int id_implements;

    public void id_byte(boolean bl) {
        this.id_throws = bl;
    }

    public Lm_1(int n, int n2, int n3, int n4, boolean bl) {
        super(n, n2, n3, n4, rgN_2.id_byte);
        this.id_throws = bl;
    }

    public void id_class(int n, int n2, int n3, int n4, rqO_2 rqO_22) {
        this.id_case = n;
        this.id_catch = n2;
        this.id_private = n3;
        this.id_implements = n4;
        this.id_class = rqO_22;
    }

    public void id_class(int n, int n2) {
        this.id_volatile = n;
        this.id_final = n2;
    }

    @Override
    public void id_break(Ml_1 ml_1, int n, int n2, float f) {
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
        this.id_break(ml_1, this.id_volatile, this.id_final, n3, n4, this.id_extends, this.id_native);
        RenderSystem.enableDepthTest();
    }

    public boolean id_catch() {
        return this.id_throws;
    }
}

