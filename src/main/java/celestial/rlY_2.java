/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rlC_2;
import celestial.rle_3;
import celestial.rlo_3;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;

public class rlY_2 {
    private final Collection<rle_3> id_class = Lists.newArrayList();
    private Collection<rlC_2> id_break = Lists.newArrayList();

    public int id_byte() {
        return (int)this.id_class.stream().filter(rle_3::id_implements).count();
    }

    public rlY_2() {
    }

    public rlY_2(Collection<rle_3> collection) {
        this.id_class.addAll(collection);
    }

    public String toString() {
        return this.id_private();
    }

    public void id_class(rle_3 rle_32) {
        this.id_class.add(rle_32);
        this.id_break.forEach(rle_32::id_class);
    }

    public void id_class(Consumer<rle_3> consumer) {
        this.id_class(new rlo_3(this, consumer));
    }

    public int id_class() {
        return (int)this.id_class.stream().filter(rle_3::id_catch).filter(rle_3::id_extends).count();
    }

    public void id_class(rlC_2 rlC_22) {
        this.id_break.add(rlC_22);
        this.id_class.forEach(rle_32 -> rle_32.id_class(rlC_22));
    }

    public int id_break() {
        return (int)this.id_class.stream().filter(rle_3::id_catch).filter(rle_3::id_native).count();
    }

    public boolean id_throws() {
        return this.id_break() > 0;
    }

    public boolean id_catch() {
        return this.id_byte() == this.id_case();
    }

    public int id_case() {
        return this.id_class.size();
    }

    public boolean id_protected() {
        return this.id_class() > 0;
    }

    public String id_private() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        this.id_class.forEach(rle_32 -> {
            if (!rle_32.id_private()) {
                stringBuffer.append(' ');
            } else if (rle_32.id_case()) {
                stringBuffer.append('+');
            } else if (rle_32.id_catch()) {
                stringBuffer.append(rle_32.id_extends() ? (char)'X' : (char)'x');
            } else {
                stringBuffer.append('_');
            }
        });
        stringBuffer.append(']');
        return stringBuffer.toString();
    }
}

