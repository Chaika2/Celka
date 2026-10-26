/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LA;
import celestial.LF;
import celestial.LL;
import celestial.Ml_1;
import celestial.QY;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rqO_2;
import com.mojang.blaze3d.systems.RenderSystem;

public class Ll_1
extends LF {
    private final rqO_2 id_class;
    private final int id_throws;
    private final int id_case;
    private final int id_catch;
    private final int id_this;
    private final int id_else;

    public Ll_1(int n, int n2, int n3, int n4, int n5, int n6, int n7, rqO_2 rqO_22, int n8, int n9, LL lL, LA lA, rgP_2 rgP_22) {
        super(n, n2, n3, n4, rgP_22, lL, lA);
        this.id_this = n8;
        this.id_else = n9;
        this.id_throws = n5;
        this.id_case = n6;
        this.id_catch = n7;
        this.id_class = rqO_22;
    }

    public Ll_1(int n, int n2, int n3, int n4, int n5, int n6, int n7, rqO_2 rqO_22, int n8, int n9, LL lL, rgP_2 rgP_22) {
        this(n, n2, n3, n4, n5, n6, n7, rqO_22, n8, n9, lL, id_private, rgP_22);
    }

    public Ll_1(int n, int n2, int n3, int n4, int n5, int n6, int n7, rqO_2 rqO_22, int n8, int n9, LL lL) {
        this(n, n2, n3, n4, n5, n6, n7, rqO_22, n8, n9, lL, rgN_2.id_byte);
    }

    public Ll_1(int n, int n2, int n3, int n4, int n5, int n6, int n7, rqO_2 rqO_22, LL lL) {
        this(n, n2, n3, n4, n5, n6, n7, rqO_22, 256, 256, lL);
    }

    public void id_class(int n, int n2) {
        this.id_volatile = n;
        this.id_final = n2;
    }

    @Override
    public void id_break(Ml_1 ml_1, int n, int n2, float f) {
        QY qY = QY.id_instanceof();
        qY.A().id_class(this.id_class);
        int n3 = this.id_case;
        if (this.B_()) {
            n3 += this.id_catch;
        }
        RenderSystem.enableDepthTest();
        Ll_1.id_class(ml_1, this.id_volatile, this.id_final, (float)this.id_throws, (float)n3, this.id_extends, this.id_native, this.id_this, this.id_else);
        if (this.B_()) {
            this.id_class(ml_1, n, n2);
        }
    }
}

