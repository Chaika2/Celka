/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgL_2;
import celestial.rgS_2;
import celestial.rgX_2;
import celestial.rgc_3;
import celestial.rpl_3;
import java.util.Map;
import java.util.Optional;

public class rgJ_2
extends rgX_2 {
    public final /* synthetic */ Map id_class;

    public rgJ_2(Map map) {
        this.id_class = map;
    }

    @Override
    public rpl_3 id_class(rgS_2 rgS_22) {
        return rpv_32 -> rgS_22.id_class((rgc_32, string) -> rgL_2.id_byte(string, rgc_32, rpv_32) ? Optional.empty() : rgS_2.id_class, rgc_3.id_class).isPresent();
    }

    @Override
    public boolean id_class() {
        return false;
    }

    @Override
    public String id_class(String string) {
        return this.id_class.getOrDefault(string, string);
    }

    @Override
    public boolean id_break(String string) {
        return this.id_class.containsKey(string);
    }
}

