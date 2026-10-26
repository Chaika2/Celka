/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
package celestial;

import celestial.KI;
import celestial.Kp_1;
import celestial.Kw_1;
import celestial.XC;
import celestial.YJ;
import celestial.an_3;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;

public class Kt_1
implements KI {
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("commands.data.entity.invalid"));
    public static final Function<String, Kp_1> id_class = string -> new Kw_1((String)string);
    private final an_3 id_byte;

    public Kt_1(an_3 an_32) {
        this.id_byte = an_32;
    }

    @Override
    public rgP_2 id_class(rcZ_2 rcZ_22) {
        return new rgn_3("commands.data.entity.query", this.id_byte.L_(), rcZ_22.id_volatile());
    }

    @Override
    public rgP_2 id_class(YJ yJ, double d, int n) {
        return new rgn_3("commands.data.entity.get", yJ, this.id_byte.L_(), String.format(Locale.ROOT, "%.2f", d), n);
    }

    @Override
    public void id_class(rcd_3 rcd_32) throws CommandSyntaxException {
        if (this.id_byte instanceof rhd_3) {
            throw id_break.create();
        }
        UUID uUID = this.id_byte.ro();
        this.id_byte.id_throws(rcd_32);
        this.id_byte.a_(uUID);
    }

    @Override
    public rcd_3 id_class() {
        return XC.id_break(this.id_byte);
    }

    @Override
    public rgP_2 id_break() {
        return new rgn_3("commands.data.entity.modified", this.id_byte.L_());
    }
}

