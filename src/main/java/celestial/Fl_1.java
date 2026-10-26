/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.FH;
import celestial.Fu_1;
import celestial.Ml_1;
import celestial.rJQ;
import celestial.rOD;
import celestial.rOK;
import celestial.rhP_2;
import celestial.rhz_3;
import celestial.rqO_2;
import com.mojang.blaze3d.systems.RenderSystem;

public class Fl_1
extends Fu_1<rJQ> {
    private static final rqO_2 id_class = new rqO_2("textures/gui/container/horse.png");
    private final rOD id_throws;
    private float id_case;
    private float id_catch;

    public Fl_1(rJQ rJQ2, rhz_3 rhz_32, rOD rOD2) {
        super(rJQ2, rhz_32, rOD2.L_());
        this.id_throws = rOD2;
        this.id_continue = false;
    }

    @Override
    protected void id_class(Ml_1 ml_1, float f, int n, int n2) {
        rOK rOK2;
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(id_class);
        int n3 = (this.id_package - this.id_synchronized) / 2;
        int n4 = (this.id_int - this.id_return) / 2;
        this.id_break(ml_1, n3, n4, 0, 0, this.id_synchronized, this.id_return);
        if (this.id_throws instanceof rOK && (rOK2 = (rOK)this.id_throws).sJ()) {
            this.id_break(ml_1, n3 + 79, n4 + 17, 0, this.id_return, rOK2.sc() * 18, 54);
        }
        if (this.id_throws.id_class()) {
            this.id_break(ml_1, n3 + 7, n4 + 35 - 18, 18, this.id_return + 54, 18, 18);
        }
        if (this.id_throws.sY()) {
            if (this.id_throws instanceof rhP_2) {
                this.id_break(ml_1, n3 + 7, n4 + 35, 36, this.id_return + 54, 18, 18);
            } else {
                this.id_break(ml_1, n3 + 7, n4 + 35, 0, this.id_return + 54, 18, 18);
            }
        }
        FH.id_class(n3 + 51, n4 + 60, 17, (float)(n3 + 51) - this.id_case, (float)(n4 + 75 - 50) - this.id_catch, this.id_throws);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        this.id_case = n;
        this.id_catch = n2;
        super.id_class(ml_1, n, n2, f);
        this.id_break(ml_1, n, n2);
    }
}

