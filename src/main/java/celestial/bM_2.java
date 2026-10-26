/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.U;
import celestial.bb_3;
import celestial.rVi_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bM_2 {
    private static byte[] id_class;
    private static short[] id_byte;
    public Object[] id_break;

    public void id_byte(bb_3 bb_32) {
        ((C_class)this.id_break[id_byte[9]]).s().id_break(bb_32);
    }

    public void id_byte() {
        ((List)this.id_break[id_byte[2]]).stream().filter(bb_3::id_protected).forEach(bb_3::id_class);
        this.id_catch();
    }

    public bM_2(C_class c_class) {
        ArrayList arrayList;
        this.id_finally();
        C_class c_class2 = c_class;
        this.id_break[bM_2.id_byte[0]] = c_class2;
        this.id_break[bM_2.id_byte[1]] = arrayList = new ArrayList();
    }

    static {
        bM_2.ntfClinit();
    }

    public void id_class(bb_3 bb_32) {
        ((List)this.id_break[id_byte[3]]).add(bb_32);
    }

    public void id_class(bb_3 bb_32, rVi_1 rVi_12) {
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA46E33A2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5AC273A7367A1FCBL;
    }

    public void id_class() {
        U u = ((C_class)this.id_break[id_byte[6]]).s();
        for (bb_3 bb_32 : (List)this.id_break[id_byte[7]]) {
            u.id_break(bb_32);
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-54, 98, -89, 121, -2, -60, -75, 96}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_break(bb_3 bb_32) {
        ((C_class)this.id_break[id_byte[8]]).s().id_class(bb_32);
    }

    public List<bb_3> id_break() {
        return (List)this.id_break[id_byte[11]];
    }

    public C_class id_throws() {
        return (C_class)this.id_break[id_byte[10]];
    }

    private static /* synthetic */ void ntfClinit() {
        bM_2.id_implements();
        bM_2.id_private();
    }

    private void id_finally() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_class[0]];
        }
    }

    public void id_catch() {
    }

    public void id_case() {
        U u = ((C_class)this.id_break[id_byte[4]]).s();
        for (bb_3 bb_32 : (List)this.id_break[id_byte[5]]) {
            u.id_class(bb_32);
        }
    }

    private static void id_implements() {
        short[] sArray = new short[12];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[11] = 1;
        id_byte = sArray;
    }

    public void id_protected() {
    }

    private static void id_private() {
        id_class = new byte[]{2};
    }
}

