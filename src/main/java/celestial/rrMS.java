/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fj_3;
import celestial.rfU_2;
import celestial.rpr_3;
import celestial.rrbb_3;
import celestial.wK_2;
import java.util.IdentityHashMap;
import java.util.Map;

public class rrMS {
    public int id_class = 1;
    public boolean id_break = false;
    private Map[] id_byte = new Map[8];

    public rrMS(String string) {
        if (string.equals("4")) {
            this.id_class = 4;
        } else if (string.equals("2")) {
            this.id_class = 2;
        } else if (string.equals("F")) {
            this.id_break = true;
        } else if (string.equals("4F")) {
            this.id_class = 4;
            this.id_break = true;
        } else if (string.equals("2F")) {
            this.id_class = 2;
            this.id_break = true;
        } else {
            rrbb_3.id_protected("NaturalTextures: Unknown type: " + string);
        }
    }

    private boolean id_class(float f, float f2, float f3) {
        float f4 = rfU_2.id_throws(f - f2);
        return f4 < f3;
    }

    private int[] id_class(int[] nArray, int n, boolean bl) {
        int[] nArray2 = (int[])nArray.clone();
        int n2 = 4 - n;
        if (bl) {
            n2 += 3;
        }
        n2 %= 4;
        int n3 = nArray2.length / 4;
        for (int i = 0; i < 4; ++i) {
            int n4 = i * n3;
            int n5 = n2 * n3;
            nArray2[n5 + 4] = nArray[n4 + 4];
            nArray2[n5 + 4 + 1] = nArray[n4 + 4 + 1];
            if (bl) {
                if (--n2 >= 0) continue;
                n2 = 3;
                continue;
            }
            if (++n2 <= 3) continue;
            n2 = 0;
        }
        return nArray2;
    }

    private boolean id_class(wK_2 wK_22) {
        fj_3 fj_32 = wK_22.id_case();
        float f = fj_32.id_case();
        float f2 = fj_32.id_catch();
        float f3 = f2 - f;
        float f4 = f3 / 256.0f;
        float f5 = fj_32.id_private();
        float f6 = fj_32.id_implements();
        float f7 = f6 - f5;
        float f8 = f7 / 256.0f;
        int[] nArray = wK_22.id_class();
        int n = nArray.length / 4;
        for (int i = 0; i < 4; ++i) {
            int n2 = i * n;
            float f9 = Float.intBitsToFloat(nArray[n2 + 4]);
            float f10 = Float.intBitsToFloat(nArray[n2 + 4 + 1]);
            if (!this.id_class(f9, f, f4) && !this.id_class(f9, f2, f4)) {
                return false;
            }
            if (this.id_class(f10, f5, f8) || this.id_class(f10, f6, f8)) continue;
            return false;
        }
        return true;
    }

    public synchronized wK_2 id_class(wK_2 wK_22, int n, boolean bl) {
        int n2 = n;
        if (bl) {
            n2 = n | 4;
        }
        if (n2 > 0 && n2 < this.id_byte.length) {
            wK_2 wK_23;
            IdentityHashMap<wK_2, wK_2> identityHashMap = this.id_byte[n2];
            if (identityHashMap == null) {
                this.id_byte[n2] = identityHashMap = new IdentityHashMap<wK_2, wK_2>(1);
            }
            if ((wK_23 = (wK_2)identityHashMap.get(wK_22)) == null) {
                wK_23 = this.id_break(wK_22, n, bl);
                identityHashMap.put(wK_22, wK_23);
            }
            return wK_23;
        }
        return wK_22;
    }

    public boolean id_class() {
        if (this.id_class != 2 && this.id_class != 4) {
            return this.id_break;
        }
        return true;
    }

    private wK_2 id_break(wK_2 wK_22, int n, boolean bl) {
        int[] nArray = wK_22.id_class();
        int n2 = wK_22.id_byte();
        rpr_3 rpr_32 = wK_22.id_protected();
        fj_3 fj_32 = wK_22.id_case();
        boolean bl2 = wK_22.id_throws();
        if (!this.id_class(wK_22)) {
            n = 0;
        }
        nArray = this.id_class(nArray, n, bl);
        return new wK_2(nArray, n2, rpr_32, fj_32, bl2);
    }
}

