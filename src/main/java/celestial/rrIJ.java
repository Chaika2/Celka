/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.apache.commons.io.FilenameUtils
 */
package celestial;

import celestial.rrIX;
import celestial.rrId_1;
import celestial.rrIx_1;
import celestial.rrQX;
import celestial.rrZS;
import celestial.rrZp_1;
import celestial.rrwj_3;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.io.FilenameUtils;

public class rrIJ
implements rrZS<rrIX> {
    private static short[] id_byte;
    private static byte[] id_protected;
    private static String[] id_throws;
    private static boolean[] id_case;
    public Object[] id_break;

    public List<rrwj_3> id_byte() {
        return (List)this.id_break[id_byte[26]];
    }

    public boolean id_byte(String string) {
        return ((Map)this.id_break[id_byte[23]]).entrySet().stream().anyMatch(entry -> ((String)entry.getKey()).equalsIgnoreCase(string.toLowerCase()));
    }

    @Override
    public /* synthetic */ boolean id_byte(Object object, boolean bl) {
        return this.id_class((rrIX)object, bl);
    }

    @Override
    public boolean id_byte(rrIX rrIX2, boolean bl) {
        if (rrIX2 == null) {
            return id_case[10];
        }
        JsonObject jsonObject = new JsonObject();
        rrIX2.id_break(jsonObject);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[12]]).id_break().id_class(rrIX2.id_throws(), (JsonElement)jsonObject);
        if (bl) {
            if (!this.id_class(rrIX2) && rrIX2 != this.id_protected()) {
                ((List)this.id_break[id_byte[13]]).forEach(rrZp_12 -> rrZp_12.id_protected(rrIX2));
            }
        } else {
            ((List)this.id_break[id_byte[14]]).forEach(rrZp_12 -> rrZp_12.id_class(rrIX2));
        }
        return id_case[11];
    }

    @Override
    public boolean id_byte(String string, boolean bl) {
        rrIX rrIX2 = this.id_protected(string);
        if (rrIX2 == null) {
            rrIX2 = new rrIX(string);
            ((Map)this.id_break[id_byte[11]]).put(string, rrIX2);
        }
        return this.id_byte(rrIX2, bl);
    }

    public rrIJ() {
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap hashMap;
        this.id_native();
        this.id_break[rrIJ.id_byte[0]] = hashMap = new HashMap();
        this.id_break[rrIJ.id_byte[1]] = arrayList2 = new ArrayList();
        this.id_break[rrIJ.id_byte[2]] = arrayList = new ArrayList();
        this.id_private();
    }

    static {
        rrIJ.ntfClinit();
    }

    @Override
    public /* synthetic */ boolean id_class(Object object, boolean bl) {
        return this.id_break((rrIX)object, bl);
    }

    @Override
    public boolean id_class(String string, boolean bl) {
        rrIX rrIX2 = this.id_protected(string);
        return this.id_class(rrIX2, bl);
    }

    @Override
    public boolean id_class(rrIX rrIX2, boolean bl) {
        try {
            if (rrIX2 == null) {
                return id_case[6];
            }
            JsonObject jsonObject = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[8]]).id_break().id_break(rrIX2.id_throws()).getAsJsonObject();
            if (jsonObject == null) {
                return id_case[7];
            }
            rrIX2.id_class(jsonObject);
            if (bl) {
                ((List)this.id_break[id_byte[9]]).forEach(rrZp_12 -> rrZp_12.id_break(rrIX2));
            }
            rrIX rrIX3 = rrIX2;
            this.id_break[rrIJ.id_byte[10]] = rrIX3;
            return id_case[8];
        }
        catch (Exception exception) {
            return id_case[9];
        }
    }

    private void id_class(rrwj_3 ... rrwj_3Array) {
        ((List)this.id_break[id_byte[3]]).addAll(List.of(rrwj_3Array));
    }

    @Override
    public void id_class() {
        for (rrIX rrIX2 : this.id_break()) {
            if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[20]]).id_break().id_class(rrIX2.id_throws())) continue;
            this.id_break(rrIX2, id_case[17]);
        }
    }

    public void id_class(rrZp_1 ... rrZp_1Array) {
        ((List)this.id_break[id_byte[22]]).addAll(List.of(rrZp_1Array));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAF1635A771DA78DCL;
    }

    @Override
    public /* synthetic */ Object id_class(String string) {
        return this.id_protected(string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC92581FE;
    }

    @Override
    public boolean id_class(rrIX rrIX2) {
        return rrIX2.id_class().equals(id_throws[3]);
    }

    @Override
    public void id_class(boolean bl) {
        File file = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[4]]).id_break().id_class(id_throws[0]);
        File[] fileArray = file.listFiles();
        if (fileArray != null) {
            File[] fileArray2 = fileArray;
            int n = fileArray2.length;
            for (int i = id_case[4]; i < n; ++i) {
                File file2 = fileArray2[i];
                if (!FilenameUtils.getExtension((String)file2.getName()).equals(id_throws[1].substring(id_case[5]))) continue;
                String string = FilenameUtils.removeExtension((String)file2.getName());
                rrIX rrIX2 = new rrIX(string);
                rrIX2.id_byte();
                if (bl && !((Map)this.id_break[id_byte[5]]).containsKey(string)) {
                    ((List)this.id_break[id_byte[6]]).forEach(rrZp_12 -> rrZp_12.id_protected(rrIX2));
                }
                ((Map)this.id_break[id_byte[7]]).put(string, rrIX2);
            }
        }
    }

    @Override
    public boolean id_break(String string, boolean bl) {
        rrIX rrIX2 = this.id_protected(string);
        return rrIX2 != null && this.id_break(rrIX2, bl) ? id_case[12] : id_case[13];
    }

    @Override
    public /* synthetic */ boolean id_break(Object object, boolean bl) {
        return this.id_byte((rrIX)object, bl);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{115, -53, -85, 116, -107, 98, 55, -46}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public boolean id_break(rrIX rrIX2, boolean bl) {
        if (rrIX2 == null) {
            return id_case[14];
        }
        File file = rrIX2.id_throws();
        ((Map)this.id_break[id_byte[18]]).remove(rrIX2.id_class());
        if (bl && !this.id_class(rrIX2)) {
            ((List)this.id_break[id_byte[19]]).forEach(rrZp_12 -> rrZp_12.id_byte(rrIX2));
        }
        return file.exists() && file.delete() ? id_case[15] : id_case[16];
    }

    @Override
    public Collection<rrIX> id_break() {
        return ((Map)this.id_break[id_byte[21]]).values().stream().filter(rrIX2 -> !this.id_class((rrIX)rrIX2) ? id_case[18] : id_case[19]).toList();
    }

    @Override
    public void id_break(boolean bl) {
        for (rrIX rrIX2 : this.id_break()) {
            this.id_class(rrIX2, bl);
        }
    }

    public Map<String, rrIX> id_throws() {
        return (Map)this.id_break[id_byte[27]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrIJ.id_implements();
        rrIJ.id_extends();
        rrIJ.id_volatile();
        rrIJ.id_finally();
    }

    private static void id_finally() {
        id_protected = new byte[]{2, 4};
    }

    public void id_catch() {
        this.id_class(id_case[3]);
        this.id_class();
    }

    private static void id_extends() {
        id_throws = new String[]{new String("configs"), new String(".celka"), new String("configs"), new String("autocfg")};
    }

    public List<rrZp_1> id_case() {
        return (List)this.id_break[id_byte[25]];
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[20];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[15] = true;
        blArray[17] = true;
        blArray[18] = true;
        id_case = blArray;
    }

    public rrIX id_protected() {
        return (rrIX)this.id_break[id_byte[24]];
    }

    public rrIX id_protected(String string) {
        if (((Map)this.id_break[id_byte[15]]).containsKey(string)) {
            return (rrIX)((Map)this.id_break[id_byte[16]]).get(string);
        }
        File file = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[17]]).id_break().id_class(id_throws[2]);
        if (new File(file, string + ".celka").exists()) {
            return new rrIX(string);
        }
        return null;
    }

    private void id_private() {
        rrwj_3[] rrwj_3Array = new rrwj_3[id_protected[0]];
        rrwj_3Array[rrIJ.id_case[0]] = new rrIx_1();
        rrwj_3Array[rrIJ.id_case[1]] = new rrId_1();
        this.id_class(rrwj_3Array);
        this.id_class(id_case[2]);
    }

    private static void id_volatile() {
        short[] sArray = new short[28];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[6] = 2;
        sArray[9] = 2;
        sArray[10] = 3;
        sArray[13] = 2;
        sArray[14] = 2;
        sArray[19] = 2;
        sArray[22] = 2;
        sArray[24] = 3;
        sArray[25] = 2;
        sArray[26] = 1;
        id_byte = sArray;
    }

    private void id_native() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[1]];
        }
    }
}

