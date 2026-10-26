/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.apache.commons.io.FilenameUtils
 */
package celestial;

import celestial.rrQX;
import celestial.rrZS;
import celestial.rrwD_2;
import celestial.rrwK_2;
import celestial.rrwR_2;
import celestial.rrwj_3;
import celestial.rrwo_3;
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

public class rrwY_2
implements rrZS<rrwR_2> {
    public Object[] id_break;
    private static String[] id_byte;
    private static byte[] id_protected;
    private static boolean[] id_throws;
    private static short[] id_case;

    @Override
    public boolean id_byte(String string, boolean bl) {
        rrwR_2 rrwR_22 = this.id_break(string);
        boolean bl2 = id_throws[11];
        if (rrwR_22 == null) {
            rrwR_22 = new rrwR_2(string);
            ((Map)this.id_break[id_case[12]]).put(string, rrwR_22);
            bl2 = id_throws[12];
        }
        return this.id_break(rrwR_22, bl2);
    }

    @Override
    public boolean id_byte(rrwR_2 rrwR_22, boolean bl) {
        try {
            JsonObject jsonObject = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[9]]).id_break().id_break(rrwR_22.id_class()).getAsJsonObject();
            if (jsonObject == null) {
                return id_throws[8];
            }
            rrwR_22.id_class(jsonObject);
            if (bl) {
                ((List)this.id_break[id_case[10]]).forEach(rrwK_22 -> rrwK_22.id_class(rrwR_22.id_break()));
            }
            rrwR_2 rrwR_23 = rrwR_22;
            this.id_break[rrwY_2.id_case[11]] = rrwR_23;
            return id_throws[9];
        }
        catch (Exception exception) {
            return id_throws[10];
        }
    }

    public List<rrwK_2> id_byte() {
        return (List)this.id_break[id_case[29]];
    }

    public void id_byte(boolean bl) {
        this.id_class(bl);
        this.id_class();
    }

    public boolean id_byte(String string) {
        return ((Map)this.id_break[id_case[24]]).entrySet().stream().anyMatch(entry -> ((String)entry.getKey()).equalsIgnoreCase(string.toLowerCase()));
    }

    public rrwY_2() {
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap hashMap;
        this.id_implements();
        this.id_break[rrwY_2.id_case[0]] = hashMap = new HashMap();
        this.id_break[rrwY_2.id_case[1]] = arrayList2 = new ArrayList();
        this.id_break[rrwY_2.id_case[2]] = arrayList = new ArrayList();
        this.id_catch();
    }

    static {
        rrwY_2.ntfClinit();
    }

    @Override
    public boolean id_class(rrwR_2 rrwR_22) {
        return rrwR_22.id_break().equals(id_byte[3]);
    }

    @Override
    public void id_class() {
        for (rrwR_2 rrwR_22 : this.id_break()) {
            if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[22]]).id_break().id_class(rrwR_22.id_class())) continue;
            this.id_class(rrwR_22, id_throws[18]);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x46E2F188;
    }

    private void id_class(rrwj_3 ... rrwj_3Array) {
        ((List)this.id_break[id_case[30]]).addAll(List.of(rrwj_3Array));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5756ECC85F70D90FL;
    }

    @Override
    public /* synthetic */ Object id_class(String string) {
        return this.id_break(string);
    }

    public void id_class(rrwK_2 ... rrwK_2Array) {
        ((List)this.id_break[id_case[28]]).addAll(List.of(rrwK_2Array));
    }

    @Override
    public void id_class(boolean bl) {
        File file = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[3]]).id_break().id_class(id_byte[0]);
        File[] fileArray = file.listFiles();
        if (fileArray != null) {
            File[] fileArray2 = fileArray;
            int n = fileArray2.length;
            for (int i = id_throws[5]; i < n; ++i) {
                File file2 = fileArray2[i];
                if (!FilenameUtils.getExtension((String)file2.getName()).equals(id_byte[1].substring(id_throws[6]))) continue;
                String string = FilenameUtils.removeExtension((String)file2.getName());
                rrwR_2 rrwR_22 = new rrwR_2(string);
                if (bl && !((Map)this.id_break[id_case[4]]).containsKey(string)) {
                    ((List)this.id_break[id_case[5]]).forEach(rrwK_22 -> rrwK_22.id_byte(rrwR_22.id_break()));
                }
                ((Map)this.id_break[id_case[6]]).put(string, rrwR_22);
            }
        }
    }

    @Override
    public boolean id_class(String string, boolean bl) {
        rrwR_2 rrwR_22 = this.id_break(string);
        if (rrwR_22 == null) {
            if (bl) {
                ((List)this.id_break[id_case[7]]).forEach(rrwK_22 -> rrwK_22.id_break(string));
            }
            return id_throws[7];
        }
        return this.id_byte(rrwR_22, bl);
    }

    @Override
    public boolean id_class(rrwR_2 rrwR_22, boolean bl) {
        File file = rrwR_22.id_class();
        ((Map)this.id_break[id_case[20]]).remove(rrwR_22.id_break());
        if (bl && !this.id_class(rrwR_22)) {
            ((List)this.id_break[id_case[21]]).forEach(rrwK_22 -> rrwK_22.id_throws(rrwR_22.id_break()));
        }
        return file.exists() && file.delete() ? id_throws[16] : id_throws[17];
    }

    @Override
    public void id_break(boolean bl) {
        for (rrwR_2 rrwR_22 : ((Map)this.id_break[id_case[8]]).values()) {
            this.id_byte(rrwR_22, bl);
        }
    }

    public rrwR_2 id_break(String string) {
        if (((Map)this.id_break[id_case[16]]).containsKey(string)) {
            return (rrwR_2)((Map)this.id_break[id_case[17]]).get(string);
        }
        File file = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[18]]).id_break().id_class(id_byte[2]);
        if (new File(file, string + ".celka").exists()) {
            return new rrwR_2(string);
        }
        return null;
    }

    @Override
    public boolean id_break(String string, boolean bl) {
        rrwR_2 rrwR_22 = this.id_break(string);
        if (rrwR_22 == null) {
            if (bl) {
                ((List)this.id_break[id_case[19]]).forEach(rrwK_22 -> rrwK_22.id_break(string));
            }
            return id_throws[15];
        }
        return this.id_class(rrwR_22, bl);
    }

    @Override
    public boolean id_break(rrwR_2 rrwR_22, boolean bl) {
        if (rrwR_22 == null) {
            return id_throws[13];
        }
        JsonObject jsonObject = new JsonObject();
        rrwR_22.id_break(jsonObject);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[13]]).id_break().id_class(rrwR_22.id_class(), (JsonElement)jsonObject);
        if (bl) {
            if (!this.id_class(rrwR_22) && rrwR_22 != this.id_case()) {
                ((List)this.id_break[id_case[14]]).forEach(rrwK_22 -> rrwK_22.id_byte(rrwR_22.id_break()));
            }
        } else {
            ((List)this.id_break[id_case[15]]).forEach(rrwK_22 -> rrwK_22.id_protected(rrwR_22.id_break()));
        }
        return id_throws[14];
    }

    @Override
    public Collection<rrwR_2> id_break() {
        return ((Map)this.id_break[id_case[23]]).values().stream().filter(rrwR_22 -> !this.id_class((rrwR_2)rrwR_22) ? id_throws[19] : id_throws[20]).toList();
    }

    public Map<String, rrwR_2> id_throws() {
        return (Map)this.id_break[id_case[27]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrwY_2.id_private();
        rrwY_2.id_native();
        rrwY_2.id_finally();
        rrwY_2.id_extends();
    }

    private static void id_finally() {
        short[] sArray = new short[31];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[5] = 2;
        sArray[7] = 2;
        sArray[10] = 2;
        sArray[11] = 3;
        sArray[14] = 2;
        sArray[15] = 2;
        sArray[19] = 2;
        sArray[21] = 2;
        sArray[25] = 3;
        sArray[26] = 1;
        sArray[28] = 2;
        sArray[29] = 2;
        sArray[30] = 1;
        id_case = sArray;
    }

    private void id_catch() {
        rrwj_3[] rrwj_3Array = new rrwj_3[id_throws[0]];
        rrwj_3Array[rrwY_2.id_throws[1]] = new rrwD_2();
        this.id_class(rrwj_3Array);
        rrwK_2[] rrwK_2Array = new rrwK_2[id_throws[2]];
        rrwK_2Array[rrwY_2.id_throws[3]] = new rrwo_3();
        this.id_class(rrwK_2Array);
        this.id_class(id_throws[4]);
    }

    private static void id_extends() {
        id_protected = new byte[]{4};
    }

    public rrwR_2 id_case() {
        return (rrwR_2)this.id_break[id_case[25]];
    }

    private void id_implements() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[0]];
        }
    }

    public List<rrwj_3> id_protected() {
        return (List)this.id_break[id_case[26]];
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-128, 35, -114, 103, -104, -91, -94, 51}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_private() {
        boolean[] blArray = new boolean[21];
        blArray[0] = true;
        blArray[2] = true;
        blArray[6] = true;
        blArray[9] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[19] = true;
        id_throws = blArray;
    }

    private static void id_native() {
        id_byte = new String[]{new String("creeperfarm"), new String(".celka"), new String("creeperfarm"), new String("autocfg")};
    }
}

