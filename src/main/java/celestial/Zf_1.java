/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.Ml_1;
import celestial.QY;
import celestial.ZI;
import celestial.Zt_1;
import celestial.fY_2;

public class Zf_1
extends LZ {
    public final ZI id_throws;
    private boolean id_case;
    public final /* synthetic */ Zt_1 id_class;

    public Zf_1(Zt_1 zt_1, ZI zI, int n, int n2) {
        this.id_class = zt_1;
        super(n, n2, 25, 25, zI.id_class());
        this.id_throws = zI;
    }

    private void id_class(Ml_1 ml_1, fY_2 fY_22) {
        fY_22.id_class(Zt_1.id_class);
        ml_1.id_class();
        ml_1.id_class((double)this.id_volatile, (double)this.id_final, 0.0);
        Zf_1.id_class(ml_1, 0, 0, 0.0f, 75.0f, 25, 25, 128, 128);
        ml_1.id_break();
    }

    public void id_class(boolean bl) {
        this.id_case = bl;
    }

    @Override
    public void id_break(Ml_1 ml_1, int n, int n2, float f) {
        QY qY = QY.id_instanceof();
        this.id_class(ml_1, qY.A());
        this.id_throws.id_class(this.id_class.id_final, this.id_volatile + 5, this.id_final + 5);
        if (this.id_case) {
            this.id_break(ml_1, qY.A());
        }
    }

    private void id_break(Ml_1 ml_1, fY_2 fY_22) {
        fY_22.id_class(Zt_1.id_class);
        ml_1.id_class();
        ml_1.id_class((double)this.id_volatile, (double)this.id_final, 0.0);
        Zf_1.id_class(ml_1, 0, 0, 25.0f, 75.0f, 25, 25, 128, 128);
        ml_1.id_break();
    }

    @Override
    public boolean B_() {
        return super.B_() || this.id_case;
    }
}

