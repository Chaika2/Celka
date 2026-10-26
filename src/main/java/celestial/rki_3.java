/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rki_3 {
    public boolean id_class;
    public boolean id_break;

    public rki_3(boolean bl, boolean bl2) {
        this.id_class = bl;
        this.id_break = bl2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rki_3)) {
            return false;
        }
        rki_3 rki_32 = (rki_3)object;
        return this.id_class == rki_32.id_class && this.id_break == rki_32.id_break;
    }

    public String toString() {
        return "[open=" + this.id_class + ", filtering=" + this.id_break + "]";
    }

    public int hashCode() {
        int n = this.id_class ? 1 : 0;
        return 31 * n + (this.id_break ? 1 : 0);
    }

    public rki_3 id_class() {
        return new rki_3(this.id_class, this.id_break);
    }
}

