/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.iB_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rrP_2;
import celestial.rrr_3;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Collection;
import org.apache.logging.log4j.Logger;

public final class iF_2<E extends iB_2> {
    private final Collection<? extends il_3<?>> id_class;
    private final Collection<? extends rrP_2<? extends rrr_3<? super E>>> id_break;
    private final Codec<iZ_2<E>> id_byte;

    public iF_2(Collection<? extends il_3<?>> collection, Collection<? extends rrP_2<? extends rrr_3<? super E>>> collection2) {
        this.id_class = collection;
        this.id_break = collection2;
        this.id_byte = iZ_2.id_break(collection, collection2);
    }

    public iZ_2<E> id_class(Dynamic<?> dynamic) {
        return this.id_byte.parse(dynamic).resultOrPartial(arg_0 -> ((Logger)iZ_2.id_class).error(arg_0)).orElseGet(() -> new iZ_2(this.id_class, this.id_break, ImmutableList.of(), () -> this.id_byte));
    }
}

