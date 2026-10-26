/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.rrJJ;
import celestial.rrJd_1;
import celestial.rrdy_1;
import celestial.rrkM;
import celestial.rrkO;
import celestial.vm_3;
import java.awt.Rectangle;

public class rrJx_1
implements rrJJ {
    private String[] id_class(rrdy_1 rrdy_12) {
        return rrJd_1.id_class(rrdy_12.id_class());
    }

    @Override
    public String[] id_class(LZ lZ, int n) {
        if (lZ instanceof rrkM) {
            return rrJd_1.id_class("of.options.shaders.DOWNLOAD");
        }
        if (!(lZ instanceof rrkO)) {
            return null;
        }
        rrkO rrkO2 = (rrkO)lZ;
        rrdy_1 rrdy_12 = rrkO2.id_private();
        return this.id_class(rrdy_12);
    }

    @Override
    public boolean id_class() {
        return true;
    }

    @Override
    public Rectangle id_class(vm_3 vm_32, int n, int n2) {
        int n3 = vm_32.id_package - 450;
        int n4 = 35;
        if (n3 < 10) {
            n3 = 10;
        }
        if (n2 <= n4 + 94) {
            n4 += 100;
        }
        int n5 = n3 + 150 + 150;
        int n6 = n4 + 84 + 10;
        return new Rectangle(n3, n4, n5 - n3, n6 - n4);
    }
}

