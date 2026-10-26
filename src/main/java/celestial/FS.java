/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LA;
import celestial.LF;
import celestial.Ml_1;
import celestial.Qw_1;
import celestial.cm_3;
import celestial.rfU_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rrQK;
import celestial.rrQX;
import celestial.rrfD_2;
import celestial.util.AnimValue;
import celestial.util.MinecraftAccessor;
import com.mojang.blaze3d.systems.RenderSystem;

public class FS
extends LF
implements MinecraftAccessor {
    private final AnimValue id_case = new AnimValue((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[1]), 0.4f, false);
    public float id_class;
    public float id_throws;

    public FS(int n, int n2, int n3, int n4, LA lA) {
        super(n, n2, n3, n4, rgN_2.id_byte, lF -> {}, lA);
        this.id_class = n;
        this.id_throws = n2;
    }

    @Override
    public void id_break(Ml_1 ml_1, int n, int n2, float f) {
        rgN_2 rgN_22 = new rgN_2("Reset Draggables");
        boolean bl = this.B_();
        int n3 = ((Qw_1)FS.id_import.id_class[20]).id_class(Integer.MIN_VALUE);
        int n4 = bl ? 0xFFFFA0 : 0xFFFFFF;
        cm_3 cm_32 = (cm_3)FS.id_import.id_class[15];
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, this.id_continue);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableDepthTest();
        rrfD_2.id_protected(ml_1, this.id_class, this.id_throws, this.id_extends, this.id_native, n3);
        FS.id_class(ml_1, cm_32, (rgP_2)rgN_22, this.id_class + (float)this.id_extends / 2.0f, this.id_throws + (float)(this.id_native - 8) / 2.0f, n4 | rfU_2.id_case(this.id_continue * 255.0f) << 24);
        if (bl) {
            this.id_class(ml_1, n, n2);
        }
    }

    @Override
    public void id_catch() {
        super.id_catch();
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_class().id_break();
    }

    public AnimValue id_private() {
        return this.id_case;
    }
}

