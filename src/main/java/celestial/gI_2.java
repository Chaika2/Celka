/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.Oa_1;
import celestial.Oi_1;
import celestial.gj_3;
import celestial.gy_3;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayDeque;

public class gI_2
implements gj_3 {
    private final ParseResults<gy_3> id_class;

    public gI_2(ParseResults<gy_3> parseResults) {
        this.id_class = parseResults;
    }

    public String toString() {
        return this.id_class.getReader().getString();
    }

    @Override
    public void id_class(Oa_1 oa_1, gy_3 gy_32, ArrayDeque<Oi_1> arrayDeque, int n) throws CommandSyntaxException {
        oa_1.id_break().execute(new ParseResults(this.id_class.getContext().withSource((Object)gy_32), this.id_class.getReader(), this.id_class.getExceptions()));
    }
}

