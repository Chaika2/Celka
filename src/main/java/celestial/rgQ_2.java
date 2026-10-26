/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.RC;
import celestial.Rn_1;
import celestial.an_3;
import celestial.gy_3;
import celestial.rVi_1;
import celestial.rgN_2;
import celestial.rgZ_2;
import celestial.rgr_3;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rgQ_2
extends rgZ_2
implements rgr_3 {
    private static final Logger id_byte = LogManager.getLogger();
    private final String id_protected;
    private final Rn_1 id_throws;

    public rgQ_2(String string) {
        this.id_protected = string;
        Rn_1 rn_1 = null;
        try {
            RC rC = new RC(new StringReader(string));
            rn_1 = rC.id_super();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            id_byte.warn("Invalid selector component: {}", (Object)string, (Object)commandSyntaxException.getMessage());
        }
        this.id_throws = rn_1;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rgQ_2)) {
            return false;
        }
        rgQ_2 rgQ_22 = (rgQ_2)object;
        return this.id_protected.equals(rgQ_22.id_protected) && super.equals(object);
    }

    @Override
    public String toString() {
        return "SelectorComponent{pattern='" + this.id_protected + "', siblings=" + this.id_case + ", style=" + this.id_class() + "}";
    }

    @Override
    public rVi_1 id_class(gy_3 gy_32, an_3 an_32, int n) throws CommandSyntaxException {
        return gy_32 != null && this.id_throws != null ? Rn_1.id_class(this.id_throws.id_break(gy_32)) : new rgN_2("");
    }

    @Override
    public String id_break() {
        return this.id_protected;
    }

    @Override
    public /* synthetic */ rVi_1 id_throws() {
        return this.id_implements();
    }

    @Override
    public /* synthetic */ rgZ_2 id_finally() {
        return this.id_implements();
    }

    public rgQ_2 id_implements() {
        return new rgQ_2(this.id_protected);
    }

    public String id_private() {
        return this.id_protected;
    }
}

