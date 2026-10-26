/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.rFL;
import celestial.rFv_1;
import celestial.rRG;
import celestial.rRM;
import celestial.rRb_1;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rhN_2;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class rrEQ
extends rRG {
    private final Set<rhN_2> id_class = Sets.newHashSet();
    private final Set<rhN_2> id_break = Collections.unmodifiableSet(this.id_class);
    private boolean id_finally = true;

    @Override
    public rRG id_byte(boolean bl) {
        if (bl != this.id_implements) {
            super.id_byte(bl);
            this.id_class(rFL.UPDATE_PROPERTIES);
        }
        return this;
    }

    public void id_byte() {
        if (!this.id_class.isEmpty()) {
            for (rhN_2 rhN_22 : Lists.newArrayList(this.id_class)) {
                this.id_break(rhN_22);
            }
        }
    }

    public Collection<rhN_2> id_int() {
        return this.id_break;
    }

    public rrEQ(rgP_2 rgP_22, rRb_1 rRb_12, rRM rRM2) {
        super(rfU_2.id_class(), rgP_22, rRb_12, rRM2);
    }

    private void id_class(rFL rFL2) {
        if (this.id_finally) {
            rFv_1 rFv_12 = new rFv_1(rFL2, this);
            for (rhN_2 rhN_22 : this.id_class) {
                rhN_22.id_class.id_class(rFv_12);
            }
        }
    }

    public void id_class(rhN_2 rhN_22) {
        if (this.id_class.add(rhN_22) && this.id_finally) {
            rhN_22.id_class.id_class(new rFv_1(rFL.ADD, this));
        }
    }

    @Override
    public void id_class(float f) {
        if (f != this.id_protected) {
            super.id_class(f);
            this.id_class(rFL.UPDATE_PCT);
        }
    }

    @Override
    public void id_class(rgP_2 rgP_22) {
        if (!Objects.equal((Object)rgP_22, (Object)this.id_byte)) {
            super.id_class(rgP_22);
            this.id_class(rFL.UPDATE_NAME);
        }
    }

    @Override
    public rRG id_class(boolean bl) {
        if (bl != this.id_catch) {
            super.id_class(bl);
            this.id_class(rFL.UPDATE_PROPERTIES);
        }
        return this;
    }

    @Override
    public void id_class(rRM rRM2) {
        if (rRM2 != this.id_case) {
            super.id_class(rRM2);
            this.id_class(rFL.UPDATE_STYLE);
        }
    }

    @Override
    public void id_class(rRb_1 rRb_12) {
        if (rRb_12 != this.id_throws) {
            super.id_class(rRb_12);
            this.id_class(rFL.UPDATE_STYLE);
        }
    }

    @Override
    public rRG id_break(boolean bl) {
        if (bl != this.id_private) {
            super.id_break(bl);
            this.id_class(rFL.UPDATE_PROPERTIES);
        }
        return this;
    }

    public void id_break(rhN_2 rhN_22) {
        if (this.id_class.remove(rhN_22) && this.id_finally) {
            rhN_22.id_class.id_class(new rFv_1(rFL.REMOVE, this));
        }
    }

    public boolean id_package() {
        return this.id_finally;
    }

    public void id_protected(boolean bl) {
        if (bl != this.id_finally) {
            this.id_finally = bl;
            for (rhN_2 rhN_22 : this.id_class) {
                rhN_22.id_class.id_class(new rFv_1(bl ? rFL.ADD : rFL.REMOVE, this));
            }
        }
    }
}

