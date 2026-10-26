/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package celestial;

import celestial.RC;
import celestial.Rn_1;
import celestial.an_3;
import celestial.gR_2;
import celestial.gy_3;
import celestial.rgn_3;
import celestial.rhN_2;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RZ
implements ArgumentType<Rn_1> {
    private static final Collection<String> id_catch = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
    public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("argument.entity.toomany"));
    public static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("argument.player.toomany"));
    public static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType((Message)new rgn_3("argument.player.entities"));
    public static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType((Message)new rgn_3("argument.entity.notfound.entity"));
    public static final SimpleCommandExceptionType id_throws = new SimpleCommandExceptionType((Message)new rgn_3("argument.entity.notfound.player"));
    public static final SimpleCommandExceptionType id_case = new SimpleCommandExceptionType((Message)new rgn_3("argument.entity.selector.not_allowed"));
    public final boolean id_private;
    public final boolean id_implements;

    public static Collection<? extends an_3> id_byte(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        return ((Rn_1)commandContext.getArgument(string, Rn_1.class)).id_break((gy_3)commandContext.getSource());
    }

    public static RZ id_byte() {
        return new RZ(true, true);
    }

    protected RZ(boolean bl, boolean bl2) {
        this.id_private = bl;
        this.id_implements = bl2;
    }

    public static RZ id_class() {
        return new RZ(true, false);
    }

    public Rn_1 id_class(StringReader stringReader) throws CommandSyntaxException {
        boolean bl = false;
        RC rC = new RC(stringReader);
        Rn_1 rn_1 = rC.id_super();
        if (rn_1.id_class() > 1 && this.id_private) {
            if (this.id_implements) {
                stringReader.setCursor(0);
                throw id_break.createWithContext((ImmutableStringReader)stringReader);
            }
            stringReader.setCursor(0);
            throw id_class.createWithContext((ImmutableStringReader)stringReader);
        }
        if (rn_1.id_break() && this.id_implements && !rn_1.id_byte()) {
            stringReader.setCursor(0);
            throw id_byte.createWithContext((ImmutableStringReader)stringReader);
        }
        return rn_1;
    }

    public static an_3 id_class(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        return ((Rn_1)commandContext.getArgument(string, Rn_1.class)).id_class((gy_3)commandContext.getSource());
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public static Collection<? extends an_3> id_break(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        Collection<? extends an_3> collection = RZ.id_byte(commandContext, string);
        if (collection.isEmpty()) {
            throw id_protected.create();
        }
        return collection;
    }

    public static RZ id_break() {
        return new RZ(false, false);
    }

    public static rhN_2 id_throws(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        return ((Rn_1)commandContext.getArgument(string, Rn_1.class)).id_byte((gy_3)commandContext.getSource());
    }

    public static Collection<rhN_2> id_case(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        List<rhN_2> list = ((Rn_1)commandContext.getArgument(string, Rn_1.class)).id_protected((gy_3)commandContext.getSource());
        if (list.isEmpty()) {
            throw id_throws.create();
        }
        return list;
    }

    public static RZ id_protected() {
        return new RZ(false, true);
    }

    public static Collection<rhN_2> id_protected(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        return ((Rn_1)commandContext.getArgument(string, Rn_1.class)).id_protected((gy_3)commandContext.getSource());
    }

    public Collection<String> getExamples() {
        return id_catch;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder2) {
        if (commandContext.getSource() instanceof gR_2) {
            StringReader stringReader = new StringReader(suggestionsBuilder2.getInput());
            stringReader.setCursor(suggestionsBuilder2.getStart());
            gR_2 gR_22 = (gR_2)commandContext.getSource();
            RC rC = new RC(stringReader, gR_22.id_class(2));
            try {
                rC.id_super();
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
            return rC.id_class(suggestionsBuilder2, (SuggestionsBuilder suggestionsBuilder) -> {
                Collection<String> collection = gR_22.id_class();
                Collection<String> collection2 = this.id_implements ? collection : Iterables.concat(collection, gR_22.id_break());
                gR_2.id_break(collection2, suggestionsBuilder);
            });
        }
        return Suggestions.empty();
    }
}

