/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 */
package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class gB_2 {
    public String id_class;
    private final List<String> id_break = Lists.newArrayList();

    public String toString() {
        if (this.id_class != null) {
            return this.id_break.isEmpty() ? this.id_class : this.id_class + " " + this.id_class();
        }
        return this.id_break.isEmpty() ? "(Unknown file)" : "(Unknown file) " + this.id_class();
    }

    public void id_class(String string) {
        this.id_break.add(0, string);
    }

    public String id_class() {
        return StringUtils.join(this.id_break, (String)"->");
    }
}

