/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap
 */
package celestial;

import celestial.HU;
import celestial.Hv_1;
import celestial.kZ_2;
import celestial.lw_3;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.rrGi_1;
import celestial.rrJl_1;
import celestial.rrJp_1;
import celestial.rrbb_3;
import celestial.wK_2;
import celestial.xc_3;
import it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class rrxF_2 {
    private xc_3 id_class;
    private rfH_2 id_break;
    private int id_byte = -1;
    private int id_protected = -1;
    private int id_throws = -1;
    private int id_case = -1;
    private float[] id_catch = new float[rpr_3.VALUES.length * 2];
    private BitSet id_private = new BitSet(3);
    private lw_3 id_implements = new lw_3();
    private rrGi_1 id_finally = null;
    private boolean[] id_extends = null;
    private boolean[] id_native = null;
    private boolean[] id_volatile = null;
    private rpr_3[] id_final = null;
    private List<wK_2> id_package = new ArrayList<wK_2>();
    private List<wK_2> id_int = new ArrayList<wK_2>();
    private wK_2[] id_new = new wK_2[1];
    private wK_2[] id_continue = new wK_2[2];
    private wK_2[] id_super = new wK_2[3];
    private wK_2[] id_this = new wK_2[4];
    private Hv_1 id_else = null;
    private rrJp_1[] id_synchronized = new rrJp_1[HU.s.length];
    private boolean id_return = false;
    private Long2ByteLinkedOpenHashMap id_public = new Long2ByteLinkedOpenHashMap();
    private static final int id_goto = -1;
    private static final int id_while = 0;
    private static final int id_try = 1;

    public float[] id_byte() {
        return this.id_catch;
    }

    public boolean id_int() {
        return this.id_return;
    }

    public rrxF_2(xc_3 xc_32, rfH_2 rfH_22) {
        this.id_class = xc_32;
        this.id_break = rfH_22;
    }

    public wK_2[] id_class(wK_2 wK_22, wK_2 wK_23) {
        this.id_continue[0] = wK_22;
        this.id_continue[1] = wK_23;
        return this.id_continue;
    }

    public void id_class(xc_3 xc_32, rfH_2 rfH_22) {
        if (this.id_class != xc_32 || this.id_break != rfH_22) {
            this.id_class = xc_32;
            this.id_break = rfH_22;
            this.id_byte = -1;
            this.id_protected = -1;
            this.id_throws = -1;
            this.id_case = -1;
            this.id_private.clear();
        }
    }

    public List<wK_2> id_class(wK_2[] wK_2Array) {
        this.id_int.clear();
        if (wK_2Array != null) {
            for (int i = 0; i < wK_2Array.length; ++i) {
                wK_2 wK_22 = wK_2Array[i];
                this.id_int.add(wK_22);
            }
        }
        return this.id_int;
    }

    public void id_class(Hv_1 hv_1) {
        this.id_else = hv_1;
    }

    public rpr_3[] id_class(rpr_3 rpr_32, rpr_3 rpr_33, rpr_3 rpr_34, rpr_3 rpr_35) {
        rpr_3[] rpr_3Array = this.id_native();
        rpr_3Array[0] = rpr_32;
        rpr_3Array[1] = rpr_33;
        rpr_3Array[2] = rpr_34;
        rpr_3Array[3] = rpr_35;
        return rpr_3Array;
    }

    public rrJp_1 id_class(HU hU) {
        rrJp_1 rrJp_12 = this.id_synchronized[hU.id_protected()];
        if (rrJp_12 == null) {
            this.id_synchronized[hU.id_protected()] = rrJp_12 = new rrJp_1();
        }
        return rrJp_12;
    }

    public wK_2[] id_class(wK_2 wK_22, wK_2 wK_23, wK_2 wK_24) {
        this.id_super[0] = wK_22;
        this.id_super[1] = wK_23;
        this.id_super[2] = wK_24;
        return this.id_super;
    }

    public void id_class(boolean bl) {
        this.id_return = bl;
    }

    public int id_class() {
        if (this.id_byte < 0) {
            this.id_byte = this.id_class.id_continue();
        }
        return this.id_byte;
    }

    public wK_2[] id_class(wK_2 wK_22, wK_2 wK_23, wK_2 wK_24, wK_2 wK_25) {
        this.id_this[0] = wK_22;
        this.id_this[1] = wK_23;
        this.id_this[2] = wK_24;
        this.id_this[3] = wK_25;
        return this.id_this;
    }

    public boolean id_class(List list) {
        if (this.id_throws == -1 && list.size() > 0) {
            this.id_throws = list.get(0) instanceof rrJl_1 ? 1 : 0;
        }
        return this.id_throws == 1;
    }

    public boolean id_class(wK_2 wK_22) {
        if (this.id_throws < 0) {
            this.id_throws = wK_22 instanceof rrJl_1 ? 1 : 0;
        }
        return this.id_throws == 1;
    }

    public wK_2[] id_break(wK_2 wK_22) {
        this.id_new[0] = wK_22;
        return this.id_new;
    }

    public int id_break() {
        if (this.id_protected < 0) {
            this.id_protected = this.id_class.id_super();
        }
        return this.id_protected;
    }

    public lw_3 id_throws() {
        return this.id_implements;
    }

    public boolean[] id_finally() {
        if (this.id_native == null) {
            this.id_native = new boolean[4];
        }
        return this.id_native;
    }

    public xc_3 id_catch() {
        return this.id_class;
    }

    public boolean[] id_extends() {
        if (this.id_volatile == null) {
            this.id_volatile = new boolean[4];
        }
        return this.id_volatile;
    }

    public boolean id_case() {
        return this.id_throws == 1;
    }

    public boolean[] id_implements() {
        if (this.id_extends == null) {
            this.id_extends = new boolean[4];
        }
        return this.id_extends;
    }

    public Long2ByteLinkedOpenHashMap id_new() {
        return this.id_public;
    }

    public Hv_1 id_package() {
        return this.id_else;
    }

    public BitSet id_protected() {
        return this.id_private;
    }

    public rrGi_1 id_private() {
        if (this.id_finally == null) {
            this.id_finally = new rrGi_1(0, 0, 0);
        }
        return this.id_finally;
    }

    public List<wK_2> id_final() {
        return this.id_package;
    }

    public boolean id_volatile() {
        if (this.id_case == -1) {
            this.id_case = rrbb_3.id_static() && this.id_class.id_break() instanceof kZ_2 ? 1 : 0;
        }
        return this.id_case == 1;
    }

    public rpr_3[] id_native() {
        if (this.id_final == null) {
            this.id_final = new rpr_3[4];
        }
        return this.id_final;
    }
}

