/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ax_1;
import celestial.PE;
import celestial.PP;
import celestial.an_3;
import celestial.cb_3;
import celestial.gm_3;
import celestial.rRl_1;
import celestial.rXa_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.ryZ_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ms_1
extends Enum<Ms_1>
implements PE,
PP {
    private static short[] shorts347bd646f08b343d83dca157cd270e07;
    public static Object[] staticFields347bd646f08b343d83dca157cd270e07;
    private static String[] strings347bd646f08b343d83dca157cd270e07;
    private static boolean[] booleans347bd646f08b343d83dca157cd270e07;
    private static byte[] bytes347bd646f08b343d83dca157cd270e07;

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7C86BFC3;
    }

    @Override
    public rRl_1 id_byte() {
        return ((Ax_1)Ms_1.b_.id_class[shorts347bd646f08b343d83dca157cd270e07[8]]).id_native();
    }

    static {
        Ms_1.ntfClinit();
    }

    public static Ms_1[] values() {
        return (Ms_1[])((Ms_1[])staticFields347bd646f08b343d83dca157cd270e07[shorts347bd646f08b343d83dca157cd270e07[0]]).clone();
    }

    public static Ms_1 valueOf(String string) {
        return Enum.valueOf(Ms_1.class, string);
    }

    @Override
    public ryZ_2 id_class(cb_3 cb_32, rYB rYB2, rpm_3 rpm_32, rff_3 rff_32) {
        return ((Ax_1)Ms_1.b_.id_class[shorts347bd646f08b343d83dca157cd270e07[10]]).id_break(cb_32, (gm_3)rYB2, rpm_32, rff_32);
    }

    @Override
    public void id_class() {
        ((Ax_1)Ms_1.b_.id_class[shorts347bd646f08b343d83dca157cd270e07[1]]).id_package();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x35D0132E091139D3L;
    }

    @Override
    public void id_class(int n, int n2, int n3, rXa_1 rXa_12) {
        ((Ax_1)Ms_1.b_.id_class[shorts347bd646f08b343d83dca157cd270e07[6]]).id_class(n, n2, n3, rXa_12);
    }

    @Override
    public void id_class(int n) {
        ((Ax_1)Ms_1.b_.id_class[shorts347bd646f08b343d83dca157cd270e07[16]]).id_class(n);
    }

    @Override
    public ryZ_2 id_class(rpm_3 rpm_32) {
        return ((Ax_1)Ms_1.b_.id_class[shorts347bd646f08b343d83dca157cd270e07[11]]).id_class(rpm_32);
    }

    @Override
    public void id_class(boolean bl) {
        ((Ax_1)Ms_1.b_.id_class[shorts347bd646f08b343d83dca157cd270e07[14]]).id_class(bl);
    }

    @Override
    public void id_class(int n, int n2, int n3, rXa_1 rXa_12, boolean bl) {
        ((Ax_1)Ms_1.b_.id_class[shorts347bd646f08b343d83dca157cd270e07[5]]).id_class(n, n2, n3, rXa_12, bl);
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, rpr_3 rpr_32) {
        return ((Ax_1)Ms_1.b_.id_class[shorts347bd646f08b343d83dca157cd270e07[3]]).id_break(rfH_22, rpr_32, booleans347bd646f08b343d83dca157cd270e07[2]);
    }

    @Override
    public void id_class(cb_3 cb_32, an_3 an_32, boolean bl) {
        ((Ax_1)Ms_1.b_.id_class[shorts347bd646f08b343d83dca157cd270e07[12]]).id_class((rhd_3)cb_32, an_32, bl);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-41, -80, 108, -122, -11, 20, -114, -50}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break() {
        ((Ax_1)Ms_1.b_.id_class[shorts347bd646f08b343d83dca157cd270e07[4]]).id_break();
    }

    @Override
    public void id_break(int n) {
        ((Ax_1)Ms_1.b_.id_class[shorts347bd646f08b343d83dca157cd270e07[15]]).id_byte(n);
    }

    @Override
    public ryZ_2 id_break(cb_3 cb_32, rYB rYB2, rpm_3 rpm_32, rff_3 rff_32) {
        return ((Ax_1)Ms_1.b_.id_class[shorts347bd646f08b343d83dca157cd270e07[9]]).id_class(cb_32, (gm_3)rYB2, rpm_32, rff_32);
    }

    @Override
    public boolean id_break(rfH_2 rfH_22, rpr_3 rpr_32) {
        return ((Ax_1)Ms_1.b_.id_class[shorts347bd646f08b343d83dca157cd270e07[13]]).id_class(rfH_22, rpr_32, booleans347bd646f08b343d83dca157cd270e07[3]);
    }

    @Override
    public int id_throws() {
        return ((Ax_1)Ms_1.b_.id_class[Ms_1.shorts347bd646f08b343d83dca157cd270e07[7]]).id_break;
    }

    private static /* synthetic */ void ntfClinit() {
        Ms_1.id_implements();
        Ms_1.id_finally();
        Ms_1.id_catch();
        Ms_1.id_native();
        Ms_1.id_extends();
    }

    private static void id_finally() {
        strings347bd646f08b343d83dca157cd270e07 = new String[]{new String("INSTANCE")};
    }

    private static void id_catch() {
        short[] sArray = new short[18];
        sArray[0] = 1;
        sArray[1] = 55;
        sArray[2] = 55;
        sArray[3] = 55;
        sArray[4] = 55;
        sArray[5] = 55;
        sArray[6] = 55;
        sArray[7] = 55;
        sArray[8] = 55;
        sArray[9] = 55;
        sArray[10] = 55;
        sArray[11] = 55;
        sArray[12] = 55;
        sArray[13] = 55;
        sArray[14] = 55;
        sArray[15] = 55;
        sArray[16] = 55;
        shorts347bd646f08b343d83dca157cd270e07 = sArray;
    }

    private static void id_extends() {
        Object[] objectArray;
        objectArray = new Object[]{new Ms_1(), new Ms_1[]{(Ms_1)objectArray[0]}};
        staticFields347bd646f08b343d83dca157cd270e07 = objectArray;
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[8] = true;
        booleans347bd646f08b343d83dca157cd270e07 = blArray;
    }

    @Override
    public boolean id_protected() {
        return ((Ax_1)Ms_1.b_.id_class[shorts347bd646f08b343d83dca157cd270e07[2]]).id_final().c_() == bytes347bd646f08b343d83dca157cd270e07[0] ? booleans347bd646f08b343d83dca157cd270e07[0] : booleans347bd646f08b343d83dca157cd270e07[1];
    }

    private static /* synthetic */ Ms_1[] id_private() {
        Ms_1[] ms_1Array = new Ms_1[booleans347bd646f08b343d83dca157cd270e07[4]];
        ms_1Array[Ms_1.booleans347bd646f08b343d83dca157cd270e07[5]] = (Ms_1)staticFields347bd646f08b343d83dca157cd270e07[shorts347bd646f08b343d83dca157cd270e07[17]];
        return ms_1Array;
    }

    private static void id_native() {
        bytes347bd646f08b343d83dca157cd270e07 = new byte[]{-1, 2};
    }
}

