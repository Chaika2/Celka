/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzY_2;
import celestial.rrzf_3;
import celestial.rrzi_3;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.security.Key;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQP
extends rrzY_2
implements PosixFileAttributes {
    public Object[] id_throws;
    private static short[] id_case;
    private static byte[] id_catch;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{30, -93, -64, -108, -107, -8, -33, 78}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rrQP(rrzf_3 rrzf_32, byte[] byArray, Path path, int n, FileAttribute ... fileAttributeArray) {
        super(byArray, path, n, fileAttributeArray);
        this.id_finally();
        rrzf_3 rrzf_33 = rrzf_32;
        this.id_throws[rrQP.id_case[14]] = rrzf_33;
        UserPrincipal userPrincipal = (UserPrincipal)((rrzf_3)this.id_throws[rrQP.id_case[15]]).id_break[id_case[16]];
        this.id_throws[rrQP.id_case[17]] = userPrincipal;
        GroupPrincipal groupPrincipal = (GroupPrincipal)((rrzf_3)this.id_throws[rrQP.id_case[18]]).id_break[id_case[19]];
        this.id_throws[rrQP.id_case[20]] = groupPrincipal;
    }

    public rrQP(rrzf_3 rrzf_32, rrQP rrQP2, int n) {
        super(rrQP2, n);
        this.id_finally();
        rrzf_3 rrzf_33 = rrzf_32;
        this.id_throws[rrQP.id_case[29]] = rrzf_33;
        UserPrincipal userPrincipal = (UserPrincipal)((rrzf_3)this.id_throws[rrQP.id_case[30]]).id_break[id_case[31]];
        this.id_throws[rrQP.id_case[32]] = userPrincipal;
        GroupPrincipal groupPrincipal = (GroupPrincipal)((rrzf_3)this.id_throws[rrQP.id_case[33]]).id_break[id_case[34]];
        this.id_throws[rrQP.id_case[35]] = groupPrincipal;
        UserPrincipal userPrincipal2 = (UserPrincipal)rrQP2.id_throws[id_case[36]];
        this.id_throws[rrQP.id_case[37]] = userPrincipal2;
        GroupPrincipal groupPrincipal2 = (GroupPrincipal)rrQP2.id_throws[id_case[38]];
        this.id_throws[rrQP.id_case[39]] = groupPrincipal2;
    }

    public rrQP(rrzf_3 rrzf_32, byte[] byArray, boolean bl, int n) {
        super(byArray, bl, n);
        this.id_finally();
        rrzf_3 rrzf_33 = rrzf_32;
        this.id_throws[rrQP.id_case[0]] = rrzf_33;
        UserPrincipal userPrincipal = (UserPrincipal)((rrzf_3)this.id_throws[rrQP.id_case[1]]).id_break[id_case[2]];
        this.id_throws[rrQP.id_case[3]] = userPrincipal;
        GroupPrincipal groupPrincipal = (GroupPrincipal)((rrzf_3)this.id_throws[rrQP.id_case[4]]).id_break[id_case[5]];
        this.id_throws[rrQP.id_case[6]] = groupPrincipal;
    }

    public rrQP(rrzf_3 rrzf_32, rrQP rrQP2, int n, int n2) {
        super(rrQP2, n);
        this.id_finally();
        rrzf_3 rrzf_33 = rrzf_32;
        this.id_throws[rrQP.id_case[21]] = rrzf_33;
        UserPrincipal userPrincipal = (UserPrincipal)((rrzf_3)this.id_throws[rrQP.id_case[22]]).id_break[id_case[23]];
        this.id_throws[rrQP.id_case[24]] = userPrincipal;
        GroupPrincipal groupPrincipal = (GroupPrincipal)((rrzf_3)this.id_throws[rrQP.id_case[25]]).id_break[id_case[26]];
        this.id_throws[rrQP.id_case[27]] = groupPrincipal;
        Integer n3 = n2;
        this.id_class[rrQP.id_case[28]] = n3;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rrQP(rrzf_3 rrzf_32, byte[] byArray, int n, boolean bl, int n2, FileAttribute ... fileAttributeArray) {
        super(byArray, n, bl, n2, fileAttributeArray);
        this.id_finally();
        rrzf_3 rrzf_33 = rrzf_32;
        this.id_throws[rrQP.id_case[7]] = rrzf_33;
        UserPrincipal userPrincipal = (UserPrincipal)((rrzf_3)this.id_throws[rrQP.id_case[8]]).id_break[id_case[9]];
        this.id_throws[rrQP.id_case[10]] = userPrincipal;
        GroupPrincipal groupPrincipal = (GroupPrincipal)((rrzf_3)this.id_throws[rrQP.id_case[11]]).id_break[id_case[12]];
        this.id_throws[rrQP.id_case[13]] = groupPrincipal;
    }

    public rrQP(rrzf_3 rrzf_32, rrzf_3 rrzf_33, rrzi_3 rrzi_32) throws IOException {
        super(rrzf_33, rrzi_32);
        this.id_finally();
        rrzf_3 rrzf_34 = rrzf_32;
        this.id_throws[rrQP.id_case[40]] = rrzf_34;
        UserPrincipal userPrincipal = (UserPrincipal)((rrzf_3)this.id_throws[rrQP.id_case[41]]).id_break[id_case[42]];
        this.id_throws[rrQP.id_case[43]] = userPrincipal;
        GroupPrincipal groupPrincipal = (GroupPrincipal)((rrzf_3)this.id_throws[rrQP.id_case[44]]).id_break[id_case[45]];
        this.id_throws[rrQP.id_case[46]] = groupPrincipal;
    }

    static {
        rrQP.ntfClinit();
    }

    @Override
    public GroupPrincipal group() {
        this.id_finally();
        return (GroupPrincipal)this.id_throws[id_case[48]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x58FF5AA05A7012B6L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x46188E62;
    }

    @Override
    public Set<PosixFilePermission> permissions() {
        this.id_finally();
        return this.id_class().orElse(Set.copyOf((Set)((rrzf_3)this.id_throws[rrQP.id_case[49]]).id_break[id_case[50]]));
    }

    @Override
    public UserPrincipal owner() {
        this.id_finally();
        return (UserPrincipal)this.id_throws[id_case[47]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrQP.id_extends();
        rrQP.id_implements();
    }

    private void id_finally() {
        if (this.id_throws == null) {
            Object[] objectArray = this.id_throws = new Object[id_catch[0]];
        }
    }

    private static void id_extends() {
        short[] sArray = new short[51];
        sArray[0] = 2;
        sArray[1] = 2;
        sArray[2] = 13;
        sArray[4] = 2;
        sArray[5] = 14;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 2;
        sArray[9] = 13;
        sArray[11] = 2;
        sArray[12] = 14;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[15] = 2;
        sArray[16] = 13;
        sArray[18] = 2;
        sArray[19] = 14;
        sArray[20] = 1;
        sArray[21] = 2;
        sArray[22] = 2;
        sArray[23] = 13;
        sArray[25] = 2;
        sArray[26] = 14;
        sArray[27] = 1;
        sArray[28] = 6;
        sArray[29] = 2;
        sArray[30] = 2;
        sArray[31] = 13;
        sArray[33] = 2;
        sArray[34] = 14;
        sArray[35] = 1;
        sArray[38] = 1;
        sArray[39] = 1;
        sArray[40] = 2;
        sArray[41] = 2;
        sArray[42] = 13;
        sArray[44] = 2;
        sArray[45] = 14;
        sArray[46] = 1;
        sArray[48] = 1;
        sArray[49] = 2;
        sArray[50] = 15;
        id_case = sArray;
    }

    private static void id_implements() {
        id_catch = new byte[]{3};
    }
}

