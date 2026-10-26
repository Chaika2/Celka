/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.YJ;
import celestial.rNG;
import celestial.rNM;
import celestial.rNb_1;
import celestial.rcZ_2;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

public abstract sealed class rNE
extends Enum<rNE>
permits rNG, rNb_1, rNM {
    public static final /* enum */ rNE REPLACE = new rNG("replace");
    public static final /* enum */ rNE APPEND = new rNb_1("append");
    public static final /* enum */ rNE MERGE = new rNM("merge");
    public final String op;
    private static final /* synthetic */ rNE[] $VALUES;

    public rNE(String string2) {
        this.op = string2;
    }

    static {
        $VALUES = rNE.id_class();
    }

    public static rNE[] values() {
        return (rNE[])$VALUES.clone();
    }

    public static rNE valueOf(String string) {
        return Enum.valueOf(rNE.class, string);
    }

    private static /* synthetic */ rNE[] id_class() {
        return new rNE[]{REPLACE, APPEND, MERGE};
    }

    public abstract void id_class(rcZ_2 var1, YJ var2, List<rcZ_2> var3) throws CommandSyntaxException;

    public static rNE id_class(String string) {
        for (rNE rNE2 : rNE.values()) {
            if (!rNE2.op.equals(string)) continue;
            return rNE2;
        }
        throw new IllegalArgumentException("Invalid merge strategy" + string);
    }
}

