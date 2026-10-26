/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.Xu_1;
import celestial.rgn_3;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Function;

public class XL {
    public static final XL id_class = new XL(null, null);
    public static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("argument.range.ints"));
    private final Float id_byte;
    private final Float id_protected;

    public XL(Float f, Float f2) {
        this.id_byte = f;
        this.id_protected = f2;
    }

    private static Float id_class(Float f, Function<Float, Float> function) {
        return f == null ? null : function.apply(f);
    }

    public Float id_class() {
        return this.id_byte;
    }

    public static XL id_class(StringReader stringReader, boolean bl, Function<Float, Float> function) throws CommandSyntaxException {
        Float f;
        if (!stringReader.canRead()) {
            throw Xu_1.id_class.createWithContext((ImmutableStringReader)stringReader);
        }
        int n = stringReader.getCursor();
        Float f2 = XL.id_class(XL.id_class(stringReader, bl), function);
        if (stringReader.canRead(2) && stringReader.peek() == '.' && stringReader.peek(1) == '.') {
            stringReader.skip();
            stringReader.skip();
            f = XL.id_class(XL.id_class(stringReader, bl), function);
            if (f2 == null && f == null) {
                stringReader.setCursor(n);
                throw Xu_1.id_class.createWithContext((ImmutableStringReader)stringReader);
            }
        } else {
            if (!bl && stringReader.canRead() && stringReader.peek() == '.') {
                stringReader.setCursor(n);
                throw id_break.createWithContext((ImmutableStringReader)stringReader);
            }
            f = f2;
        }
        if (f2 == null && f == null) {
            stringReader.setCursor(n);
            throw Xu_1.id_class.createWithContext((ImmutableStringReader)stringReader);
        }
        return new XL(f2, f);
    }

    private static Float id_class(StringReader stringReader, boolean bl) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        while (stringReader.canRead() && XL.id_break(stringReader, bl)) {
            stringReader.skip();
        }
        String string = stringReader.getString().substring(n, stringReader.getCursor());
        if (string.isEmpty()) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(string));
        }
        catch (NumberFormatException numberFormatException) {
            if (bl) {
                throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidDouble().createWithContext((ImmutableStringReader)stringReader, (Object)string);
            }
            throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidInt().createWithContext((ImmutableStringReader)stringReader, (Object)string);
        }
    }

    public Float id_break() {
        return this.id_protected;
    }

    private static boolean id_break(StringReader stringReader, boolean bl) {
        char c = stringReader.peek();
        if ((c < '0' || c > '9') && c != '-') {
            if (bl && c == '.') {
                return !stringReader.canRead(2) || stringReader.peek(1) != '.';
            }
            return false;
        }
        return true;
    }
}

