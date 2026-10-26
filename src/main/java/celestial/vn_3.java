/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.QY;
import celestial.cm_3;
import celestial.rqR_2;
import celestial.vF_2;
import celestial.vL_2;
import celestial.vm_3;

public class vn_3
extends vL_2 {
    private final QY id_class = QY.id_instanceof();

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        int n8 = n2 + n5 / 2 - 4;
        ((cm_3)this.id_class.id_class[15]).id_byte(ml_1, vF_2.id_finally, ((vm_3)this.id_class.id_class[73]).id_package / 2 - ((cm_3)this.id_class.id_class[15]).id_class(vF_2.id_finally) / 2, n8, 0xFFFFFF);
        String string = switch ((int)(rqR_2.id_break() / 300L % 4L)) {
            default -> "O o o";
            case 1, 3 -> "o O o";
            case 2 -> "o o O";
        };
        ((cm_3)this.id_class.id_class[15]).id_break(ml_1, string, (float)(((vm_3)this.id_class.id_class[73]).id_package / 2 - ((cm_3)this.id_class.id_class[15]).id_break(string) / 2), (float)(n8 + 9), 0x808080);
    }
}

