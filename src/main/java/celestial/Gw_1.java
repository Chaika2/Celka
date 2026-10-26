/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 */
package celestial;

import celestial.C_class;
import celestial.GH;
import celestial.GI;
import celestial.Gq_1;
import celestial.Gt_1;
import celestial.PG;
import celestial.rfj_3;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gw_1
implements Gt_1 {
    private static short[] id_break;
    public Object[] id_class;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    private static int[] id_throws;

    private static void id_byte() {
        short[] sArray = new short[16];
        sArray[0] = 3;
        sArray[2] = 2;
        sArray[3] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[10] = 2;
        sArray[12] = 3;
        sArray[13] = 2;
        id_break = sArray;
    }

    public Gw_1(GH gH, Path path, boolean bl) throws Exception {
        PG[] pGArray;
        this.id_case();
        GH gH2 = gH;
        this.id_class[Gw_1.id_break[0]] = gH2;
        Boolean bl2 = bl;
        this.id_class[Gw_1.id_break[1]] = bl2;
        Gson gson = new GsonBuilder().create();
        this.id_class[Gw_1.id_break[2]] = pGArray = (PG[])gson.fromJson((Reader)new InputStreamReader(Files.newInputStream(path, new OpenOption[id_protected[0]])), PG[].class);
        gH.id_case("Loaded " + ((PG[])this.id_class[id_break[3]]).length + " positions");
        LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
        this.id_class[Gw_1.id_break[4]] = longOpenHashSet;
        PG[] pGArray2 = (PG[])this.id_class[id_break[5]];
        int n = pGArray2.length;
        for (int i = id_protected[1]; i < n; ++i) {
            PG pG = pGArray2[i];
            ((LongOpenHashSet)this.id_class[id_break[6]]).add(rfj_3.id_class(pG.id_class, pG.id_break));
        }
    }

    static {
        Gw_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-43, -89, 79, 62, -89, 0, 87, 18}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public GI id_class(int n, int n2) {
        if (((LongOpenHashSet)this.id_class[id_break[7]]).contains(rfj_3.id_class(n, n2)) ^ (Boolean)this.id_class[id_break[8]]) {
            return (GI)((Object)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[id_break[9]]);
        }
        return (GI)((Object)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[id_break[10]]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD95EEB600ACED7BEL;
    }

    @Override
    public int id_class() {
        if (!((Boolean)this.id_class[id_break[11]]).booleanValue()) {
            return id_throws[0];
        }
        int n = id_protected[2];
        Gq_1 gq_1 = new Gq_1((GH)this.id_class[id_break[12]]);
        PG[] pGArray = (PG[])this.id_class[id_break[13]];
        int n2 = pGArray.length;
        for (int i = id_protected[3]; i < n2; ++i) {
            PG pG = pGArray[i];
            if (gq_1.id_class(pG.id_class, pG.id_break) == (GI)((Object)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[id_break[14]]) || ++n < (Integer)C_class.id_instanceof().rR.id_class[id_break[15]]) continue;
            return n;
        }
        return n;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB1CEAB97;
    }

    private static void id_break() {
        id_protected = new boolean[6];
    }

    private static void id_throws() {
        id_byte = new byte[]{4};
    }

    private static /* synthetic */ void ntfClinit() {
        Gw_1.id_break();
        Gw_1.id_byte();
        Gw_1.id_throws();
        Gw_1.id_protected();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[Gw_1.id_protected[4]] = id_protected[5];
        }
    }

    private static void id_protected() {
        id_throws = new int[]{Integer.MAX_VALUE};
    }
}

