/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.RY;
import celestial.Ro_1;
import celestial.rLd_1;
import celestial.rLk_1;
import celestial.rLx_1;
import celestial.rLz_1;
import celestial.rdn_3;
import celestial.ruu_3;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class rLW
implements rLd_1<rLk_1> {
    public rLk_1 id_class(rLz_1<rLk_1> rLz_12, ruu_3 ruu_32) {
        return new rLk_1(rLz_12, ruu_32.id_extends());
    }

    public rLk_1 id_class(rLz_1<rLk_1> rLz_12, StringReader stringReader) throws CommandSyntaxException {
        stringReader.expect(' ');
        Ro_1 ro_1 = new Ro_1(stringReader, false).id_catch();
        rdn_3 rdn_32 = new RY(ro_1.id_class(), ro_1.id_break()).id_class(1, false);
        return new rLk_1(rLz_12, rdn_32);
    }

    @Override
    public /* synthetic */ rLx_1 id_break(rLz_1 rLz_12, ruu_3 ruu_32) {
        return this.id_class((rLz_1<rLk_1>)rLz_12, ruu_32);
    }

    @Override
    public /* synthetic */ rLx_1 id_break(rLz_1 rLz_12, StringReader stringReader) throws CommandSyntaxException {
        return this.id_class((rLz_1<rLk_1>)rLz_12, stringReader);
    }
}

