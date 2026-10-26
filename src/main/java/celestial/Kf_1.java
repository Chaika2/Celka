/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
package celestial;

import celestial.KI;
import celestial.Kj_1;
import celestial.Kp_1;
import celestial.YJ;
import celestial.gR_2;
import celestial.gy_3;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqO_2;
import celestial.rrEU;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class Kf_1
implements KI {
    public static final SuggestionProvider<gy_3> id_break = (commandContext, suggestionsBuilder) -> gR_2.id_class(Kf_1.id_class((CommandContext<gy_3>)commandContext).id_class(), suggestionsBuilder);
    public static final Function<String, Kp_1> id_class = string -> new Kj_1((String)string);
    private final rrEU id_byte;
    private final rqO_2 id_protected;

    public Kf_1(rrEU rrEU2, rqO_2 rqO_22) {
        this.id_byte = rrEU2;
        this.id_protected = rqO_22;
    }

    @Override
    public rgP_2 id_class(YJ yJ, double d, int n) {
        return new rgn_3("commands.data.storage.get", yJ, this.id_protected, String.format(Locale.ROOT, "%.2f", d), n);
    }

    public static rrEU id_class(CommandContext<gy_3> commandContext) {
        return ((gy_3)commandContext.getSource()).id_super().Y();
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        this.id_byte.id_class(this.id_protected, rcd_32);
    }

    @Override
    public rcd_3 id_class() {
        return this.id_byte.id_class(this.id_protected);
    }

    @Override
    public rgP_2 id_class(rcZ_2 rcZ_22) {
        return new rgn_3("commands.data.storage.query", this.id_protected, rcZ_22.id_volatile());
    }

    @Override
    public rgP_2 id_break() {
        return new rgn_3("commands.data.storage.modified", this.id_protected);
    }
}

