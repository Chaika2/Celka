/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHQ;
import celestial.rpF_2;

public class rHN
implements rpF_2 {
    public final /* synthetic */ rHQ id_class;

    public rHN(rHQ rHQ2) {
        this.id_class = rHQ2;
    }

    @Override
    public int id_class() {
        return 2;
    }

    @Override
    public void id_class(int n, int n2) {
        switch (n) {
            case 0: {
                this.id_class.id_case = n2;
                break;
            }
            case 1: {
                this.id_class.id_implements = n2;
            }
        }
    }

    @Override
    public int id_class(int n) {
        switch (n) {
            case 0: {
                return this.id_class.id_case;
            }
            case 1: {
                return this.id_class.id_implements;
            }
        }
        return 0;
    }
}

