/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
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
import celestial.RZ;
import celestial.Rn_1;
import celestial.Rt_1;
import celestial.Rw_1;
import celestial.gR_2;
import celestial.gy_3;
import celestial.rgn_3;
import com.mojang.authlib.GameProfile;
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
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

public class RT
implements ArgumentType<Rt_1> {
    private static final Collection<String> id_break = Arrays.asList("Player", "0123", "dd12be42-52a9-4a91-a8a1-11c01849e498", "@e");
    public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("argument.player.unknown"));

    public static Collection<GameProfile> id_class(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        return ((Rt_1)commandContext.getArgument(string, Rt_1.class)).getNames((gy_3)commandContext.getSource());
    }

    public Rt_1 id_class(StringReader stringReader) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '@') {
            RC rC = new RC(stringReader);
            Rn_1 rn_1 = rC.id_super();
            if (rn_1.id_break()) {
                throw RZ.id_byte.create();
            }
            return new Rw_1(rn_1);
        }
        int n = stringReader.getCursor();
        while (stringReader.canRead() && stringReader.peek() != ' ') {
            stringReader.skip();
        }
        String string = stringReader.getString().substring(n, stringReader.getCursor());
        return gy_32 -> {
            GameProfile gameProfile = gy_32.id_super().F().id_class(string);
            if (gameProfile == null) {
                throw id_class.create();
            }
            return Collections.singleton(gameProfile);
        };
    }

    public static RT id_class() {
        return new RT();
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_break;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder2) {
        if (commandContext.getSource() instanceof gR_2) {
            StringReader stringReader = new StringReader(suggestionsBuilder2.getInput());
            stringReader.setCursor(suggestionsBuilder2.getStart());
            RC rC = new RC(stringReader);
            try {
                rC.id_super();
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
            return rC.id_class(suggestionsBuilder2, suggestionsBuilder -> gR_2.id_break(((gR_2)commandContext.getSource()).id_class(), suggestionsBuilder));
        }
        return Suggestions.empty();
    }
}

