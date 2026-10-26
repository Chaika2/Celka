/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.XZ;
import celestial.Xv_1;
import celestial.rgn_3;
import celestial.rpY_2;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract class Xu_1<T extends Number> {
    public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("argument.range.empty"));
    public static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("argument.range.swapped"));
    protected final T id_byte;
    protected final T id_protected;

    public boolean id_byte() {
        return this.id_byte == null && this.id_protected == null;
    }

    protected Xu_1(T t, T t2) {
        this.id_byte = t;
        this.id_protected = t2;
    }

    protected static <T extends Number, R extends Xu_1<T>> R id_class(StringReader stringReader, Xv_1<T, R> xv_1, Function<String, T> function, Supplier<DynamicCommandExceptionType> supplier, Function<T, T> function2) throws CommandSyntaxException {
        if (!stringReader.canRead()) {
            throw id_class.createWithContext((ImmutableStringReader)stringReader);
        }
        int n = stringReader.getCursor();
        try {
            Number number;
            Number number2 = (Number)Xu_1.id_class(Xu_1.id_class(stringReader, function, supplier), function2);
            if (stringReader.canRead(2) && stringReader.peek() == '.' && stringReader.peek(1) == '.') {
                stringReader.skip();
                stringReader.skip();
                number = (Number)Xu_1.id_class(Xu_1.id_class(stringReader, function, supplier), function2);
                if (number2 == null && number == null) {
                    throw id_class.createWithContext((ImmutableStringReader)stringReader);
                }
            } else {
                number = number2;
            }
            if (number2 == null && number == null) {
                throw id_class.createWithContext((ImmutableStringReader)stringReader);
            }
            return xv_1.create(stringReader, number2, number);
        }
        catch (CommandSyntaxException commandSyntaxException) {
            stringReader.setCursor(n);
            throw new CommandSyntaxException(commandSyntaxException.getType(), commandSyntaxException.getRawMessage(), commandSyntaxException.getInput(), n);
        }
    }

    protected static <T extends Number, R extends Xu_1<T>> R id_class(JsonElement jsonElement, R r, BiFunction<JsonElement, String, T> biFunction, XZ<T, R> xZ) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            if (rpY_2.id_break(jsonElement)) {
                Number number = (Number)biFunction.apply(jsonElement, "value");
                return xZ.create(number, number);
            }
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "value");
            Number number = jsonObject.has("min") ? (Number)((Number)biFunction.apply(jsonObject.get("min"), "min")) : (Number)null;
            Number number2 = jsonObject.has("max") ? (Number)((Number)biFunction.apply(jsonObject.get("max"), "max")) : (Number)null;
            return xZ.create(number, number2);
        }
        return r;
    }

    private static boolean id_class(StringReader stringReader) {
        char c = stringReader.peek();
        if ((c < '0' || c > '9') && c != '-') {
            if (c != '.') {
                return false;
            }
            return !stringReader.canRead(2) || stringReader.peek(1) != '.';
        }
        return true;
    }

    private static <T> T id_class(T t, Function<T, T> function) {
        return t == null ? null : (T)function.apply(t);
    }

    private static <T extends Number> T id_class(StringReader stringReader, Function<String, T> function, Supplier<DynamicCommandExceptionType> supplier) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        while (stringReader.canRead() && Xu_1.id_class(stringReader)) {
            stringReader.skip();
        }
        String string = stringReader.getString().substring(n, stringReader.getCursor());
        if (string.isEmpty()) {
            return (T)((Number)null);
        }
        try {
            return (T)((Number)function.apply(string));
        }
        catch (NumberFormatException numberFormatException) {
            throw supplier.get().createWithContext((ImmutableStringReader)stringReader, (Object)string);
        }
    }

    public T id_class() {
        return this.id_byte;
    }

    public T id_break() {
        return this.id_protected;
    }

    public JsonElement id_protected() {
        if (this.id_byte()) {
            return JsonNull.INSTANCE;
        }
        if (this.id_byte != null && this.id_byte.equals(this.id_protected)) {
            return new JsonPrimitive(this.id_byte);
        }
        JsonObject jsonObject = new JsonObject();
        if (this.id_byte != null) {
            jsonObject.addProperty("min", this.id_byte);
        }
        if (this.id_protected != null) {
            jsonObject.addProperty("max", this.id_protected);
        }
        return jsonObject;
    }
}

