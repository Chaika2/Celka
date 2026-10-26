/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Ml_1;
import celestial.rgN_2;
import celestial.rgn_3;
import celestial.rrvL;
import celestial.vm_3;

public class vS_2
extends vm_3 {
    public vS_2() {
        super(new rgN_2("Out of memory!"));
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        vS_2.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, this.id_int / 4 - 60 + 20, 0xFFFFFF);
        vS_2.id_byte(ml_1, this.id_super, "Minecraft has run out of memory.", this.id_package / 2 - 140, this.id_int / 4 - 60 + 60 + 0, 0xA0A0A0);
        vS_2.id_byte(ml_1, this.id_super, "This could be caused by a bug in the game or by the", this.id_package / 2 - 140, this.id_int / 4 - 60 + 60 + 18, 0xA0A0A0);
        vS_2.id_byte(ml_1, this.id_super, "Java Virtual Machine not being allocated enough", this.id_package / 2 - 140, this.id_int / 4 - 60 + 60 + 27, 0xA0A0A0);
        vS_2.id_byte(ml_1, this.id_super, "memory.", this.id_package / 2 - 140, this.id_int / 4 - 60 + 60 + 36, 0xA0A0A0);
        vS_2.id_byte(ml_1, this.id_super, "To prevent level corruption, the current game has quit.", this.id_package / 2 - 140, this.id_int / 4 - 60 + 60 + 54, 0xA0A0A0);
        vS_2.id_byte(ml_1, this.id_super, "We've tried to free up enough memory to let you go back to", this.id_package / 2 - 140, this.id_int / 4 - 60 + 60 + 63, 0xA0A0A0);
        vS_2.id_byte(ml_1, this.id_super, "the main menu and back to playing, but this may not have worked.", this.id_package / 2 - 140, this.id_int / 4 - 60 + 60 + 72, 0xA0A0A0);
        vS_2.id_byte(ml_1, this.id_super, "Please restart the game if you see this message again.", this.id_package / 2 - 140, this.id_int / 4 - 60 + 60 + 81, 0xA0A0A0);
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    public boolean E_() {
        return false;
    }

    @Override
    protected void v_() {
        this.id_class(new LF(this.id_package / 2 - 155, this.id_int / 4 + 120 + 12, 150, 20, new rgn_3("gui.toTitle"), lF -> this.id_volatile.id_break(new rrvL())));
        this.id_class(new LF(this.id_package / 2 - 155 + 160, this.id_int / 4 + 120 + 12, 150, 20, new rgn_3("menu.quit"), lF -> this.id_volatile.G()));
    }
}

