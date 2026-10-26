/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.BuiltInExceptionProvider
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.Xu_1;
import celestial.rpY_2;
import com.google.gson.JsonElement;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.BuiltInExceptionProvider;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

public class XF
extends Xu_1<Integer> {
    public static final XF id_throws = new XF((Integer)null, (Integer)null);
    private final Long id_case;
    private final Long id_catch;

    public boolean id_byte(int n) {
        if (this.id_byte != null && (Integer)this.id_byte > n) {
            return false;
        }
        return this.id_protected == null || (Integer)this.id_protected >= n;
    }

    private XF(Integer n, Integer n2) {
        super(n, n2);
        this.id_case = XF.id_class(n);
        this.id_catch = XF.id_class(n2);
    }

    public static XF id_class(JsonElement jsonElement) {
        return XF.id_class(jsonElement, id_throws, rpY_2::id_case, XF::new);
    }

    public static XF id_class(StringReader stringReader) throws CommandSyntaxException {
        return XF.id_class(stringReader, n -> n);
    }

    public static XF id_class(StringReader stringReader, Function<Integer, Integer> function) throws CommandSyntaxException {
        return XF.id_class(stringReader, XF::id_class, Integer::parseInt, () -> ((BuiltInExceptionProvider)CommandSyntaxException.BUILT_IN_EXCEPTIONS).readerInvalidInt(), function);
    }

    private static XF id_class(StringReader stringReader, Integer n, Integer n2) throws CommandSyntaxException {
        if (n != null && n2 != null && n > n2) {
            throw id_break.createWithContext((ImmutableStringReader)stringReader);
        }
        return new XF(n, n2);
    }

    public static XF id_class(int n) {
        return new XF(n, n);
    }

    private static Long id_class(Integer n) {
        return n == null ? null : Long.valueOf(n.longValue() * n.longValue());
    }

    public static XF id_break(int n) {
        return new XF(n, (Integer)null);
    }
}

