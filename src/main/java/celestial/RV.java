/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.Rj_1;
import celestial.Xm_1;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class RV
implements Rj_1<Xm_1> {
    private static final Collection<String> id_class = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

    public Xm_1 id_class(StringReader stringReader) throws CommandSyntaxException {
        return Xm_1.id_class(stringReader);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.id_class(stringReader);
    }

    public Collection<String> getExamples() {
        return id_class;
    }
}

