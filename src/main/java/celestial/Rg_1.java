/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.Rj_1;
import celestial.XF;
import celestial.gy_3;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class Rg_1
implements Rj_1<XF> {
    private static final Collection<String> id_class = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

    public XF id_class(StringReader stringReader) throws CommandSyntaxException {
        return XF.id_class(stringReader);
    }

    public static XF id_class(CommandContext<gy_3> commandContext, String string) {
        return (XF)commandContext.getArgument(string, XF.class);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_class;
    }
}

