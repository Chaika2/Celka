/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVK;
import celestial.rgA_2;
import celestial.rgS_2;
import celestial.rgc_3;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class rVD {
    public final List<rVK> id_class;
    private String id_break;

    public rVD(List<rVK> list) {
        this.id_class = list;
        this.id_break = list.stream().map(rVK2 -> rVK2.id_byte).collect(Collectors.joining());
    }

    public rgS_2 id_class() {
        rgA_2 rgA_22 = new rgA_2();
        this.id_class.forEach(rgA_22::id_class);
        this.id_class.clear();
        return rgA_22.id_class();
    }

    public rgS_2 id_class(int n, int n2, rgc_3 rgc_32) {
        rgA_2 rgA_22 = new rgA_2();
        ListIterator<rVK> listIterator = this.id_class.listIterator();
        int n3 = n;
        boolean bl = false;
        while (listIterator.hasNext()) {
            String string;
            rVK rVK2 = listIterator.next();
            String string2 = rVK2.id_byte;
            int n4 = string2.length();
            if (!bl) {
                if (n3 > n4) {
                    rgA_22.id_class(rVK2);
                    listIterator.remove();
                    n3 -= n4;
                } else {
                    string = string2.substring(0, n3);
                    if (!string.isEmpty()) {
                        rgA_22.id_class(rgS_2.id_class(string, rVK2.id_protected));
                    }
                    n3 += n2;
                    bl = true;
                }
            }
            if (!bl) continue;
            if (n3 <= n4) {
                string = string2.substring(n3);
                if (string.isEmpty()) {
                    listIterator.remove();
                    break;
                }
                listIterator.set(new rVK(string, rgc_32));
                break;
            }
            listIterator.remove();
            n3 -= n4;
        }
        this.id_break = this.id_break.substring(n + n2);
        return rgA_22.id_break();
    }

    public char id_class(int n) {
        return this.id_break.charAt(n);
    }
}

