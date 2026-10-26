/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;
import celestial.rGW;
import celestial.rLA;
import celestial.rLl_1;
import celestial.rYB;

public class rGk_1
extends rLA {
    public rGk_1(is_3 is_32, rYB rYB2) {
        super(is_32, rYB2);
    }

    @Override
    protected rLl_1 id_class(int n) {
        this.id_int = new rGW();
        return new rLl_1(this.id_int, n);
    }
}

