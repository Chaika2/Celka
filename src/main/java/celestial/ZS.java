/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Ml_1;
import celestial.ZE;
import celestial.cb_3;
import celestial.cm_3;
import celestial.gm_3;
import celestial.mT_2;
import celestial.rgF_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgc_3;
import celestial.rgn_3;
import celestial.rrvL;
import celestial.vm_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class ZS
extends vm_3 {
    private final rgP_2 id_class;
    private final boolean id_throws;
    private rgP_2 id_case;

    private void id_byte(boolean bl) {
        if (bl) {
            this.id_finally();
        } else {
            ((cb_3)this.id_volatile.id_class[57]).J();
            this.id_volatile.id_break((vm_3)null);
        }
    }

    public ZS(rgP_2 rgP_22, boolean bl) {
        super(new rgn_3(bl ? "deathScreen.title.hardcore" : "deathScreen.title"));
        this.id_class = rgP_22;
        this.id_throws = bl;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1, 0, 0, this.id_package, this.id_int, 0x60500000, -1602211792);
        RenderSystem.pushMatrix();
        RenderSystem.scalef(2.0f, 2.0f, 2.0f);
        ZS.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2 / 2, 30, 0xFFFFFF);
        RenderSystem.popMatrix();
        if (this.id_class != null) {
            ZS.id_class(ml_1, this.id_super, this.id_class, this.id_package / 2, 85, 0xFFFFFF);
        }
        ZS.id_class(ml_1, this.id_super, this.id_case, this.id_package / 2, 100, 0xFFFFFF);
        if (this.id_class != null && n2 > 85 && n2 < 94) {
            rgc_3 rgc_32 = this.id_break(n);
            this.id_class(ml_1, rgc_32, n, n2);
        }
        super.id_class(ml_1, n, n2, f);
    }

    private rgc_3 id_break(int n) {
        if (this.id_class == null) {
            return null;
        }
        int n2 = ((cm_3)this.id_volatile.id_class[15]).id_class(this.id_class);
        int n3 = this.id_package / 2 - n2 / 2;
        int n4 = this.id_package / 2 + n2 / 2;
        return n >= n3 && n <= n4 ? ((cm_3)this.id_volatile.id_class[15]).id_break().id_class(this.id_class, n - n3) : null;
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        rgc_3 rgc_32;
        if (this.id_class != null && d2 > 85.0 && d2 < 94.0 && (rgc_32 = this.id_break((int)d)) != null && rgc_32.id_private() != null && rgc_32.id_private().id_class() == rgH_2.OPEN_URL) {
            this.id_class(rgc_32);
            return false;
        }
        return super.id_break(d, d2, n);
    }

    private void id_finally() {
        if ((gm_3)this.id_volatile.id_class[56] != null) {
            ((gm_3)this.id_volatile.id_class[56]).id_catch();
        }
        this.id_volatile.id_byte(new ZE(new rgn_3("menu.savingLevel")));
        this.id_volatile.id_break(new rrvL());
    }

    @Override
    public boolean E_() {
        return false;
    }

    @Override
    protected void v_() {
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 72, 200, 20, this.id_throws ? new rgn_3("deathScreen.spectate") : new rgn_3("deathScreen.respawn"), lF -> {
            ((cb_3)this.id_volatile.id_class[57]).J();
            this.id_volatile.id_break((vm_3)null);
        }));
        LF lF2 = this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 96, 200, 20, new rgn_3("deathScreen.titleScreen"), lF -> {
            if (this.id_throws) {
                this.id_finally();
            } else {
                mT_2 mT_22 = new mT_2(this::id_byte, new rgn_3("deathScreen.quit.confirm"), rgN_2.id_byte, new rgn_3("deathScreen.titleScreen"), new rgn_3("deathScreen.respawn"));
                this.id_volatile.id_break(mT_22);
                mT_22.id_break(20);
            }
        }));
        if (!this.id_throws && this.id_volatile.id_while() == null) {
            lF2.id_int = false;
        }
        this.id_case = new rgn_3("deathScreen.score").id_break(": ").id_class(new rgN_2(Integer.toString(((cb_3)this.id_volatile.id_class[57]).sp())).id_class(rgF_2.YELLOW));
    }

    @Override
    public boolean z_() {
        return false;
    }
}

