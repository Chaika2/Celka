/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.OT;
import celestial.Ya_1;
import celestial.Ye_1;
import celestial.rhN_2;

public abstract sealed class YU
extends Enum<YU>
permits Ye_1, Ya_1 {
    public static final /* enum */ YU GRANT = new Ye_1("grant");
    public static final /* enum */ YU REVOKE = new Ya_1("revoke");
    private final String prefix;
    private static final /* synthetic */ YU[] $VALUES;

    public YU(String string2) {
        this.prefix = "commands.advancement." + string2;
    }

    static {
        $VALUES = YU.id_break();
    }

    public static YU[] values() {
        return (YU[])$VALUES.clone();
    }

    public static YU valueOf(String string) {
        return Enum.valueOf(YU.class, string);
    }

    protected abstract boolean id_class(rhN_2 var1, OT var2);

    protected String id_class() {
        return this.prefix;
    }

    protected abstract boolean id_class(rhN_2 var1, OT var2, String var3);

    public int id_class(rhN_2 rhN_22, Iterable<OT> iterable) {
        int n = 0;
        for (OT oT : iterable) {
            if (!this.id_class(rhN_22, oT)) continue;
            ++n;
        }
        return n;
    }

    private static /* synthetic */ YU[] id_break() {
        return new YU[]{GRANT, REVOKE};
    }
}

