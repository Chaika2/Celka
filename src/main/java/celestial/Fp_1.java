/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Fy_1;
import celestial.LF;
import celestial.LL;
import celestial.Ml_1;
import celestial.rJp_1;
import celestial.rdI_2;
import celestial.rdn_3;
import celestial.rgN_2;

public class Fp_1
extends LF {
    public final int id_class;
    public final /* synthetic */ Fy_1 id_throws;

    public Fp_1(Fy_1 fy_1, int n, int n2, int n3, LL lL) {
        this.id_throws = fy_1;
        super(n, n2, 89, 20, rgN_2.id_byte, lL);
        this.id_class = n3;
        this.id_new = false;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2) {
        if (this.id_package && ((rJp_1)this.id_throws.id_instanceof).id_throws().size() > this.id_class + this.id_throws.id_finally) {
            if (n < this.id_volatile + 20) {
                rdn_3 rdn_32 = ((rdI_2)((rJp_1)this.id_throws.id_instanceof).id_throws().get(this.id_class + this.id_throws.id_finally)).id_break();
                Fy_1.id_class(this.id_throws, ml_1, rdn_32, n, n2);
            } else if (n < this.id_volatile + 50 && n > this.id_volatile + 30) {
                rdn_3 rdn_33 = ((rdI_2)((rJp_1)this.id_throws.id_instanceof).id_throws().get(this.id_class + this.id_throws.id_finally)).id_byte();
                if (!rdn_33.id_class()) {
                    Fy_1.id_break(this.id_throws, ml_1, rdn_33, n, n2);
                }
            } else if (n > this.id_volatile + 65) {
                rdn_3 rdn_34 = ((rdI_2)((rJp_1)this.id_throws.id_instanceof).id_throws().get(this.id_class + this.id_throws.id_finally)).id_protected();
                Fy_1.id_byte(this.id_throws, ml_1, rdn_34, n, n2);
            }
        }
    }

    public int id_private() {
        return this.id_class;
    }
}

