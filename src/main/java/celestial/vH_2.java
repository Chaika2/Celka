/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Ml_1;
import celestial.cN_2;
import celestial.cq_3;
import celestial.rRl_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rpu_3;
import celestial.vm_3;

public class vH_2
extends vm_3 {
    private static final rgP_2 id_class = new rgn_3("selectWorld.allowCommands");
    private static final rgP_2 id_throws = new rgn_3("selectWorld.gameMode");
    private static final rgP_2 id_case = new rgn_3("lanServer.otherPlayers");
    private final vm_3 id_catch;
    private LF id_private;
    private LF id_implements;
    private String id_finally = "survival";
    private boolean id_else;

    public vH_2(vm_3 vm_32) {
        super(new rgn_3("lanServer.title"));
        this.id_catch = vm_32;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        vH_2.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 50, 0xFFFFFF);
        vH_2.id_class(ml_1, this.id_super, id_case, this.id_package / 2, 82, 0xFFFFFF);
        super.id_class(ml_1, n, n2, f);
    }

    private void id_finally() {
        this.id_implements.id_break(new rgn_3("options.generic_value", id_throws, new rgn_3("selectWorld.gameMode." + this.id_finally)));
        this.id_private.id_break(cN_2.id_class(id_class, this.id_else));
    }

    @Override
    protected void v_() {
        this.id_class(new LF(this.id_package / 2 - 155, this.id_int - 28, 150, 20, new rgn_3("lanServer.start"), lF -> {
            this.id_volatile.id_break((vm_3)null);
            int n = rpu_3.id_class();
            rgn_3 rgn_32 = this.id_volatile.id_this().id_class(rRl_1.id_class(this.id_finally), this.id_else, n) ? new rgn_3("commands.publish.started", n) : new rgn_3("commands.publish.failed");
            ((cq_3)this.id_volatile.id_class[19]).id_throws().id_class(rgn_32);
            this.id_volatile.id_implements();
        }));
        this.id_class(new LF(this.id_package / 2 + 5, this.id_int - 28, 150, 20, cN_2.id_protected, lF -> this.id_volatile.id_break(this.id_catch)));
        this.id_implements = this.id_class(new LF(this.id_package / 2 - 155, 100, 150, 20, rgN_2.id_byte, lF -> {
            this.id_finally = "spectator".equals(this.id_finally) ? "creative" : ("creative".equals(this.id_finally) ? "adventure" : ("adventure".equals(this.id_finally) ? "survival" : "spectator"));
            this.id_finally();
        }));
        this.id_private = this.id_class(new LF(this.id_package / 2 + 5, 100, 150, 20, id_class, lF -> {
            this.id_else = !this.id_else;
            this.id_finally();
        }));
        this.id_finally();
    }
}

