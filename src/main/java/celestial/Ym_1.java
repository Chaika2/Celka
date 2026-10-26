/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 */
package celestial;

import celestial.OT;
import celestial.gy_3;
import celestial.iJ_2;
import celestial.rQz_1;
import celestial.rVL;
import celestial.rWB;
import celestial.rgn_3;
import celestial.rkw_3;
import celestial.rqO_2;
import celestial.rzZ_2;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class Ym_1
implements ArgumentType<rqO_2> {
    private static final Collection<String> id_class = Arrays.asList("foo", "foo:bar", "012");
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("advancement.advancementNotFound", object));
    private static final DynamicCommandExceptionType id_byte = new DynamicCommandExceptionType(object -> new rgn_3("recipe.notFound", object));
    private static final DynamicCommandExceptionType id_protected = new DynamicCommandExceptionType(object -> new rgn_3("predicate.unknown", object));
    private static final DynamicCommandExceptionType id_throws = new DynamicCommandExceptionType(object -> new rgn_3("attribute.unknown", object));

    public static rQz_1 id_byte(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        rqO_2 rqO_22 = (rqO_2)commandContext.getArgument(string, rqO_2.class);
        rzZ_2 rzZ_22 = ((gy_3)commandContext.getSource()).id_super().K();
        rQz_1 rQz_12 = rzZ_22.id_class(rqO_22);
        if (rQz_12 == null) {
            throw id_protected.create((Object)rqO_22);
        }
        return rQz_12;
    }

    public static OT id_class(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        rqO_2 rqO_22 = (rqO_2)commandContext.getArgument(string, rqO_2.class);
        OT oT = ((gy_3)commandContext.getSource()).id_super().t().id_class(rqO_22);
        if (oT == null) {
            throw id_break.create((Object)rqO_22);
        }
        return oT;
    }

    public rqO_2 id_class(StringReader stringReader) throws CommandSyntaxException {
        return rqO_2.id_class(stringReader);
    }

    public static Ym_1 id_class() {
        return new Ym_1();
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public static rkw_3<?> id_break(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        rWB rWB2 = ((gy_3)commandContext.getSource()).id_super().V();
        rqO_2 rqO_22 = (rqO_2)commandContext.getArgument(string, rqO_2.class);
        return rWB2.id_class(rqO_22).orElseThrow(() -> id_byte.create((Object)rqO_22));
    }

    public static rqO_2 id_throws(CommandContext<gy_3> commandContext, String string) {
        return (rqO_2)commandContext.getArgument(string, rqO_2.class);
    }

    public static iJ_2 id_protected(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        rqO_2 rqO_22 = (rqO_2)commandContext.getArgument(string, rqO_2.class);
        return rVL.O.id_break(rqO_22).orElseThrow(() -> id_throws.create((Object)rqO_22));
    }

    public Collection<String> getExamples() {
        return id_class;
    }
}

