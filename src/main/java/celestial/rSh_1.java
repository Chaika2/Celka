/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBI;
import celestial.rEB;
import java.util.function.Predicate;

public class rSh_1<T extends iB_2>
extends rBI<T> {
    private boolean id_implements = true;

    public rSh_1(rEB rEB2, Class<T> clazz, int n, boolean bl, boolean bl2, Predicate<iB_2> predicate) {
        super(rEB2, clazz, n, bl, bl2, predicate);
    }

    public void id_class(boolean bl) {
        this.id_implements = bl;
    }

    @Override
    public boolean id_class() {
        return this.id_implements && super.id_class();
    }
}

