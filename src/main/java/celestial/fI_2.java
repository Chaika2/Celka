/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.ft_3;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;

public class fI_2 {
    private final int id_class;
    private final int id_break;
    private final int id_byte;
    private final int id_protected;
    private List<fI_2> id_throws;
    private ft_3 id_case;

    public int id_byte() {
        return this.id_break;
    }

    public fI_2(int n, int n2, int n3, int n4) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
        this.id_protected = n4;
    }

    public String toString() {
        return "Slot{originX=" + this.id_class + ", originY=" + this.id_break + ", width=" + this.id_byte + ", height=" + this.id_protected + ", texture=" + this.id_case + ", subSlots=" + this.id_throws + "}";
    }

    public void id_class(Consumer<fI_2> consumer) {
        if (this.id_case != null) {
            consumer.accept(this);
        } else if (this.id_throws != null) {
            for (fI_2 fI_22 : this.id_throws) {
                fI_22.id_class(consumer);
            }
        }
    }

    public boolean id_class(ft_3 ft_32) {
        if (this.id_case != null) {
            return false;
        }
        int n = ft_32.id_break;
        int n2 = ft_32.id_byte;
        if (n <= this.id_byte && n2 <= this.id_protected) {
            if (n == this.id_byte && n2 == this.id_protected) {
                this.id_case = ft_32;
                return true;
            }
            if (this.id_throws == null) {
                this.id_throws = Lists.newArrayListWithCapacity((int)1);
                this.id_throws.add(new fI_2(this.id_class, this.id_break, n, n2));
                int n3 = this.id_byte - n;
                int n4 = this.id_protected - n2;
                if (n4 > 0 && n3 > 0) {
                    int n5;
                    int n6 = Math.max(this.id_protected, n3);
                    if (n6 >= (n5 = Math.max(this.id_byte, n4))) {
                        this.id_throws.add(new fI_2(this.id_class, this.id_break + n2, n, n4));
                        this.id_throws.add(new fI_2(this.id_class + n, this.id_break, n3, this.id_protected));
                    } else {
                        this.id_throws.add(new fI_2(this.id_class + n, this.id_break, n3, n2));
                        this.id_throws.add(new fI_2(this.id_class, this.id_break + n2, this.id_byte, n4));
                    }
                } else if (n3 == 0) {
                    this.id_throws.add(new fI_2(this.id_class, this.id_break + n2, n, n4));
                } else if (n4 == 0) {
                    this.id_throws.add(new fI_2(this.id_class + n, this.id_break, n3, n2));
                }
            }
            for (fI_2 fI_22 : this.id_throws) {
                if (!fI_22.id_class(ft_32)) continue;
                return true;
            }
            return false;
        }
        return false;
    }

    public ft_3 id_class() {
        return this.id_case;
    }

    public int id_break() {
        return this.id_class;
    }
}

