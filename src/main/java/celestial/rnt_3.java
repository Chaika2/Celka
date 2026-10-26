/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rnT_2;
import celestial.rnv_3;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class rnt_3
extends WindowAdapter {
    public final /* synthetic */ rnT_2 id_class;
    public final /* synthetic */ JFrame id_break;
    public final /* synthetic */ rnv_3 id_byte;

    public rnt_3(rnT_2 rnT_22, JFrame jFrame, rnv_3 rnv_32) {
        this.id_class = rnT_22;
        this.id_break = jFrame;
        this.id_byte = rnv_32;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        if (!this.id_class.id_case.getAndSet(true)) {
            this.id_break.setTitle("Minecraft server - shutting down!");
            this.id_byte.id_class(true);
            this.id_class.id_case();
        }
    }
}

