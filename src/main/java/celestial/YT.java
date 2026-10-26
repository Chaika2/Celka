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
 */
package celestial;

import celestial.gy_3;
import celestial.rgn_3;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YT
implements ArgumentType<UUID> {
    public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("argument.uuid.invalid"));
    private static final Collection<String> id_break = Arrays.asList("dd12be42-52a9-4a91-a8a1-11c01849e498");
    private static final Pattern id_byte = Pattern.compile("^([-A-Fa-f0-9]+)");

    public UUID id_class(StringReader stringReader) throws CommandSyntaxException {
        String string = stringReader.getRemaining();
        Matcher matcher = id_byte.matcher(string);
        if (matcher.find()) {
            String string2 = matcher.group(1);
            try {
                UUID uUID = UUID.fromString(string2);
                stringReader.setCursor(stringReader.getCursor() + string2.length());
                return uUID;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
        }
        throw id_class.create();
    }

    public static UUID id_class(CommandContext<gy_3> commandContext, String string) {
        return (UUID)commandContext.getArgument(string, UUID.class);
    }

    public static YT id_class() {
        return new YT();
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_break;
    }
}

