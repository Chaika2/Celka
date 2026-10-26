/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rDR;
import celestial.rDe_1;
import celestial.rKL;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUv_1;
import celestial.rVA;
import celestial.rVL;
import celestial.rfH_2;
import celestial.rrBo_1;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rDg_1<FC extends rUv_1, F extends rUO<FC>>
implements rKL<rDg_1<?, ?>> {
    public static final Codec<rDg_1<?, ?>> id_class = rVL.q.dispatch(rDg_12 -> rDg_12.id_throws, rUO::id_class);
    public static final Codec<Supplier<rDg_1<?, ?>>> id_break = rVA.id_class(rVL.v, id_class);
    public static final Codec<List<Supplier<rDg_1<?, ?>>>> id_byte = rVA.id_break(rVL.v, id_class);
    public static final Logger id_protected = LogManager.getLogger();
    public final F id_throws;
    public final FC id_case;

    public FC id_byte() {
        return this.id_case;
    }

    public rDg_1(F f, FC FC2) {
        this.id_throws = f;
        this.id_case = FC2;
    }

    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22) {
        return ((rUO)this.id_throws).id_class(rRI2, rKd_12, random, rfH_22, this.id_case);
    }

    @Override
    public /* synthetic */ Object id_class(rrBo_1 rrBo_12) {
        return this.id_break(rrBo_12);
    }

    public rDR id_class(float f) {
        return new rDR(this, f);
    }

    public rDg_1<?, ?> id_break(rrBo_1<?> rrBo_12) {
        return rUO.G.id_break(new rDe_1(() -> this, rrBo_12));
    }

    public F id_break() {
        return this.id_throws;
    }

    public Stream<rDg_1<?, ?>> id_protected() {
        return Stream.concat(Stream.of(this), this.id_case.ae_());
    }
}

