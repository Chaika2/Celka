/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.XC;
import celestial.YE;
import celestial.YJ;
import celestial.an_3;
import celestial.rNJ;
import celestial.rNO;
import celestial.rNh_1;
import celestial.rNl_1;
import celestial.rQz_1;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.ryO_2;
import celestial.rzO_2;
import celestial.rzd_3;
import celestial.rzr_3;
import celestial.rzx_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class rNs_1
extends rzO_2 {
    public final rNJ id_break;
    public final List<rNh_1> id_byte;
    public static final Function<an_3, rcZ_2> id_protected = XC::id_break;
    public static final Function<ryO_2, rcZ_2> id_throws = ryO_22 -> ryO_22.id_class(new rcd_3());

    public rNs_1(rQz_1[] rQz_1Array, rNJ rNJ2, List<rNh_1> list) {
        super(rQz_1Array);
        this.id_break = rNJ2;
        this.id_byte = ImmutableList.copyOf(list);
    }

    public static rNO id_class(rNJ rNJ2) {
        return new rNO(rNJ2);
    }

    public static YJ id_class(String string) {
        try {
            return new YE().id_class(new StringReader(string));
        }
        catch (CommandSyntaxException commandSyntaxException) {
            throw new IllegalArgumentException("Failed to parse path " + string, commandSyntaxException);
        }
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return ImmutableSet.of(this.id_break.lootParam);
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        rcZ_2 rcZ_22 = this.id_break.field_216226_g.apply(rzr_32);
        if (rcZ_22 != null) {
            this.id_byte.forEach(rNh_12 -> rNh_12.id_class(rdn_32::id_int, rcZ_22));
        }
        return rdn_32;
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_else;
    }
}

