/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.AJ;
import celestial.AZ;
import com.google.common.collect.Lists;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;

public class Am_1 {
    private final List<AZ> id_class = Lists.newArrayList();
    private boolean id_break;

    public synchronized List<AZ> id_byte() {
        return Collections.unmodifiableList(this.id_class);
    }

    public synchronized void id_class(String string, InetAddress inetAddress) {
        String string2 = AJ.id_class(string);
        Object object = AJ.id_break(string);
        if (object != null) {
            object = inetAddress.getHostAddress() + ":" + (String)object;
            boolean bl = false;
            for (AZ aZ : this.id_class) {
                if (!aZ.id_break().equals(object)) continue;
                aZ.id_byte();
                bl = true;
                break;
            }
            if (!bl) {
                this.id_class.add(new AZ(string2, (String)object));
                this.id_break = true;
            }
        }
    }

    public synchronized boolean id_class() {
        return this.id_break;
    }

    public synchronized void id_break() {
        this.id_break = false;
    }
}

