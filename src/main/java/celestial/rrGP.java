/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 */
package celestial;

import celestial.Ko_1;
import celestial.rRO;
import celestial.rRl_1;
import celestial.rRu_1;
import celestial.rTH;
import celestial.rVm_1;
import celestial.rYE;
import celestial.rcd_3;
import celestial.rrGB;
import celestial.rrSp_1;
import com.mojang.serialization.Lifecycle;
import java.util.Set;

public interface rrGP {
    public rcd_3 id_char();

    public rrSp_1 id_long();

    public Lifecycle id_float();

    public int id_interface();

    public rcd_3 id_class(rVm_1 var1, rcd_3 var2);

    public void id_class(rcd_3 var1);

    public void id_class(rRO var1);

    public void id_class(rRl_1 var1);

    default public void id_class(Ko_1 ko_1) {
        ko_1.id_class("Known server brands", () -> String.join((CharSequence)", ", this.id_while()));
        ko_1.id_class("Level was modded", () -> Boolean.toString(this.id_goto()));
        ko_1.id_class("Level storage version", () -> {
            int n = this.id_interface();
            return String.format("0x%05X - %s", n, this.id_implements(n));
        });
    }

    public void id_class(rTH var1);

    public void id_class(String var1, boolean var2);

    public void id_break(rcd_3 var1);

    public rRu_1 id_finally();

    public rRO id_extends();

    public boolean id_goto();

    public boolean id_continue();

    default public String id_implements(int n) {
        switch (n) {
            case 19132: {
                return "McRegion";
            }
            case 19133: {
                return "Anvil";
            }
        }
        return "Unknown?";
    }

    public boolean id_implements();

    public rrGB id_instanceof();

    public rRl_1 id_new();

    public rYE id_throw();

    public rcd_3 id_try();

    public Set<String> id_while();

    public rTH id_public();

    public void id_protected(boolean var1);

    public rcd_3 id_abstract();

    public String id_volatile();

    public boolean id_native();
}

