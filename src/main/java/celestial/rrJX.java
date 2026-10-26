/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.Ml_1;
import celestial.QY;
import celestial.ch_3;
import celestial.cm_3;
import celestial.rrJJ;
import celestial.rrJM;
import celestial.vm_3;
import java.awt.Rectangle;
import java.util.Arrays;
import java.util.List;

public class rrJX {
    private vm_3 id_class;
    private rrJJ id_break;
    private int id_byte = 0;
    private int id_protected = 0;
    private long id_throws = 0L;

    public rrJX(vm_3 vm_32, rrJJ rrJJ2) {
        this.id_class = vm_32;
        this.id_break = rrJJ2;
    }

    public void id_class(Ml_1 ml_1, int n, int n2, List<LZ> list) {
        if (Math.abs(n - this.id_byte) <= 5 && Math.abs(n2 - this.id_protected) <= 5) {
            LZ lZ;
            int n3 = 700;
            if (System.currentTimeMillis() >= this.id_throws + (long)n3 && (lZ = rrJM.id_class(n, n2, list)) != null) {
                Rectangle rectangle = this.id_break.id_class(this.id_class, n, n2);
                String[] stringArray = this.id_break.id_class(lZ, rectangle.width);
                if (stringArray != null) {
                    int n4;
                    if (stringArray.length > 8) {
                        stringArray = Arrays.copyOf(stringArray, 8);
                        stringArray[stringArray.length - 1] = stringArray[stringArray.length - 1] + " ...";
                    }
                    if (this.id_break.id_class()) {
                        n4 = -528449408;
                        this.id_class(ml_1, rectangle.x, rectangle.y, rectangle.x + rectangle.width, rectangle.y + rectangle.height, n4);
                    }
                    ch_3.id_class(ml_1, rectangle.x, rectangle.y, rectangle.x + rectangle.width, rectangle.y + rectangle.height, -536870912);
                    for (n4 = 0; n4 < stringArray.length; ++n4) {
                        String string = stringArray[n4];
                        int n5 = 0xDDDDDD;
                        if (string.endsWith("!")) {
                            n5 = 0xFF2020;
                        }
                        cm_3 cm_32 = (cm_3)QY.id_instanceof().id_class[15];
                        cm_32.id_class(ml_1, string, (float)(rectangle.x + 5), (float)(rectangle.y + 5 + n4 * 11), n5);
                    }
                }
            }
        } else {
            this.id_byte = n;
            this.id_protected = n2;
            this.id_throws = System.currentTimeMillis();
        }
    }

    private void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5) {
        ch_3.id_class(ml_1, n, n2 - 1, n3, n2, n5);
        ch_3.id_class(ml_1, n, n4, n3, n4 + 1, n5);
        ch_3.id_class(ml_1, n - 1, n2, n, n4, n5);
        ch_3.id_class(ml_1, n3, n2, n3 + 1, n4, n5);
    }
}

