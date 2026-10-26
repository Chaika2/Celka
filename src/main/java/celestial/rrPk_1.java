/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.Rk_1;
import celestial.rRR;
import celestial.rfH_2;
import celestial.rrPA;
import celestial.rrPN;
import celestial.rrPp_1;
import celestial.rrPx_1;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class rrPk_1
extends rrPA {
    public static final Codec<rrPk_1> id_class;
    public static final rrPk_1 id_break;

    private rrPk_1() {
    }

    static {
        id_break = new rrPk_1();
        id_class = Codec.unit(() -> id_break);
    }

    @Override
    public rrPp_1 id_class(rRR rRR2, rfH_2 rfH_22, rfH_2 rfH_23, rrPp_1 rrPp_12, rrPp_1 rrPp_13, rrPN rrPN2) {
        xc_3 xc_32 = rrPp_13.id_break;
        if (xc_32.id_class(xu_3.JE)) {
            String string = rrPp_13.id_byte.id_native("final_state");
            Rk_1 rk_1 = new Rk_1(new StringReader(string), false);
            try {
                rk_1.id_class(true);
            }
            catch (CommandSyntaxException commandSyntaxException) {
                throw new RuntimeException(commandSyntaxException);
            }
            return rk_1.id_break().id_class(xu_3.bo) ? null : new rrPp_1(rrPp_13.id_class, rk_1.id_break(), null);
        }
        return rrPp_13;
    }

    @Override
    protected rrPx_1<?> id_class() {
        return rrPx_1.id_protected;
    }
}

