/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.Ax_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.combat.AutoTotem;
import celestial.q_1;
import celestial.rJr_1;
import celestial.rXa_1;
import celestial.rdn_3;
import celestial.rrAM;
import celestial.rrCk_1;
import celestial.rrLY;
import celestial.rrQX;
import celestial.rrfY_2;
import celestial.rrmi_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrCz_1
extends rrCk_1 {
    private static short[] id_byte;
    private static byte[] id_protected;
    private static boolean[] id_case;
    public Object[] id_break;

    @Override
    public void id_byte() {
        rdn_3 rdn_32 = ((cb_3)rrCz_1.id_import.id_class[id_byte[1]]).Sn();
        if (((AutoTotem)this.id_continue()).id_continue()) {
            return;
        }
        Pair<rdn_3, Integer> pair = ((AutoTotem)this.id_continue()).id_this();
        int n = (Integer)pair.getRight();
        if (n < 0) {
            return;
        }
        n = rrfY_2.id_break(n);
        if (!rdn_32.id_class()) {
            ((rrmi_3)this.id_class[id_byte[2]]).id_class(rdn_32, n);
        }
        ((Ax_1)rrCz_1.id_import.id_class[id_byte[3]]).id_class(((rJr_1)((cb_3)rrCz_1.id_import.id_class[rrCz_1.id_byte[4]]).id_implements[rrCz_1.id_byte[5]]).id_case, n, (int)id_protected[0], rXa_1.SWAP, id_case[0]);
        Boolean bl = id_case[1];
        this.id_class[rrCz_1.id_byte[6]] = bl;
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[7]]).id_finally().id_class(rrLY.id_class());
    }

    public rrCz_1(AutoTotem autoTotem) {
        super(autoTotem);
        this.id_implements();
    }

    static {
        rrCz_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCABB22A0;
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[0]])) {
            if (((AutoTotem)this.id_continue()).id_super()) {
                this.id_byte();
            } else {
                this.id_class();
            }
        }
    }

    @EventTarget
    public void id_class(rrAM rrAM2) {
        this.id_throws();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7A16A75444F97411L;
    }

    @Override
    public void id_class() {
        this.id_implements();
        if (((Boolean)this.id_class[id_byte[8]]).booleanValue() && ((rrmi_3)this.id_class[id_byte[9]]).id_class()) {
            rrCz_1 rrCz_12 = this;
            int n = (Integer)rrCz_12.id_break[id_byte[10]] + id_case[2];
            Integer n2 = n;
            rrCz_12.id_break[rrCz_1.id_byte[11]] = n2;
            if (n > id_case[3]) {
                int n3 = ((rrmi_3)this.id_class[id_byte[12]]).id_class(id_case[4], new String[id_case[5]]);
                if (n3 < 0) {
                    return;
                }
                ((Ax_1)rrCz_1.id_import.id_class[id_byte[13]]).id_class(((rJr_1)((cb_3)rrCz_1.id_import.id_class[rrCz_1.id_byte[14]]).id_implements[rrCz_1.id_byte[15]]).id_case, n3, (int)id_protected[1], rXa_1.SWAP, id_case[6]);
                this.id_throws();
                ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[16]]).id_finally().id_class(rrLY.id_class());
            }
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{57, 108, -37, 119, -16, -31, -16, -9}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_throws() {
        this.id_implements();
        ((rrmi_3)this.id_class[id_byte[17]]).id_throws();
        Boolean bl = id_case[7];
        this.id_class[rrCz_1.id_byte[18]] = bl;
        Integer n = id_case[8];
        this.id_break[rrCz_1.id_byte[19]] = n;
    }

    private static /* synthetic */ void ntfClinit() {
        rrCz_1.id_case();
        rrCz_1.id_finally();
        rrCz_1.id_private();
    }

    private static void id_finally() {
        short[] sArray = new short[20];
        sArray[1] = 57;
        sArray[2] = 1;
        sArray[3] = 55;
        sArray[4] = 57;
        sArray[5] = 4;
        sArray[9] = 1;
        sArray[12] = 1;
        sArray[13] = 55;
        sArray[14] = 57;
        sArray[15] = 4;
        sArray[17] = 1;
        id_byte = sArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[12];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[9] = true;
        id_case = blArray;
    }

    private void id_implements() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
            this.id_break[0] = 0;
        }
    }

    private static void id_private() {
        id_protected = new byte[]{40, 40};
    }

    @Override
    public boolean aK_() {
        this.id_throws();
        return super.aK_();
    }
}

