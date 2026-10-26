/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgH_2;

public class rgl_3 {
    private final rgH_2 id_class;
    private final String id_break;
    private Runnable id_byte = () -> {};

    public Runnable id_byte() {
        return this.id_byte;
    }

    public rgl_3(rgH_2 rgH_22, String string) {
        this.id_class = rgH_22;
        this.id_break = string;
    }

    public rgl_3(Runnable runnable) {
        this(rgH_2.RUNNABLE, "");
        this.id_byte = runnable;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rgl_3 rgl_32 = (rgl_3)object;
            if (this.id_class != rgl_32.id_class) {
                return false;
            }
            return !(this.id_break != null ? !this.id_break.equals(rgl_32.id_break) : rgl_32.id_break != null);
        }
        return false;
    }

    public String toString() {
        return "ClickEvent{action=" + this.id_class + ", value='" + this.id_break + "'}";
    }

    public int hashCode() {
        int n = this.id_class.hashCode();
        return 31 * n + (this.id_break != null ? this.id_break.hashCode() : 0);
    }

    public rgH_2 id_class() {
        return this.id_class;
    }

    public String id_break() {
        return this.id_break;
    }
}

