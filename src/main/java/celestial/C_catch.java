/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_char;
import celestial.C_goto;
import celestial.PP;
import celestial.cb_3;
import celestial.rt_3;
import java.util.List;
import java.util.Objects;

public interface C_catch {
    public C_char id_byte();

    default public C_case id_class(cb_3 cb_32) {
        for (C_case c_case : this.id_case()) {
            if (!Objects.equals(cb_32, c_case.id_throw().id_catch())) continue;
            return c_case;
        }
        return null;
    }

    public rt_3 id_class();

    public C_case id_break();

    public C_goto id_throws();

    default public boolean id_catch() {
        return this.id_private().id_goto().id_byte();
    }

    public List<C_case> id_case();

    default public C_case id_private() {
        for (C_case c_case : this.id_case()) {
            if (!Objects.equals((cb_3)PP.b_.id_class[57], c_case.id_throw().id_catch())) continue;
            return c_case;
        }
        return null;
    }
}

