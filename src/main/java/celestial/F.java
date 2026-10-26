/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_import;
import celestial.C_interface;
import celestial.L;
import celestial.rqj_3;
import java.util.List;
import java.util.stream.Stream;

public interface F {
    public Stream<String> id_byte(String var1);

    public Stream<String> id_class(rqj_3<String, List<C_import>> var1);

    public L<C_interface> id_class();

    public boolean id_class(String var1);

    public C_case id_break();

    public C_interface id_break(String var1);

    public boolean id_break(rqj_3<String, List<C_import>> var1);
}

