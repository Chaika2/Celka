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

import celestial.Yw_1;
import celestial.rgn_3;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Yr_1 {
    public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType((Message)new rgn_3("argument.pos.missing.double"));
    public static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("argument.pos.missing.int"));
    private final boolean id_byte;
    private final double id_protected;

    public Yr_1(boolean bl, double d) {
        this.id_byte = bl;
        this.id_protected = d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Yr_1)) {
            return false;
        }
        Yr_1 yr_1 = (Yr_1)object;
        if (this.id_byte != yr_1.id_byte) {
            return false;
        }
        return Double.compare(yr_1.id_protected, this.id_protected) == 0;
    }

    public int hashCode() {
        int n = this.id_byte ? 1 : 0;
        long l = Double.doubleToLongBits(this.id_protected);
        return 31 * n + (int)(l ^ l >>> 32);
    }

    public boolean id_class() {
        return this.id_byte;
    }

    public static Yr_1 id_class(StringReader stringReader, boolean bl) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '^') {
            throw Yw_1.id_break.createWithContext((ImmutableStringReader)stringReader);
        }
        if (!stringReader.canRead()) {
            throw id_class.createWithContext((ImmutableStringReader)stringReader);
        }
        boolean bl2 = Yr_1.id_break(stringReader);
        int n = stringReader.getCursor();
        double d = stringReader.canRead() && stringReader.peek() != ' ' ? stringReader.readDouble() : 0.0;
        String string = stringReader.getString().substring(n, stringReader.getCursor());
        if (bl2 && string.isEmpty()) {
            return new Yr_1(true, 0.0);
        }
        if (!string.contains(".") && !bl2 && bl) {
            d += 0.5;
        }
        return new Yr_1(bl2, d);
    }

    public double id_class(double d) {
        return this.id_byte ? this.id_protected + d : this.id_protected;
    }

    public static Yr_1 id_class(StringReader stringReader) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '^') {
            throw Yw_1.id_break.createWithContext((ImmutableStringReader)stringReader);
        }
        if (!stringReader.canRead()) {
            throw id_break.createWithContext((ImmutableStringReader)stringReader);
        }
        boolean bl = Yr_1.id_break(stringReader);
        double d = stringReader.canRead() && stringReader.peek() != ' ' ? (bl ? stringReader.readDouble() : (double)stringReader.readInt()) : 0.0;
        return new Yr_1(bl, d);
    }

    public static boolean id_break(StringReader stringReader) {
        boolean bl;
        if (stringReader.peek() == '~') {
            bl = true;
            stringReader.skip();
        } else {
            bl = false;
        }
        return bl;
    }
}

