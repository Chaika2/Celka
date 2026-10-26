/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rBW;
import celestial.rLC;
import celestial.rYB;
import celestial.rbF_2;
import celestial.rbq_3;
import celestial.rfH_2;
import celestial.rls_3;
import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;

public class rbH_2
extends rbq_3 {
    private int id_byte;
    private List<rfH_2> id_protected;
    private rLC id_throws;
    private int id_case;
    public final /* synthetic */ rbF_2 id_class;

    @Override
    public void id_byte() {
        this.id_byte = 0;
        this.id_case = 0;
        super.id_byte();
    }

    private void id_byte(rfH_2 rfH_22) {
        this.id_protected.add(rfH_22);
        while (this.id_protected.size() > 3) {
            this.id_protected.remove(0);
        }
    }

    public rbH_2(rbF_2 rbF_22) {
        this.id_class = rbF_22;
        super(rbF_22);
        this.id_byte = ((rYB)this.id_class.id_throws[7]).id_int.nextInt(10);
        this.id_protected = Lists.newArrayList();
        this.id_throws = null;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    private boolean id_class(rfH_2 rfH_22) {
        rbF_2.id_case(this.id_class).id_class(10.0f);
        rbF_2.id_catch(this.id_class).id_class((double)rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_(), 1.0);
        return rbF_2.id_private(this.id_class).id_finally() != null && rbF_2.id_implements(this.id_class).id_finally().id_finally();
    }

    public boolean id_break(rfH_2 rfH_22) {
        return this.id_protected.contains(rfH_22);
    }

    @Override
    public void id_throws() {
        if (this.id_class.id_abstract != null) {
            ++this.id_byte;
            if (this.id_byte > 600) {
                this.id_extends();
            } else if (!rbF_2.id_byte(this.id_class).id_volatile()) {
                if (!this.id_class.id_break(this.id_class.id_abstract, 16)) {
                    if (this.id_class.id_native(this.id_class.id_abstract)) {
                        this.id_native();
                    } else {
                        this.id_class.id_finally(this.id_class.id_abstract);
                    }
                } else {
                    boolean bl = this.id_class(this.id_class.id_abstract);
                    if (!bl) {
                        this.id_extends();
                    } else if (this.id_throws != null && rbF_2.id_protected(this.id_class).id_finally().id_class(this.id_throws)) {
                        ++this.id_case;
                        if (this.id_case > 60) {
                            this.id_native();
                            this.id_case = 0;
                        }
                    } else {
                        this.id_throws = rbF_2.id_throws(this.id_class).id_finally();
                    }
                }
            }
        }
    }

    public void id_finally() {
        this.id_protected.clear();
    }

    @Override
    public boolean id_catch() {
        return this.id_class.id_abstract != null && !this.id_class.k() && this.id_class.sF() && !this.id_protected(this.id_class.id_abstract) && ((rYB)this.id_class.id_throws[7]).id_byte(this.id_class.id_abstract).id_class(rls_3.k);
    }

    private void id_extends() {
        if (this.id_class.id_abstract != null) {
            this.id_byte(this.id_class.id_abstract);
        }
        this.id_native();
    }

    @Override
    public void id_protected() {
        this.id_byte = 0;
        this.id_case = 0;
        rbF_2.id_class(this.id_class).id_final();
        rbF_2.id_break(this.id_class).id_case();
    }

    private boolean id_protected(rfH_2 rfH_22) {
        if (this.id_class.id_break(rfH_22, 2)) {
            return true;
        }
        rLC rLC2 = rbF_2.id_finally(this.id_class).id_finally();
        return rLC2 != null && rLC2.id_volatile().equals(rfH_22) && rLC2.id_finally() && rLC2.id_byte();
    }

    @Override
    public boolean id_private() {
        return this.id_catch();
    }

    private void id_native() {
        this.id_class.id_abstract = null;
        this.id_class.id_throw = 200;
    }
}

