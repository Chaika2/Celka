/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.lD_2;
import celestial.rrMh_1;
import celestial.yk_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class yb_3 {
    private final lD_2 id_class;
    private static final yb_3 id_break = new yb_3();

    public lD_2 id_byte() {
        return this.id_class;
    }

    public yb_3(int n) {
        this.id_class = new lD_2(n);
    }

    public yb_3() {
        this(0x200000);
    }

    public void id_class(lD_2 lD_22) {
        if (lD_22.id_finally != null) {
            rrMh_1.id_class(lD_22.id_finally);
        }
        lD_22.id_finally();
        yk_3.id_class(lD_22);
    }

    public static yb_3 id_class() {
        RenderSystem.assertThread(RenderSystem::isOnGameThreadOrInit);
        return id_break;
    }

    public void id_break() {
        this.id_class(this.id_class);
    }
}

