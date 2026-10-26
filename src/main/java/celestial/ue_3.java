/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.cb_3;
import celestial.ch_3;
import celestial.ms_3;
import celestial.rJY;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rkg_3;
import celestial.rkw_3;
import celestial.rqs_3;
import celestial.vm_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class ue_3
extends ms_3 {
    private Iterator<rdb_3> id_implements;
    private Set<rdb_3> id_finally;
    private rJY id_extends;
    private rdb_3 id_native;
    private float id_volatile;

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, boolean bl, float f) {
        super.id_class(ml_1, n, n2, bl, f);
        if (this.id_extends != null) {
            if (!vm_3.id_else()) {
                this.id_volatile += f;
            }
            int n3 = this.id_extends.id_throws + n;
            int n4 = this.id_extends.id_case + n2;
            ch_3.id_class(ml_1, n3, n4, n3 + 16, n4 + 16, 0x30FF0000);
            this.id_private.id_float().id_class((cb_3)this.id_private.id_class[57], this.id_native().id_continue(), (float)n3, (float)n4);
            RenderSystem.depthFunc(516);
            ch_3.id_class(ml_1, n3, n4, n3 + 16, n4 + 16, 0x30FFFFFF);
            RenderSystem.depthFunc(515);
        }
    }

    @Override
    public void id_class(rkw_3<?> rkw_32, List<rJY> list) {
        rdn_3 rdn_32 = rkw_32.id_byte();
        this.id_throws.id_class(rkw_32);
        this.id_throws.id_class(rkg_3.id_class(rdn_32), list.get((int)2).id_throws, list.get((int)2).id_case);
        rqs_3<rkg_3> rqs_32 = rkw_32.id_class();
        this.id_extends = list.get(1);
        if (this.id_finally == null) {
            this.id_finally = this.id_protected();
        }
        this.id_implements = this.id_finally.iterator();
        this.id_native = null;
        Iterator iterator = rqs_32.iterator();
        for (int i = 0; i < 2; ++i) {
            if (!iterator.hasNext()) {
                return;
            }
            rkg_3 rkg_32 = (rkg_3)iterator.next();
            if (rkg_32.id_protected()) continue;
            rJY rJY2 = list.get(i);
            this.id_throws.id_class(rkg_32, rJY2.id_throws, rJY2.id_case);
        }
    }

    @Override
    protected void id_class() {
        this.id_case.id_class(152, 182, 28, 18, id_class);
    }

    @Override
    public void id_class(rJY rJY2) {
        super.id_class(rJY2);
        if (rJY2 != null && rJY2.id_protected < this.id_catch.id_throws()) {
            this.id_extends = null;
        }
    }

    protected abstract Set<rdb_3> id_protected();

    private rdb_3 id_native() {
        if (this.id_native == null || this.id_volatile > 30.0f) {
            this.id_volatile = 0.0f;
            if (this.id_implements == null || !this.id_implements.hasNext()) {
                if (this.id_finally == null) {
                    this.id_finally = this.id_protected();
                }
                this.id_implements = this.id_finally.iterator();
            }
            this.id_native = this.id_implements.next();
        }
        return this.id_native;
    }
}

