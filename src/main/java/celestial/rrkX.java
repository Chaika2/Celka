/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXi_1;
import celestial.rrdD;
import celestial.rrdi_1;

public class rrkX
extends rrXi_1 {
    private rrdD id_throws = null;

    public rrkX(int n, int n2, int n3, int n4, int n5, rrdD rrdD2, String string) {
        super(n, n2, n3, n4, n5, string);
        this.id_throws = rrdD2;
    }

    @Override
    protected boolean id_break(int n) {
        if (this.id_throws instanceof rrdi_1) {
            return n == 0;
        }
        return true;
    }

    public boolean id_extends() {
        return true;
    }

    public void id_implements() {
    }

    public rrdD id_private() {
        return this.id_throws;
    }
}

