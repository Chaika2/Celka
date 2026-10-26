/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.SystemUtils
 */
package celestial;

import celestial.C_class;
import celestial.C_public;
import celestial.C_return;
import celestial.PP;
import celestial.SR;
import celestial.gm_3;
import celestial.rRJ;
import celestial.rYB;
import celestial.rng_3;
import celestial.rqM_2;
import celestial.rrGr_1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.SystemUtils;

public class SY
implements PP,
C_public {
    private static byte[] id_throws;
    public static Object[] id_class;
    private static String[] id_case;
    public Object[] id_break;
    private static short[] id_catch;
    private static boolean[] id_private;

    public SR id_byte() {
        this.id_catch();
        return (SR)this.id_break[id_catch[0]];
    }

    public SY() {
        this.id_throws();
    }

    static {
        SY.ntfClinit();
    }

    public void id_class(Consumer<SR> consumer) {
        this.id_catch();
        if ((SR)this.id_break[id_catch[13]] != null) {
            consumer.accept((SR)this.id_break[id_catch[14]]);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6D053BDE;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{85, -108, 21, 21, 87, 54, -125, -95}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void id_class(rqM_2<rYB> rqM_22) {
        Object object;
        File file;
        File file2;
        rng_3 rng_32 = b_.id_this();
        if (b_.id_finally()) {
            file2 = rRJ.id_class(rqM_22, rng_32.id_class(rrGr_1.id_implements).toFile());
            if (file2.toPath().relativize(((File)SY.b_.id_class[id_catch[1]]).toPath()).getNameCount() != id_throws[0]) {
                file2 = file2.getParentFile();
            }
            file = file2 = new File(file2, id_case[0]);
        } else {
            if (b_.S() == null) {
                Object var13_7 = null;
                this.id_break[SY.id_catch[2]] = var13_7;
                gm_3 gm_32 = (gm_3)SY.b_.id_class[id_catch[3]];
                this.id_break[SY.id_catch[4]] = gm_32;
                return;
            }
            object = SY.b_.S().id_break;
            if (SystemUtils.IS_OS_WINDOWS) {
                object = ((String)object).replace(id_case[1], id_case[2]);
            }
            file2 = new File(C_class.B(), (String)object);
            file = C_class.B();
        }
        try {
            object = new FileOutputStream(new File(file, id_case[3]));
            try {
                ((FileOutputStream)object).write(id_case[4].getBytes());
            }
            finally {
                ((FileOutputStream)object).close();
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        object = rRJ.id_class(rqM_22, file2).toPath();
        if (!Files.exists((Path)object, new LinkOption[id_private[0]])) {
            try {
                Files.createDirectories((Path)object, new FileAttribute[id_private[1]]);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        Map map = (Map)id_class[id_catch[5]];
        synchronized (map) {
            SR sR = ((Map)id_class[id_catch[6]]).computeIfAbsent(object, path -> new SR((Path)path, rqM_22));
            this.id_break[SY.id_catch[7]] = sR;
        }
        gm_3 gm_33 = (gm_3)SY.b_.id_class[id_catch[8]];
        this.id_break[SY.id_catch[9]] = gm_33;
    }

    @Override
    public /* synthetic */ C_return id_class() {
        return this.id_byte();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB570BC71F7BE910FL;
    }

    public void id_break() {
        SR sR = (SR)this.id_break[id_catch[10]];
        Object var6_2 = null;
        this.id_break[SY.id_catch[11]] = var6_2;
        Object var7_3 = null;
        this.id_break[SY.id_catch[12]] = var7_3;
        if (sR == null) {
            return;
        }
        sR.id_byte();
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[1]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        SY.id_private();
        SY.id_case();
        SY.id_protected();
        SY.id_implements();
        SY.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray = new Object[]{new HashMap()};
        id_class = objectArray;
    }

    private final void id_catch() {
        if ((rYB)this.id_break[id_catch[15]] != (gm_3)SY.b_.id_class[id_catch[16]]) {
            if ((SR)this.id_break[id_catch[17]] != null) {
                this.id_break();
            }
            if ((gm_3)SY.b_.id_class[id_catch[18]] != null) {
                this.id_class(((gm_3)SY.b_.id_class[id_catch[19]]).E());
            }
        } else if ((SR)this.id_break[id_catch[20]] == null && (gm_3)SY.b_.id_class[id_catch[21]] != null && (b_.id_finally() || b_.S() != null)) {
            this.id_class(((gm_3)SY.b_.id_class[id_catch[22]]).E());
        }
    }

    private static void id_case() {
        id_case = new String[]{new String("baritone"), new String(":"), new String("_"), new String("readme.txt"), new String("https://github.com/cabaletta/baritone\n")};
    }

    private static void id_implements() {
        id_throws = new byte[]{2, 2};
    }

    private static void id_protected() {
        short[] sArray = new short[23];
        sArray[1] = 24;
        sArray[3] = 56;
        sArray[4] = 1;
        sArray[8] = 56;
        sArray[9] = 1;
        sArray[12] = 1;
        sArray[15] = 1;
        sArray[16] = 56;
        sArray[18] = 56;
        sArray[19] = 56;
        sArray[21] = 56;
        sArray[22] = 56;
        id_catch = sArray;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[4];
        blArray[3] = true;
        id_private = blArray;
    }
}

