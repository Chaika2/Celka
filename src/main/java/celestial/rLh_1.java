/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.rLO;
import celestial.rLd_1;
import celestial.rLx_1;
import celestial.rLz_1;
import celestial.ruu_3;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class rLh_1
implements rLd_1<rLO> {
    public rLO id_class(rLz_1<rLO> rLz_12, ruu_3 ruu_32) {
        return (rLO)rLz_12;
    }

    public rLO id_class(rLz_1<rLO> rLz_12, StringReader stringReader) throws CommandSyntaxException {
        return (rLO)rLz_12;
    }

    @Override
    public /* synthetic */ rLx_1 id_break(rLz_1 rLz_12, ruu_3 ruu_32) {
        return this.id_class((rLz_1<rLO>)rLz_12, ruu_32);
    }

    @Override
    public /* synthetic */ rLx_1 id_break(rLz_1 rLz_12, StringReader stringReader) throws CommandSyntaxException {
        return this.id_class((rLz_1<rLO>)rLz_12, stringReader);
    }
}

