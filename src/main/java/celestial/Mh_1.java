/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MO;
import celestial.Mk_1;
import celestial.rcW_2;
import celestial.rw_3;
import java.io.IOException;
import java.io.InputStream;

public non-sealed class Mh_1
extends MO {
    public Mh_1(String string2) {
    }

    @Override
    public rw_3 id_class(InputStream inputStream) throws IOException {
        return new Mk_1(rcW_2.id_class(inputStream));
    }
}

