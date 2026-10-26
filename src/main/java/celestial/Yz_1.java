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
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package celestial;

import celestial.YN;
import celestial.YQ;
import celestial.gR_2;
import celestial.gy_3;
import celestial.rfU_2;
import celestial.rgn_3;
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
import java.util.concurrent.CompletableFuture;

public class Yz_1
implements ArgumentType<YN> {
    private static final Collection<String> id_class = Arrays.asList("=", ">", "<");
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("arguments.operation.invalid"));
    private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType((Message)new rgn_3("arguments.operation.div0"));

    public static YN id_class(CommandContext<gy_3> commandContext, String string) throws CommandSyntaxException {
        return (YN)commandContext.getArgument(string, YN.class);
    }

    private static YN id_class(String string) throws CommandSyntaxException {
        return string.equals("><") ? (rAa_12, rAa_13) -> {
            int n = rAa_12.id_break();
            rAa_12.id_break(rAa_13.id_break());
            rAa_13.id_break(n);
        } : Yz_1.id_break(string);
    }

    public YN id_class(StringReader stringReader) throws CommandSyntaxException {
        if (!stringReader.canRead()) {
            throw id_break.create();
        }
        int n = stringReader.getCursor();
        while (stringReader.canRead() && stringReader.peek() != ' ') {
            stringReader.skip();
        }
        return Yz_1.id_class(stringReader.getString().substring(n, stringReader.getCursor()));
    }

    public static Yz_1 id_class() {
        return new Yz_1();
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    private static YQ id_break(String string) throws CommandSyntaxException {
        int n3 = -1;
        switch (string.hashCode()) {
            case 60: {
                if (!string.equals("<")) break;
                n3 = 6;
                break;
            }
            case 61: {
                if (!string.equals("=")) break;
                n3 = 0;
                break;
            }
            case 62: {
                if (!string.equals(">")) break;
                n3 = 7;
                break;
            }
            case 1208: {
                if (!string.equals("%=")) break;
                n3 = 5;
                break;
            }
            case 1363: {
                if (!string.equals("*=")) break;
                n3 = 3;
                break;
            }
            case 1394: {
                if (!string.equals("+=")) break;
                n3 = 1;
                break;
            }
            case 1456: {
                if (!string.equals("-=")) break;
                n3 = 2;
                break;
            }
            case 1518: {
                if (!string.equals("/=")) break;
                n3 = 4;
            }
        }
        switch (n3) {
            case 0: {
                return (n, n2) -> n2;
            }
            case 1: {
                return (n, n2) -> n + n2;
            }
            case 2: {
                return (n, n2) -> n - n2;
            }
            case 3: {
                return (n, n2) -> n * n2;
            }
            case 4: {
                return (n, n2) -> {
                    if (n2 == 0) {
                        throw id_byte.create();
                    }
                    return rfU_2.id_class(n, n2);
                };
            }
            case 5: {
                return (n, n2) -> {
                    if (n2 == 0) {
                        throw id_byte.create();
                    }
                    return rfU_2.id_break(n, n2);
                };
            }
            case 6: {
                return Math::min;
            }
            case 7: {
                return Math::max;
            }
        }
        throw id_break.create();
    }

    public Collection<String> getExamples() {
        return id_class;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return gR_2.id_class(new String[]{"=", "+=", "-=", "*=", "/=", "%=", "<", ">", "><"}, suggestionsBuilder);
    }
}

