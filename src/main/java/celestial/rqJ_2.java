/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rqx_3;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class rqJ_2<T> {
    public final List<T> id_class = Lists.newArrayList();
    public final Spliterator<T> id_break;

    public rqJ_2(Stream<T> stream) {
        this.id_break = stream.spliterator();
    }

    public Stream<T> id_class() {
        return StreamSupport.stream(new rqx_3(this, Long.MAX_VALUE, 0), false);
    }
}

