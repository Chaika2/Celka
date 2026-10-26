/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.Rk_1;
import celestial.rLX;
import celestial.rLd_1;
import celestial.rLx_1;
import celestial.rLz_1;
import celestial.ruu_3;
import celestial.xd_3;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class rLJ
implements rLd_1<rLX> {
    public rLX id_class(rLz_1<rLX> rLz_12, ruu_3 ruu_32) {
        return new rLX(rLz_12, xd_3.id_char.id_class(ruu_32.id_case()));
    }

    public rLX id_class(rLz_1<rLX> rLz_12, StringReader stringReader) throws CommandSyntaxException {
        stringReader.expect(' ');
        return new rLX(rLz_12, new Rk_1(stringReader, false).id_class(false).id_break());
    }

    @Override
    public /* synthetic */ rLx_1 id_break(rLz_1 rLz_12, ruu_3 ruu_32) {
        return this.id_class((rLz_1<rLX>)rLz_12, ruu_32);
    }

    @Override
    public /* synthetic */ rLx_1 id_break(rLz_1 rLz_12, StringReader stringReader) throws CommandSyntaxException {
        return this.id_class((rLz_1<rLX>)rLz_12, stringReader);
    }
}

