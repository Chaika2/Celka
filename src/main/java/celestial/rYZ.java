/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rYG;
import celestial.rYY;
import celestial.rYn_1;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rpn_3;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rYZ
implements rYn_1 {
    private static final Logger id_protected = LogManager.getLogger();
    private static final int id_throws = (int)Math.round(Math.log(16.0) / Math.log(2.0)) - 2;
    private static final int id_case = (int)Math.round(Math.log(256.0) / Math.log(2.0)) - 2;
    public static final int id_class = 1 << id_throws + id_throws + id_case;
    public static final int id_break = (1 << id_throws) - 1;
    public static final int id_byte = (1 << id_case) - 1;
    private final rpn_3<rYG> id_catch;
    private final rYG[] id_private;

    public rYZ(rpn_3<rYG> rpn_32, rfj_3 rfj_32, rYY rYY2, int[] nArray) {
        this(rpn_32);
        int n = rfj_32.id_break() >> 2;
        int n2 = rfj_32.id_byte() >> 2;
        if (nArray != null) {
            for (int i = 0; i < nArray.length; ++i) {
                this.id_private[i] = rpn_32.id_class(nArray[i]);
                if (this.id_private[i] != null) continue;
                int n3 = i & id_break;
                int n4 = i >> id_throws + id_throws & id_byte;
                int n5 = i >> id_throws & id_break;
                this.id_private[i] = rYY2.id_protected(n + n3, n4, n2 + n5);
            }
        } else {
            for (int i = 0; i < this.id_private.length; ++i) {
                int n6 = i & id_break;
                int n7 = i >> id_throws + id_throws & id_byte;
                int n8 = i >> id_throws & id_break;
                this.id_private[i] = rYY2.id_protected(n + n6, n7, n2 + n8);
            }
        }
    }

    public rYZ(rpn_3<rYG> rpn_32, rfj_3 rfj_32, rYY rYY2) {
        this(rpn_32);
        int n = rfj_32.id_break() >> 2;
        int n2 = rfj_32.id_byte() >> 2;
        for (int i = 0; i < this.id_private.length; ++i) {
            int n3 = i & id_break;
            int n4 = i >> id_throws + id_throws & id_byte;
            int n5 = i >> id_throws & id_break;
            this.id_private[i] = rYY2.id_protected(n + n3, n4, n2 + n5);
        }
    }

    public rYZ(rpn_3<rYG> rpn_32, int[] nArray) {
        this(rpn_32);
        for (int i = 0; i < this.id_private.length; ++i) {
            int n = nArray[i];
            rYG rYG2 = rpn_32.id_class(n);
            if (rYG2 == null) {
                id_protected.warn("Received invalid biome id: " + n);
                this.id_private[i] = rpn_32.id_class(0);
                continue;
            }
            this.id_private[i] = rYG2;
        }
    }

    private rYZ(rpn_3<rYG> rpn_32) {
        this(rpn_32, new rYG[id_class]);
    }

    public rYZ(rpn_3<rYG> rpn_32, rYG[] rYGArray) {
        this.id_catch = rpn_32;
        this.id_private = rYGArray;
    }

    public int[] id_class() {
        int[] nArray = new int[this.id_private.length];
        for (int i = 0; i < this.id_private.length; ++i) {
            nArray[i] = this.id_catch.id_class(this.id_private[i]);
        }
        return nArray;
    }

    @Override
    public rYG id_protected(int n, int n2, int n3) {
        int n4 = n & id_break;
        int n5 = rfU_2.id_class(n2, 0, id_byte);
        int n6 = n3 & id_break;
        return this.id_private[n5 << id_throws + id_throws | n6 << id_throws | n4];
    }
}

