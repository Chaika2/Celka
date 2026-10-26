/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAC;
import celestial.rAF;
import celestial.rqO_2;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface rAL {
    public List<rAF> id_byte(rqO_2 var1) throws IOException;

    public Collection<rqO_2> id_class(String var1, Predicate<String> var2);

    public Set<String> id_class();

    public rAF id_class(rqO_2 var1) throws IOException;

    public boolean id_break(rqO_2 var1);

    public Stream<rAC> id_break();
}

