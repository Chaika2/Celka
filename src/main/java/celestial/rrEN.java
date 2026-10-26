/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Either
 */
package celestial;

import celestial.an_3;
import celestial.rKd_1;
import celestial.rRo_1;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rga_3;
import celestial.rhN_2;
import celestial.rjh_3;
import celestial.roC_2;
import celestial.roJ_2;
import celestial.roN_2;
import celestial.roX_2;
import celestial.roq_3;
import celestial.rqR_2;
import celestial.rrEG;
import celestial.rrEL;
import celestial.rrEM;
import celestial.rrEZ;
import celestial.rrEc_1;
import celestial.rrEg_1;
import celestial.rrEi_1;
import celestial.rrEj_1;
import celestial.rrEl_1;
import celestial.rrEm_1;
import celestial.rrEx_1;
import celestial.rrGk_1;
import celestial.rrGs_1;
import celestial.rrPt_1;
import celestial.rrse_3;
import celestial.ruS_2;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class rrEN
extends roX_2 {
    private static final List<roN_2> id_break = roN_2.id_class();
    private final rrEL id_byte;
    private final rKd_1 id_protected;
    private final rrEm_1 id_throws;
    public final Thread id_case;
    public final rrEZ id_catch;
    private final rrEc_1 id_private;
    public final rrEx_1 id_class;
    private final rrEi_1 id_implements;
    private long id_finally;
    private boolean id_extends = true;
    private boolean id_native = true;
    private final long[] id_volatile = new long[4];
    private final roN_2[] id_final = new roN_2[4];
    private final roC_2[] id_package = new roC_2[4];
    private rrEg_1 id_int;

    private CompletableFuture<Either<roC_2, rrEM>> id_byte(int n, int n2, roN_2 roN_22, boolean bl) {
        rfj_3 rfj_32 = new rfj_3(n, n2);
        long l = rfj_32.id_class();
        int n3 = 33 + roN_2.id_class(roN_22);
        rrEG rrEG2 = this.id_class(l);
        if (bl) {
            this.id_byte.id_class(rrEl_1.id_private, rfj_32, n3, rfj_32);
            if (this.id_class(rrEG2, n3)) {
                this.id_package();
                rrEG2 = this.id_class(l);
                if (this.id_class(rrEG2, n3)) {
                    throw rqR_2.id_byte(new IllegalStateException("No chunk holder after ticket has been added"));
                }
            }
        }
        return this.id_class(rrEG2, n3) ? rrEG.id_break : rrEG2.id_class(roN_22, this.id_class);
    }

    public void id_byte(an_3 an_32) {
        this.id_class.id_class(an_32);
    }

    @Override
    public String id_byte() {
        return "ServerChunkCache: " + this.id_finally();
    }

    private void id_int() {
        long l = this.id_throws.r();
        long l2 = l - this.id_finally;
        this.id_finally = l;
        rrGs_1 rrGs_12 = this.id_throws.id_public();
        boolean bl = this.id_throws.b();
        boolean bl2 = this.id_throws.B().id_break(rRu_1.id_protected);
        if (!bl) {
            rrEg_1 rrEg_12;
            int n = this.id_throws.B().id_byte(rRu_1.id_volatile);
            boolean bl3 = rrGs_12.id_throws() % 400L == 0L;
            int n2 = this.id_byte.id_break();
            this.id_int = rrEg_12 = rrEj_1.id_class(n2, this.id_throws.W(), this::id_class);
            ArrayList arrayList = Lists.newArrayList(this.id_class.id_catch());
            Collections.shuffle(arrayList);
            arrayList.forEach(rrEG2 -> {
                Optional optional = rrEG2.id_class().getNow(rrEG.id_byte).left();
                if (optional.isPresent()) {
                    rrEG2.id_class((roJ_2)optional.get());
                    Optional optional2 = rrEG2.id_break().getNow(rrEG.id_byte).left();
                    if (optional2.isPresent()) {
                        roJ_2 roJ_22 = (roJ_2)optional2.get();
                        rfj_3 rfj_32 = rrEG2.id_implements();
                        if (!this.id_class.id_throws(rfj_32)) {
                            roJ_22.id_break(roJ_22.id_this() + l2);
                            if (bl2 && (this.id_extends || this.id_native) && this.id_throws.id_instanceof().id_class(roJ_22.id_private())) {
                                rrEj_1.id_class(this.id_throws, roJ_22, rrEg_12, this.id_native, this.id_extends, bl3);
                            }
                            this.id_throws.id_class(roJ_22, n);
                        }
                    }
                }
            });
            if (bl2) {
                this.id_throws.id_break(this.id_extends, this.id_native);
            }
        }
        this.id_class.id_private();
    }

    public rrEN(rrEm_1 rrEm_12, rrGk_1 rrGk_12, DataFixer dataFixer, rrPt_1 rrPt_12, Executor executor, rKd_1 rKd_12, int n, boolean bl, roq_3 roq_32, Supplier<rrEi_1> supplier) {
        this.id_throws = rrEm_12;
        this.id_private = new rrEc_1(this, rrEm_12);
        this.id_protected = rKd_12;
        this.id_case = Thread.currentThread();
        File file = rrGk_12.id_class(rrEm_12.E());
        File file2 = new File(file, "data");
        file2.mkdirs();
        this.id_implements = new rrEi_1(file2, dataFixer);
        this.id_class = new rrEx_1(rrEm_12, rrGk_12, dataFixer, rrPt_12, executor, this.id_private, this, this.id_implements(), roq_32, supplier, n, bl);
        this.id_catch = this.id_class.id_break();
        this.id_byte = this.id_class.id_case();
        this.id_final();
    }

    private rrEG id_class(long l) {
        return this.id_class.id_break(l);
    }

    public <T> void id_class(rrEl_1<T> rrEl_12, rfj_3 rfj_32, int n, T t) {
        this.id_byte.id_byte(rrEl_12, rfj_32, n, t);
    }

    @Override
    public void id_class(rfj_3 rfj_32, boolean bl) {
        this.id_byte.id_class(rfj_32, bl);
    }

    public void id_class(BooleanSupplier booleanSupplier) {
        this.id_byte.id_class();
        this.id_package();
        this.id_int();
        this.id_class.id_class(booleanSupplier);
        this.id_final();
    }

    private void id_class(long l, roC_2 roC_22, roN_2 roN_22) {
        for (int i = 3; i > 0; --i) {
            this.id_volatile[i] = this.id_volatile[i - 1];
            this.id_final[i] = this.id_final[i - 1];
            this.id_package[i] = this.id_package[i - 1];
        }
        this.id_volatile[0] = l;
        this.id_final[0] = roN_22;
        this.id_package[0] = roC_22;
    }

    private void id_class(long l, Consumer<roJ_2> consumer) {
        rrEG rrEG2 = this.id_class(l);
        if (rrEG2 != null) {
            rrEG2.id_byte().getNow(rrEG.id_byte).left().ifPresent(consumer);
        }
    }

    public void id_class(int n) {
        this.id_class.id_class(n);
    }

    @Override
    public void id_class(boolean bl, boolean bl2) {
        this.id_extends = bl;
        this.id_native = bl2;
    }

    @Override
    public /* synthetic */ rrse_3 id_class() {
        return this.id_protected();
    }

    public void id_class(an_3 an_32, ruS_2<?> ruS_22) {
        this.id_class.id_break(an_32, ruS_22);
    }

    public void id_class(rhN_2 rhN_22) {
        this.id_class.id_class(rhN_22);
    }

    public CompletableFuture<Either<roC_2, rrEM>> id_class(int n, int n2, roN_2 roN_22, boolean bl) {
        CompletionStage<Object> completionStage;
        boolean bl2;
        boolean bl3 = bl2 = Thread.currentThread() == this.id_case;
        if (bl2) {
            completionStage = this.id_byte(n, n2, roN_22, bl);
            this.id_private.id_byte(() -> completionStage.isDone());
        } else {
            completionStage = CompletableFuture.supplyAsync(() -> this.id_byte(n, n2, roN_22, bl), this.id_private).thenCompose(completableFuture -> completableFuture);
        }
        return completionStage;
    }

    @Override
    public boolean id_class(rfj_3 rfj_32) {
        return this.id_class(rfj_32.id_class(), rrEG::id_break);
    }

    @Override
    public boolean id_class(an_3 an_32) {
        long l = rfj_3.id_class(rfU_2.id_byte(an_32.rx()) >> 4, rfU_2.id_byte(an_32.BO()) >> 4);
        return this.id_class(l, rrEG::id_break);
    }

    private boolean id_class(rrEG rrEG2, int n) {
        return rrEG2 == null || rrEG2.id_finally() > n;
    }

    @Override
    public void id_class(rRo_1 rRo_12, rjh_3 rjh_32) {
        this.id_private.execute(() -> {
            rrEG rrEG2 = this.id_class(rjh_32.id_new().id_class());
            if (rrEG2 != null) {
                rrEG2.id_class(rRo_12, rjh_32.id_byte());
            }
        });
    }

    public void id_class(boolean bl) {
        this.id_package();
        this.id_class.id_class(bl);
    }

    private boolean id_class(long l, Function<rrEG, CompletableFuture<Either<roJ_2, rrEM>>> function) {
        rrEG rrEG2 = this.id_class(l);
        if (rrEG2 == null) {
            return false;
        }
        Either<roJ_2, rrEM> either = function.apply(rrEG2).getNow(rrEG.id_byte);
        return either.left().isPresent();
    }

    @Override
    public boolean id_class(rfH_2 rfH_22) {
        long l = rfj_3.id_class(rfH_22.b_() >> 4, rfH_22.d_() >> 4);
        return this.id_class(l, rrEG::id_class);
    }

    @Override
    public void close() throws IOException {
        this.id_class(true);
        this.id_catch.close();
        this.id_class.close();
    }

    public void id_break(an_3 an_32) {
        this.id_class.id_break(an_32);
    }

    @Override
    public /* synthetic */ rRq_1 id_break() {
        return this.id_case();
    }

    @Override
    public roC_2 id_break(int n, int n2, roN_2 roN_22, boolean bl) {
        roC_2 roC_23;
        if (Thread.currentThread() != this.id_case) {
            return CompletableFuture.supplyAsync(() -> this.id_break(n, n2, roN_22, bl), this.id_private).join();
        }
        long l = rfj_3.id_class(n, n2);
        for (int i = 0; i < 4; ++i) {
            if (l != this.id_volatile[i] || roN_22 != this.id_final[i] || (roC_23 = this.id_package[i]) == null && bl) continue;
            return roC_23;
        }
        CompletableFuture<Either<roC_2, rrEM>> completableFuture = this.id_byte(n, n2, roN_22, bl);
        this.id_private.id_byte(completableFuture::isDone);
        roC_23 = (roC_2)completableFuture.join().map(roC_22 -> roC_22, rrEM2 -> {
            if (bl) {
                throw rqR_2.id_byte(new IllegalStateException("Chunk not there when requested: " + rrEM2));
            }
            return null;
        });
        this.id_class(l, roC_23, roN_22);
        return roC_23;
    }

    public String id_break(rfj_3 rfj_32) {
        return this.id_class.id_break(rfj_32);
    }

    public <T> void id_break(rrEl_1<T> rrEl_12, rfj_3 rfj_32, int n, T t) {
        this.id_byte.id_protected(rrEl_12, rfj_32, n, t);
    }

    public void id_break(rfH_2 rfH_22) {
        int n;
        int n2 = rfH_22.b_() >> 4;
        rrEG rrEG2 = this.id_class(rfj_3.id_class(n2, n = rfH_22.d_() >> 4));
        if (rrEG2 != null) {
            rrEG2.id_class(rfH_22);
        }
    }

    public void id_break(an_3 an_32, ruS_2<?> ruS_22) {
        this.id_class.id_class(an_32, ruS_22);
    }

    public int id_throws() {
        return this.id_class.id_protected();
    }

    @Override
    public rRq_1 id_throws(int n, int n2) {
        long l = rfj_3.id_class(n, n2);
        rrEG rrEG2 = this.id_class(l);
        if (rrEG2 == null) {
            return null;
        }
        int n3 = id_break.size() - 1;
        roN_2 roN_22;
        Optional optional;
        while (!(optional = rrEG2.id_class(roN_22 = id_break.get(n3)).getNow(rrEG.id_class).left()).isPresent()) {
            if (roN_22 == roN_2.id_finally.id_throws()) {
                return null;
            }
            --n3;
        }
        return (rRq_1)optional.get();
    }

    public int id_finally() {
        return this.id_class.id_throws();
    }

    public boolean id_catch() {
        return this.id_private.k_();
    }

    public rrEi_1 id_extends() {
        return this.id_implements;
    }

    public rYB id_case() {
        return this.id_throws;
    }

    @Override
    public boolean id_case(int n, int n2) {
        int n3;
        rrEG rrEG2 = this.id_class(new rfj_3(n, n2).id_class());
        return !this.id_class(rrEG2, n3 = 33 + roN_2.id_class(roN_2.id_volatile));
    }

    public rKd_1 id_implements() {
        return this.id_protected;
    }

    public boolean id_package() {
        boolean bl = this.id_byte.id_class(this.id_class);
        boolean bl2 = this.id_class.id_byte();
        if (!bl && !bl2) {
            return false;
        }
        this.id_final();
        return true;
    }

    @Override
    public roJ_2 id_protected(int n, int n2) {
        if (Thread.currentThread() != this.id_case) {
            return null;
        }
        long l = rfj_3.id_class(n, n2);
        for (int i = 0; i < 4; ++i) {
            if (l != this.id_volatile[i] || this.id_final[i] != roN_2.id_volatile) continue;
            roC_2 roC_22 = this.id_package[i];
            return roC_22 instanceof roJ_2 ? (roJ_2)roC_22 : null;
        }
        rrEG rrEG2 = this.id_class(l);
        if (rrEG2 == null) {
            return null;
        }
        Either either = rrEG2.id_break(roN_2.id_volatile).getNow(null);
        if (either == null) {
            return null;
        }
        roC_2 roC_23 = either.left().orElse(null);
        if (roC_23 != null) {
            this.id_class(l, roC_23, roN_2.id_volatile);
            if (roC_23 instanceof roJ_2) {
                return (roJ_2)roC_23;
            }
        }
        return null;
    }

    public rrEZ id_protected() {
        return this.id_catch;
    }

    public int id_private() {
        return this.id_private.rJ();
    }

    private void id_final() {
        Arrays.fill(this.id_volatile, rfj_3.id_class);
        Arrays.fill(this.id_final, null);
        Arrays.fill(this.id_package, null);
    }

    public rrEg_1 id_volatile() {
        return this.id_int;
    }

    public rga_3 id_native() {
        return this.id_class.id_implements();
    }
}

