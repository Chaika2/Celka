/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rrIB;
import celestial.rrIE;
import celestial.rrIG;
import celestial.rrIM;
import celestial.rrIO;
import celestial.rrIP;
import celestial.rrIS;
import celestial.rrIb_1;
import celestial.rrIh_1;
import celestial.rrIr_1;
import celestial.rrIs_1;
import celestial.rrQX;
import celestial.rrZS;
import celestial.rrwU_2;
import celestial.rrwa_3;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwe_3
implements rrZS<rrwU_2> {
    private static short[] id_byte;
    public Object[] id_break;
    private static byte[] id_protected;
    private static boolean[] id_throws;

    public rrwU_2 id_byte(String string) {
        return this.id_break().stream().filter(rrwU_22 -> rrwU_22.id_break().getName().equalsIgnoreCase(string + ".celka")).findFirst().orElse(null);
    }

    @Override
    public boolean id_byte(String string, boolean bl) {
        rrwU_2 rrwU_22 = this.id_byte(string);
        return this.id_byte(rrwU_22, bl);
    }

    public void id_byte() {
        this.id_break().forEach(rrwU_22 -> this.id_class((rrwU_2)rrwU_22, id_throws[17]));
    }

    @Override
    public /* synthetic */ boolean id_byte(Object object, boolean bl) {
        return this.id_class((rrwU_2)object, bl);
    }

    @Override
    public boolean id_byte(rrwU_2 rrwU_22, boolean bl) {
        if (rrwU_22 == null) {
            return id_throws[8];
        }
        JsonObject jsonObject = new JsonObject();
        rrwU_22.id_break(jsonObject);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[6]]).id_break().id_class(rrwU_22.id_break(), (JsonElement)jsonObject);
        return id_throws[9];
    }

    public rrwe_3() {
        ArrayList arrayList;
        this.id_extends();
        this.id_break[rrwe_3.id_byte[0]] = arrayList = new ArrayList();
        this.id_native();
    }

    static {
        rrwe_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1B4CF17E;
    }

    @Override
    public /* synthetic */ Object id_class(String string) {
        return this.id_byte(string);
    }

    @Override
    public boolean id_class(rrwU_2 rrwU_22, boolean bl) {
        try {
            if (rrwU_22 == null) {
                return id_throws[2];
            }
            File file = rrwU_22.id_break();
            if (file == null) {
                return id_throws[3];
            }
            JsonElement jsonElement = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[5]]).id_break().id_break(file);
            if (jsonElement == null || !jsonElement.isJsonObject()) {
                return id_throws[4];
            }
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            if (jsonObject == null) {
                return id_throws[5];
            }
            rrwU_22.id_class(jsonObject);
            return id_throws[6];
        }
        catch (Exception exception) {
            return id_throws[7];
        }
    }

    @Override
    public void id_class() {
        for (rrwU_2 rrwU_22 : this.id_break()) {
            if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[8]]).id_break().id_class(rrwU_22.id_break())) continue;
            this.id_break(rrwU_22, id_throws[15]);
        }
    }

    public void id_class(rrwU_2 ... rrwU_2Array) {
        ((List)this.id_break[id_byte[4]]).addAll(List.of(rrwU_2Array));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x11D48A8A9EA28FCBL;
    }

    @Override
    public boolean id_class(rrwU_2 rrwU_22) {
        return id_throws[16];
    }

    @Override
    public boolean id_class(String string, boolean bl) {
        rrwU_2 rrwU_22 = this.id_byte(string);
        return this.id_class(rrwU_22, bl);
    }

    @Override
    public void id_class(boolean bl) {
    }

    @Override
    public /* synthetic */ boolean id_class(Object object, boolean bl) {
        return this.id_break((rrwU_2)object, bl);
    }

    @Override
    public boolean id_break(rrwU_2 rrwU_22, boolean bl) {
        if (rrwU_22 == null) {
            return id_throws[12];
        }
        File file = rrwU_22.id_break();
        ((List)this.id_break[id_byte[7]]).remove(rrwU_22);
        return file.exists() && file.delete() ? id_throws[13] : id_throws[14];
    }

    @Override
    public void id_break(boolean bl) {
        for (rrwU_2 rrwU_22 : this.id_break()) {
            this.id_class(rrwU_22, bl);
        }
    }

    @Override
    public Collection<rrwU_2> id_break() {
        return (List)this.id_break[id_byte[9]];
    }

    @Override
    public /* synthetic */ boolean id_break(Object object, boolean bl) {
        return this.id_byte((rrwU_2)object, bl);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{27, -122, 55, -125, 94, 62, -21, 70}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public boolean id_break(String string, boolean bl) {
        rrwU_2 rrwU_22 = this.id_byte(string);
        return rrwU_22 != null && this.id_break(rrwU_22, bl) ? id_throws[10] : id_throws[11];
    }

    public rrIb_1 id_throws() {
        return (rrIb_1)this.id_break[id_byte[11]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrwe_3.id_finally();
        rrwe_3.id_implements();
        rrwe_3.id_private();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[19];
        blArray[1] = true;
        blArray[6] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[17] = true;
        blArray[18] = true;
        id_throws = blArray;
    }

    public void id_catch() {
        this.id_break().forEach(rrwU_22 -> this.id_byte((rrwU_2)rrwU_22, id_throws[18]));
    }

    private void id_extends() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[11]];
        }
    }

    public rrIG id_case() {
        return (rrIG)this.id_break[id_byte[10]];
    }

    private static void id_implements() {
        short[] sArray = new short[13];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[12] = 3;
        id_byte = sArray;
    }

    public rrIP id_protected() {
        return (rrIP)this.id_break[id_byte[12]];
    }

    private static void id_private() {
        id_protected = new byte[]{12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 4};
    }

    private void id_native() {
        rrwU_2[] rrwU_2Array = new rrwU_2[id_protected[0]];
        rrwU_2Array[rrwe_3.id_throws[0]] = new rrIM();
        rrwU_2Array[rrwe_3.id_throws[1]] = new rrIO();
        rrwU_2Array[rrwe_3.id_protected[1]] = new rrIs_1();
        rrwU_2Array[rrwe_3.id_protected[2]] = new rrwa_3();
        rrIG rrIG2 = new rrIG();
        this.id_break[rrwe_3.id_byte[1]] = rrIG2;
        rrwU_2Array[rrwe_3.id_protected[3]] = rrIG2;
        rrIb_1 rrIb_12 = new rrIb_1();
        this.id_break[rrwe_3.id_byte[2]] = rrIb_12;
        rrwU_2Array[rrwe_3.id_protected[4]] = rrIb_12;
        rrwU_2Array[rrwe_3.id_protected[5]] = new rrIS();
        rrwU_2Array[rrwe_3.id_protected[6]] = new rrIE();
        rrwU_2Array[rrwe_3.id_protected[7]] = new rrIB();
        rrwU_2Array[rrwe_3.id_protected[8]] = new rrIh_1();
        rrwU_2Array[rrwe_3.id_protected[9]] = new rrIr_1();
        rrIP rrIP2 = new rrIP();
        this.id_break[rrwe_3.id_byte[3]] = rrIP2;
        rrwU_2Array[rrwe_3.id_protected[10]] = rrIP2;
        this.id_class(rrwU_2Array);
    }
}

