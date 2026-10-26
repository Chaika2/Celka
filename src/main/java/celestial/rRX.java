/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rKT;
import celestial.rKW;
import celestial.rKd_1;
import celestial.rRJ;
import celestial.rVC;
import celestial.rVL;
import celestial.rYD;
import celestial.rYK;
import celestial.rqM_2;
import celestial.rqO_2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Supplier;

public final class rRX {
    public static final Codec<rRX> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rRJ.id_final.fieldOf("type").forGetter(rRX::id_class), (App)rKd_1.id_class.fieldOf("generator").forGetter(rRX::id_byte)).apply((Applicative)instance, instance.stable(rRX::new)));
    public static final rqM_2<rRX> id_break = rqM_2.id_class(rVL.id_import, new rqO_2("overworld"));
    public static final rqM_2<rRX> id_byte = rqM_2.id_class(rVL.id_import, new rqO_2("the_nether"));
    public static final rqM_2<rRX> id_protected = rqM_2.id_class(rVL.id_import, new rqO_2("the_end"));
    private static final LinkedHashSet<rqM_2<rRX>> id_throws = Sets.newLinkedHashSet((Iterable)ImmutableList.of(id_break, id_byte, id_protected));
    private final Supplier<rRJ> id_case;
    private final rKd_1 id_catch;

    public rKd_1 id_byte() {
        return this.id_catch;
    }

    public rRX(Supplier<rRJ> supplier, rKd_1 rKd_12) {
        this.id_case = supplier;
        this.id_catch = rKd_12;
    }

    public static rVC<rRX> id_class(rVC<rRX> rVC2) {
        Object object;
        rVC<rRX> rVC3 = new rVC<rRX>(rVL.id_import, Lifecycle.experimental());
        for (rqM_2 object2 : id_throws) {
            object = rVC2.id_class(object2);
            if (object == null) continue;
            rVC3.id_class(object2, object, rVC2.id_protected((rRX)object));
        }
        for (Map.Entry entry : rVC2.id_throws()) {
            object = (rqM_2)entry.getKey();
            if (id_throws.contains(object)) continue;
            rVC3.id_class((rqM_2<rRX>)object, (rRX)entry.getValue(), rVC2.id_protected((rRX)entry.getValue()));
        }
        return rVC3;
    }

    public Supplier<rRJ> id_class() {
        return this.id_case;
    }

    public static boolean id_class(long l, rVC<rRX> rVC2) {
        ArrayList arrayList = Lists.newArrayList(rVC2.id_throws());
        if (arrayList.size() != id_throws.size()) {
            return false;
        }
        Map.Entry entry = (Map.Entry)arrayList.get(0);
        Map.Entry entry2 = (Map.Entry)arrayList.get(1);
        Map.Entry entry3 = (Map.Entry)arrayList.get(2);
        if (entry.getKey() == id_break && entry2.getKey() == id_byte && entry3.getKey() == id_protected) {
            if (!((rRX)entry.getValue()).id_break().id_class(rRJ.id_implements) && ((rRX)entry.getValue()).id_break() != rRJ.id_volatile) {
                return false;
            }
            if (!((rRX)entry2.getValue()).id_break().id_class(rRJ.id_finally)) {
                return false;
            }
            if (!((rRX)entry3.getValue()).id_break().id_class(rRJ.id_extends)) {
                return false;
            }
            if (((rRX)entry2.getValue()).id_byte() instanceof rKT && ((rRX)entry3.getValue()).id_byte() instanceof rKT) {
                rKT rKT2 = (rKT)((rRX)entry2.getValue()).id_byte();
                rKT rKT3 = (rKT)((rRX)entry3.getValue()).id_byte();
                if (!rKT2.id_class(l, rKW.id_throws)) {
                    return false;
                }
                if (!rKT3.id_class(l, rKW.id_case)) {
                    return false;
                }
                if (!(rKT2.id_protected() instanceof rYD)) {
                    return false;
                }
                rYD rYD2 = (rYD)rKT2.id_protected();
                if (!rYD2.id_break(l)) {
                    return false;
                }
                if (!(rKT3.id_protected() instanceof rYK)) {
                    return false;
                }
                rYK rYK2 = (rYK)rKT3.id_protected();
                return rYK2.id_break(l);
            }
            return false;
        }
        return false;
    }

    public rRJ id_break() {
        return this.id_case.get();
    }
}

