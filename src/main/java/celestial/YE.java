/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
package celestial;

import celestial.YG;
import celestial.YJ;
import celestial.YM;
import celestial.YO;
import celestial.YX;
import celestial.Yb_1;
import celestial.Yh_1;
import celestial.Yx_1;
import celestial.gy_3;
import celestial.rcH_2;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rgn_3;
import com.google.common.collect.Lists;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class YE
implements ArgumentType<YJ> {
    private static final Collection<String> id_byte = Arrays.asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
    public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("arguments.nbtpath.node.invalid"));
    public static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(object -> new rgn_3("arguments.nbtpath.nothing_found", object));

    public static YE id_class() {
        return new YE();
    }

    private static boolean id_class(char c) {
        return c != ' ' && c != '\"' && c != '[' && c != ']' && c != '.' && c != '{' && c != '}';
    }

    public static Predicate<rcZ_2> id_class(rcd_3 rcd_32) {
        return rcZ_22 -> rco_3.id_class(rcd_32, rcZ_22, true);
    }

    public static YJ id_class(CommandContext<gy_3> commandContext, String string) {
        return (YJ)commandContext.getArgument(string, YJ.class);
    }

    public YJ id_class(StringReader stringReader) throws CommandSyntaxException {
        ArrayList arrayList = Lists.newArrayList();
        int n = stringReader.getCursor();
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        boolean bl = true;
        while (stringReader.canRead() && stringReader.peek() != ' ') {
            char c;
            YO yO = YE.id_class(stringReader, bl);
            arrayList.add(yO);
            object2IntOpenHashMap.put((Object)yO, stringReader.getCursor() - n);
            bl = false;
            if (!stringReader.canRead() || (c = stringReader.peek()) == ' ' || c == '[' || c == '{') continue;
            stringReader.expect('.');
        }
        return new YJ(stringReader.getString().substring(n, stringReader.getCursor()), arrayList.toArray(new YO[0]), (Object2IntMap<YO>)object2IntOpenHashMap);
    }

    private static YO id_class(StringReader stringReader, String string) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '{') {
            rcd_3 rcd_32 = new rcH_2(stringReader).id_case();
            return new Yh_1(string, rcd_32);
        }
        return new Yx_1(string);
    }

    private static YO id_class(StringReader stringReader, boolean bl) throws CommandSyntaxException {
        switch (stringReader.peek()) {
            case '\"': {
                String string = stringReader.readString();
                return YE.id_class(stringReader, string);
            }
            case '[': {
                stringReader.skip();
                char c = stringReader.peek();
                if (c == '{') {
                    rcd_3 rcd_32 = new rcH_2(stringReader).id_case();
                    stringReader.expect(']');
                    return new YX(rcd_32);
                }
                if (c == ']') {
                    stringReader.skip();
                    return YM.id_class;
                }
                int n = stringReader.readInt();
                stringReader.expect(']');
                return new YG(n);
            }
            case '{': {
                if (!bl) {
                    throw id_class.createWithContext((ImmutableStringReader)stringReader);
                }
                rcd_3 rcd_33 = new rcH_2(stringReader).id_case();
                return new Yb_1(rcd_33);
            }
        }
        String string = YE.id_break(stringReader);
        return YE.id_class(stringReader, string);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    private static String id_break(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        while (stringReader.canRead() && YE.id_class(stringReader.peek())) {
            stringReader.skip();
        }
        if (stringReader.getCursor() == n) {
            throw id_class.createWithContext((ImmutableStringReader)stringReader);
        }
        return stringReader.getString().substring(n, stringReader.getCursor());
    }

    public Collection<String> getExamples() {
        return id_byte;
    }
}

