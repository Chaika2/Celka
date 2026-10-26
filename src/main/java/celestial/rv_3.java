/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rdn_3;
import celestial.rz_3;
import java.util.List;
import java.util.function.Predicate;

public interface rv_3
extends rz_3 {
    public void id_class(Predicate<rdn_3> var1);

    public void id_break(Predicate<an_3> var1);

    public Predicate<an_3> id_finally();

    public List<an_3> id_implements();

    default public void id_private() {
        this.id_protected();
    }
}

