/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.KH;
import celestial.KI;
import celestial.Kp_1;
import celestial.YJ;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.ryO_2;
import celestial.xc_3;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

public class Kl_1
implements KI {
    public static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("commands.data.block.invalid"));
    public static final Function<String, Kp_1> id_class = string -> new KH((String)string);
    private final ryO_2 id_byte;
    private final rfH_2 id_protected;

    public Kl_1(ryO_2 ryO_22, rfH_2 rfH_22) {
        this.id_byte = ryO_22;
        this.id_protected = rfH_22;
    }

    @Override
    public rgP_2 id_class(rcZ_2 rcZ_22) {
        return new rgn_3("commands.data.block.query", this.id_protected.b_(), this.id_protected.c_(), this.id_protected.d_(), rcZ_22.id_volatile());
    }

    @Override
    public rgP_2 id_class(YJ yJ, double d, int n) {
        return new rgn_3("commands.data.block.get", yJ, this.id_protected.b_(), this.id_protected.c_(), this.id_protected.d_(), String.format(Locale.ROOT, "%.2f", d), n);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        rcd_32.id_break("x", this.id_protected.b_());
        rcd_32.id_break("y", this.id_protected.c_());
        rcd_32.id_break("z", this.id_protected.d_());
        xc_3 xc_32 = this.id_byte.id_while().id_byte(this.id_protected);
        this.id_byte.id_class(xc_32, rcd_32);
        this.id_byte.id_break();
        this.id_byte.id_while().id_class(this.id_protected, xc_32, xc_32, 3);
    }

    @Override
    public rcd_3 id_class() {
        return this.id_byte.id_class(new rcd_3());
    }

    @Override
    public rgP_2 id_break() {
        return new rgn_3("commands.data.block.modified", this.id_protected.b_(), this.id_protected.c_(), this.id_protected.d_());
    }
}

