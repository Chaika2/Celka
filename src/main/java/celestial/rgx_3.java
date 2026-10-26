/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.YE;
import celestial.YJ;
import celestial.an_3;
import celestial.gy_3;
import celestial.rVi_1;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rgB_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgZ_2;
import celestial.rgr_3;
import celestial.rgv_3;
import com.google.common.base.Joiner;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rgx_3
extends rgZ_2
implements rgr_3 {
    private static final Logger id_catch = LogManager.getLogger();
    protected final boolean id_byte;
    protected final String id_protected;
    protected final YJ id_throws;

    protected rgx_3(String string, YJ yJ, boolean bl) {
        this.id_protected = string;
        this.id_throws = yJ;
        this.id_byte = bl;
    }

    public rgx_3(String string, boolean bl) {
        this(string, rgx_3.id_class(string), bl);
    }

    @Override
    public rVi_1 id_class(gy_3 gy_32, an_3 an_32, int n) throws CommandSyntaxException {
        if (gy_32 != null && this.id_throws != null) {
            Stream<String> stream = this.id_class(gy_32).flatMap(rcd_32 -> {
                try {
                    return this.id_throws.id_class((rcZ_2)rcd_32).stream();
                }
                catch (CommandSyntaxException commandSyntaxException) {
                    return Stream.empty();
                }
            }).map(rcZ_2::id_native);
            return this.id_byte ? (rVi_1)stream.flatMap(string -> {
                try {
                    rVi_1 rVi_12 = rgB_2.id_class(string);
                    return Stream.of(rgv_3.id_class(gy_32, rVi_12, an_32, n));
                }
                catch (Exception exception) {
                    id_catch.warn("Failed to parse component: " + string, (Throwable)exception);
                    return Stream.of(new rVi_1[0]);
                }
            }).reduce((rVi_12, rVi_13) -> rVi_12.id_break(", ").id_class((rgP_2)rVi_13)).orElse(new rgN_2("")) : new rgN_2(Joiner.on((String)", ").join(stream.iterator()));
        }
        return new rgN_2("");
    }

    protected abstract Stream<rcd_3> id_class(gy_3 var1) throws CommandSyntaxException;

    private static YJ id_class(String string) {
        try {
            return new YE().id_class(new StringReader(string));
        }
        catch (CommandSyntaxException commandSyntaxException) {
            return null;
        }
    }

    public boolean id_implements() {
        return this.id_byte;
    }

    public String id_private() {
        return this.id_protected;
    }
}

