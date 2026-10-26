/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrkI;
import celestial.rrkR;

public class rrkg_1
extends rrkR {
    public rrkg_1() {
        super(new rrkI(), new rrkI(), new rrkI(), new rrkI());
    }

    @Override
    public int id_class(int n, int n2, int n3, int n4) {
        return n == n2 && n2 == n3 && n3 == n4 ? n : super.id_class(n, n2, n3, n4);
    }
}

