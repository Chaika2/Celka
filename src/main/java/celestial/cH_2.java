/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cC_2;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public interface cH_2
extends cC_2 {
    default public void id_byte(cC_2 cC_22) {
        this.id_class(cC_22);
    }

    default public Optional<cC_2> id_byte(double d, double d2) {
        for (cC_2 cC_22 : this.x_()) {
            if (!cC_22.id_break(d, d2)) continue;
            return Optional.of(cC_22);
        }
        return Optional.empty();
    }

    @Override
    default public boolean id_class(double d, double d2, double d3) {
        return this.id_byte(d, d2).filter(cC_22 -> cC_22.id_class(d, d2, d3)).isPresent();
    }

    @Override
    default public boolean id_class(int n, int n2, int n3) {
        return this.id_catch() != null && this.id_catch().id_class(n, n2, n3);
    }

    public void id_class(boolean var1);

    public void id_class(cC_2 var1);

    @Override
    default public boolean id_class(char c, int n) {
        return this.id_catch() != null && this.id_catch().id_class(c, n);
    }

    @Override
    default public boolean id_class(double d, double d2, int n) {
        this.id_class(false);
        return this.id_byte(d, d2).filter(cC_22 -> cC_22.id_class(d, d2, n)).isPresent();
    }

    @Override
    default public boolean id_class(double d, double d2, int n, double d3, double d4) {
        return this.id_catch() != null && this.id_case() && n == 0 ? this.id_catch().id_class(d, d2, n, d3, d4) : false;
    }

    @Override
    default public boolean id_break(boolean bl) {
        Supplier<cC_2> supplier;
        BooleanSupplier booleanSupplier;
        boolean bl2;
        cC_2 cC_22 = this.id_catch();
        boolean bl3 = bl2 = cC_22 != null;
        if (bl2 && cC_22.id_break(bl)) {
            return true;
        }
        List<? extends cC_2> list = this.x_();
        int n = list.indexOf(cC_22);
        int n2 = bl2 && n >= 0 ? n + (bl ? 1 : 0) : (bl ? 0 : list.size());
        ListIterator<? extends cC_2> listIterator = list.listIterator(n2);
        BooleanSupplier booleanSupplier2 = bl ? listIterator::hasNext : (booleanSupplier = listIterator::hasPrevious);
        Supplier<cC_2> supplier2 = bl ? listIterator::next : (supplier = listIterator::previous);
        while (booleanSupplier.getAsBoolean()) {
            cC_2 cC_23 = supplier.get();
            if (!cC_23.id_break(bl)) continue;
            this.id_class(cC_23);
            return true;
        }
        this.id_class(null);
        return false;
    }

    default public void id_break(cC_2 cC_22) {
        this.id_class(cC_22);
        cC_22.id_break(true);
    }

    @Override
    default public boolean id_break(int n, int n2, int n3) {
        return this.id_catch() != null && this.id_catch().id_break(n, n2, n3);
    }

    @Override
    default public boolean id_break(double d, double d2, int n) {
        for (cC_2 cC_22 : this.x_()) {
            if (!cC_22.id_break(d, d2, n)) continue;
            this.id_class(cC_22);
            if (n == 0) {
                this.id_class(true);
            }
            return true;
        }
        return false;
    }

    public cC_2 id_catch();

    public boolean id_case();

    public List<? extends cC_2> x_();
}

