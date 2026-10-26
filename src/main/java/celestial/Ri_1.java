/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.Rf_1;
import celestial.Yr_1;
import celestial.Yw_1;
import celestial.gy_3;
import celestial.rjK_2;
import celestial.rjU_2;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class Ri_1
implements Rf_1 {
    private final Yr_1 id_class;
    private final Yr_1 id_break;
    private final Yr_1 id_byte;

    @Override
    public boolean id_byte() {
        return this.id_byte.id_class();
    }

    public Ri_1(Yr_1 yr_1, Yr_1 yr_12, Yr_1 yr_13) {
        this.id_class = yr_1;
        this.id_break = yr_12;
        this.id_byte = yr_13;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Ri_1)) {
            return false;
        }
        Ri_1 ri_1 = (Ri_1)object;
        if (!this.id_class.equals(ri_1.id_class)) {
            return false;
        }
        return !this.id_break.equals(ri_1.id_break) ? false : this.id_byte.equals(ri_1.id_byte);
    }

    public int hashCode() {
        int n = this.id_class.hashCode();
        n = 31 * n + this.id_break.hashCode();
        return 31 * n + this.id_byte.hashCode();
    }

    public static Ri_1 id_class(StringReader stringReader, boolean bl) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        Yr_1 yr_1 = Yr_1.id_class(stringReader, bl);
        if (stringReader.canRead() && stringReader.peek() == ' ') {
            stringReader.skip();
            Yr_1 yr_12 = Yr_1.id_class(stringReader, false);
            if (stringReader.canRead() && stringReader.peek() == ' ') {
                stringReader.skip();
                Yr_1 yr_13 = Yr_1.id_class(stringReader, bl);
                return new Ri_1(yr_1, yr_12, yr_13);
            }
            stringReader.setCursor(n);
            throw Yw_1.id_class.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.setCursor(n);
        throw Yw_1.id_class.createWithContext((ImmutableStringReader)stringReader);
    }

    @Override
    public boolean id_class() {
        return this.id_class.id_class();
    }

    @Override
    public rjU_2 id_class(gy_3 gy_32) {
        rjU_2 rjU_22 = gy_32.id_volatile();
        return new rjU_2(this.id_class.id_class(rjU_22.id_break), this.id_break.id_class(rjU_22.id_byte), this.id_byte.id_class(rjU_22.id_protected));
    }

    public static Ri_1 id_class(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        Yr_1 yr_1 = Yr_1.id_class(stringReader);
        if (stringReader.canRead() && stringReader.peek() == ' ') {
            stringReader.skip();
            Yr_1 yr_12 = Yr_1.id_class(stringReader);
            if (stringReader.canRead() && stringReader.peek() == ' ') {
                stringReader.skip();
                Yr_1 yr_13 = Yr_1.id_class(stringReader);
                return new Ri_1(yr_1, yr_12, yr_13);
            }
            stringReader.setCursor(n);
            throw Yw_1.id_class.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.setCursor(n);
        throw Yw_1.id_class.createWithContext((ImmutableStringReader)stringReader);
    }

    @Override
    public rjK_2 id_break(gy_3 gy_32) {
        rjK_2 rjK_22 = gy_32.id_continue();
        return new rjK_2((float)this.id_class.id_class(rjK_22.id_byte), (float)this.id_break.id_class(rjK_22.id_protected));
    }

    @Override
    public boolean id_break() {
        return this.id_break.id_class();
    }

    public static Ri_1 id_protected() {
        return new Ri_1(new Yr_1(true, 0.0), new Yr_1(true, 0.0), new Yr_1(true, 0.0));
    }
}

