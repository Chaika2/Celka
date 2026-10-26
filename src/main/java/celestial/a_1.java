/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rP_2;
import celestial.rU_2;
import celestial.rd_3;
import java.util.HashSet;
import java.util.List;

public interface a_1 {
    public rP_2 id_byte();

    default public a_1 id_class(rP_2 rP_22) {
        throw new UnsupportedOperationException();
    }

    default public double id_class(int n) {
        double d = 0.0;
        List<rd_3> list = this.id_catch();
        for (int i = n; i < list.size(); ++i) {
            d += list.get(i).id_throws();
        }
        return d;
    }

    default public a_1 id_class(Object object) {
        throw new UnsupportedOperationException();
    }

    default public int id_class() {
        return this.id_break().size();
    }

    public List<rU_2> id_break();

    default public void id_throws() {
        List<rU_2> list = this.id_break();
        List<rd_3> list2 = this.id_catch();
        if (!this.id_implements().equals(list.get(0))) {
            throw new IllegalStateException("Start node does not equal first path element");
        }
        if (!this.id_protected().equals(list.get(list.size() - 1))) {
            throw new IllegalStateException("End node does not equal last path element");
        }
        if (list.size() != list2.size() + 1) {
            throw new IllegalStateException("Size of path array is unexpected");
        }
        HashSet<rU_2> hashSet = new HashSet<rU_2>();
        for (int i = 0; i < list.size() - 1; ++i) {
            rU_2 rU_22 = list.get(i);
            rU_2 rU_23 = list.get(i + 1);
            rd_3 rd_32 = list2.get(i);
            if (!rU_22.equals(rd_32.id_break())) {
                throw new IllegalStateException("Path source is not equal to the movement source");
            }
            if (!rU_23.equals(rd_32.id_implements())) {
                throw new IllegalStateException("Path destination is not equal to the movement destination");
            }
            if (hashSet.contains(rU_22)) {
                throw new IllegalStateException("Path doubles back on itself, making a loop");
            }
            hashSet.add(rU_22);
        }
    }

    public List<rd_3> id_catch();

    public int id_case();

    default public rU_2 id_implements() {
        return this.id_break().get(0);
    }

    default public rU_2 id_protected() {
        List<rU_2> list = this.id_break();
        return list.get(list.size() - 1);
    }

    default public a_1 id_private() {
        throw new UnsupportedOperationException();
    }
}

