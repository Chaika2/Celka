/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  org.apache.commons.lang3.StringUtils
 */
package celestial;

import celestial.rgn_3;
import celestial.rqX_2;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import org.apache.commons.lang3.StringUtils;

public class rqO_2
implements Comparable<rqO_2> {
    public static final Codec<rqO_2> id_class = Codec.STRING.comapFlatMap(rqO_2::id_class, rqO_2::toString).stable();
    private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType((Message)new rgn_3("argument.id.invalid"));
    protected final String id_break;
    protected final String id_byte;

    private static boolean id_byte(char c) {
        return c == '_' || c == '-' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9' || c == '.';
    }

    public String id_byte() {
        return this.id_break;
    }

    public static boolean id_byte(String string) {
        String[] stringArray = rqO_2.id_break(string, ':');
        return rqO_2.id_throws(StringUtils.isEmpty((CharSequence)stringArray[0]) ? "minecraft" : stringArray[0]) && rqO_2.id_protected(stringArray[1]);
    }

    protected rqO_2(String[] stringArray) {
        this.id_break = StringUtils.isEmpty((CharSequence)stringArray[0]) ? "minecraft" : stringArray[0];
        this.id_byte = stringArray[1];
        if (this.id_byte.equals("DUMMY")) {
            if (!rqO_2.id_throws(this.id_break)) {
                throw new rqX_2("Non [a-z0-9_.-] character in namespace of location: " + this.id_break + ":" + this.id_byte);
            }
            if (!rqO_2.id_protected(this.id_byte)) {
                throw new rqX_2("Non [a-z0-9/._-] character in path of location: " + this.id_break + ":" + this.id_byte);
            }
        }
    }

    public rqO_2(String string, String string2) {
        this(new String[]{string, string2});
    }

    public rqO_2(String string) {
        this(rqO_2.id_break(string, ':'));
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rqO_2)) {
            return false;
        }
        rqO_2 rqO_22 = (rqO_2)object;
        return this.id_break.equals(rqO_22.id_break) && this.id_byte.equals(rqO_22.id_byte);
    }

    public String toString() {
        return this.id_break + ":" + this.id_byte;
    }

    public int hashCode() {
        return 31 * this.id_break.hashCode() + this.id_byte.hashCode();
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.id_class((rqO_2)object);
    }

    public static rqO_2 id_class(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        while (stringReader.canRead() && rqO_2.id_class(stringReader.peek())) {
            stringReader.skip();
        }
        String string = stringReader.getString().substring(n, stringReader.getCursor());
        try {
            return new rqO_2(string);
        }
        catch (rqX_2 rqX_22) {
            stringReader.setCursor(n);
            throw id_protected.createWithContext((ImmutableStringReader)stringReader);
        }
    }

    public static boolean id_class(char c) {
        return c >= '0' && c <= '9' || c >= 'a' && c <= 'z' || c == '_' || c == ':' || c == '/' || c == '.' || c == '-';
    }

    public static rqO_2 id_class(String string, char c) {
        return new rqO_2(rqO_2.id_break(string, c));
    }

    private static DataResult<rqO_2> id_class(String string) {
        try {
            return DataResult.success((Object)new rqO_2(string));
        }
        catch (rqX_2 rqX_22) {
            return DataResult.error((String)("Not a valid resource location: " + string + " " + rqX_22.getMessage()));
        }
    }

    public int id_class(rqO_2 rqO_22) {
        int n = this.id_byte.compareTo(rqO_22.id_byte);
        if (n == 0) {
            n = this.id_break.compareTo(rqO_22.id_break);
        }
        return n;
    }

    public int id_break(rqO_2 rqO_22) {
        int n = this.id_break.compareTo(rqO_22.id_break);
        return n != 0 ? n : this.id_byte.compareTo(rqO_22.id_byte);
    }

    public static rqO_2 id_break(String string) {
        try {
            return new rqO_2(string);
        }
        catch (rqX_2 rqX_22) {
            return null;
        }
    }

    protected static String[] id_break(String string, char c) {
        String[] stringArray = new String[]{"minecraft", string};
        int n = string.indexOf(c);
        if (n >= 0) {
            stringArray[1] = string.substring(n + 1, string.length());
            if (n >= 1) {
                stringArray[0] = string.substring(0, n);
            }
        }
        return stringArray;
    }

    public String id_break() {
        return this.id_byte;
    }

    public static boolean id_break(char c) {
        return c == '_' || c == '-' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9' || c == '/' || c == '.';
    }

    private static boolean id_throws(String string) {
        for (int i = 0; i < string.length(); ++i) {
            if (rqO_2.id_byte(string.charAt(i))) continue;
            return false;
        }
        return true;
    }

    private static boolean id_protected(String string) {
        for (int i = 0; i < string.length(); ++i) {
            if (rqO_2.id_break(string.charAt(i))) continue;
            return false;
        }
        return true;
    }
}

