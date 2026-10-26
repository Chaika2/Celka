/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.Lifecycle
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rDM;
import celestial.rDO;
import celestial.rDg_1;
import celestial.rKW;
import celestial.rUx_1;
import celestial.rVC;
import celestial.rVF;
import celestial.rVL;
import celestial.rYC;
import celestial.rYG;
import celestial.reP_2;
import celestial.reZ_2;
import celestial.reu_3;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rrPn_1;
import celestial.rrPu_1;
import celestial.rrSR;
import celestial.rrSY;
import celestial.rrrF;
import com.google.common.collect.Maps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rVy_1 {
    protected static final Logger id_class = LogManager.getLogger();
    private static final Map<rqO_2, Supplier<?>> id_extends = Maps.newLinkedHashMap();
    private static final rVF<rVF<?>> id_native = new rVC(rqM_2.id_class(new rqO_2("root")), Lifecycle.experimental());
    public static final rVL<? extends rVL<?>> id_break = id_native;
    public static final rVL<rrSR<?>> id_byte = rVy_1.id_class(rVL.m, () -> rrSY.id_int);
    public static final rVL<rDM<?>> id_protected = rVy_1.id_class(rVL.Z, () -> rDO.id_class);
    public static final rVL<rDg_1<?, ?>> id_throws = rVy_1.id_class(rVL.v, () -> rUx_1.rf);
    public static final rVL<reP_2<?, ?>> id_case = rVy_1.id_class(rVL.F, () -> rrrF.id_break);
    public static final rVL<rrPn_1> id_catch = rVy_1.id_class(rVL.L, () -> rrPu_1.id_break);
    public static final rVL<reu_3> id_private = rVy_1.id_class(rVL.A, reZ_2::id_class);
    public static final rVL<rYG> id_implements = rVy_1.id_class(rVL.n, () -> rYC.id_class);
    public static final rVL<rKW> id_finally = rVy_1.id_class(rVL.u, rKW::id_implements);

    static {
        id_extends.forEach((rqO_22, supplier) -> {
            if (supplier.get() == null) {
                id_class.error("Unable to bootstrap registry '{}'", rqO_22);
            }
        });
        rVL.id_class(id_native);
    }

    public static void id_class() {
    }

    private static <T> rVL<T> id_class(rqM_2<? extends rVL<T>> rqM_22, Lifecycle lifecycle, Supplier<T> supplier) {
        return rVy_1.id_class(rqM_22, new rVC(rqM_22, lifecycle), supplier, lifecycle);
    }

    private static <T> rVL<T> id_class(rqM_2<? extends rVL<T>> rqM_22, Supplier<T> supplier) {
        return rVy_1.id_class(rqM_22, Lifecycle.stable(), supplier);
    }

    private static <T, R extends rVF<T>> R id_class(rqM_2<? extends rVL<T>> rqM_22, R r, Supplier<T> supplier, Lifecycle lifecycle) {
        rqO_2 rqO_22 = rqM_22.id_class();
        id_extends.put(rqO_22, supplier);
        rVF<rVF<?>> rVF2 = id_native;
        return rVF2.id_class(rqM_22, r, lifecycle);
    }

    public static <T> T id_class(rVL<? super T> rVL2, String string, T t) {
        return rVy_1.id_class(rVL2, new rqO_2(string), t);
    }

    public static <V, T extends V> T id_class(rVL<V> rVL2, rqO_2 rqO_22, T t) {
        return ((rVF)rVL2).id_class(rqM_2.id_class(rVL2.id_break(), rqO_22), t, Lifecycle.stable());
    }

    public static <V, T extends V> T id_class(rVL<V> rVL2, int n, rqM_2<V> rqM_22, T t) {
        return ((rVF)rVL2).id_class(n, rqM_22, t, Lifecycle.stable());
    }
}

