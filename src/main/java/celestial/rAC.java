/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAI;
import celestial.rAo_1;
import celestial.rqO_2;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;

public interface rAC
extends AutoCloseable {
    public String id_class();

    public <T> T id_class(rAo_1<T> var1) throws IOException;

    public Set<String> id_class(rAI var1);

    public InputStream id_class(rAI var1, rqO_2 var2) throws IOException;

    public Collection<rqO_2> id_class(rAI var1, String var2, String var3, int var4, Predicate<String> var5);

    public InputStream id_class(String var1) throws IOException;

    @Override
    public void close();

    public boolean id_break(rAI var1, rqO_2 var2);
}

