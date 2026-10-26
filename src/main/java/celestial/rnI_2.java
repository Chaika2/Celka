/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rnW_2;
import java.util.Vector;
import javax.swing.JList;

public class rnI_2
extends JList<String> {
    private final rnW_2 id_class;
    private int id_break;

    public rnI_2(rnW_2 rnW_22) {
        this.id_class = rnW_22;
        rnW_22.id_protected(this::id_class);
    }

    public void id_class() {
        if (this.id_break++ % 20 == 0) {
            Vector<String> vector = new Vector<String>();
            for (int i = 0; i < this.id_class.x().id_super().size(); ++i) {
                vector.add(this.id_class.x().id_super().get(i).sv().getName());
            }
            this.setListData(vector);
        }
    }
}

