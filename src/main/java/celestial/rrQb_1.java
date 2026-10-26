/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQM;
import celestial.rrQs_1;
import celestial.rrzT_2;
import celestial.rrzq_3;
import celestial.rrzt_3;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQb_1
extends rrzq_3
implements PosixFileAttributeView {
    private static String[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_break;
    private static short[] id_throws;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-65, 16, -79, 91, 92, -80, 116, 12}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_byte() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[1]];
            objectArray[rrQb_1.id_protected[2]] = id_protected[3];
        }
    }

    public rrQb_1(rrQs_1 rrQs_12, boolean bl) {
        super(rrQs_12, id_protected[0]);
        this.id_byte();
        Boolean bl2 = bl;
        this.id_break[rrQb_1.id_throws[0]] = bl2;
    }

    static {
        rrQb_1.ntfClinit();
    }

    @Override
    public String name() {
        this.id_byte();
        return (Boolean)this.id_break[id_throws[1]] != false ? id_byte[0] : id_byte[1];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9F0E89CF;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6AA5B6401227EF57L;
    }

    @Override
    public Object id_class(rrzT_2 rrzT_22, rrzt_3 rrzt_32) {
        this.id_byte();
        PosixFileAttributes posixFileAttributes = (PosixFileAttributes)((Object)rrzt_32);
        switch (((int[])rrQM.id_class[id_throws[5]])[rrzT_22.ordinal()]) {
            case 1: {
                return posixFileAttributes.owner();
            }
            case 2: {
                return posixFileAttributes.group();
            }
            case 3: {
                if (!((Boolean)this.id_break[id_throws[6]]).booleanValue()) {
                    return posixFileAttributes.permissions();
                }
                return super.id_class(rrzT_22, rrzt_32);
            }
        }
        return super.id_class(rrzT_22, rrzt_32);
    }

    private static void id_class() {
        id_throws = new short[7];
    }

    @Override
    public PosixFileAttributes readAttributes() throws IOException {
        return (PosixFileAttributes)((Object)((rrQs_1)this.id_class[id_throws[2]]).id_class());
    }

    private static void id_break() {
        id_byte = new String[]{new String("owner"), new String("posix")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrQb_1.id_protected();
        rrQb_1.id_break();
        rrQb_1.id_class();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[1] = true;
        id_protected = blArray;
    }

    @Override
    public UserPrincipal getOwner() throws IOException {
        return this.readAttributes().owner();
    }

    @Override
    public void setOwner(UserPrincipal userPrincipal) throws IOException {
        ((rrQs_1)this.id_class[id_throws[3]]).id_class(userPrincipal);
    }

    @Override
    public void setGroup(GroupPrincipal groupPrincipal) throws IOException {
        ((rrQs_1)this.id_class[id_throws[4]]).id_class(groupPrincipal);
    }
}

