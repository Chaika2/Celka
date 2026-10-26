/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.gm_3;
import celestial.lO_2;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXs_1;
import celestial.rfH_2;

public class nu_3
extends lO_2 {
    private final rXs_1 id_break;
    protected boolean id_class;

    public nu_3(gm_3 gm_32, double d, double d2, double d3, rXs_1 rXs_12) {
        super(gm_32, d, d2, d3);
        this.id_class(0.01f, 0.01f);
        this.id_else = 0.06f;
        this.id_break = rXs_12;
    }

    @Override
    public CJ id_class() {
        return CJ.id_break;
    }

    @Override
    public int id_break(float f) {
        return this.id_class ? 240 : super.id_break(f);
    }

    protected void id_catch() {
        if (this.id_this-- <= 0) {
            this.id_finally();
        }
    }

    @Override
    public void id_case() {
        this.id_protected = this.id_catch;
        this.id_throws = this.id_private;
        this.id_case = this.id_implements;
        this.id_catch();
        if (!this.id_package) {
            this.id_extends -= (double)this.id_else;
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            this.id_private();
            if (!this.id_package) {
                this.id_finally *= (double)0.98f;
                this.id_extends *= (double)0.98f;
                this.id_native *= (double)0.98f;
                rfH_2 rfH_22 = new rfH_2(this.id_catch, this.id_private, this.id_implements);
                rXE rXE2 = this.id_byte.id_break(rfH_22);
                if (rXE2.id_class() == this.id_break && this.id_private < (double)((float)rfH_22.c_() + rXE2.id_class((rRq_1)this.id_byte, rfH_22))) {
                    this.id_finally();
                }
            }
        }
    }

    protected void id_private() {
    }
}

