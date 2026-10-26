/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.At_1;
import celestial.rRJ;
import celestial.rRl_1;
import celestial.rVL;
import celestial.rVm_1;
import celestial.rVv_1;
import celestial.rYB;
import celestial.rqM_2;
import celestial.ruS_2;
import celestial.ruu_3;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.Set;

public class rvZ_2
implements ruS_2<At_1> {
    private int id_class;
    private long id_break;
    private boolean id_byte;
    private rRl_1 id_protected;
    private rRl_1 id_throws;
    private Set<rqM_2<rYB>> id_case;
    private rVv_1 id_catch;
    private rRJ id_private;
    private rqM_2<rYB> id_implements;
    private int id_finally;
    private int id_extends;
    private boolean id_native;
    private boolean id_volatile;
    private boolean id_final;
    private boolean id_package;

    public long id_byte() {
        return this.id_break;
    }

    public rvZ_2() {
    }

    public rvZ_2(int n, rRl_1 rRl_12, rRl_1 rRl_13, long l, boolean bl, Set<rqM_2<rYB>> set, rVv_1 rVv_12, rRJ rRJ2, rqM_2<rYB> rqM_22, int n2, int n3, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.id_class = n;
        this.id_case = set;
        this.id_catch = rVv_12;
        this.id_private = rRJ2;
        this.id_implements = rqM_22;
        this.id_break = l;
        this.id_protected = rRl_12;
        this.id_throws = rRl_13;
        this.id_finally = n2;
        this.id_byte = bl;
        this.id_extends = n3;
        this.id_native = bl2;
        this.id_volatile = bl3;
        this.id_final = bl4;
        this.id_package = bl5;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readInt();
        this.id_byte = ruu_32.readBoolean();
        this.id_protected = rRl_1.id_class(ruu_32.readByte());
        this.id_throws = rRl_1.id_class(ruu_32.readByte());
        int n = ruu_32.id_case();
        this.id_case = Sets.newHashSet();
        for (int i = 0; i < n; ++i) {
            this.id_case.add(rqM_2.id_class(rVL.id_static, ruu_32.id_volatile()));
        }
        this.id_catch = ruu_32.id_class(rVv_1.id_class);
        this.id_private = ruu_32.id_class(rRJ.id_final).get();
        this.id_implements = rqM_2.id_class(rVL.id_static, ruu_32.id_volatile());
        this.id_break = ruu_32.readLong();
        this.id_finally = ruu_32.id_case();
        this.id_extends = ruu_32.id_case();
        this.id_native = ruu_32.readBoolean();
        this.id_volatile = ruu_32.readBoolean();
        this.id_final = ruu_32.readBoolean();
        this.id_package = ruu_32.readBoolean();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeInt(this.id_class);
        ruu_32.writeBoolean(this.id_byte);
        ruu_32.writeByte(this.id_protected.id_class());
        ruu_32.writeByte(this.id_throws.id_class());
        ruu_32.id_protected(this.id_case.size());
        for (rqM_2<rYB> rqM_22 : this.id_case) {
            ruu_32.id_class(rqM_22.id_class());
        }
        ruu_32.id_class(rVv_1.id_class, this.id_catch);
        ruu_32.id_class(rRJ.id_final, () -> this.id_private);
        ruu_32.id_class(this.id_implements.id_class());
        ruu_32.writeLong(this.id_break);
        ruu_32.id_protected(this.id_finally);
        ruu_32.id_protected(this.id_extends);
        ruu_32.writeBoolean(this.id_native);
        ruu_32.writeBoolean(this.id_volatile);
        ruu_32.writeBoolean(this.id_final);
        ruu_32.writeBoolean(this.id_package);
    }

    public int id_break() {
        return this.id_class;
    }

    public rRl_1 id_throws() {
        return this.id_protected;
    }

    public rqM_2<rYB> id_finally() {
        return this.id_implements;
    }

    public Set<rqM_2<rYB>> id_catch() {
        return this.id_case;
    }

    public int id_extends() {
        return this.id_extends;
    }

    public rRl_1 id_case() {
        return this.id_throws;
    }

    public rRJ id_implements() {
        return this.id_private;
    }

    public boolean id_package() {
        return this.id_package;
    }

    public boolean id_protected() {
        return this.id_byte;
    }

    public rVm_1 id_private() {
        return this.id_catch;
    }

    public boolean id_final() {
        return this.id_final;
    }

    public boolean id_volatile() {
        return this.id_volatile;
    }

    public boolean id_native() {
        return this.id_native;
    }
}

