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
import celestial.rfU_2;
import celestial.rjK_2;
import celestial.rjU_2;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;

public class Ra_1
implements Rf_1 {
    private final double id_class;
    private final double id_break;
    private final double id_byte;

    @Override
    public boolean id_byte() {
        return true;
    }

    public Ra_1(double d, double d2, double d3) {
        this.id_class = d;
        this.id_break = d2;
        this.id_byte = d3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Ra_1)) {
            return false;
        }
        Ra_1 ra_1 = (Ra_1)object;
        return this.id_class == ra_1.id_class && this.id_break == ra_1.id_break && this.id_byte == ra_1.id_byte;
    }

    public int hashCode() {
        return Objects.hash(this.id_class, this.id_break, this.id_byte);
    }

    public static Ra_1 id_class(StringReader stringReader) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        double d = Ra_1.id_class(stringReader, n);
        if (stringReader.canRead() && stringReader.peek() == ' ') {
            stringReader.skip();
            double d2 = Ra_1.id_class(stringReader, n);
            if (stringReader.canRead() && stringReader.peek() == ' ') {
                stringReader.skip();
                double d3 = Ra_1.id_class(stringReader, n);
                return new Ra_1(d, d2, d3);
            }
            stringReader.setCursor(n);
            throw Yw_1.id_class.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.setCursor(n);
        throw Yw_1.id_class.createWithContext((ImmutableStringReader)stringReader);
    }

    private static double id_class(StringReader stringReader, int n) throws CommandSyntaxException {
        if (!stringReader.canRead()) {
            throw Yr_1.id_class.createWithContext((ImmutableStringReader)stringReader);
        }
        if (stringReader.peek() != '^') {
            stringReader.setCursor(n);
            throw Yw_1.id_break.createWithContext((ImmutableStringReader)stringReader);
        }
        stringReader.skip();
        return stringReader.canRead() && stringReader.peek() != ' ' ? stringReader.readDouble() : 0.0;
    }

    @Override
    public boolean id_class() {
        return true;
    }

    @Override
    public rjU_2 id_class(gy_3 gy_32) {
        rjK_2 rjK_22 = gy_32.id_continue();
        rjU_2 rjU_22 = gy_32.id_this().id_class(gy_32);
        float f = rfU_2.id_break((rjK_22.id_protected + 90.0f) * ((float)Math.PI / 180));
        float f2 = rfU_2.id_class((rjK_22.id_protected + 90.0f) * ((float)Math.PI / 180));
        float f3 = rfU_2.id_break(-rjK_22.id_byte * ((float)Math.PI / 180));
        float f4 = rfU_2.id_class(-rjK_22.id_byte * ((float)Math.PI / 180));
        float f5 = rfU_2.id_break((-rjK_22.id_byte + 90.0f) * ((float)Math.PI / 180));
        float f6 = rfU_2.id_class((-rjK_22.id_byte + 90.0f) * ((float)Math.PI / 180));
        rjU_2 rjU_23 = new rjU_2(f * f3, f4, f2 * f3);
        rjU_2 rjU_24 = new rjU_2(f * f5, f6, f2 * f5);
        rjU_2 rjU_25 = rjU_23.id_byte(rjU_24).id_class(-1.0);
        double d = rjU_23.id_break * this.id_byte + rjU_24.id_break * this.id_break + rjU_25.id_break * this.id_class;
        double d2 = rjU_23.id_byte * this.id_byte + rjU_24.id_byte * this.id_break + rjU_25.id_byte * this.id_class;
        double d3 = rjU_23.id_protected * this.id_byte + rjU_24.id_protected * this.id_break + rjU_25.id_protected * this.id_class;
        return new rjU_2(rjU_22.id_break + d, rjU_22.id_byte + d2, rjU_22.id_protected + d3);
    }

    @Override
    public boolean id_break() {
        return true;
    }

    @Override
    public rjK_2 id_break(gy_3 gy_32) {
        return rjK_2.id_class;
    }
}

