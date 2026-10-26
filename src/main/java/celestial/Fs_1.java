/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LA;
import celestial.LF;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.Qw_1;
import celestial.cN_2;
import celestial.cm_3;
import celestial.rfU_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.util.MinecraftAccessor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Arrays;

public class Fs_1
extends LF
implements MinecraftAccessor {
    private static final String[] id_class = new String[]{"warp", "call", "tpa", "tp", "l", "login", "register", "reg", "cp", "changepass", "cpass", "changepassword"};
    private static final rgn_3 id_throws = new rgn_3("chat.streamerMode");

    public Fs_1(int n, int n2, int n3, int n4, LA lA) {
        super(n, n2, n3, n4, rgN_2.id_byte, lF -> ((Qw_1)Fs_1.id_import.id_class[20]).id_final(), lA);
    }

    public boolean id_class(Lu_1 lu_1) {
        if (!((Qw_1)Fs_1.id_import.id_class[20]).O) {
            return false;
        }
        return Arrays.stream(id_class).anyMatch(string -> lu_1.id_private().startsWith("/" + string + " "));
    }

    @Override
    public void id_break(Ml_1 ml_1, int n, int n2, float f) {
        rgP_2 rgP_22 = this.id_private();
        boolean bl = this.B_();
        int n3 = ((Qw_1)Fs_1.id_import.id_class[20]).id_class(Integer.MIN_VALUE);
        int n4 = bl ? 0xFFFFA0 : 0xFFFFFF;
        cm_3 cm_32 = (cm_3)Fs_1.id_import.id_class[15];
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, this.id_continue);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableDepthTest();
        Fs_1.id_class(ml_1, this.id_volatile, this.id_final, this.id_volatile + this.id_extends, this.id_final + this.id_native, n3);
        Fs_1.id_class(ml_1, cm_32, rgP_22, this.id_volatile + this.id_extends / 2, this.id_final + (this.id_native - 8) / 2, n4 | rfU_2.id_case(this.id_continue * 255.0f) << 24);
        if (bl) {
            this.id_class(ml_1, n, n2);
        }
    }

    private rgP_2 id_private() {
        return cN_2.id_class(id_throws, ((Qw_1)Fs_1.id_import.id_class[20]).O);
    }
}

