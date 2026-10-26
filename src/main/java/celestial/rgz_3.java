/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.RC;
import celestial.RZ;
import celestial.Rn_1;
import celestial.an_3;
import celestial.gy_3;
import celestial.rAa_1;
import celestial.rVi_1;
import celestial.rgN_2;
import celestial.rgZ_2;
import celestial.rgr_3;
import celestial.rnG_2;
import celestial.rnP_2;
import celestial.rnW_2;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

public class rgz_3
extends rgZ_2
implements rgr_3 {
    private final String id_byte;
    private final Rn_1 id_protected;
    private final String id_throws;

    private rgz_3(String string, Rn_1 rn_1, String string2) {
        this.id_byte = string;
        this.id_protected = rn_1;
        this.id_throws = string2;
    }

    public rgz_3(String string, String string2) {
        this(string, rgz_3.id_class(string), string2);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rgz_3)) {
            return false;
        }
        rgz_3 rgz_32 = (rgz_3)object;
        return this.id_byte.equals(rgz_32.id_byte) && this.id_throws.equals(rgz_32.id_throws) && super.equals(object);
    }

    @Override
    public String toString() {
        return "ScoreComponent{name='" + this.id_byte + "'objective='" + this.id_throws + "', siblings=" + this.id_case + ", style=" + this.id_class() + "}";
    }

    @Override
    public rVi_1 id_class(gy_3 gy_32, an_3 an_32, int n) throws CommandSyntaxException {
        if (gy_32 == null) {
            return new rgN_2("");
        }
        String string = this.id_class(gy_32);
        String string2 = an_32 != null && string.equals("*") ? an_32.i() : string;
        return new rgN_2(this.id_class(string2, gy_32));
    }

    private String id_class(String string, gy_3 gy_32) {
        rnP_2 rnP_22;
        rnG_2 rnG_22;
        rnW_2 rnW_22 = gy_32.id_super();
        if (rnW_22 != null && (rnG_22 = rnW_22.R()).id_class(string, rnP_22 = rnG_22.id_byte(this.id_throws))) {
            rAa_1 rAa_12 = rnG_22.id_break(string, rnP_22);
            return Integer.toString(rAa_12.id_break());
        }
        return "";
    }

    private String id_class(gy_3 gy_32) throws CommandSyntaxException {
        List<? extends an_3> list;
        if (this.id_protected != null && !(list = this.id_protected.id_break(gy_32)).isEmpty()) {
            if (list.size() != 1) {
                throw RZ.id_class.create();
            }
            return list.get(0).i();
        }
        return this.id_byte;
    }

    private static Rn_1 id_class(String string) {
        try {
            return new RC(new StringReader(string)).id_super();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            return null;
        }
    }

    @Override
    public /* synthetic */ rVi_1 id_throws() {
        return this.id_extends();
    }

    @Override
    public /* synthetic */ rgZ_2 id_finally() {
        return this.id_extends();
    }

    public rgz_3 id_extends() {
        return new rgz_3(this.id_byte, this.id_protected, this.id_throws);
    }

    public String id_implements() {
        return this.id_throws;
    }

    public String id_private() {
        return this.id_byte;
    }
}

