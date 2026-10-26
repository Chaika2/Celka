/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  it.unimi.dsi.fastutil.shorts.ShortArraySet
 *  it.unimi.dsi.fastutil.shorts.ShortSet
 */
package celestial;

import celestial.rFC;
import celestial.rFy_1;
import celestial.rRo_1;
import celestial.rYB;
import celestial.rZR;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rjh_3;
import celestial.roC_2;
import celestial.roJ_2;
import celestial.roN_2;
import celestial.roQ_2;
import celestial.rok_3;
import celestial.roz_3;
import celestial.rqR_2;
import celestial.rrEJ;
import celestial.rrEM;
import celestial.rrEX;
import celestial.rrEb_1;
import celestial.rrEh_1;
import celestial.rrEx_1;
import celestial.rrse_3;
import celestial.ruS_2;
import celestial.rvC_2;
import celestial.ryO_2;
import celestial.xc_3;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.shorts.ShortArraySet;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class rrEG {
    public static final Either<roC_2, rrEM> id_class = Either.right((Object)rrEM.id_break);
    public static final CompletableFuture<Either<roC_2, rrEM>> id_break = CompletableFuture.completedFuture(id_class);
    public static final Either<roJ_2, rrEM> id_byte = Either.right((Object)rrEM.id_break);
    private static final CompletableFuture<Either<roJ_2, rrEM>> id_protected = CompletableFuture.completedFuture(id_byte);
    private static final List<roN_2> id_throws = roN_2.id_class();
    private static final rrEJ[] id_case = rrEJ.values();
    private final AtomicReferenceArray<CompletableFuture<Either<roC_2, rrEM>>> id_catch = new AtomicReferenceArray(id_throws.size());
    private volatile CompletableFuture<Either<roJ_2, rrEM>> id_private = id_protected;
    private volatile CompletableFuture<Either<roJ_2, rrEM>> id_implements = id_protected;
    private volatile CompletableFuture<Either<roJ_2, rrEM>> id_finally = id_protected;
    private CompletableFuture<roC_2> id_extends = CompletableFuture.completedFuture(null);
    private int id_native;
    private int id_volatile;
    private int id_final;
    public final rfj_3 id_package;
    private boolean id_int;
    private final ShortSet[] id_new = new ShortSet[16];
    private int id_continue;
    private int id_super;
    private final rrse_3 id_this;
    private final rrEh_1 id_else;
    private final rrEX id_synchronized;
    private boolean id_return;
    private boolean id_public;

    public CompletableFuture<Either<roJ_2, rrEM>> id_byte() {
        return this.id_private;
    }

    public static rrEJ id_byte(int n) {
        return id_case[rfU_2.id_class(33 - n + 1, 0, id_case.length - 1)];
    }

    public rrEG(rfj_3 rfj_32, int n, rrse_3 rrse_32, rrEh_1 rrEh_12, rrEX rrEX2) {
        this.id_package = rfj_32;
        this.id_this = rrse_32;
        this.id_else = rrEh_12;
        this.id_synchronized = rrEX2;
        this.id_volatile = this.id_native = rrEx_1.id_break + 1;
        this.id_final = this.id_native;
        this.id_class(n);
    }

    private void id_class(CompletableFuture<? extends Either<? extends roC_2, rrEM>> completableFuture) {
        this.id_extends = this.id_extends.thenCombine(completableFuture, (roC_23, either) -> (roC_2)either.map(roC_22 -> roC_22, rrEM2 -> roC_23));
    }

    public CompletableFuture<Either<roC_2, rrEM>> id_class(roN_2 roN_22, rrEx_1 rrEx_12) {
        Object object;
        int n = roN_22.id_byte();
        CompletableFuture<Either<roC_2, rrEM>> completableFuture = this.id_catch.get(n);
        if (completableFuture != null && ((object = completableFuture.getNow((Either<roC_2, rrEM>)((Either)null))) == null || object.left().isPresent())) {
            return completableFuture;
        }
        if (rrEG.id_break(this.id_volatile).id_break(roN_22)) {
            object = rrEx_12.id_class(this, roN_22);
            this.id_class((CompletableFuture<? extends Either<? extends roC_2, rrEM>>)object);
            this.id_catch.set(n, (CompletableFuture<Either<roC_2, rrEM>>)object);
            return object;
        }
        return completableFuture == null ? id_break : completableFuture;
    }

    public CompletableFuture<Either<roC_2, rrEM>> id_class(roN_2 roN_22) {
        CompletableFuture<Either<roC_2, rrEM>> completableFuture = this.id_catch.get(roN_22.id_byte());
        return completableFuture == null ? id_break : completableFuture;
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22) {
        rFy_1 rFy_12;
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 != null && (rFy_12 = ryO_22.Y_()) != null) {
            this.id_class(rFy_12, false);
        }
    }

    protected void id_class(rrEx_1 rrEx_12) {
        CompletableFuture<Either<roC_2, rrEM>> completableFuture;
        int n;
        roN_2 roN_22 = rrEG.id_break(this.id_native);
        roN_2 roN_23 = rrEG.id_break(this.id_volatile);
        boolean bl = this.id_native <= rrEx_1.id_break;
        boolean bl2 = this.id_volatile <= rrEx_1.id_break;
        rrEJ rrEJ2 = rrEG.id_byte(this.id_native);
        rrEJ rrEJ3 = rrEG.id_byte(this.id_volatile);
        if (bl) {
            Either either2 = Either.right((Object)new rrEb_1(this));
            int n2 = n = bl2 ? roN_23.id_byte() + 1 : 0;
            while (n <= roN_22.id_byte()) {
                completableFuture = this.id_catch.get(n);
                if (completableFuture != null) {
                    completableFuture.complete((Either<roC_2, rrEM>)either2);
                } else {
                    this.id_catch.set(n, CompletableFuture.completedFuture(either2));
                }
                ++n;
            }
        }
        boolean bl3 = rrEJ2.id_class(rrEJ.BORDER);
        n = rrEJ3.id_class(rrEJ.BORDER);
        this.id_return |= n;
        if (!bl3 && n != 0) {
            this.id_private = rrEx_12.id_break(this);
            this.id_class(this.id_private);
        }
        if (bl3 && n == 0) {
            completableFuture = this.id_private;
            this.id_private = id_protected;
            this.id_class((CompletableFuture<? extends Either<? extends roC_2, rrEM>>)completableFuture.thenApply(either -> either.ifLeft(rrEx_12::id_class)));
        }
        boolean bl4 = rrEJ2.id_class(rrEJ.TICKING);
        boolean bl5 = rrEJ3.id_class(rrEJ.TICKING);
        if (!bl4 && bl5) {
            this.id_implements = rrEx_12.id_class(this);
            this.id_class(this.id_implements);
        }
        if (bl4 && !bl5) {
            this.id_implements.complete(id_byte);
            this.id_implements = id_protected;
        }
        boolean bl6 = rrEJ2.id_class(rrEJ.ENTITY_TICKING);
        boolean bl7 = rrEJ3.id_class(rrEJ.ENTITY_TICKING);
        if (!bl6 && bl7) {
            if (this.id_finally != id_protected) {
                throw rqR_2.id_byte(new IllegalStateException());
            }
            this.id_finally = rrEx_12.id_byte(this.id_package);
            this.id_class(this.id_finally);
        }
        if (bl6 && !bl7) {
            this.id_finally.complete(id_byte);
            this.id_finally = id_protected;
        }
        this.id_else.id_class(this.id_package, this::id_extends, this.id_volatile, this::id_protected);
        this.id_native = this.id_volatile;
    }

    public void id_class(int n) {
        this.id_volatile = n;
    }

    public void id_class(roz_3 roz_32) {
        for (int i = 0; i < this.id_catch.length(); ++i) {
            Optional optional;
            CompletableFuture<Either<roC_2, rrEM>> completableFuture = this.id_catch.get(i);
            if (completableFuture == null || !(optional = completableFuture.getNow(id_class).left()).isPresent() || !(optional.get() instanceof rok_3)) continue;
            this.id_catch.set(i, CompletableFuture.completedFuture(Either.left((Object)roz_32)));
        }
        this.id_class(CompletableFuture.completedFuture(Either.left((Object)roz_32.id_final())));
    }

    public CompletableFuture<Either<roJ_2, rrEM>> id_class() {
        return this.id_implements;
    }

    private void id_class(ruS_2<?> ruS_22, boolean bl) {
        this.id_synchronized.id_class(this.id_package, bl).forEach(rhN_22 -> rhN_22.id_class.id_class(ruS_22));
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        if (xc_32.id_break().id_protected()) {
            this.id_class(rYB2, rfH_22);
        }
    }

    public void id_class(rRo_1 rRo_12, int n) {
        roJ_2 roJ_22 = this.id_protected();
        if (roJ_22 != null) {
            roJ_22.id_break(true);
            if (rRo_12 == rRo_1.SKY) {
                this.id_super |= 1 << n - -1;
            } else {
                this.id_continue |= 1 << n - -1;
            }
        }
    }

    public void id_class(rfH_2 rfH_22) {
        roJ_2 roJ_22 = this.id_protected();
        if (roJ_22 != null) {
            byte by = (byte)rjh_3.id_class(rfH_22.c_());
            if (this.id_new[by] == null) {
                this.id_int = true;
                this.id_new[by] = new ShortArraySet();
            }
            this.id_new[by].add(rjh_3.id_break(rfH_22));
        }
    }

    public void id_class(roJ_2 roJ_22) {
        if (this.id_int || this.id_super != 0 || this.id_continue != 0) {
            int n;
            rYB rYB2 = roJ_22.id_extends();
            int n2 = 0;
            for (n = 0; n < this.id_new.length; ++n) {
                n2 += this.id_new[n] != null ? this.id_new[n].size() : 0;
            }
            this.id_public |= n2 >= 64;
            if (this.id_super != 0 || this.id_continue != 0) {
                this.id_class(new rFC(roJ_22.id_private(), this.id_this, this.id_super, this.id_continue, true), !this.id_public);
                this.id_super = 0;
                this.id_continue = 0;
            }
            for (n = 0; n < this.id_new.length; ++n) {
                ShortSet shortSet = this.id_new[n];
                if (shortSet == null) continue;
                rjh_3 rjh_32 = rjh_3.id_class(roJ_22.id_private(), n);
                if (shortSet.size() == 1) {
                    var7_7 = rjh_32.id_catch(shortSet.iterator().nextShort());
                    var8_8 = rYB2.id_byte((rfH_2)var7_7);
                    this.id_class(new rZR((rfH_2)var7_7, (xc_3)var8_8), false);
                    this.id_class(rYB2, (rfH_2)var7_7, (xc_3)var8_8);
                } else {
                    var7_7 = roJ_22.id_byte()[rjh_32.c_()];
                    var8_8 = new rvC_2(rjh_32, shortSet, (roQ_2)var7_7, this.id_public);
                    this.id_class((ruS_2<?>)var8_8, false);
                    ((rvC_2)var8_8).id_class((rfH_2 rfH_22, xc_3 xc_32) -> this.id_class(rYB2, (rfH_2)rfH_22, (xc_3)xc_32));
                }
                this.id_new[n] = null;
            }
            this.id_int = false;
        }
    }

    public CompletableFuture<Either<roJ_2, rrEM>> id_break() {
        return this.id_finally;
    }

    public static roN_2 id_break(int n) {
        return n < 33 ? roN_2.id_volatile : roN_2.id_class(n - 33);
    }

    public CompletableFuture<Either<roC_2, rrEM>> id_break(roN_2 roN_22) {
        return rrEG.id_break(this.id_volatile).id_break(roN_22) ? this.id_class(roN_22) : id_break;
    }

    public roN_2 id_throws() {
        for (int i = id_throws.size() - 1; i >= 0; --i) {
            roN_2 roN_22 = id_throws.get(i);
            CompletableFuture<Either<roC_2, rrEM>> completableFuture = this.id_class(roN_22);
            if (!completableFuture.getNow(id_class).left().isPresent()) continue;
            return roN_22;
        }
        return null;
    }

    public int id_finally() {
        return this.id_volatile;
    }

    public CompletableFuture<roC_2> id_catch() {
        return this.id_extends;
    }

    public int id_extends() {
        return this.id_final;
    }

    public roC_2 id_case() {
        for (int i = id_throws.size() - 1; i >= 0; --i) {
            Optional optional;
            roN_2 roN_22 = id_throws.get(i);
            CompletableFuture<Either<roC_2, rrEM>> completableFuture = this.id_class(roN_22);
            if (completableFuture.isCompletedExceptionally() || !(optional = completableFuture.getNow(id_class).left()).isPresent()) continue;
            return (roC_2)optional.get();
        }
        return null;
    }

    public rfj_3 id_implements() {
        return this.id_package;
    }

    public roJ_2 id_protected() {
        CompletableFuture<Either<roJ_2, rrEM>> completableFuture = this.id_class();
        Either<roJ_2, rrEM> either = completableFuture.getNow((Either<roJ_2, rrEM>)((Either)null));
        return either == null ? null : either.left().orElse(null);
    }

    private void id_protected(int n) {
        this.id_final = n;
    }

    public rrEJ id_private() {
        return rrEG.id_byte(this.id_volatile);
    }

    public void id_volatile() {
        this.id_return = rrEG.id_byte(this.id_volatile).id_class(rrEJ.BORDER);
    }

    public boolean id_native() {
        return this.id_return;
    }
}

