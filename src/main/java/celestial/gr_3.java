/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Locale;

public class gr_3 {
    private static gr_3 id_class;
    private final int id_break;
    private final int id_byte;
    private final int id_protected;
    private final int id_throws;
    private final int id_case;
    private final boolean id_catch;
    private final boolean id_private;

    public gr_3(int n, int n2, int n3, int n4, int n5) {
        this(true, false, n, n2, n3, n4, n5);
    }

    public gr_3(int n, int n2, int n3) {
        this(false, false, n, n2, n, n2, n3);
    }

    public gr_3() {
        this(false, true, 1, 0, 1, 0, 32774);
    }

    private gr_3(boolean bl, boolean bl2, int n, int n2, int n3, int n4, int n5) {
        this.id_catch = bl;
        this.id_break = n;
        this.id_protected = n2;
        this.id_byte = n3;
        this.id_throws = n4;
        this.id_private = bl2;
        this.id_case = n5;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof gr_3)) {
            return false;
        }
        gr_3 gr_32 = (gr_3)object;
        if (this.id_case != gr_32.id_case) {
            return false;
        }
        if (this.id_throws != gr_32.id_throws) {
            return false;
        }
        if (this.id_protected != gr_32.id_protected) {
            return false;
        }
        if (this.id_private != gr_32.id_private) {
            return false;
        }
        if (this.id_catch != gr_32.id_catch) {
            return false;
        }
        if (this.id_byte != gr_32.id_byte) {
            return false;
        }
        return this.id_break == gr_32.id_break;
    }

    public int hashCode() {
        int n = this.id_break;
        n = 31 * n + this.id_byte;
        n = 31 * n + this.id_protected;
        n = 31 * n + this.id_throws;
        n = 31 * n + this.id_case;
        n = 31 * n + (this.id_catch ? 1 : 0);
        return 31 * n + (this.id_private ? 1 : 0);
    }

    public static int id_class(String string) {
        String string2 = string.trim().toLowerCase(Locale.ROOT);
        if ("add".equals(string2)) {
            return 32774;
        }
        if ("subtract".equals(string2)) {
            return 32778;
        }
        if ("reversesubtract".equals(string2)) {
            return 32779;
        }
        if ("reverse_subtract".equals(string2)) {
            return 32779;
        }
        if ("min".equals(string2)) {
            return 32775;
        }
        return "max".equals(string2) ? 32776 : 32774;
    }

    public void id_class() {
        if (!this.equals(id_class)) {
            if (id_class == null || this.id_private != id_class.id_break()) {
                id_class = this;
                if (this.id_private) {
                    RenderSystem.disableBlend();
                    return;
                }
                RenderSystem.enableBlend();
            }
            RenderSystem.blendEquation(this.id_case);
            if (this.id_catch) {
                RenderSystem.blendFuncSeparate(this.id_break, this.id_protected, this.id_byte, this.id_throws);
            } else {
                RenderSystem.blendFunc(this.id_break, this.id_protected);
            }
        }
    }

    public static int id_break(String string) {
        String string2 = string.trim().toLowerCase(Locale.ROOT);
        string2 = string2.replaceAll("_", "");
        string2 = string2.replaceAll("one", "1");
        string2 = string2.replaceAll("zero", "0");
        if ("0".equals(string2 = string2.replaceAll("minus", "-"))) {
            return 0;
        }
        if ("1".equals(string2)) {
            return 1;
        }
        if ("srccolor".equals(string2)) {
            return 768;
        }
        if ("1-srccolor".equals(string2)) {
            return 769;
        }
        if ("dstcolor".equals(string2)) {
            return 774;
        }
        if ("1-dstcolor".equals(string2)) {
            return 775;
        }
        if ("srcalpha".equals(string2)) {
            return 770;
        }
        if ("1-srcalpha".equals(string2)) {
            return 771;
        }
        if ("dstalpha".equals(string2)) {
            return 772;
        }
        return "1-dstalpha".equals(string2) ? 773 : -1;
    }

    public boolean id_break() {
        return this.id_private;
    }
}

