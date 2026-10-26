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

public class Xm_1
extends Xu_1<Float> {
    public static final Xm_1 id_throws = new Xm_1((Float)null, (Float)null);
    private final Double id_case;
    private final Double id_catch;

    private Xm_1(Float f, Float f2) {
        super(f, f2);
        this.id_case = Xm_1.id_class(f);
        this.id_catch = Xm_1.id_class(f2);
    }

    public static Xm_1 id_class(JsonElement jsonElement) {
        return Xm_1.id_class(jsonElement, id_throws, rpY_2::id_protected, Xm_1::new);
    }

    public static Xm_1 id_class(StringReader stringReader) throws CommandSyntaxException {
        return Xm_1.id_class(stringReader, f -> f);
    }

    public static Xm_1 id_class(StringReader stringReader, Function<Float, Float> function) throws CommandSyntaxException {
        return Xm_1.id_class(stringReader, Xm_1::id_class, Float::parseFloat, () -> ((BuiltInExceptionProvider)CommandSyntaxException.BUILT_IN_EXCEPTIONS).readerInvalidFloat(), function);
    }

    private static Xm_1 id_class(StringReader stringReader, Float f, Float f2) throws CommandSyntaxException {
        if (f != null && f2 != null && f.floatValue() > f2.floatValue()) {
            throw id_break.createWithContext((ImmutableStringReader)stringReader);
        }
        return new Xm_1(f, f2);
    }

    private static Double id_class(Float f) {
        return f == null ? null : Double.valueOf(f.doubleValue() * f.doubleValue());
    }

    public static Xm_1 id_class(float f) {
        return new Xm_1(Float.valueOf(f), (Float)null);
    }

    public boolean id_class(double d) {
        if (this.id_case != null && this.id_case > d) {
            return false;
        }
        return this.id_catch == null || !(this.id_catch < d);
    }

    public boolean id_break(float f) {
        if (this.id_byte != null && ((Float)this.id_byte).floatValue() > f) {
            return false;
        }
        return this.id_protected == null || !(((Float)this.id_protected).floatValue() < f);
    }
}

