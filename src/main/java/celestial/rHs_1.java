/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHS;
import celestial.rpF_2;

public class rHs_1
implements rpF_2 {
    public final /* synthetic */ rHS id_class;

    public rHs_1(rHS rHS2) {
        this.id_class = rHS2;
    }

    @Override
    public int id_class() {
        return 4;
    }

    @Override
    public void id_class(int n, int n2) {
        switch (n) {
            case 0: {
                this.id_class.id_catch = n2;
                break;
            }
            case 1: {
                this.id_class.id_private = n2;
                break;
            }
            case 2: {
                this.id_class.id_implements = n2;
                break;
            }
            case 3: {
                this.id_class.id_finally = n2;
            }
        }
    }

    @Override
    public int id_class(int n) {
        switch (n) {
            case 0: {
                return this.id_class.id_catch;
            }
            case 1: {
                return this.id_class.id_private;
            }
            case 2: {
                return this.id_class.id_implements;
            }
            case 3: {
                return this.id_class.id_finally;
            }
        }
        return 0;
    }
}

