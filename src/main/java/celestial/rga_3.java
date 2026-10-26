/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 */
package celestial;

import celestial.rKS;
import celestial.rRP;
import celestial.rRR;
import celestial.rRr_1;
import celestial.rTv_1;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rgU_2;
import celestial.rge_3;
import celestial.rgi_3;
import celestial.rjh_3;
import celestial.roN_2;
import celestial.roQ_2;
import celestial.rqR_2;
import celestial.xc_3;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rga_3
extends rKS<rge_3> {
    private final rgi_3 id_class;
    private final LongSet id_break = new LongOpenHashSet();

    public Optional<rRP> id_byte(rfH_2 rfH_22) {
        rge_3 rge_32 = (rge_3)this.id_throws(rjh_3.id_class(rfH_22).id_continue());
        return rge_32.id_byte(rfH_22);
    }

    public Optional<rfH_2> id_byte(Predicate<rRP> predicate, Predicate<rfH_2> predicate2, rfH_2 rfH_22, int n, rRr_1 rRr_12) {
        return this.id_class(predicate, predicate2, rfH_22, n, rRr_12).findFirst();
    }

    public Stream<rgU_2> id_byte(Predicate<rRP> predicate, rfH_2 rfH_22, int n, rRr_1 rRr_12) {
        int n2 = n * n;
        return this.id_break(predicate, rfH_22, n, rRr_12).filter(rgU_22 -> rgU_22.id_throws().id_private(rfH_22) <= (double)n2);
    }

    public rga_3(File file, DataFixer dataFixer, boolean bl) {
        super(file, rge_3::id_class, rge_3::new, dataFixer, rTv_1.POI_CHUNK, bl);
        this.id_class = new rgi_3(this);
    }

    private static boolean id_class(roQ_2 roQ_22) {
        return roQ_22.id_class(rRP.id_public::contains);
    }

    public void id_class(rRR rRR2, rfH_2 rfH_22, int n) {
        rjh_3.id_break(new rfj_3(rfH_22), Math.floorDiv(n, 16)).map(rjh_32 -> Pair.of((Object)rjh_32, this.id_protected(rjh_32.id_continue()))).filter(pair -> ((Optional)pair.getSecond()).map(rge_3::id_class).orElse(false) == false).map(pair -> ((rjh_3)pair.getFirst()).id_new()).filter(rfj_32 -> this.id_break.add(rfj_32.id_class())).forEach(rfj_32 -> rRR2.id_class(rfj_32.id_break, rfj_32.id_byte, roN_2.id_class));
    }

    private void id_class(roQ_2 roQ_22, rjh_3 rjh_32, BiConsumer<rfH_2, rRP> biConsumer) {
        rjh_32.id_super().forEach(rfH_22 -> {
            xc_3 xc_32 = roQ_22.id_class(rjh_3.id_break(rfH_22.b_()), rjh_3.id_break(rfH_22.c_()), rjh_3.id_break(rfH_22.d_()));
            rRP.id_class(xc_32).ifPresent(rRP2 -> biConsumer.accept((rfH_2)rfH_22, (rRP)rRP2));
        });
    }

    public Stream<rfH_2> id_class(Predicate<rRP> predicate, Predicate<rfH_2> predicate2, rfH_2 rfH_22, int n, rRr_1 rRr_12) {
        return this.id_byte(predicate, rfH_22, n, rRr_12).map(rgU_2::id_throws).filter(predicate2);
    }

    public void id_class(rfH_2 rfH_22, rRP rRP2) {
        ((rge_3)this.id_throws(rjh_3.id_class(rfH_22).id_continue())).id_class(rfH_22, rRP2);
    }

    public Optional<rfH_2> id_class(Predicate<rRP> predicate, Predicate<rfH_2> predicate2, rfH_2 rfH_22, int n) {
        return this.id_byte(predicate, rfH_22, n, rRr_1.HAS_SPACE).filter(rgU_22 -> predicate2.test(rgU_22.id_throws())).findFirst().map(rgU_22 -> {
            rgU_22.id_class();
            return rgU_22.id_throws();
        });
    }

    public Optional<rfH_2> id_class(Predicate<rRP> predicate, Predicate<rfH_2> predicate2, rRr_1 rRr_12, rfH_2 rfH_22, int n, Random random) {
        List list = this.id_byte(predicate, rfH_22, n, rRr_12).collect(Collectors.toList());
        Collections.shuffle(list, random);
        return list.stream().filter(rgU_22 -> predicate2.test(rgU_22.id_throws())).findFirst().map(rgU_2::id_throws);
    }

    public boolean id_class(rfH_2 rfH_22, Predicate<rRP> predicate) {
        return this.id_protected(rjh_3.id_class(rfH_22).id_continue()).map(rge_32 -> rge_32.id_class(rfH_22, predicate)).orElse(false);
    }

    public void id_class(rfH_2 rfH_22) {
        ((rge_3)this.id_throws(rjh_3.id_class(rfH_22).id_continue())).id_class(rfH_22);
    }

    public long id_class(Predicate<rRP> predicate, rfH_2 rfH_22, int n, rRr_1 rRr_12) {
        return this.id_byte(predicate, rfH_22, n, rRr_12).count();
    }

    public boolean id_class(rRP rRP2, rfH_2 rfH_22) {
        Optional<rRP> optional = ((rge_3)this.id_throws(rjh_3.id_class(rfH_22).id_continue())).id_byte(rfH_22);
        return optional.isPresent() && optional.get().equals(rRP2);
    }

    public Stream<rgU_2> id_class(Predicate<rRP> predicate, rfj_3 rfj_32, rRr_1 rRr_12) {
        return IntStream.range(0, 16).boxed().map(n -> this.id_protected(rjh_3.id_class(rfj_32, (int)n).id_continue())).filter(Optional::isPresent).flatMap(optional -> ((rge_3)optional.get()).id_class(predicate, rRr_12));
    }

    @Override
    protected void id_class(long l) {
        super.id_class(l);
        this.id_class.id_break(l, this.id_class.id_break(l), false);
    }

    @Override
    public void id_class(BooleanSupplier booleanSupplier) {
        super.id_class(booleanSupplier);
        this.id_class.id_class();
    }

    public int id_class(rjh_3 rjh_32) {
        this.id_class.id_class();
        return this.id_class.id_byte(rjh_32.id_continue());
    }

    public void id_class(rfj_3 rfj_32, roQ_2 roQ_22) {
        rjh_3 rjh_32 = rjh_3.id_class(rfj_32, roQ_22.id_catch() >> 4);
        rqR_2.id_class(this.id_protected(rjh_32.id_continue()), (T rge_32) -> rge_32.id_class((BiConsumer<rfH_2, rRP> biConsumer) -> {
            if (rga_3.id_class(roQ_22)) {
                this.id_class(roQ_22, rjh_32, (BiConsumer<rfH_2, rRP>)biConsumer);
            }
        }), () -> {
            if (rga_3.id_class(roQ_22)) {
                rge_3 rge_32 = (rge_3)this.id_throws(rjh_32.id_continue());
                this.id_class(roQ_22, rjh_32, rge_32::id_class);
            }
        });
    }

    public Stream<rgU_2> id_break(Predicate<rRP> predicate, rfH_2 rfH_22, int n, rRr_1 rRr_12) {
        int n2 = Math.floorDiv(n, 16) + 1;
        return rfj_3.id_class(new rfj_3(rfH_22), n2).flatMap(rfj_32 -> this.id_class(predicate, (rfj_3)rfj_32, rRr_12)).filter(rgU_22 -> {
            rfH_2 rfH_23 = rgU_22.id_throws();
            return Math.abs(rfH_23.b_() - rfH_22.b_()) <= n && Math.abs(rfH_23.d_() - rfH_22.d_()) <= n;
        });
    }

    @Override
    protected void id_break(long l) {
        this.id_class.id_break(l, this.id_class.id_break(l), false);
    }

    public boolean id_break(rfH_2 rfH_22) {
        return ((rge_3)this.id_throws(rjh_3.id_class(rfH_22).id_continue())).id_break(rfH_22);
    }

    public Stream<rfH_2> id_break(Predicate<rRP> predicate, Predicate<rfH_2> predicate2, rfH_2 rfH_22, int n, rRr_1 rRr_12) {
        return this.id_class(predicate, predicate2, rfH_22, n, rRr_12).sorted(Comparator.comparingDouble(rfH_23 -> rfH_23.id_private(rfH_22)));
    }

    public boolean id_case(long l) {
        Optional optional = this.id_byte(l);
        return optional == null ? false : optional.map(rge_32 -> rge_32.id_class(rRP.id_break, rRr_1.IS_OCCUPIED).count() > 0L).orElse(false);
    }

    public Optional<rfH_2> id_protected(Predicate<rRP> predicate, rfH_2 rfH_22, int n, rRr_1 rRr_12) {
        return this.id_byte(predicate, rfH_22, n, rRr_12).map(rgU_2::id_throws).min(Comparator.comparingDouble(rfH_23 -> rfH_23.id_private(rfH_22)));
    }
}

