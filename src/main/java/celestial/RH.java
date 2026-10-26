/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.Rp_1;
import celestial.Rq_1;
import celestial.Ry_1;
import celestial.gt_3;
import celestial.gy_3;
import celestial.rgn_3;
import celestial.rlb_3;
import celestial.rqO_2;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Collection;

public class RH
implements ArgumentType<Rq_1> {
    private static final Collection<String> id_class = Arrays.asList("foo", "foo:bar", "#foo");
    private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("arguments.function.tag.unknown", object));
    private static final DynamicCommandExceptionType id_byte = new DynamicCommandExceptionType(object -> new rgn_3("arguments.function.unknown", object));

    public static Collection<gt_3> id_class(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        return ((Rq_1)commandContext.getArgument(string, Rq_1.class)).id_class(commandContext);
    }

    public static RH id_class() {
        return new RH();
    }

    public Rq_1 id_class(StringReader stringReader) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '#') {
            stringReader.skip();
            rqO_2 rqO_22 = rqO_2.id_class(stringReader);
            return new Ry_1(this, rqO_22);
        }
        rqO_2 rqO_23 = rqO_2.id_class(stringReader);
        return new Rp_1(this, rqO_23);
    }

    public static gt_3 id_class(CommandContext<gy_3> commandContext, rqO_2 rqO_22) throws CommandSyntaxException {
        return ((gy_3)commandContext.getSource()).id_super().w().id_class(rqO_22).orElseThrow(() -> id_byte.create((Object)rqO_22.toString()));
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public static Pair<rqO_2, Either<gt_3, rlb_3<gt_3>>> id_break(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        return ((Rq_1)commandContext.getArgument(string, Rq_1.class)).id_break(commandContext);
    }

    public static rlb_3<gt_3> id_break(CommandContext<gy_3> commandContext, rqO_2 rqO_22) throws CommandSyntaxException {
        rlb_3<gt_3> rlb_32 = ((gy_3)commandContext.getSource()).id_super().w().id_break(rqO_22);
        if (rlb_32 == null) {
            throw id_break.create((Object)rqO_22.toString());
        }
        return rlb_32;
    }

    public Collection<String> getExamples() {
        return id_class;
    }
}

