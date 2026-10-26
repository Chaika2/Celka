/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.RM;
import celestial.Rf_1;
import celestial.YJ;
import celestial.gy_3;
import celestial.rVi_1;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rgZ_2;
import celestial.rgx_3;
import celestial.rrEm_1;
import celestial.ryO_2;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;
import java.util.stream.Stream;

public class rgd_3
extends rgx_3 {
    private final String id_catch;
    private final Rf_1 id_private;

    private rgd_3(String string, YJ yJ, boolean bl, String string2, Rf_1 rf_1) {
        super(string, yJ, bl);
        this.id_catch = string2;
        this.id_private = rf_1;
    }

    public rgd_3(String string, boolean bl, String string2) {
        super(string, bl);
        this.id_catch = string2;
        this.id_private = this.id_class(this.id_catch);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rgd_3)) {
            return false;
        }
        rgd_3 rgd_32 = (rgd_3)object;
        return Objects.equals(this.id_catch, rgd_32.id_catch) && Objects.equals(this.id_protected, rgd_32.id_protected) && super.equals(object);
    }

    @Override
    public String toString() {
        return "BlockPosArgument{pos='" + this.id_catch + "'path='" + this.id_protected + "', siblings=" + this.id_case + ", style=" + this.id_class() + "}";
    }

    @Override
    protected Stream<rcd_3> id_class(gy_3 gy_32) {
        ryO_2 ryO_22;
        rfH_2 rfH_22;
        rrEm_1 rrEm_12;
        if (this.id_private != null && (rrEm_12 = gy_32.id_final()).id_synchronized(rfH_22 = this.id_private.id_byte(gy_32)) && (ryO_22 = rrEm_12.id_class(rfH_22)) != null) {
            return Stream.of(ryO_22.id_class(new rcd_3()));
        }
        return Stream.empty();
    }

    private Rf_1 id_class(String string) {
        try {
            return RM.id_class().id_class(new StringReader(string));
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

    public rgd_3 id_native() {
        return new rgd_3(this.id_protected, this.id_throws, this.id_byte, this.id_catch, this.id_private);
    }
}

