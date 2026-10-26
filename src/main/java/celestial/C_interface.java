/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.PP;
import celestial.rVi_1;
import celestial.x_1;
import java.util.List;
import java.util.stream.Stream;

public interface C_interface
extends PP {
    public x_1 id_byte();

    public void id_class(String var1, C_static var2) throws x_1;

    public rVi_1 id_class();

    public Stream<String> id_break(String var1, C_static var2) throws x_1;

    public List<String> id_break();

    public List<String> id_catch();

    default public boolean id_case() {
        return false;
    }

    public String id_implements();

    default public void id_private() {
    }
}

