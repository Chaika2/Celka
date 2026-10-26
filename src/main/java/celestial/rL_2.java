/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ra_3;
import celestial.re_3;
import celestial.rz_3;
import celestial.xd_3;
import java.util.stream.Stream;

public interface rL_2
extends rz_3 {
    default public void id_class(int n, xd_3 ... xd_3Array) {
        this.id_class(n, new ra_3((re_3[])Stream.of(xd_3Array).map(re_3::new).toArray(re_3[]::new)));
    }

    default public void id_class(int n, re_3 ... re_3Array) {
        this.id_class(n, new ra_3(re_3Array));
    }

    public void id_class(int var1, ra_3 var2);

    default public void id_class(xd_3 ... xd_3Array) {
        this.id_class(0, xd_3Array);
    }

    default public void id_class(re_3 ... re_3Array) {
        this.id_class(0, re_3Array);
    }

    default public void id_class(ra_3 ra_32) {
        this.id_class(0, ra_32);
    }

    public void id_class(int var1, String ... var2);

    default public void id_class(String ... stringArray) {
        this.id_class(0, stringArray);
    }

    default public void id_private() {
        this.id_protected();
    }
}

