/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.C_throws;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.movement.GuiMove;
import celestial.q_1;
import celestial.rdy_3;
import celestial.rmj_3;
import celestial.rmt_3;
import celestial.rqr_3;
import celestial.rrLY;
import celestial.rrLZ;
import celestial.rrfj_3;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrli_3;
import celestial.ruS_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHB
extends rrli_3 {
    public Object[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[20];
        blArray[0] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[17] = true;
        id_break = blArray;
    }

    public rrHB(GuiMove guiMove) {
        super(guiMove);
        ArrayList arrayList;
        this.id_protected();
        this.id_class[rrHB.id_protected[0]] = arrayList = new ArrayList();
    }

    static {
        rrHB.ntfClinit();
    }

    @EventTarget(id_class=-200)
    public void id_class(q_1 q_12) {
        this.id_protected();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[1]])) {
            if ((Integer)this.id_class[id_protected[2]] > 0) {
                rrHB rrHB2 = this;
                Integer n = (Integer)rrHB2.id_class[id_protected[3]] - id_break[0];
                rrHB2.id_class[rrHB.id_protected[4]] = n;
            }
            if (rrfj_3.id_catch()) {
                Integer n = id_byte[0];
                this.id_class[rrHB.id_protected[5]] = n;
            }
            if (((Boolean)this.id_class[id_protected[6]]).booleanValue()) {
                ((cb_3)rrHB.id_import.id_class[id_protected[7]]).c_(id_break[1]);
                C_throws.id_byte().id_int().id_class();
                ((rqr_3)((cb_3)rrHB.id_import.id_class[rrHB.id_protected[8]]).id_break[id_protected[9]]).id_break(id_break[2]);
            }
            if ((rrfq_3)((Object)rrfp_3.id_class[id_protected[10]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[11]])) {
                this.id_break();
            }
        } else if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[12]]) && (rrfq_3)((Object)rrfp_3.id_class[id_protected[13]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[14]])) {
            this.id_break();
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8C9C598F5CA7F021L;
    }

    public boolean id_class() {
        this.id_protected();
        return (Boolean)this.id_class[id_protected[35]] == false && ((List)this.id_class[id_protected[36]]).isEmpty() ? id_break[15] : id_break[16];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9AD848C0;
    }

    @EventTarget
    public void id_class(rrLY rrLY2) {
        this.id_protected();
        if (!((List)this.id_class[id_protected[15]]).isEmpty()) {
            Boolean bl = id_break[3];
            this.id_class[rrHB.id_protected[16]] = bl;
        }
    }

    private boolean id_class(rmt_3 rmt_32) {
        this.id_protected();
        if (rmt_32.id_break() != 0) {
            return id_break[9];
        }
        if ((Integer)this.id_class[id_protected[23]] == 0 || ((cb_3)rrHB.id_import.id_class[id_protected[24]]).Sy()) {
            return id_break[10];
        }
        if ((rrfq_3)((Object)rrfp_3.id_class[id_protected[25]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[26]]) && rmt_32.id_case().id_break() == rdy_3.Gu && rmt_32.id_protected() == id_break[11]) {
            return id_break[12];
        }
        return id_break[13];
    }

    @EventTarget
    public void id_class(rrLZ rrLZ2) {
        this.id_protected();
        ruS_2<?> ruS_22 = rrLZ2.id_class();
        if (ruS_22 instanceof rmt_3) {
            rmt_3 rmt_32 = (rmt_3)ruS_22;
            if (this.id_class(rmt_32)) {
                ((List)this.id_class[id_protected[17]]).add(rmt_32);
                rrLZ2.id_class(id_break[4]);
            } else if (!((List)this.id_class[id_protected[18]]).isEmpty()) {
                this.id_case();
            }
        } else if (ruS_22 instanceof rmj_3 && !((List)this.id_class[id_protected[19]]).isEmpty()) {
            Boolean bl = id_break[5];
            this.id_class[rrHB.id_protected[20]] = bl;
            rrLZ2.id_class(id_break[6]);
        }
    }

    private void id_break() {
        this.id_protected();
        if (((Boolean)this.id_class[id_protected[27]]).booleanValue() && !((cb_3)rrHB.id_import.id_class[id_protected[28]]).X()) {
            this.id_case();
            Boolean bl = id_break[14];
            this.id_class[rrHB.id_protected[29]] = bl;
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{90, 24, 95, 70, 18, 36, -104, -27}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        short[] sArray = new short[37];
        sArray[2] = 2;
        sArray[3] = 2;
        sArray[4] = 2;
        sArray[5] = 2;
        sArray[6] = 1;
        sArray[7] = 57;
        sArray[8] = 57;
        sArray[9] = 17;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[16] = 1;
        sArray[20] = 1;
        sArray[21] = 1;
        sArray[22] = 2;
        sArray[23] = 2;
        sArray[24] = 57;
        sArray[25] = 1;
        sArray[26] = 2;
        sArray[27] = 1;
        sArray[28] = 57;
        sArray[29] = 1;
        sArray[32] = 57;
        sArray[35] = 1;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrHB.id_byte();
        rrHB.id_throws();
        rrHB.id_private();
    }

    private void id_case() {
        this.id_protected();
        if (((List)this.id_class[id_protected[30]]).isEmpty()) {
            return;
        }
        for (rmt_3 rmt_32 : (List)this.id_class[id_protected[31]]) {
            ((Aq_1)((cb_3)rrHB.id_import.id_class[rrHB.id_protected[32]]).id_break[id_protected[33]]).id_break(rmt_32);
        }
        ((List)this.id_class[id_protected[34]]).clear();
    }

    private void id_protected() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
            this.id_class[1] = false;
            this.id_class[2] = 0;
        }
    }

    private static void id_private() {
        id_byte = new byte[]{3, 3, 2};
    }

    @Override
    public boolean aK_() {
        this.id_protected();
        this.id_case();
        Boolean bl = id_break[7];
        this.id_class[rrHB.id_protected[21]] = bl;
        Integer n = id_break[8];
        this.id_class[rrHB.id_protected[22]] = n;
        return super.aK_();
    }
}

