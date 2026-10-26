/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.LZ;
import celestial.QY;
import celestial.fH_2;
import celestial.fQ_2;
import celestial.fW_2;
import celestial.ff_3;
import celestial.fk_3;
import celestial.fl_3;
import celestial.fo_3;
import celestial.rAL;
import celestial.rAc_1;
import celestial.rAu_1;
import celestial.rqO_2;
import celestial.rrbY_2;
import celestial.rrbb_3;
import celestial.rrbl_3;
import celestial.rrdA;
import celestial.vB_2;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class fY_2
implements AutoCloseable,
fW_2,
rAc_1 {
    private static final Logger id_break = LogManager.getLogger();
    public static final rqO_2 id_class = new rqO_2("");
    private final Map<rqO_2, ff_3> id_byte = Maps.newHashMap();
    private final Set<fW_2> id_protected = Sets.newHashSet();
    private final Map<String, Integer> id_throws = Maps.newHashMap();
    private final rAL id_case;
    private ff_3 id_catch;
    private rqO_2 id_private;

    private ff_3 id_byte(rqO_2 rqO_22, ff_3 ff_32) {
        try {
            ff_32.a_(this.id_case);
            return ff_32;
        }
        catch (IOException iOException) {
            if (rqO_22 != id_class) {
                id_break.warn("Failed to load texture: {}", (Object)rqO_22, (Object)iOException);
            }
            return fQ_2.id_byte();
        }
        catch (Throwable throwable) {
            KY kY = KY.id_class(throwable, "Registering texture");
            Ko_1 ko_1 = kY.id_class("Resource location being registered");
            ko_1.id_class("Resource location", rqO_22);
            ko_1.id_class("Texture object class", () -> ff_32.getClass().getName());
            throw new KU(kY);
        }
    }

    public ff_3 id_byte() {
        return this.id_catch;
    }

    public void id_byte(rqO_2 rqO_22) {
        ff_3 ff_32 = this.id_break(rqO_22);
        if (ff_32 != null) {
            this.id_byte.remove(rqO_22);
            fo_3.id_class(ff_32.id_new());
        }
    }

    public fY_2(rAL rAL2) {
        this.id_case = rAL2;
    }

    @Override
    public CompletableFuture<Void> id_class(rAu_1 rAu_12, rAL rAL2, Executor executor, Executor executor2) {
        rrbb_3.id_byte("*** Reloading textures ***");
        rrbb_3.id_case("Resource packs: " + rrbb_3.k());
        Iterator<rqO_2> iterator = this.id_byte.keySet().iterator();
        while (iterator.hasNext()) {
            rqO_2 rqO_22 = iterator.next();
            String string = rqO_22.id_break();
            if (!string.startsWith("optifine/") && !rrbY_2.id_break(rqO_22)) continue;
            ff_3 ff_32 = this.id_byte.get(rqO_22);
            if (ff_32 instanceof ff_3) {
                ff_32.id_continue();
            }
            iterator.remove();
        }
        rrbY_2.id_implements();
        return ((CompletableFuture)CompletableFuture.allOf(vB_2.id_class(this, executor), this.id_class(LZ.id_finally, executor)).thenCompose(rAu_12::id_class)).thenAcceptAsync(void_ -> {
            fQ_2.id_byte();
            HashSet<Map.Entry<rqO_2, ff_3>> hashSet = new HashSet<Map.Entry<rqO_2, ff_3>>(this.id_byte.entrySet());
            Iterator iterator = hashSet.iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                rqO_2 rqO_22 = (rqO_2)entry.getKey();
                ff_3 ff_32 = (ff_3)entry.getValue();
                if (ff_32 == fQ_2.id_byte() && !rqO_22.equals(fQ_2.id_class())) {
                    iterator.remove();
                    continue;
                }
                ff_32.id_class(this, rAL2, rqO_22, executor2);
            }
        }, runnable -> RenderSystem.recordRenderCall(runnable::run));
    }

    public void id_class(rqO_2 rqO_22, ff_3 ff_32) {
        ff_3 ff_33 = this.id_byte.put(rqO_22, ff_32 = this.id_byte(rqO_22, ff_32));
        if (ff_33 != ff_32) {
            if (ff_33 != null && ff_33 != fQ_2.id_byte()) {
                this.id_protected.remove(ff_33);
                this.id_break(rqO_22, ff_33);
            }
            if (ff_32 instanceof fW_2) {
                this.id_protected.add((fW_2)((Object)ff_32));
            }
        }
    }

    public void id_class(rqO_2 rqO_22) {
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> this.id_protected(rqO_22));
        } else {
            this.id_protected(rqO_22);
        }
    }

    private static void id_class(Runnable runnable) {
        QY.id_instanceof().execute(() -> RenderSystem.recordRenderCall(runnable::run));
    }

    public rqO_2 id_class(String string, fk_3 fk_32) {
        Integer n = this.id_throws.get(string);
        n = n == null ? Integer.valueOf(1) : Integer.valueOf(n + 1);
        this.id_throws.put(string, n);
        rqO_2 rqO_22 = new rqO_2(String.format("dynamic/%s_%d", string, n));
        this.id_class(rqO_22, (ff_3)fk_32);
        return rqO_22;
    }

    public CompletableFuture<Void> id_class(rqO_2 rqO_22, Executor executor) {
        if (!this.id_byte.containsKey(rqO_22)) {
            fl_3 fl_32 = new fl_3(this.id_case, rqO_22, executor);
            this.id_byte.put(rqO_22, fl_32);
            return fl_32.id_class().thenRunAsync(() -> this.id_class(rqO_22, (ff_3)fl_32), fY_2::id_class);
        }
        return CompletableFuture.completedFuture(null);
    }

    @Override
    public void close() {
        this.id_byte.forEach(this::id_break);
        this.id_byte.clear();
        this.id_protected.clear();
        this.id_throws.clear();
    }

    private void id_break(rqO_2 rqO_22, ff_3 ff_32) {
        if (ff_32 != fQ_2.id_byte()) {
            try {
                ff_32.close();
            }
            catch (Exception exception) {
                id_break.warn("Failed to close texture {}", (Object)rqO_22, (Object)exception);
            }
        }
        ff_32.id_continue();
    }

    public ff_3 id_break(rqO_2 rqO_22) {
        return this.id_byte.get(rqO_22);
    }

    @Override
    public void id_break() {
        for (fW_2 fW_22 : this.id_protected) {
            fW_22.id_break();
        }
    }

    private void id_protected(rqO_2 rqO_22) {
        ff_3 ff_32;
        if (rrbb_3.rl()) {
            rqO_22 = rrbl_3.id_class(rqO_22);
        }
        if ((ff_32 = this.id_byte.get(rqO_22)) == null) {
            ff_32 = new fH_2(rqO_22);
            this.id_class(rqO_22, ff_32);
        }
        if (rrbb_3.rs()) {
            rrdA.id_break(ff_32);
        } else {
            ff_32.id_super();
        }
        this.id_catch = ff_32;
        this.id_private = rqO_22;
    }
}

