/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.RC;
import celestial.Rn_1;
import celestial.XC;
import celestial.YJ;
import celestial.an_3;
import celestial.gy_3;
import celestial.rVi_1;
import celestial.rcd_3;
import celestial.rgZ_2;
import celestial.rgx_3;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class rgk_3
extends rgx_3 {
    private final String id_catch;
    private final Rn_1 id_private;

    private rgk_3(String string, YJ yJ, boolean bl, String string2, Rn_1 rn_1) {
        super(string, yJ, bl);
        this.id_catch = string2;
        this.id_private = rn_1;
    }

    public rgk_3(String string, boolean bl, String string2) {
        super(string, bl);
        this.id_catch = string2;
        this.id_private = rgk_3.id_class(string2);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rgk_3)) {
            return false;
        }
        rgk_3 rgk_32 = (rgk_3)object;
        return Objects.equals(this.id_catch, rgk_32.id_catch) && Objects.equals(this.id_protected, rgk_32.id_protected) && super.equals(object);
    }

    @Override
    public String toString() {
        return "EntityNbtComponent{selector='" + this.id_catch + "'path='" + this.id_protected + "', siblings=" + this.id_case + ", style=" + this.id_class() + "}";
    }

    @Override
    protected Stream<rcd_3> id_class(gy_3 gy_32) throws CommandSyntaxException {
        if (this.id_private != null) {
            List<? extends an_3> list = this.id_private.id_break(gy_32);
            return list.stream().map(XC::id_break);
        }
        return Stream.empty();
    }

    private static Rn_1 id_class(String string) {
        try {
            RC rC = new RC(new StringReader(string));
            return rC.id_super();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            return null;
        }
    }

    @Override
    public /* synthetic */ rVi_1 id_throws() {
        return this.id_native();
    }

    @Override
    public /* synthetic */ rgZ_2 id_finally() {
        return this.id_native();
    }

    public String id_extends() {
        return this.id_catch;
    }

    public rgk_3 id_native() {
        return new rgk_3(this.id_protected, this.id_throws, this.id_byte, this.id_catch, this.id_private);
    }
}

