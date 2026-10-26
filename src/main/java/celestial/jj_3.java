/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.bridge.game.Language
 */
package celestial;

import com.mojang.bridge.game.Language;

public class jj_3
implements Language,
Comparable<jj_3> {
    private final String id_class;
    private final String id_break;
    private final String id_byte;
    private final boolean id_protected;

    public jj_3(String string, String string2, String string3, boolean bl) {
        this.id_class = string;
        this.id_break = string2;
        this.id_byte = string3;
        this.id_protected = bl;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return !(object instanceof jj_3) ? false : this.id_class.equals(((jj_3)object).id_class);
    }

    public String toString() {
        return String.format("%s (%s)", this.id_byte, this.id_break);
    }

    public int hashCode() {
        return this.id_class.hashCode();
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.id_class((jj_3)object);
    }

    public String getName() {
        return this.id_byte;
    }

    public int id_class(jj_3 jj_32) {
        return this.id_class.compareTo(jj_32.id_class);
    }

    public boolean id_class() {
        return this.id_protected;
    }

    public String getRegion() {
        return this.id_break;
    }

    public String getCode() {
        return this.id_class;
    }
}

