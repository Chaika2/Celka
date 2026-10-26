/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Of_1;
import celestial.gp_3;
import celestial.gq_3;
import celestial.rAC;
import celestial.rAI;
import celestial.rAL;
import celestial.rAQ;
import celestial.rAj_1;
import celestial.rAv_1;
import celestial.rWB;
import celestial.rlQ_2;
import celestial.rlu_3;
import celestial.rqg_3;
import celestial.rzC_2;
import celestial.rzZ_2;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class rAh_1
implements AutoCloseable {
    private static final CompletableFuture<rqg_3> id_class = CompletableFuture.completedFuture(rqg_3.INSTANCE);
    private final rAv_1 id_break = new rAj_1(rAI.SERVER_DATA);
    private final gp_3 id_byte;
    private final rWB id_protected = new rWB();
    private final rlu_3 id_throws = new rlu_3();
    private final rzZ_2 id_case = new rzZ_2();
    private final rzC_2 id_catch = new rzC_2(this.id_case);
    private final Of_1 id_private = new Of_1(this.id_case);
    private final rAQ id_implements;

    public rzC_2 id_byte() {
        return this.id_catch;
    }

    public rAh_1(gq_3 gq_32, int n) {
        this.id_byte = new gp_3(gq_32);
        this.id_implements = new rAQ(n, this.id_byte.id_class());
        this.id_break.id_class(this.id_throws);
        this.id_break.id_class(this.id_case);
        this.id_break.id_class(this.id_protected);
        this.id_break.id_class(this.id_catch);
        this.id_break.id_class(this.id_implements);
        this.id_break.id_class(this.id_private);
    }

    public rAQ id_class() {
        return this.id_implements;
    }

    public static CompletableFuture<rAh_1> id_class(List<rAC> list, gq_3 gq_32, int n, Executor executor, Executor executor2) {
        rAh_1 rAh_12 = new rAh_1(gq_32, n);
        CompletableFuture<rqg_3> completableFuture = rAh_12.id_break.id_class(executor, executor2, list, id_class);
        return ((CompletableFuture)completableFuture.whenComplete((rqg_32, throwable) -> {
            if (throwable != null) {
                rAh_12.close();
            }
        })).thenApply(rqg_32 -> rAh_12);
    }

    @Override
    public void close() {
        this.id_break.close();
    }

    public rzZ_2 id_break() {
        return this.id_case;
    }

    public rWB id_throws() {
        return this.id_protected;
    }

    public Of_1 id_catch() {
        return this.id_private;
    }

    public gp_3 id_case() {
        return this.id_byte;
    }

    public void id_implements() {
        this.id_throws.id_break().id_throws();
    }

    public rlQ_2 id_protected() {
        return this.id_throws.id_break();
    }

    public rAL id_private() {
        return this.id_break;
    }
}

