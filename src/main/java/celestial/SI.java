/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_continue;
import celestial.C_return;
import celestial.C_super;
import celestial.C_throws;
import celestial.PP;
import celestial.Sf_1;
import celestial.St_1;
import celestial.Sw_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.roJ_2;
import celestial.rqM_2;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SI
implements PP,
C_super {
    private static short[] id_throws;
    private static long[] id_case;
    public static Object[] id_class;
    private static int[] id_catch;
    private static double[] id_private;
    private static byte[] id_implements;
    private static boolean[] id_finally;
    public Object[] id_break;

    public boolean id_byte(int n, int n2) {
        return this.id_throws(n >> id_implements[2], n2 >> id_implements[3]) != null ? id_finally[3] : id_finally[4];
    }

    private void id_byte() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_implements[17]];
        }
    }

    public SI(Path path, rqM_2<rYB> rqM_22) {
        rqM_2<rYB> rqM_23;
        ConcurrentHashMap concurrentHashMap;
        LinkedBlockingQueue linkedBlockingQueue;
        this.id_byte();
        Long2ObjectOpenHashMap long2ObjectOpenHashMap = new Long2ObjectOpenHashMap();
        this.id_break[SI.id_throws[0]] = long2ObjectOpenHashMap;
        this.id_break[SI.id_throws[1]] = linkedBlockingQueue = new LinkedBlockingQueue();
        this.id_break[SI.id_throws[2]] = concurrentHashMap = new ConcurrentHashMap();
        if (!Files.exists(path, new LinkOption[id_finally[0]])) {
            try {
                Files.createDirectories(path, new FileAttribute[id_finally[1]]);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        String string = path.toString();
        this.id_break[SI.id_throws[3]] = string;
        this.id_break[SI.id_throws[4]] = rqM_23 = rqM_22;
        C_class.id_interface().execute(new Sf_1(this));
        C_class.id_interface().execute(() -> {
            try {
                Thread.sleep(id_case[5]);
                while (true) {
                    this.id_class();
                    Thread.sleep(id_case[6]);
                }
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
                return;
            }
        });
    }

    static {
        SI.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA8E3BAC7;
    }

    @Override
    public void id_class() {
        if (!((Boolean)C_class.id_instanceof().id_throw.id_class[id_throws[13]]).booleanValue()) {
            this.id_catch().forEach(sw_1 -> {
                if (sw_1 != null) {
                    sw_1.id_byte();
                }
            });
            this.id_finally();
            return;
        }
        this.id_catch().parallelStream().forEach(sw_1 -> {
            if (sw_1 != null) {
                sw_1.id_byte((String)this.id_break[id_throws[29]]);
            }
        });
        this.id_finally();
    }

    public void id_class(St_1 st_1) {
        Sw_1 sw_1 = this.id_case((Integer)st_1.id_break[id_throws[9]] >> id_implements[6], (Integer)st_1.id_break[id_throws[10]] >> id_implements[7]);
        sw_1.id_class((Integer)st_1.id_break[id_throws[11]] & id_implements[8], (Integer)st_1.id_break[id_throws[12]] & id_implements[9], st_1);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-80, 35, -77, -106, 114, 41, 61, -45}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public /* synthetic */ C_continue id_class(int n, int n2) {
        return this.id_throws(n, n2);
    }

    @Override
    public void id_class(roJ_2 roJ_22) {
        if (((Map)this.id_break[id_throws[5]]).put(roJ_22.id_private(), roJ_22) == null) {
            ((LinkedBlockingQueue)this.id_break[id_throws[6]]).add(roJ_22.id_private());
        }
    }

    @Override
    public ArrayList<rfH_2> id_class(String string, int n, int n2, int n3, int n4) {
        ArrayList<rfH_2> arrayList = new ArrayList<rfH_2>();
        int n5 = n2 >> id_implements[4];
        int n6 = n3 >> id_implements[5];
        for (int i = id_finally[5]; i <= n4; ++i) {
            for (int j = -i; j <= i; ++j) {
                for (int k = -i; k <= i; ++k) {
                    int n7;
                    int n8;
                    Sw_1 sw_1;
                    int n9 = j * j + k * k;
                    if (n9 != i || (sw_1 = this.id_case(n8 = j + n5, n7 = k + n6)) == null) continue;
                    arrayList.addAll(sw_1.id_protected(string));
                }
            }
            if (arrayList.size() < n) continue;
            return arrayList;
        }
        return arrayList;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9E53AB88C9216AF4L;
    }

    @Override
    public boolean id_break(int n, int n2) {
        Sw_1 sw_1 = this.id_throws(n >> id_implements[0], n2 >> id_implements[1]);
        if (sw_1 == null) {
            return id_finally[2];
        }
        return sw_1.id_class(n & id_throws[7], n2 & id_throws[8]);
    }

    @Override
    public void id_break() {
        long l = System.nanoTime() / id_case[0];
        this.id_catch().forEach(sw_1 -> {
            if (sw_1 != null) {
                sw_1.id_class((String)this.id_break[id_throws[28]]);
            }
        });
        long l2 = System.nanoTime() / id_case[1];
        System.out.println("World load took " + (l2 - l) + "ms");
    }

    private static void id_throws() {
        id_catch = new int[]{58594, -58594, 58594, -58594, 58594};
    }

    public synchronized Sw_1 id_throws(int n, int n2) {
        return (Sw_1)((Long2ObjectMap)this.id_break[id_throws[24]]).get(this.id_private(n, n2));
    }

    private static /* synthetic */ void ntfClinit() {
        SI.id_case();
        SI.id_volatile();
        SI.id_final();
        SI.id_extends();
        SI.id_protected();
        SI.id_throws();
        SI.id_implements();
    }

    private synchronized void id_finally() {
        if (!((Boolean)C_class.id_instanceof().id_throws.id_class[id_throws[14]]).booleanValue()) {
            return;
        }
        rfH_2 rfH_22 = this.id_native();
        for (Sw_1 sw_1 : this.id_catch()) {
            int n;
            int n2;
            double d;
            if (sw_1 == null || !((d = Math.sqrt((n2 = (sw_1.id_break() << id_implements[10]) + id_throws[15] - rfH_22.b_()) * n2 + (n = (sw_1.id_class() << id_implements[11]) + id_throws[16] - rfH_22.d_()) * n)) > id_private[0])) continue;
            if (!((Boolean)C_class.id_instanceof().A.id_class[id_throws[17]]).booleanValue()) {
                this.id_byte("Deleting cached region " + sw_1.id_break() + "," + sw_1.id_class() + " from ram");
            }
            ((Long2ObjectMap)this.id_break[id_throws[18]]).remove(this.id_private(sw_1.id_break(), sw_1.id_class()));
        }
    }

    private boolean id_catch(int n, int n2) {
        return n <= id_catch[0] && n >= id_catch[1] && n2 <= id_catch[2] && n2 >= id_catch[3] ? id_finally[10] : id_finally[11];
    }

    private synchronized List<Sw_1> id_catch() {
        return new ArrayList<Sw_1>((Collection<Sw_1>)((Long2ObjectMap)this.id_break[id_throws[23]]).values());
    }

    private static void id_extends() {
        id_private = new double[]{1024.0};
    }

    private static void id_case() {
        boolean[] blArray = new boolean[14];
        blArray[3] = true;
        blArray[10] = true;
        blArray[12] = true;
        id_finally = blArray;
    }

    private synchronized Sw_1 id_case(int n, int n2) {
        return (Sw_1)((Long2ObjectMap)this.id_break[id_throws[25]]).computeIfAbsent(this.id_private(n, n2), l -> {
            Sw_1 sw_1 = new Sw_1(n, n2, (rqM_2)this.id_break[id_throws[26]]);
            sw_1.id_class((String)this.id_break[id_throws[27]]);
            return sw_1;
        });
    }

    private static void id_implements() {
        Object[] objectArray = new Object[]{58594};
        id_class = objectArray;
    }

    public void id_protected(int n, int n2) {
        this.id_case(n, n2);
    }

    private static void id_protected() {
        id_implements = new byte[]{9, 9, 9, 9, 9, 9, 5, 5, 31, 31, 9, 9, 4, 8, 4, 8, 32, 5};
    }

    private long id_private(int n, int n2) {
        if (!this.id_catch(n, n2)) {
            return id_case[2];
        }
        return (long)n & id_case[3] | ((long)n2 & id_case[4]) << id_implements[16];
    }

    private static void id_final() {
        short[] sArray = new short[30];
        sArray[1] = 2;
        sArray[2] = 3;
        sArray[3] = 1;
        sArray[4] = 4;
        sArray[5] = 3;
        sArray[6] = 2;
        sArray[7] = 511;
        sArray[8] = 511;
        sArray[10] = 1;
        sArray[12] = 1;
        sArray[15] = 256;
        sArray[16] = 256;
        sArray[19] = 7;
        sArray[20] = 7;
        sArray[22] = 1;
        sArray[26] = 4;
        sArray[27] = 1;
        sArray[28] = 1;
        sArray[29] = 1;
        id_throws = sArray;
    }

    private static void id_volatile() {
        long[] lArray = new long[7];
        lArray[0] = 1000000L;
        lArray[1] = 1000000L;
        lArray[3] = 0xFFFFFFFFL;
        lArray[4] = 0xFFFFFFFFL;
        lArray[5] = 30000L;
        lArray[6] = 600000L;
        id_case = lArray;
    }

    private rfH_2 id_native() {
        for (C_case object : C_throws.id_class().id_case()) {
            C_return c_return = object.id_implements().id_class();
            if (c_return == null || c_return.id_break() != this || object.id_throw().id_catch() == null) continue;
            return object.id_throw().id_volatile();
        }
        Object object = null;
        for (Sw_1 sw_1 : this.id_catch()) {
            St_1 st_1;
            if (sw_1 == null || (st_1 = sw_1.id_protected()) == null || object != null && (Long)((St_1)object).id_break[id_throws[19]] >= (Long)st_1.id_break[id_throws[20]]) continue;
            object = st_1;
        }
        if (object == null) {
            return new rfH_2(id_finally[6], id_finally[7], id_finally[8]);
        }
        return new rfH_2(((Integer)((St_1)object).id_break[id_throws[21]] << id_implements[12]) + id_implements[13], id_finally[9], ((Integer)((St_1)object).id_break[id_throws[22]] << id_implements[14]) + id_implements[15]);
    }
}

