/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.C_continue;
import celestial.St_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.ri_3;
import celestial.rqM_2;
import celestial.xc_3;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.security.Key;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sw_1
implements C_continue {
    public static Object[] id_class;
    public Object[] id_break;
    private static boolean[] id_byte;
    private static byte[] id_protected;
    private static String[] id_throws;
    private static short[] id_case;
    private static long[] id_catch;
    private static int[] id_private;

    public synchronized void id_byte(String string) {
        if (!((Boolean)this.id_break[id_case[12]]).booleanValue()) {
            return;
        }
        this.id_byte();
        try {
            Path path;
            Path path2 = Paths.get(string, new String[id_byte[6]]);
            if (!Files.exists(path2, new LinkOption[id_byte[7]])) {
                Files.createDirectories(path2, new FileAttribute[id_byte[8]]);
            }
            if (!Files.exists(path = Sw_1.id_class(path2, (Integer)this.id_break[id_case[13]], (Integer)this.id_break[id_case[14]]), new LinkOption[id_byte[9]])) {
                Files.createFile(path, new FileAttribute[id_byte[10]]);
            }
            try (FileOutputStream fileOutputStream = new FileOutputStream(path.toFile());
                 GZIPOutputStream gZIPOutputStream = new GZIPOutputStream((OutputStream)fileOutputStream, id_case[15]);
                 DataOutputStream dataOutputStream = new DataOutputStream(gZIPOutputStream);){
                Object object;
                int n;
                int n2;
                dataOutputStream.writeInt(id_private[0]);
                for (n2 = id_byte[11]; n2 < id_protected[10]; ++n2) {
                    for (n = id_byte[12]; n < id_protected[11]; ++n) {
                        St_1 st_1 = ((St_1[][])this.id_break[id_case[16]])[n2][n];
                        if (st_1 == null) {
                            dataOutputStream.write(id_byte[13]);
                            continue;
                        }
                        dataOutputStream.write(id_byte[14]);
                        object = st_1.id_byte();
                        dataOutputStream.write((byte[])object);
                        dataOutputStream.write(new byte[id_case[17] - ((byte[])object).length]);
                    }
                }
                for (n2 = id_byte[15]; n2 < id_protected[12]; ++n2) {
                    for (n = id_byte[16]; n < id_protected[13]; ++n) {
                        if (((St_1[][])this.id_break[id_case[18]])[n2][n] == null) continue;
                        for (int i = id_byte[17]; i < id_case[19]; ++i) {
                            dataOutputStream.writeUTF(ri_3.id_class(((St_1[][])this.id_break[id_case[20]])[n2][n].id_class()[i].id_break()));
                        }
                    }
                }
                for (n2 = id_byte[18]; n2 < id_protected[14]; ++n2) {
                    for (n = id_byte[19]; n < id_protected[15]; ++n) {
                        if (((St_1[][])this.id_break[id_case[21]])[n2][n] == null) continue;
                        Map<String, List<rfH_2>> map = ((St_1[][])this.id_break[id_case[22]])[n2][n].id_break();
                        dataOutputStream.writeShort(map.entrySet().size());
                        object = map.entrySet().iterator();
                        while (object.hasNext()) {
                            Map.Entry entry = (Map.Entry)object.next();
                            dataOutputStream.writeUTF((String)entry.getKey());
                            dataOutputStream.writeShort(((List)entry.getValue()).size());
                            for (rfH_2 rfH_22 : (List)entry.getValue()) {
                                dataOutputStream.writeByte((byte)(rfH_22.d_() << id_protected[16] | rfH_22.b_()));
                                dataOutputStream.writeByte((byte)rfH_22.c_());
                            }
                        }
                    }
                }
                for (n2 = id_byte[20]; n2 < id_protected[17]; ++n2) {
                    for (n = id_byte[21]; n < id_protected[18]; ++n) {
                        if (((St_1[][])this.id_break[id_case[23]])[n2][n] == null) continue;
                        dataOutputStream.writeLong((Long)((St_1[][])this.id_break[Sw_1.id_case[24]])[n2][n].id_break[id_case[25]]);
                    }
                }
            }
            Boolean bl = id_byte[22];
            this.id_break[Sw_1.id_case[26]] = bl;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public synchronized void id_byte() {
        long l = (Long)C_class.id_instanceof().id_strictfp.id_class[id_case[37]];
        if (l < id_catch[2]) {
            return;
        }
        long l2 = System.currentTimeMillis();
        long l3 = l2 - l * id_catch[3];
        for (int i = id_byte[42]; i < id_protected[44]; ++i) {
            for (int j = id_byte[43]; j < id_protected[45]; ++j) {
                if (((St_1[][])this.id_break[id_case[38]])[i][j] == null || (Long)((St_1[][])this.id_break[Sw_1.id_case[39]])[i][j].id_break[id_case[40]] >= l3) continue;
                System.out.println("Removing chunk " + (i + id_protected[46] * (Integer)this.id_break[id_case[41]]) + "," + (j + id_protected[47] * (Integer)this.id_break[id_case[42]]) + " because it was cached " + (l2 - (Long)((St_1[][])this.id_break[Sw_1.id_case[43]])[i][j].id_break[id_case[44]]) / id_catch[4] + " seconds ago, and max age is " + l);
                ((St_1[][])this.id_break[Sw_1.id_case[45]])[i][j] = null;
            }
        }
    }

    public Sw_1(int n, int n2, rqM_2<rYB> rqM_22) {
        rqM_2<rYB> rqM_23;
        St_1[][] st_1Array;
        this.id_private();
        this.id_break[Sw_1.id_case[0]] = st_1Array = new St_1[id_protected[0]][id_protected[1]];
        Integer n3 = n;
        this.id_break[Sw_1.id_case[1]] = n3;
        Integer n4 = n2;
        this.id_break[Sw_1.id_case[2]] = n4;
        Boolean bl = id_byte[0];
        this.id_break[Sw_1.id_case[3]] = bl;
        this.id_break[Sw_1.id_case[4]] = rqM_23 = rqM_22;
    }

    static {
        Sw_1.ntfClinit();
    }

    @Override
    public int id_class() {
        return (Integer)this.id_break[id_case[52]];
    }

    private static Path id_class(Path path, int n, int n2) {
        String[] stringArray = new String[id_byte[46]];
        stringArray[Sw_1.id_byte[47]] = "r." + n + "." + n2 + ".bcr";
        return Paths.get(path.toString(), stringArray);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9A341802;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x63078CBC909A7FD4L;
    }

    @Override
    public boolean id_class(int n, int n2) {
        return ((St_1[][])this.id_break[id_case[7]])[n >> id_protected[6]][n2 >> id_protected[7]] != null ? id_byte[1] : id_byte[2];
    }

    @Override
    public xc_3 id_class(int n, int n2, int n3) {
        St_1 st_1 = ((St_1[][])this.id_break[id_case[5]])[n >> id_protected[2]][n3 >> id_protected[3]];
        if (st_1 != null) {
            return st_1.id_class(n & id_protected[4], n2, n3 & id_protected[5], (rqM_2)this.id_break[id_case[6]]);
        }
        return null;
    }

    public synchronized void id_class(int n, int n2, St_1 st_1) {
        ((St_1[][])this.id_break[Sw_1.id_case[10]])[n][n2] = st_1;
        Boolean bl = id_byte[5];
        this.id_break[Sw_1.id_case[11]] = bl;
    }

    public synchronized void id_class(String string) {
        try {
            Path path;
            Path path2 = Paths.get(string, new String[id_byte[23]]);
            if (!Files.exists(path2, new LinkOption[id_byte[24]])) {
                Files.createDirectories(path2, new FileAttribute[id_byte[25]]);
            }
            if (!Files.exists(path = Sw_1.id_class(path2, (Integer)this.id_break[id_case[27]], (Integer)this.id_break[id_case[28]]), new LinkOption[id_byte[26]])) {
                return;
            }
            long l = System.nanoTime() / id_catch[0];
            try (FileInputStream fileInputStream = new FileInputStream(path.toFile());
                 GZIPInputStream gZIPInputStream = new GZIPInputStream((InputStream)fileInputStream, id_private[1]);
                 DataInputStream dataInputStream = new DataInputStream(gZIPInputStream);){
                int n;
                int n2;
                int n3;
                int n4 = dataInputStream.readInt();
                if (n4 != id_private[2]) {
                    throw new IOException("Bad magic value " + n4);
                }
                boolean[][] blArray = new boolean[id_protected[19]][id_protected[20]];
                BitSet[][] bitSetArray = new BitSet[id_protected[21]][id_protected[22]];
                Map[][] mapArray = new Map[id_protected[23]][id_protected[24]];
                xc_3[][][] xc_3Array = new xc_3[id_protected[25]][id_protected[26]][];
                long[][] lArray = new long[id_protected[27]][id_protected[28]];
                for (n3 = id_byte[27]; n3 < id_protected[29]; ++n3) {
                    block22: for (n2 = id_byte[28]; n2 < id_protected[30]; ++n2) {
                        n = dataInputStream.read();
                        switch (n) {
                            case 1: {
                                byte[] byArray = new byte[id_case[29]];
                                dataInputStream.readFully(byArray);
                                bitSetArray[n3][n2] = BitSet.valueOf(byArray);
                                mapArray[n3][n2] = new HashMap();
                                xc_3Array[n3][n2] = new xc_3[id_case[30]];
                                blArray[n3][n2] = id_byte[29];
                                continue block22;
                            }
                            case 0: {
                                continue block22;
                            }
                            default: {
                                throw new IOException(id_throws[0]);
                            }
                        }
                    }
                }
                for (n3 = id_byte[30]; n3 < id_protected[31]; ++n3) {
                    for (n2 = id_byte[31]; n2 < id_protected[32]; ++n2) {
                        if (!blArray[n3][n2]) continue;
                        for (n = id_byte[32]; n < id_case[31]; ++n) {
                            xc_3Array[n3][n2][n] = ri_3.id_break(dataInputStream.readUTF()).id_continue();
                        }
                    }
                }
                for (n3 = id_byte[33]; n3 < id_protected[33]; ++n3) {
                    for (n2 = id_byte[34]; n2 < id_protected[34]; ++n2) {
                        if (!blArray[n3][n2]) continue;
                        n = dataInputStream.readShort() & id_private[3];
                        for (int i = id_byte[35]; i < n; ++i) {
                            String string2 = dataInputStream.readUTF();
                            ri_3.id_break(string2);
                            ArrayList<rfH_2> arrayList = new ArrayList<rfH_2>();
                            mapArray[n3][n2].put(string2, arrayList);
                            int n5 = dataInputStream.readShort() & id_private[4];
                            if (n5 == 0) {
                                n5 = id_private[5];
                            }
                            for (int j = id_byte[36]; j < n5; ++j) {
                                byte by = dataInputStream.readByte();
                                int n6 = by & id_protected[35];
                                int n7 = by >>> id_protected[36] & id_protected[37];
                                int n8 = dataInputStream.readByte() & id_case[32];
                                arrayList.add(new rfH_2(n6, n8, n7));
                            }
                        }
                    }
                }
                for (n3 = id_byte[37]; n3 < id_protected[38]; ++n3) {
                    for (n2 = id_byte[38]; n2 < id_protected[39]; ++n2) {
                        if (!blArray[n3][n2]) continue;
                        lArray[n3][n2] = dataInputStream.readLong();
                    }
                }
                for (n3 = id_byte[39]; n3 < id_protected[40]; ++n3) {
                    for (n2 = id_byte[40]; n2 < id_protected[41]; ++n2) {
                        if (!blArray[n3][n2]) continue;
                        n = (Integer)this.id_break[id_case[33]];
                        int n9 = (Integer)this.id_break[id_case[34]];
                        int n10 = n3 + id_protected[42] * n;
                        int n11 = n2 + id_protected[43] * n9;
                        ((St_1[][])this.id_break[Sw_1.id_case[35]])[n3][n2] = new St_1(n10, n11, bitSetArray[n3][n2], xc_3Array[n3][n2], mapArray[n3][n2], lArray[n3][n2]);
                    }
                }
            }
            this.id_byte();
            Boolean bl = id_byte[41];
            this.id_break[Sw_1.id_case[36]] = bl;
            long l2 = System.nanoTime() / id_catch[1];
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public int id_break() {
        return (Integer)this.id_break[id_case[51]];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{36, -107, -116, 120, 114, -56, 73, 69}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{(byte)0, (byte)1, 456022910};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Sw_1.id_catch();
        Sw_1.id_implements();
        Sw_1.id_native();
        Sw_1.id_finally();
        Sw_1.id_extends();
        Sw_1.id_case();
        Sw_1.id_throws();
    }

    private static void id_finally() {
        short[] sArray = new short[53];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 4;
        sArray[4] = 3;
        sArray[6] = 3;
        sArray[11] = 4;
        sArray[12] = 4;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[15] = 16384;
        sArray[17] = 16384;
        sArray[19] = 256;
        sArray[25] = 7;
        sArray[26] = 4;
        sArray[27] = 1;
        sArray[28] = 2;
        sArray[29] = 16384;
        sArray[30] = 256;
        sArray[31] = 256;
        sArray[32] = 255;
        sArray[33] = 1;
        sArray[34] = 2;
        sArray[36] = 4;
        sArray[40] = 7;
        sArray[41] = 1;
        sArray[42] = 2;
        sArray[44] = 7;
        sArray[48] = 7;
        sArray[49] = 7;
        sArray[51] = 1;
        sArray[52] = 2;
        id_case = sArray;
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[56];
        blArray[1] = true;
        blArray[5] = true;
        blArray[14] = true;
        blArray[29] = true;
        blArray[46] = true;
        blArray[48] = true;
        blArray[54] = true;
        blArray[55] = true;
        id_byte = blArray;
    }

    private static void id_extends() {
        id_protected = new byte[]{32, 32, 4, 4, 15, 15, 4, 4, 32, 32, 32, 32, 32, 32, 32, 32, 4, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 15, 4, 15, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 5, 2, 4, 3, 2};
    }

    private static void id_case() {
        id_private = new int[]{456022910, 32768, 456022910, 65535, 65535, 65536, 456022910};
    }

    private static void id_implements() {
        id_throws = new String[]{new String("Malformed stream")};
    }

    public synchronized St_1 id_protected() {
        St_1 st_1 = null;
        for (int i = id_byte[44]; i < id_protected[48]; ++i) {
            for (int j = id_byte[45]; j < id_protected[49]; ++j) {
                if (((St_1[][])this.id_break[id_case[46]])[i][j] == null || st_1 != null && (Long)((St_1[][])this.id_break[Sw_1.id_case[47]])[i][j].id_break[id_case[48]] <= (Long)st_1.id_break[id_case[49]]) continue;
                st_1 = ((St_1[][])this.id_break[id_case[50]])[i][j];
            }
        }
        return st_1;
    }

    public ArrayList<rfH_2> id_protected(String string) {
        ArrayList<rfH_2> arrayList = new ArrayList<rfH_2>();
        for (int i = id_byte[3]; i < id_protected[8]; ++i) {
            for (int j = id_byte[4]; j < id_protected[9]; ++j) {
                ArrayList<rfH_2> arrayList2;
                if (((St_1[][])this.id_break[id_case[8]])[i][j] == null || (arrayList2 = ((St_1[][])this.id_break[id_case[9]])[i][j].id_class(string)) == null) continue;
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    private void id_private() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[50]];
            objectArray[Sw_1.id_byte[48]] = id_byte[49];
            objectArray[Sw_1.id_protected[51]] = id_byte[50];
            objectArray[Sw_1.id_protected[52]] = id_byte[51];
        }
    }

    private static void id_native() {
        long[] lArray = new long[5];
        lArray[0] = 1000000L;
        lArray[1] = 1000000L;
        lArray[3] = 1000L;
        lArray[4] = 1000L;
        id_catch = lArray;
    }
}

