/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVi_1;
import celestial.rgP_2;
import celestial.rgZ_2;

public class rgN_2
extends rgZ_2 {
    public static final rgP_2 id_byte = new rgN_2("");
    private final String id_protected;

    public rgN_2(String string) {
        this.id_protected = string;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rgN_2)) {
            return false;
        }
        rgN_2 rgN_22 = (rgN_2)object;
        return this.id_protected.equals(rgN_22.id_private()) && super.equals(object);
    }

    @Override
    public String toString() {
        return "TextComponent{text='" + this.id_protected + "', siblings=" + this.id_case + ", style=" + this.id_class() + "}";
    }

    @Override
    public String id_break() {
        return this.id_protected;
    }

    @Override
    public /* synthetic */ rVi_1 id_throws() {
        return this.id_implements();
    }

    @Override
    public /* synthetic */ rgZ_2 id_finally() {
        return this.id_implements();
    }

    public rgN_2 id_implements() {
        return new rgN_2(this.id_protected);
    }

    public String id_private() {
        return this.id_protected;
    }
}

