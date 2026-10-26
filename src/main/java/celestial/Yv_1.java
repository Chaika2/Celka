/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
package celestial;

import celestial.RC;
import celestial.RZ;
import celestial.Rn_1;
import celestial.YF;
import celestial.YL;
import celestial.gR_2;
import celestial.gy_3;
import celestial.rgn_3;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Supplier;

public class Yv_1
implements ArgumentType<YF> {
    public static final SuggestionProvider<gy_3> id_class = (commandContext, suggestionsBuilder2) -> {
        StringReader stringReader = new StringReader(suggestionsBuilder2.getInput());
        stringReader.setCursor(suggestionsBuilder2.getStart());
        RC rC = new RC(stringReader);
        try {
            rC.id_super();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
        return rC.id_class(suggestionsBuilder2, suggestionsBuilder -> gR_2.id_break(((gy_3)commandContext.getSource()).id_class(), suggestionsBuilder));
    };
    private static final Collection<String> id_break = Arrays.asList("Player", "0123", "*", "@e");
    private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType((Message)new rgn_3("argument.scoreHolder.empty"));
    public final boolean id_protected;

    public static Collection<String> id_byte(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        return Yv_1.id_class(commandContext, string, ((gy_3)commandContext.getSource()).id_super().R()::id_byte);
    }

    public Yv_1(boolean bl) {
        this.id_protected = bl;
    }

    public static String id_class(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        return Yv_1.id_break(commandContext, string).iterator().next();
    }

    public static Yv_1 id_class() {
        return new Yv_1(false);
    }

    public static Collection<String> id_class(CommandContext<gy_3> commandContext, String string, Supplier<Collection<String>> supplier) throws CommandSyntaxException {
        Collection<String> collection = ((YF)commandContext.getArgument(string, YF.class)).getNames((gy_3)commandContext.getSource(), supplier);
        if (collection.isEmpty()) {
            throw RZ.id_protected.create();
        }
        return collection;
    }

    public YF id_class(StringReader stringReader) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '@') {
            RC rC = new RC(stringReader);
            Rn_1 rn_1 = rC.id_super();
            if (!this.id_protected && rn_1.id_class() > 1) {
                throw RZ.id_class.create();
            }
            return new YL(rn_1);
        }
        int n = stringReader.getCursor();
        while (stringReader.canRead() && stringReader.peek() != ' ') {
            stringReader.skip();
        }
        String string = stringReader.getString().substring(n, stringReader.getCursor());
        if (string.equals("*")) {
            return (gy_32, supplier) -> {
                Collection collection = (Collection)supplier.get();
                if (collection.isEmpty()) {
                    throw id_byte.create();
                }
                return collection;
            };
        }
        Set<String> set = Collections.singleton(string);
        return (gy_32, supplier) -> set;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public static Collection<String> id_break(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        return Yv_1.id_class(commandContext, string, Collections::emptyList);
    }

    public static Yv_1 id_break() {
        return new Yv_1(true);
    }

    public Collection<String> getExamples() {
        return id_break;
    }
}

