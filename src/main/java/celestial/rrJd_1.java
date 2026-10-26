/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.QF;
import celestial.rrJJ;
import celestial.rrJO;
import celestial.rrba_3;
import celestial.vm_3;
import java.awt.Rectangle;
import java.util.ArrayList;

public class rrJd_1
implements rrJJ {
    public static String[] id_class(String string) {
        String string2;
        String string3;
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < 10 && (string3 = rrba_3.id_class(string2 = string + ".tooltip." + (i + 1), (String)null)) != null; ++i) {
            arrayList.add(string3);
        }
        return arrayList.size() <= 0 ? null : arrayList.toArray(new String[arrayList.size()]);
    }

    @Override
    public String[] id_class(LZ lZ, int n) {
        if (!(lZ instanceof rrJO)) {
            return null;
        }
        rrJO rrJO2 = (rrJO)((Object)lZ);
        QF qF = rrJO2.id_implements();
        return rrJd_1.id_class(qF.id_byte());
    }

    @Override
    public boolean id_class() {
        return false;
    }

    @Override
    public Rectangle id_class(vm_3 vm_32, int n, int n2) {
        int n3 = vm_32.id_package / 2 - 150;
        int n4 = vm_32.id_int / 6 - 7;
        if (n2 <= n4 + 98) {
            n4 += 105;
        }
        int n5 = n3 + 150 + 150;
        int n6 = n4 + 84 + 10;
        return new Rectangle(n3, n4, n5 - n3, n6 - n4);
    }
}

