/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_import;
import celestial.C_interface;
import celestial.PP;
import celestial.rgF_2;
import java.util.List;

public interface m_1 {
    default public void id_class(C_interface c_interface, List<C_import> list) {
        PP.a_.id_class(this.getMessage(), rgF_2.RED);
        if (!c_interface.id_case()) {
            PP.a_.id_class(c_interface.id_class());
        }
    }

    public String getMessage();
}

