/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHO;
import celestial.rLR;
import celestial.rpF_2;
import celestial.rqn_3;

public class rHh_1
implements rpF_2 {
    public final /* synthetic */ rHO id_class;

    public rHh_1(rHO rHO2) {
        this.id_class = rHO2;
    }

    @Override
    public int id_class() {
        return 3;
    }

    @Override
    public void id_class(int n, int n2) {
        switch (n) {
            case 0: {
                this.id_class.id_throws = n2;
                break;
            }
            case 1: {
                if (!this.id_class.id_extends.id_continue && !this.id_class.id_byte.isEmpty()) {
                    this.id_class.id_class(rqn_3.C);
                }
                this.id_class.id_catch = rHO.id_class(n2);
                break;
            }
            case 2: {
                this.id_class.id_private = rHO.id_class(n2);
            }
        }
    }

    @Override
    public int id_class(int n) {
        switch (n) {
            case 0: {
                return this.id_class.id_throws;
            }
            case 1: {
                return rLR.id_class(this.id_class.id_catch);
            }
            case 2: {
                return rLR.id_class(this.id_class.id_private);
            }
        }
        return 0;
    }
}

