/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.GR;
import celestial.GV;
import celestial.Gg_1;
import celestial.dO_2;
import celestial.kf_3;
import celestial.rYB;
import celestial.rfH_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public sealed class Gj_1
extends Enum<Gj_1>
permits GV, Gg_1, GR {
    public Object[] fieldsc2539fcd16d03c23acab3f85bec2d6b6;
    private static String[] stringsc2539fcd16d03c23acab3f85bec2d6b6;
    public static Object[] staticFieldsc2539fcd16d03c23acab3f85bec2d6b6;
    private static boolean[] booleansc2539fcd16d03c23acab3f85bec2d6b6;
    private static byte[] bytesc2539fcd16d03c23acab3f85bec2d6b6;
    private static short[] shortsc2539fcd16d03c23acab3f85bec2d6b6;

    private static void id_byte() {
        boolean[] blArray = new boolean[10];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[9] = true;
        booleansc2539fcd16d03c23acab3f85bec2d6b6 = blArray;
    }

    public Gj_1(xd_3 xd_32, Predicate<xc_3> predicate) {
        Predicate<xc_3> predicate2;
        this.id_protected();
        xd_3 xd_33 = xd_32;
        this.fieldsc2539fcd16d03c23acab3f85bec2d6b6[Gj_1.shortsc2539fcd16d03c23acab3f85bec2d6b6[1]] = xd_33;
        this.fieldsc2539fcd16d03c23acab3f85bec2d6b6[Gj_1.shortsc2539fcd16d03c23acab3f85bec2d6b6[2]] = predicate2 = predicate;
    }

    private Gj_1(dO_2 dO_22) {
        this(dO_22, dO_22::id_implements);
    }

    static {
        Gj_1.ntfClinit();
    }

    public static Gj_1[] values() {
        return (Gj_1[])((Gj_1[])staticFieldsc2539fcd16d03c23acab3f85bec2d6b6[shortsc2539fcd16d03c23acab3f85bec2d6b6[0]]).clone();
    }

    public static Gj_1 valueOf(String string) {
        return Enum.valueOf(Gj_1.class, string);
    }

    public boolean id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        return ((Predicate)this.fieldsc2539fcd16d03c23acab3f85bec2d6b6[shortsc2539fcd16d03c23acab3f85bec2d6b6[3]]).test(xc_32);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8170AC6CD5A3575DL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x40E24E7D;
    }

    private static /* synthetic */ Gj_1[] id_class() {
        Gj_1[] gj_1Array = new Gj_1[bytesc2539fcd16d03c23acab3f85bec2d6b6[1]];
        gj_1Array[Gj_1.booleansc2539fcd16d03c23acab3f85bec2d6b6[4]] = (Gj_1)((Object)staticFieldsc2539fcd16d03c23acab3f85bec2d6b6[shortsc2539fcd16d03c23acab3f85bec2d6b6[4]]);
        gj_1Array[Gj_1.booleansc2539fcd16d03c23acab3f85bec2d6b6[5]] = (Gj_1)((Object)staticFieldsc2539fcd16d03c23acab3f85bec2d6b6[shortsc2539fcd16d03c23acab3f85bec2d6b6[5]]);
        gj_1Array[Gj_1.bytesc2539fcd16d03c23acab3f85bec2d6b6[2]] = (Gj_1)((Object)staticFieldsc2539fcd16d03c23acab3f85bec2d6b6[shortsc2539fcd16d03c23acab3f85bec2d6b6[6]]);
        gj_1Array[Gj_1.bytesc2539fcd16d03c23acab3f85bec2d6b6[3]] = (Gj_1)((Object)staticFieldsc2539fcd16d03c23acab3f85bec2d6b6[shortsc2539fcd16d03c23acab3f85bec2d6b6[7]]);
        gj_1Array[Gj_1.bytesc2539fcd16d03c23acab3f85bec2d6b6[4]] = (Gj_1)((Object)staticFieldsc2539fcd16d03c23acab3f85bec2d6b6[shortsc2539fcd16d03c23acab3f85bec2d6b6[8]]);
        gj_1Array[Gj_1.bytesc2539fcd16d03c23acab3f85bec2d6b6[5]] = (Gj_1)((Object)staticFieldsc2539fcd16d03c23acab3f85bec2d6b6[shortsc2539fcd16d03c23acab3f85bec2d6b6[9]]);
        gj_1Array[Gj_1.bytesc2539fcd16d03c23acab3f85bec2d6b6[6]] = (Gj_1)((Object)staticFieldsc2539fcd16d03c23acab3f85bec2d6b6[shortsc2539fcd16d03c23acab3f85bec2d6b6[10]]);
        gj_1Array[Gj_1.bytesc2539fcd16d03c23acab3f85bec2d6b6[7]] = (Gj_1)((Object)staticFieldsc2539fcd16d03c23acab3f85bec2d6b6[shortsc2539fcd16d03c23acab3f85bec2d6b6[11]]);
        gj_1Array[Gj_1.bytesc2539fcd16d03c23acab3f85bec2d6b6[8]] = (Gj_1)((Object)staticFieldsc2539fcd16d03c23acab3f85bec2d6b6[shortsc2539fcd16d03c23acab3f85bec2d6b6[12]]);
        gj_1Array[Gj_1.bytesc2539fcd16d03c23acab3f85bec2d6b6[9]] = (Gj_1)((Object)staticFieldsc2539fcd16d03c23acab3f85bec2d6b6[shortsc2539fcd16d03c23acab3f85bec2d6b6[13]]);
        return gj_1Array;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{46, 111, 68, 76, 86, 40, 83, 71}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        short[] sArray = new short[14];
        sArray[0] = 10;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        sArray[8] = 4;
        sArray[9] = 5;
        sArray[10] = 6;
        sArray[11] = 7;
        sArray[12] = 8;
        sArray[13] = 9;
        shortsc2539fcd16d03c23acab3f85bec2d6b6 = sArray;
    }

    private static void id_throws() {
        bytesc2539fcd16d03c23acab3f85bec2d6b6 = new byte[]{3, 10, 2, 3, 4, 5, 6, 7, 8, 9, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 2, 11};
    }

    private static /* synthetic */ void ntfClinit() {
        Gj_1.id_byte();
        Gj_1.id_case();
        Gj_1.id_break();
        Gj_1.id_throws();
        Gj_1.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray;
        objectArray = new Object[]{new Gj_1((dO_2)xu_3.PB), new Gj_1((dO_2)xu_3.sr), new Gj_1((dO_2)xu_3.sP), new Gj_1((dO_2)xu_3.bT), new Gj_1(xu_3.Pg, xc_32 -> booleansc2539fcd16d03c23acab3f85bec2d6b6[3]), new Gj_1(xu_3.Bg, xc_32 -> booleansc2539fcd16d03c23acab3f85bec2d6b6[2]), new Gj_1(xu_3.Ss, xc_32 -> xc_32.id_byte(kf_3.id_volatile) >= bytesc2539fcd16d03c23acab3f85bec2d6b6[0] ? booleansc2539fcd16d03c23acab3f85bec2d6b6[0] : booleansc2539fcd16d03c23acab3f85bec2d6b6[1]), new GV(xu_3.Pf, null), new Gg_1(xu_3.hs, null), new GR(xu_3.Pw, null), new Gj_1[]{(Gj_1)((Object)objectArray[0]), (Gj_1)((Object)objectArray[1]), (Gj_1)((Object)objectArray[2]), (Gj_1)((Object)objectArray[3]), (Gj_1)((Object)objectArray[4]), (Gj_1)((Object)objectArray[5]), (Gj_1)((Object)objectArray[6])}};
        staticFieldsc2539fcd16d03c23acab3f85bec2d6b6 = objectArray;
    }

    private static void id_case() {
        stringsc2539fcd16d03c23acab3f85bec2d6b6 = new String[]{new String("WHEAT"), new String("CARROTS"), new String("POTATOES"), new String("BEETROOT"), new String("PUMPKIN"), new String("MELON"), new String("NETHERWART"), new String("SUGARCANE"), new String("BAMBOO"), new String("CACTUS")};
    }

    private void id_protected() {
        if (this.fieldsc2539fcd16d03c23acab3f85bec2d6b6 == null) {
            Object[] objectArray = this.fieldsc2539fcd16d03c23acab3f85bec2d6b6 = new Object[bytesc2539fcd16d03c23acab3f85bec2d6b6[27]];
        }
    }
}

