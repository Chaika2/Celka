/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.NI;
import celestial.NT;
import celestial.Nc_1;
import celestial.Nf_1;
import celestial.Ng_1;
import celestial.Nq_1;
import celestial.Nt_1;
import celestial.rqO_2;

public class NR
implements Nc_1<Nq_1> {
    public final /* synthetic */ rqO_2 id_class;
    public final /* synthetic */ Nq_1 id_break;
    public final /* synthetic */ Ng_1 id_byte;

    public Nq_1 id_byte() {
        NI nI = this.id_byte.id_class.get(this.id_class);
        if (nI == null) {
            return Nf_1.id_class;
        }
        Nq_1 nq_1 = nI.id_byte();
        return new Nq_1(nq_1.id_byte().toString(), nq_1.id_throws() * this.id_break.id_throws(), nq_1.id_case() * this.id_break.id_case(), this.id_break.id_class(), NT.FILE, nq_1.id_implements() || this.id_break.id_implements(), nq_1.id_finally(), nq_1.id_extends());
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public NR(Ng_1 ng_1, rqO_2 rqO_22, Nq_1 nq_1) {
        this.id_byte = ng_1;
        this.id_class = rqO_22;
        this.id_break = nq_1;
    }

    @Override
    public int id_class() {
        NI nI = this.id_byte.id_class.get(this.id_class);
        return nI == null ? 0 : nI.id_class();
    }

    @Override
    public void id_class(Nt_1 nt_1) {
        NI nI = this.id_byte.id_class.get(this.id_class);
        if (nI != null) {
            nI.id_class(nt_1);
        }
    }

    @Override
    public /* synthetic */ Object id_break() {
        return this.id_byte();
    }
}

