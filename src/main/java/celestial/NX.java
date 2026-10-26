/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.ND;
import celestial.NJ;
import celestial.NK;
import celestial.Ni_1;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class NX {
    private final Set<NJ> id_class = Sets.newIdentityHashSet();
    public final ND id_break;
    public final Executor id_byte;

    public NX(ND nD, Executor executor) {
        this.id_break = nD;
        this.id_byte = executor;
    }

    public CompletableFuture<NJ> id_class(Ni_1 ni_1) {
        CompletableFuture<NJ> completableFuture = new CompletableFuture<NJ>();
        this.id_byte.execute(() -> {
            NK nK = this.id_break.id_class(ni_1);
            if (nK != null) {
                NJ nJ = new NJ(this, nK);
                this.id_class.add(nJ);
                completableFuture.complete(nJ);
            } else {
                completableFuture.complete(null);
            }
        });
        return completableFuture;
    }

    public void id_class(Consumer<Stream<NK>> consumer) {
        this.id_byte.execute(() -> consumer.accept(this.id_class.stream().map(nJ -> nJ.id_break).filter(Objects::nonNull)));
    }

    public void id_class() {
        this.id_byte.execute(() -> {
            Iterator<NJ> iterator = this.id_class.iterator();
            while (iterator.hasNext()) {
                NJ nJ = iterator.next();
                nJ.id_break.id_implements();
                if (!nJ.id_break.id_catch()) continue;
                nJ.id_break();
                iterator.remove();
            }
        });
    }

    public void id_break() {
        this.id_class.forEach(NJ::id_break);
        this.id_class.clear();
    }
}

