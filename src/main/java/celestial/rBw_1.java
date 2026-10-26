/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBI;
import celestial.rEB;
import java.util.function.Predicate;

public class rBw_1<T extends iB_2>
extends rBI<T> {
    private int id_implements = 0;

    @Override
    public void id_byte() {
        this.id_implements = 200;
        super.id_byte();
    }

    public rBw_1(rEB rEB2, Class<T> clazz, boolean bl, Predicate<iB_2> predicate) {
        super(rEB2, clazz, 500, bl, false, predicate);
    }

    @Override
    public boolean id_class() {
        if (this.id_implements <= 0 && this.id_throws.Sa().nextBoolean()) {
            if (!((rEB)this.id_throws).sd()) {
                return false;
            }
            this.id_finally();
            return this.id_byte != null;
        }
        return false;
    }

    public int id_catch() {
        return this.id_implements;
    }

    public void id_private() {
        --this.id_implements;
    }
}

