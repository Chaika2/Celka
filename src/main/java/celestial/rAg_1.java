/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAN;
import celestial.rAV;
import celestial.rqg_3;
import java.util.concurrent.CompletableFuture;

public class rAg_1
implements rAN {
    private final rAV id_class;
    private final CompletableFuture<rqg_3> id_break;

    @Override
    public boolean id_byte() {
        return false;
    }

    public rAg_1(rAV rAV2) {
        this.id_class = rAV2;
        this.id_break = new CompletableFuture();
        this.id_break.completeExceptionally(rAV2);
    }

    @Override
    public CompletableFuture<rqg_3> id_class() {
        return this.id_break;
    }

    @Override
    public float id_break() {
        return 0.0f;
    }

    @Override
    public void id_throws() {
        throw this.id_class;
    }

    @Override
    public boolean id_protected() {
        return true;
    }
}

