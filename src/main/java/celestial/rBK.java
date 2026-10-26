/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBW;
import celestial.rBk_1;
import java.util.EnumSet;

public class rBK
extends rBk_1 {
    private final rBk_1 id_class;
    private final int id_break;
    private boolean id_byte;

    @Override
    public void id_byte() {
        if (!this.id_byte) {
            this.id_byte = true;
            this.id_class.id_byte();
        }
    }

    public rBK(int n, rBk_1 rBk_12) {
        this.id_break = n;
        this.id_class = rBk_12;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object != null && this.getClass() == object.getClass() ? this.id_class.equals(((rBK)object).id_class) : false;
    }

    public int hashCode() {
        return this.id_class.hashCode();
    }

    @Override
    public void id_class(EnumSet<rBW> enumSet) {
        this.id_class.id_class(enumSet);
    }

    public boolean id_class(rBK rBK2) {
        return this.J_() && rBK2.id_private() < this.id_private();
    }

    @Override
    public boolean id_class() {
        return this.id_class.id_class();
    }

    @Override
    public boolean id_break() {
        return this.id_class.id_break();
    }

    @Override
    public void id_throws() {
        this.id_class.id_throws();
    }

    public rBk_1 id_finally() {
        return this.id_class;
    }

    public boolean id_catch() {
        return this.id_byte;
    }

    @Override
    public EnumSet<rBW> id_implements() {
        return this.id_class.id_implements();
    }

    @Override
    public void id_protected() {
        if (this.id_byte) {
            this.id_byte = false;
            this.id_class.id_protected();
        }
    }

    public int id_private() {
        return this.id_break;
    }

    @Override
    public boolean J_() {
        return this.id_class.J_();
    }
}

