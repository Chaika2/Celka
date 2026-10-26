/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 */
package celestial;

import celestial.IC;
import celestial.II;
import celestial.IJ;
import celestial.fJ_2;
import celestial.fY_2;
import celestial.fp_3;
import celestial.jY_2;
import celestial.lY_2;
import celestial.rAL;
import celestial.rXE;
import celestial.rqO_2;
import celestial.xc_3;
import celestial.yC_2;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;

public class Ip_1
extends jY_2<IC>
implements AutoCloseable {
    private Map<rqO_2, IJ> id_class;
    private fp_3 id_break;
    private final lY_2 id_byte;
    private final fY_2 id_protected;
    private final yC_2 id_throws;
    private int id_case;
    private IJ id_catch;
    private Object2IntMap<xc_3> id_private;

    public lY_2 id_byte() {
        return this.id_byte;
    }

    public Ip_1(fY_2 fY_22, yC_2 yC_22, int n) {
        this.id_protected = fY_22;
        this.id_throws = yC_22;
        this.id_case = n;
        this.id_byte = new lY_2(this);
    }

    public boolean id_class(xc_3 xc_32, xc_3 xc_33) {
        int n;
        if (xc_32 == xc_33) {
            return false;
        }
        int n2 = this.id_private.getInt((Object)xc_32);
        if (n2 != -1 && n2 == (n = this.id_private.getInt((Object)xc_33))) {
            rXE rXE2;
            rXE rXE3 = xc_32.id_volatile();
            return rXE3 != (rXE2 = xc_33.id_volatile());
        }
        return true;
    }

    public fJ_2 id_class(rqO_2 rqO_22) {
        return this.id_break.id_class(rqO_22);
    }

    public void id_class(int n) {
        this.id_case = n;
    }

    public IJ id_class(II iI) {
        return this.id_class.getOrDefault(iI, this.id_catch);
    }

    protected IC id_class(rAL rAL2) {
        return new IC(rAL2, this.id_throws, this.id_case);
    }

    @Override
    protected void id_class(IC iC, rAL rAL2) {
        if (this.id_break != null) {
            this.id_break.close();
        }
        this.id_break = iC.id_class(this.id_protected);
        this.id_class = iC.id_class();
        this.id_private = iC.id_break();
        this.id_catch = this.id_class.get(IC.id_native);
        this.id_byte.id_break();
    }

    @Override
    public void close() {
        if (this.id_break != null) {
            this.id_break.close();
        }
    }

    @Override
    protected /* synthetic */ Object id_break(rAL rAL2) {
        return this.id_class(rAL2);
    }

    public IJ id_break() {
        return this.id_catch;
    }
}

