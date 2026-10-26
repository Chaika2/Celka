/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_else;
import celestial.C_synchronized;
import celestial.C_this;
import celestial.C_while;
import celestial.rU_2;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.security.Key;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sg_1
implements C_synchronized {
    public static Object[] id_class;
    private static byte[] id_byte;
    private static long[] id_protected;
    public Object[] id_break;
    private static boolean[] id_throws;
    private static short[] id_case;

    private synchronized void id_byte(C_else c_else) {
        ((Map)this.id_break[id_case[2]]).put(c_else, new HashSet());
        Path path = ((Path)this.id_break[id_case[3]]).resolve(c_else.name().toLowerCase() + ".mp4");
        if (!Files.exists(path, new LinkOption[id_throws[3]])) {
            return;
        }
        try (FileInputStream fileInputStream = new FileInputStream(path.toFile());
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
             DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);){
            long l = dataInputStream.readLong();
            if (l != id_protected[0]) {
                throw new IOException("Bad magic value " + l);
            }
            long l2 = dataInputStream.readLong();
            while (true) {
                long l3 = l2;
                l2 = l3 - id_protected[1];
                if (l3 > id_protected[2]) {
                    String string = dataInputStream.readUTF();
                    long l4 = dataInputStream.readLong();
                    int n = dataInputStream.readInt();
                    int n2 = dataInputStream.readInt();
                    int n3 = dataInputStream.readInt();
                    ((Set)((Map)this.id_break[id_case[4]]).get((Object)c_else)).add(new C_while(string, c_else, new rU_2(n, n2, n3), l4));
                    continue;
                }
                break;
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private static void id_byte() {
        id_byte = new byte[]{2};
    }

    public Sg_1(Path path) {
        HashMap hashMap;
        this.id_throws();
        Path path2 = path;
        this.id_break[Sg_1.id_case[0]] = path2;
        if (!Files.exists(path, new LinkOption[id_throws[0]])) {
            try {
                Files.createDirectories(path, new FileAttribute[id_throws[1]]);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        this.id_break[Sg_1.id_case[1]] = hashMap = new HashMap();
        this.id_case();
    }

    static {
        Sg_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7644F1CD;
    }

    @Override
    public C_this id_class(C_else c_else) {
        return ((Set)((Map)this.id_break[id_case[10]]).get((Object)c_else)).stream().min(Comparator.comparingLong(c_this -> -c_this.id_protected())).orElse(null);
    }

    @Override
    public Set<C_this> id_class() {
        return ((Map)this.id_break[id_case[12]]).values().stream().flatMap(Collection::stream).collect(Collectors.toSet());
    }

    @Override
    public void id_class(C_this c_this) {
        if (((Set)((Map)this.id_break[id_case[8]]).get((Object)c_this.id_break())).add(c_this)) {
            this.id_protected(c_this.id_break());
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9BB49C94FD595B4FL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-69, -7, 55, -61, 77, 90, -60, -80}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(C_this c_this) {
        if (((Set)((Map)this.id_break[id_case[9]]).get((Object)c_this.id_break())).remove(c_this)) {
            this.id_protected(c_this.id_break());
        }
    }

    @Override
    public Set<C_this> id_break(C_else c_else) {
        return Collections.unmodifiableSet((Set)((Map)this.id_break[id_case[11]]).get((Object)c_else));
    }

    private static void id_break() {
        long[] lArray = new long[5];
        lArray[0] = 121977993584L;
        lArray[1] = 1L;
        lArray[3] = 121977993584L;
        lArray[4] = 121977993584L;
        id_protected = lArray;
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Sg_1.id_protected();
        Sg_1.id_break();
        Sg_1.id_catch();
        Sg_1.id_byte();
        Sg_1.id_private();
    }

    private static void id_catch() {
        short[] sArray = new short[13];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[12] = 1;
        id_case = sArray;
    }

    private void id_case() {
        C_else[] c_elseArray = C_else.values();
        int n = c_elseArray.length;
        for (int i = id_throws[2]; i < n; ++i) {
            C_else c_else = c_elseArray[i];
            this.id_byte(c_else);
        }
    }

    private synchronized void id_protected(C_else c_else) {
        Path path = ((Path)this.id_break[id_case[5]]).resolve(c_else.name().toLowerCase() + ".mp4");
        try (FileOutputStream fileOutputStream = new FileOutputStream(path.toFile());
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
             DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);){
            dataOutputStream.writeLong(id_protected[3]);
            dataOutputStream.writeLong(((Set)((Map)this.id_break[id_case[6]]).get((Object)c_else)).size());
            for (C_this c_this : (Set)((Map)this.id_break[id_case[7]]).get((Object)c_else)) {
                dataOutputStream.writeUTF(c_this.id_byte());
                dataOutputStream.writeLong(c_this.id_protected());
                dataOutputStream.writeInt(c_this.id_class().b_());
                dataOutputStream.writeInt(c_this.id_class().c_());
                dataOutputStream.writeInt(c_this.id_class().d_());
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[4] = true;
        id_throws = blArray;
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{121977993584L};
        id_class = objectArray;
    }
}

