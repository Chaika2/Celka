/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rAC;
import celestial.rAK;
import celestial.rAT;
import celestial.rAZ;
import celestial.rAl_1;
import celestial.rAq_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rgp_3;
import celestial.rgv_3;
import celestial.rgy_3;
import celestial.rqu_3;
import com.mojang.brigadier.arguments.StringArgumentType;
import java.io.IOException;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rAp_1
implements AutoCloseable {
    private static final Logger id_class = LogManager.getLogger();
    private static final rAK id_break = new rAK(new rgn_3("resourcePack.broken_assets").id_class(rgF_2.RED, rgF_2.ITALIC), rqu_3.id_class().getPackVersion());
    private final String id_byte;
    private final Supplier<rAC> id_protected;
    private final rgP_2 id_throws;
    private final rgP_2 id_case;
    private final rAl_1 id_catch;
    private final rAT id_private;
    private final boolean id_implements;
    private final boolean id_finally;
    private final rAZ id_extends;

    public rAl_1 id_byte() {
        return this.id_catch;
    }

    public rAp_1(String string, boolean bl, Supplier<rAC> supplier, rgP_2 rgP_22, rgP_2 rgP_23, rAl_1 rAl_12, rAT rAT2, boolean bl2, rAZ rAZ2) {
        this.id_byte = string;
        this.id_protected = supplier;
        this.id_throws = rgP_22;
        this.id_case = rgP_23;
        this.id_catch = rAl_12;
        this.id_implements = bl;
        this.id_private = rAT2;
        this.id_finally = bl2;
        this.id_extends = rAZ2;
    }

    public rAp_1(String string, boolean bl, Supplier<rAC> supplier, rAC rAC2, rAK rAK2, rAT rAT2, rAZ rAZ2) {
        this(string, bl, supplier, new rgN_2(rAC2.id_class()), rAK2.id_class(), rAl_1.id_class(rAK2.id_break()), rAT2, false, rAZ2);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rAp_1)) {
            return false;
        }
        rAp_1 rAp_12 = (rAp_1)object;
        return this.id_byte.equals(rAp_12.id_byte);
    }

    public int hashCode() {
        return this.id_byte.hashCode();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static rAp_1 id_class(String string, boolean bl, Supplier<rAC> supplier, rAq_1 rAq_12, rAT rAT2, rAZ rAZ2) {
        try (rAC rAC2 = supplier.get();){
            rAK rAK2 = rAC2.id_class(rAK.id_class);
            if (bl && rAK2 == null) {
                id_class.error("Broken/missing pack.mcmeta detected, fudging it into existance. Please check that your launcher has downloaded all assets for the game correctly!");
                rAK2 = id_break;
            }
            if (rAK2 != null) {
                rAp_1 rAp_12 = rAq_12.create(string, bl, supplier, rAC2, rAK2, rAT2, rAZ2);
                return rAp_12;
            }
            id_class.warn("Couldn't find pack meta for pack {}", (Object)string);
            return null;
        }
        catch (IOException iOException) {
            id_class.warn("Couldn't get pack info for: {}", (Object)iOException.toString());
        }
        return null;
    }

    public rgP_2 id_class(boolean bl) {
        return rgv_3.id_class(this.id_extends.decorate(new rgN_2(this.id_byte))).id_class(rgc_32 -> rgc_32.id_class(bl ? rgF_2.GREEN : rgF_2.RED).id_class(StringArgumentType.escapeIfRequired((String)this.id_byte)).id_class(new rgy_3(rgp_3.id_class, new rgN_2("").id_class(this.id_throws).id_break("\n").id_class(this.id_case))));
    }

    public rgP_2 id_class() {
        return this.id_throws;
    }

    @Override
    public void close() {
    }

    public rgP_2 id_break() {
        return this.id_case;
    }

    public String id_throws() {
        return this.id_byte;
    }

    public boolean id_catch() {
        return this.id_finally;
    }

    public boolean id_case() {
        return this.id_implements;
    }

    public rAZ id_implements() {
        return this.id_extends;
    }

    public rAC id_protected() {
        return this.id_protected.get();
    }

    public rAT id_private() {
        return this.id_private;
    }
}

