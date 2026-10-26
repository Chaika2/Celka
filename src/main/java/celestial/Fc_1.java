/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.FM;
import celestial.FV;
import celestial.Fb_1;
import celestial.Fj_1;
import celestial.LZ;
import celestial.Ml_1;
import celestial.cl_3;
import celestial.rXe_1;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhz_3;
import celestial.rqO_2;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;

public class Fc_1
extends Fb_1<rXe_1>
implements cl_3<rXe_1> {
    private static final rqO_2 id_class = new rqO_2("textures/gui/container/generic_54.png");
    private static final rgn_3 id_throws = new rgn_3("container.chest");
    private static final rgn_3 id_case = new rgn_3("container.chestDouble");
    private static final rgn_3 id_catch = new rgn_3("container.enderchest");
    private final int id_private;

    public Fc_1(rXe_1 rXe_12, rhz_3 rhz_32, rgP_2 rgP_22) {
        super(rXe_12, rhz_32, rgP_22);
        this.id_continue = false;
        this.id_private = rXe_12.id_break();
        this.id_return = 114 + this.id_private * 18;
        this.id_try = this.id_return - 94;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        super.id_class(ml_1, n, n2, f);
        this.id_break(ml_1, n, n2);
    }

    @Override
    protected void id_class(Ml_1 ml_1, float f, int n, int n2) {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(id_class);
        int n3 = (this.id_package - this.id_synchronized) / 2;
        int n4 = (this.id_int - this.id_return) / 2;
        this.id_break(ml_1, n3, n4, 0, 0, this.id_synchronized, this.id_private * 18 + 17);
        this.id_break(ml_1, n3, n4 + this.id_private * 18 + 17, 0, 126, this.id_synchronized, 96);
    }

    @Override
    public boolean id_finally() {
        if (this.id_extends == null) {
            return false;
        }
        String string = this.id_extends.getString();
        return id_throws.getString().equals(string) || id_case.getString().equals(string) || id_catch.getString().equals(string);
    }

    @Override
    public List<LZ> id_native() {
        ArrayList<LZ> arrayList = new ArrayList<LZ>();
        arrayList.add(new Fj_1(this, 0, 0, 100, 20, lF -> this.id_class(FM.PUT_ALL)));
        arrayList.add(new FV(this, 0, 0, 100, 20, lF -> this.id_class(FM.TAKE_ALL)));
        for (int i = 0; i < arrayList.size(); ++i) {
            LZ lZ = (LZ)arrayList.get(i);
            int n = 20;
            int n2 = 2;
            int n3 = this.id_char + this.id_synchronized + 5;
            int n4 = this.id_abstract + i * (n + n2);
            lZ.id_volatile = n3;
            lZ.id_final = n4;
            lZ.id_finally(false);
        }
        return arrayList;
    }
}

