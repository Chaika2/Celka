/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.rLc_1;
import celestial.rLd_1;
import celestial.rLx_1;
import celestial.rLz_1;
import celestial.ruu_3;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class rLu_1
implements rLd_1<rLc_1> {
    public rLc_1 id_class(rLz_1<rLc_1> rLz_12, ruu_3 ruu_32) {
        return new rLc_1(ruu_32.readFloat(), ruu_32.readFloat(), ruu_32.readFloat(), ruu_32.readFloat());
    }

    public rLc_1 id_class(rLz_1<rLc_1> rLz_12, StringReader stringReader) throws CommandSyntaxException {
        stringReader.expect(' ');
        float f = (float)stringReader.readDouble();
        stringReader.expect(' ');
        float f2 = (float)stringReader.readDouble();
        stringReader.expect(' ');
        float f3 = (float)stringReader.readDouble();
        stringReader.expect(' ');
        float f4 = (float)stringReader.readDouble();
        return new rLc_1(f, f2, f3, f4);
    }

    @Override
    public /* synthetic */ rLx_1 id_break(rLz_1 rLz_12, ruu_3 ruu_32) {
        return this.id_class((rLz_1<rLc_1>)rLz_12, ruu_32);
    }

    @Override
    public /* synthetic */ rLx_1 id_break(rLz_1 rLz_12, StringReader stringReader) throws CommandSyntaxException {
        return this.id_class((rLz_1<rLc_1>)rLz_12, stringReader);
    }
}

