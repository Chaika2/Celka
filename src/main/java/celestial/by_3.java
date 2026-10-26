/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.bl_3;
import celestial.bp_3;
import celestial.rU_2;
import celestial.rY_2;
import celestial.ro_3;
import celestial.rpr_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class by_3
implements ro_3 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    @Override
    public rY_2[] id_byte() {
        return (rY_2[])this.id_class[id_protected[7]];
    }

    @Override
    public synchronized rY_2 id_byte(rY_2 rY_22, rpr_3 rpr_32, int n) {
        ListIterator<rY_2> listIterator = ((LinkedList)this.id_class[id_protected[13]]).listIterator();
        while (listIterator.hasNext()) {
            rY_2 rY_23 = (rY_2)listIterator.next();
            if (rY_23 != rY_22) continue;
            listIterator.remove();
            listIterator.add(rY_23.id_class(rpr_32, n));
            this.id_implements();
            return (rY_2)listIterator.previous();
        }
        return null;
    }

    public by_3(C_class c_class) {
        rY_2[] rY_2Array;
        LinkedList linkedList;
        this.id_finally();
        this.id_class[by_3.id_protected[0]] = linkedList = new LinkedList();
        this.id_class[by_3.id_protected[1]] = rY_2Array = new rY_2[id_byte[0]];
        new bp_3(c_class, this);
    }

    static {
        by_3.ntfClinit();
    }

    @Override
    public void id_class() {
        ((LinkedList)this.id_class[id_protected[14]]).clear();
        this.id_implements();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4E6E49D5482DC03CL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4976CCA;
    }

    @Override
    public rY_2 id_class(rU_2 rU_22, rU_2 rU_23) {
        return this.id_break(new bl_3(rU_22, rU_23));
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-91, 115, 107, 48, -51, 107, 10, 74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public synchronized rY_2 id_class(rY_2 rY_22, rpr_3 rpr_32, int n) {
        ListIterator<rY_2> listIterator = ((LinkedList)this.id_class[id_protected[11]]).listIterator();
        while (listIterator.hasNext()) {
            rY_2 rY_23 = (rY_2)listIterator.next();
            if (rY_23 != rY_22) continue;
            listIterator.remove();
            listIterator.add(rY_23.id_byte(rpr_32, n));
            this.id_implements();
            return (rY_2)listIterator.previous();
        }
        return null;
    }

    @Override
    public synchronized rY_2 id_class(rY_2 rY_22) {
        ((LinkedList)this.id_class[id_protected[5]]).remove(rY_22);
        this.id_implements();
        return rY_22;
    }

    @Override
    public synchronized rY_2 id_break(rY_2 rY_22) {
        ((LinkedList)this.id_class[id_protected[4]]).add(rY_22);
        this.id_implements();
        return rY_22;
    }

    @Override
    public rY_2 id_break() {
        return (rY_2)((LinkedList)this.id_class[id_protected[10]]).peekLast();
    }

    @Override
    public synchronized rY_2 id_break(rY_2 rY_22, rpr_3 rpr_32, int n) {
        ListIterator<rY_2> listIterator = ((LinkedList)this.id_class[id_protected[12]]).listIterator();
        while (listIterator.hasNext()) {
            rY_2 rY_23 = (rY_2)listIterator.next();
            if (rY_23 != rY_22) continue;
            listIterator.remove();
            listIterator.add(rY_23.id_break(rpr_32, n));
            this.id_implements();
            return (rY_2)listIterator.previous();
        }
        return null;
    }

    @Override
    public synchronized rY_2[] id_throws() {
        rY_2[] rY_2Array = this.id_byte();
        ((LinkedList)this.id_class[id_protected[6]]).clear();
        this.id_implements();
        return rY_2Array;
    }

    private static /* synthetic */ void ntfClinit() {
        by_3.id_catch();
        by_3.id_private();
        by_3.id_case();
    }

    private void id_finally() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_byte = blArray;
    }

    private static void id_case() {
        id_break = new byte[]{2};
    }

    private void id_implements() {
        rY_2[] rY_2Array;
        this.id_class[by_3.id_protected[3]] = rY_2Array = ((LinkedList)this.id_class[id_protected[2]]).toArray(new rY_2[id_byte[1]]);
    }

    @Override
    public synchronized rY_2 id_protected() {
        if (((LinkedList)this.id_class[id_protected[8]]).size() == id_byte[2]) {
            return (rY_2)((LinkedList)this.id_class[id_protected[9]]).peekFirst();
        }
        return null;
    }

    private static void id_private() {
        short[] sArray = new short[15];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[7] = 1;
        id_protected = sArray;
    }
}

