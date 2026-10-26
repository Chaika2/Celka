/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Function3
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.rVL;
import celestial.rYD;
import celestial.rYG;
import celestial.rYM;
import celestial.rYl_1;
import celestial.rqO_2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class rYa_1 {
    public static final Map<rqO_2, rYa_1> id_break = Maps.newHashMap();
    public static final rYa_1 id_class = new rYa_1(new rqO_2("nether"), (Function3<rYa_1, rVL<rYG>, Long, rYD>)((Function3)(rYa_12, rVL2, l) -> new rYD((long)l, (List<Pair<rYM, Supplier<rYG>>>)ImmutableList.of((Object)Pair.of((Object)new rYM(0.0f, 0.0f, 0.0f, 0.0f, 0.0f), () -> rVL2.id_byte(rYl_1.id_implements)), (Object)Pair.of((Object)new rYM(0.0f, -0.5f, 0.0f, 0.0f, 0.0f), () -> rVL2.id_byte(rYl_1.C)), (Object)Pair.of((Object)new rYM(0.4f, 0.0f, 0.0f, 0.0f, 0.0f), () -> rVL2.id_byte(rYl_1.l)), (Object)Pair.of((Object)new rYM(0.0f, 0.5f, 0.0f, 0.0f, 0.375f), () -> rVL2.id_byte(rYl_1.H)), (Object)Pair.of((Object)new rYM(-0.5f, 0.0f, 0.0f, 0.0f, 0.175f), () -> rVL2.id_byte(rYl_1.y))), Optional.of(Pair.of((Object)rVL2, (Object)rYa_12)))));
    public final rqO_2 id_byte;
    private final Function3<rYa_1, rVL<rYG>, Long, rYD> id_protected;

    public rYa_1(rqO_2 rqO_22, Function3<rYa_1, rVL<rYG>, Long, rYD> function3) {
        this.id_byte = rqO_22;
        this.id_protected = function3;
        id_break.put(rqO_22, this);
    }

    public rYD id_class(rVL<rYG> rVL2, long l) {
        return (rYD)this.id_protected.apply((Object)this, rVL2, (Object)l);
    }
}

