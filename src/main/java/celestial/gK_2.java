/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.go_3;
import celestial.rcd_3;
import celestial.rqO_2;

public abstract class gK_2<T, C extends go_3<T>> {
    private final rqO_2 id_class;
    private final Class<?> id_break;

    public gK_2(rqO_2 rqO_22, Class<?> clazz) {
        this.id_class = rqO_22;
        this.id_break = clazz;
    }

    public abstract void id_class(rcd_3 var1, C var2);

    public abstract C id_class(rcd_3 var1);

    public rqO_2 id_class() {
        return this.id_class;
    }

    public Class<?> id_break() {
        return this.id_break;
    }
}

