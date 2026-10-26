/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.an_3;
import celestial.gy_3;
import celestial.rNl_1;
import celestial.rQz_1;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rgv_3;
import celestial.rzB_2;
import celestial.rzO_2;
import celestial.rzd_3;
import celestial.rzr_3;
import celestial.rzx_3;
import com.google.common.collect.ImmutableSet;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Set;
import java.util.function.UnaryOperator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rNi_1
extends rzO_2 {
    private static final Logger id_break = LogManager.getLogger();
    public final rgP_2 id_byte;
    public final rzB_2 id_protected;

    public rNi_1(rQz_1[] rQz_1Array, rgP_2 rgP_22, rzB_2 rzB_22) {
        super(rQz_1Array);
        this.id_byte = rgP_22;
        this.id_protected = rzB_22;
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return this.id_protected != null ? ImmutableSet.of(this.id_protected.id_class()) : ImmutableSet.of();
    }

    public static UnaryOperator<rgP_2> id_class(rzr_3 rzr_32, rzB_2 rzB_22) {
        an_3 an_32;
        if (rzB_22 != null && (an_32 = rzr_32.id_break(rzB_22.id_class())) != null) {
            gy_3 gy_32 = an_32.PL().id_break(2);
            return rgP_22 -> {
                try {
                    return rgv_3.id_class(gy_32, rgP_22, an_32, 0);
                }
                catch (CommandSyntaxException commandSyntaxException) {
                    id_break.warn("Failed to resolve text component", (Throwable)commandSyntaxException);
                    return rgP_22;
                }
            };
        }
        return rgP_22 -> rgP_22;
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        if (this.id_byte != null) {
            rdn_32.id_class((rgP_2)rNi_1.id_class(rzr_32, this.id_protected).apply(this.id_byte));
        }
        return rdn_32;
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_finally;
    }
}

