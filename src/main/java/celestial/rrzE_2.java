/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

public class rrzE_2
extends Properties {
    private Set<Object> id_class = new LinkedHashSet<Object>();

    @Override
    public synchronized Object put(Object object, Object object2) {
        if (object instanceof String) {
            object = ((String)object).trim();
        }
        if (object2 instanceof String) {
            object2 = ((String)object2).trim();
        }
        this.id_class.add(object);
        return super.put(object, object2);
    }

    @Override
    public synchronized Enumeration<Object> keys() {
        return Collections.enumeration(this.keySet());
    }

    @Override
    public Set<Object> keySet() {
        Set<Object> set = super.keySet();
        this.id_class.retainAll(set);
        return Collections.unmodifiableSet(this.id_class);
    }
}

