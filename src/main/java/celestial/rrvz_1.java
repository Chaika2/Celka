/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrvN;
import celestial.rrvQ;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvz_1 {
    private static byte[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{54, -53, -28, 95, -65, 115, -62, 105}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_byte() {
        return (String)this.id_class[id_byte[4]];
    }

    public rrvz_1() {
        ArrayList arrayList;
        this.id_catch();
        this.id_class[rrvz_1.id_byte[0]] = arrayList = new ArrayList();
    }

    static {
        rrvz_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x742F677EEC1EFBBFL;
    }

    public void id_class(rrvN rrvN2) {
        rrvN rrvN3 = rrvN2;
        this.id_class[rrvz_1.id_byte[1]] = rrvN3;
    }

    public rrvz_1 id_class(Color color) {
        Color color2 = color;
        this.id_class[rrvz_1.id_byte[13]] = color2;
        return this;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5DA834B1;
    }

    public void id_class(List<rrvQ> list) {
        List<rrvQ> list2;
        this.id_class[rrvz_1.id_byte[2]] = list2 = list;
    }

    public rrvz_1 id_class(String string, String string2, boolean bl) {
        ((List)this.id_class[id_byte[9]]).add(new rrvQ(string, string2, bl));
        return this;
    }

    public Color id_class() {
        return (Color)this.id_class[id_byte[6]];
    }

    public rrvz_1 id_class(String string) {
        String string2 = string;
        this.id_class[rrvz_1.id_byte[12]] = string2;
        return this;
    }

    public List<rrvQ> id_break() {
        return (List)this.id_class[id_byte[8]];
    }

    public rrvz_1 id_break(String string) {
        String string2 = string;
        this.id_class[rrvz_1.id_byte[11]] = string2;
        return this;
    }

    public String id_throws() {
        return (String)this.id_class[id_byte[5]];
    }

    public rrvz_1 id_throws(String string) {
        String string2 = string;
        this.id_class[rrvz_1.id_byte[10]] = string2;
        return this;
    }

    private static /* synthetic */ void ntfClinit() {
        rrvz_1.id_private();
        rrvz_1.id_implements();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    public String id_case() {
        return (String)this.id_class[id_byte[3]];
    }

    private static void id_implements() {
        id_break = new byte[]{6};
    }

    public rrvz_1 id_protected(String string) {
        rrvN rrvN2 = new rrvN(string);
        this.id_class[rrvz_1.id_byte[14]] = rrvN2;
        return this;
    }

    public rrvN id_protected() {
        return (rrvN)this.id_class[id_byte[7]];
    }

    private static void id_private() {
        short[] sArray = new short[15];
        sArray[0] = 5;
        sArray[1] = 4;
        sArray[2] = 5;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        sArray[8] = 5;
        sArray[9] = 5;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 3;
        sArray[14] = 4;
        id_byte = sArray;
    }
}

