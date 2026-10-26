/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAB;
import celestial.rLD;
import celestial.rLR;
import celestial.rLY;
import celestial.rcH_2;
import celestial.rdn_3;
import celestial.rdy_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfO_2
extends Enum<rrfO_2> {
    public static Object[] staticFieldsf407dfe4cb09378d9b156ac8f4322895;
    private static int[] integersf407dfe4cb09378d9b156ac8f4322895;
    private static boolean[] booleansf407dfe4cb09378d9b156ac8f4322895;
    private static String[] stringsf407dfe4cb09378d9b156ac8f4322895;
    private static short[] shortsf407dfe4cb09378d9b156ac8f4322895;
    private static float[] floatsf407dfe4cb09378d9b156ac8f4322895;
    public Object[] fieldsf407dfe4cb09378d9b156ac8f4322895;
    private static byte[] bytesf407dfe4cb09378d9b156ac8f4322895;

    public rdn_3 id_byte() {
        return (rdn_3)this.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[19]];
    }

    private rrfO_2(rLY[] rLYArray, rdn_3 rdn_32, int n2) {
        rLY[] rLYArray2;
        this.id_finally();
        this.fieldsf407dfe4cb09378d9b156ac8f4322895[rrfO_2.shortsf407dfe4cb09378d9b156ac8f4322895[21]] = rLYArray2 = rLYArray;
        rdn_3 rdn_33 = rdn_32;
        this.fieldsf407dfe4cb09378d9b156ac8f4322895[rrfO_2.shortsf407dfe4cb09378d9b156ac8f4322895[22]] = rdn_33;
        Integer n3 = n2;
        this.fieldsf407dfe4cb09378d9b156ac8f4322895[rrfO_2.shortsf407dfe4cb09378d9b156ac8f4322895[23]] = n3;
    }

    static {
        rrfO_2.ntfClinit();
    }

    public static rrfO_2[] values() {
        return (rrfO_2[])((rrfO_2[])staticFieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[0]]).clone();
    }

    public static rrfO_2 valueOf(String string) {
        return Enum.valueOf(rrfO_2.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-35, -46, 97, 92, 75, -99, 73, -101}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrfO_2 id_class(Collection<rLR> collection) {
        rrfO_2[] rrfO_2Array = (rrfO_2[])staticFieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[4]];
        int n = rrfO_2Array.length;
        for (int i = booleansf407dfe4cb09378d9b156ac8f4322895[6]; i < n; ++i) {
            rrfO_2 rrfO_22 = rrfO_2Array[i];
            if (((rLY[])rrfO_22.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[5]]).length != collection.size()) continue;
            boolean bl = booleansf407dfe4cb09378d9b156ac8f4322895[7];
            for (rLR rLR2 : collection) {
                boolean bl2 = booleansf407dfe4cb09378d9b156ac8f4322895[8];
                rLY[] rLYArray = (rLY[])rrfO_22.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[6]];
                int n2 = rLYArray.length;
                for (int j = booleansf407dfe4cb09378d9b156ac8f4322895[9]; j < n2; ++j) {
                    rLY rLY2 = rLYArray[j];
                    if (!rLR2.equals(rLY2.id_class())) continue;
                    bl2 = booleansf407dfe4cb09378d9b156ac8f4322895[10];
                    break;
                }
                if (bl2) continue;
                bl = booleansf407dfe4cb09378d9b156ac8f4322895[11];
                break;
            }
            if (!bl) continue;
            return rrfO_22;
        }
        return null;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBB60E31BB2523DBCL;
    }

    private static boolean id_class(rLY rLY2, rLY rLY3) {
        if (rLY2 == rLY3) {
            return booleansf407dfe4cb09378d9b156ac8f4322895[13];
        }
        return rLY2.id_break() >= rLY3.id_break() && rLY2.id_byte() >= rLY3.id_byte() && rLY2.id_class().equals(rLY3.id_class()) ? booleansf407dfe4cb09378d9b156ac8f4322895[14] : booleansf407dfe4cb09378d9b156ac8f4322895[15];
    }

    public static rrfO_2 id_class(int n) {
        float f = n >> bytesf407dfe4cb09378d9b156ac8f4322895[0] & shortsf407dfe4cb09378d9b156ac8f4322895[7];
        float f2 = n >> bytesf407dfe4cb09378d9b156ac8f4322895[1] & shortsf407dfe4cb09378d9b156ac8f4322895[8];
        float f3 = n & shortsf407dfe4cb09378d9b156ac8f4322895[9];
        rrfO_2 rrfO_22 = null;
        float f4 = floatsf407dfe4cb09378d9b156ac8f4322895[0];
        rrfO_2[] rrfO_2Array = (rrfO_2[])staticFieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[10]];
        int n2 = rrfO_2Array.length;
        for (int i = booleansf407dfe4cb09378d9b156ac8f4322895[12]; i < n2; ++i) {
            float f5;
            float f6;
            float f7;
            float f8;
            rrfO_2 rrfO_23 = rrfO_2Array[i];
            if ((Integer)rrfO_23.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[11]] == n) {
                return rrfO_23;
            }
            float f9 = (Integer)rrfO_23.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[12]] >> bytesf407dfe4cb09378d9b156ac8f4322895[2] & shortsf407dfe4cb09378d9b156ac8f4322895[13];
            float f10 = f - f9;
            float f11 = f10 * f10 + (f8 = f2 - (f7 = (float)((Integer)rrfO_23.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[14]] >> bytesf407dfe4cb09378d9b156ac8f4322895[3] & shortsf407dfe4cb09378d9b156ac8f4322895[15]))) * f8 + (f6 = f3 - (f5 = (float)((Integer)rrfO_23.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[16]] & shortsf407dfe4cb09378d9b156ac8f4322895[17]))) * f6;
            if (!(f11 < f4)) continue;
            f4 = f11;
            rrfO_22 = rrfO_23;
        }
        return rrfO_22;
    }

    public static rrfO_2 id_class(rdn_3 rdn_32) {
        if (rdn_32.id_break() != rdy_3.kk) {
            return null;
        }
        List<rLY> list = rAB.id_class(rdn_32);
        rrfO_2[] rrfO_2Array = (rrfO_2[])staticFieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[1]];
        int n = rrfO_2Array.length;
        for (int i = booleansf407dfe4cb09378d9b156ac8f4322895[0]; i < n; ++i) {
            rrfO_2 rrfO_22 = rrfO_2Array[i];
            if (((rLY[])rrfO_22.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[2]]).length != list.size()) continue;
            boolean bl = booleansf407dfe4cb09378d9b156ac8f4322895[1];
            for (rLY rLY2 : list) {
                boolean bl2 = booleansf407dfe4cb09378d9b156ac8f4322895[2];
                rLY[] rLYArray = (rLY[])rrfO_22.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[3]];
                int n2 = rLYArray.length;
                for (int j = booleansf407dfe4cb09378d9b156ac8f4322895[3]; j < n2; ++j) {
                    rLY rLY3 = rLYArray[j];
                    if (!rrfO_2.id_class(rLY2, rLY3)) continue;
                    bl2 = booleansf407dfe4cb09378d9b156ac8f4322895[4];
                    break;
                }
                if (bl2) continue;
                bl = booleansf407dfe4cb09378d9b156ac8f4322895[5];
                break;
            }
            if (!bl) continue;
            return rrfO_22;
        }
        return null;
    }

    public rLY[] id_class() {
        return (rLY[])this.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[18]];
    }

    public int id_break() {
        return (Integer)this.fieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[20]];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3350B158;
    }

    private static /* synthetic */ rrfO_2[] id_throws() {
        rrfO_2[] rrfO_2Array = new rrfO_2[bytesf407dfe4cb09378d9b156ac8f4322895[4]];
        rrfO_2Array[rrfO_2.booleansf407dfe4cb09378d9b156ac8f4322895[16]] = (rrfO_2)((Object)staticFieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[24]]);
        rrfO_2Array[rrfO_2.booleansf407dfe4cb09378d9b156ac8f4322895[17]] = (rrfO_2)((Object)staticFieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[25]]);
        rrfO_2Array[rrfO_2.bytesf407dfe4cb09378d9b156ac8f4322895[5]] = (rrfO_2)((Object)staticFieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[26]]);
        rrfO_2Array[rrfO_2.bytesf407dfe4cb09378d9b156ac8f4322895[6]] = (rrfO_2)((Object)staticFieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[27]]);
        rrfO_2Array[rrfO_2.bytesf407dfe4cb09378d9b156ac8f4322895[7]] = (rrfO_2)((Object)staticFieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[28]]);
        rrfO_2Array[rrfO_2.bytesf407dfe4cb09378d9b156ac8f4322895[8]] = (rrfO_2)((Object)staticFieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[29]]);
        rrfO_2Array[rrfO_2.bytesf407dfe4cb09378d9b156ac8f4322895[9]] = (rrfO_2)((Object)staticFieldsf407dfe4cb09378d9b156ac8f4322895[shortsf407dfe4cb09378d9b156ac8f4322895[30]]);
        return rrfO_2Array;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfO_2.id_case();
        rrfO_2.id_protected();
        rrfO_2.id_catch();
        rrfO_2.id_private();
        rrfO_2.id_implements();
        rrfO_2.id_extends();
        rrfO_2.id_native();
    }

    private void id_finally() {
        if (this.fieldsf407dfe4cb09378d9b156ac8f4322895 == null) {
            this.fieldsf407dfe4cb09378d9b156ac8f4322895 = new Object[3];
            this.fieldsf407dfe4cb09378d9b156ac8f4322895[2] = 0;
        }
    }

    private static void id_catch() {
        short[] sArray = new short[54];
        sArray[0] = 8;
        sArray[1] = 7;
        sArray[4] = 7;
        sArray[7] = 255;
        sArray[8] = 255;
        sArray[9] = 255;
        sArray[10] = 7;
        sArray[11] = 2;
        sArray[12] = 2;
        sArray[13] = 255;
        sArray[14] = 2;
        sArray[15] = 255;
        sArray[16] = 2;
        sArray[17] = 255;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[22] = 1;
        sArray[23] = 2;
        sArray[25] = 1;
        sArray[26] = 2;
        sArray[27] = 3;
        sArray[28] = 4;
        sArray[29] = 5;
        sArray[30] = 6;
        sArray[31] = 200;
        sArray[32] = 400;
        sArray[33] = 3600;
        sArray[34] = 900;
        sArray[35] = 12000;
        sArray[36] = 600;
        sArray[37] = 600;
        sArray[38] = 12000;
        sArray[39] = 12000;
        sArray[40] = 1200;
        sArray[41] = 18000;
        sArray[42] = 1200;
        sArray[43] = 6000;
        sArray[44] = 1200;
        sArray[45] = 400;
        sArray[46] = 400;
        sArray[47] = 400;
        sArray[48] = 400;
        sArray[49] = 400;
        sArray[50] = 1800;
        sArray[51] = 200;
        sArray[52] = 1800;
        sArray[53] = 200;
        shortsf407dfe4cb09378d9b156ac8f4322895 = sArray;
    }

    private static void id_extends() {
        integersf407dfe4cb09378d9b156ac8f4322895 = new int[]{16738740, 0xFFFFFF, 0x993333, 65535, 0x333333, 3329330, 0x484848};
    }

    private static void id_case() {
        boolean[] blArray = new boolean[54];
        blArray[1] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[10] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[17] = true;
        blArray[20] = true;
        blArray[23] = true;
        blArray[25] = true;
        blArray[26] = true;
        blArray[27] = true;
        blArray[29] = true;
        blArray[30] = true;
        blArray[32] = true;
        blArray[35] = true;
        blArray[39] = true;
        blArray[42] = true;
        blArray[44] = true;
        blArray[45] = true;
        blArray[46] = true;
        blArray[49] = true;
        blArray[50] = true;
        booleansf407dfe4cb09378d9b156ac8f4322895 = blArray;
    }

    private static void id_implements() {
        bytesf407dfe4cb09378d9b156ac8f4322895 = new byte[]{16, 8, 16, 8, 7, 2, 3, 4, 5, 6, 4, 9, 4, 2, 100, 9, 3, 36, 3, 2, 37, 2, 2, 4, 3, 38, 2, 3, 4, 2, 2, 3, 39, 3, 4, 4, 3, 2, 2, 3, 40, 4, 5, 5, 2, 2, 3, 4, 4, 41, 5, 6, 4, 2, 2, 3, 42, 6, 8, 7, 3, 2, 9};
    }

    private static void id_protected() {
        stringsf407dfe4cb09378d9b156ac8f4322895 = new String[]{new String("FIRECRACKER"), new String("HOLY_WATER"), new String("RAGE"), new String("PALLADIN"), new String("ASSASSIN"), new String("RADIATION"), new String("SLEEPING")};
    }

    private static void id_private() {
        floatsf407dfe4cb09378d9b156ac8f4322895 = new float[]{Float.MAX_VALUE};
    }

    private static void id_native() {
        Object[] objectArray = new Object[9];
        String string = stringsf407dfe4cb09378d9b156ac8f4322895[0];
        rLY[] rLYArray = new rLY[]{new rLY(rLD.id_break, 200, 9), new rLY(rLD.id_class, 400, 4), new rLY(rLD.id_package, 100, 9), new rLY(rLD.id_public, 3600, 0)};
        rdn_3 rdn_32 = new rdn_3(rdy_3.kk, 1);
        rdn_32.id_byte(rcH_2.id_class("{\"is-tshop\":1b,\"Potion\":\"minecraft:empty\",\"display\":{\"Lore\":[],\"Name\":\"{\\\"extra\\\":[{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF1493\\\",\\\"text\\\":\\\"[\u2605]\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"white\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF0055\\\",\\\"text\\\":\\\"\u0425\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF3F3D\\\",\\\"text\\\":\\\"\u043b\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF7E24\\\",\\\"text\\\":\\\"\u043e\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFBD0C\\\",\\\"text\\\":\\\"\u043f\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#DBE21D\\\",\\\"text\\\":\\\"\u0443\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#92EC57\\\",\\\"text\\\":\\\"\u0448\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#49F592\\\",\\\"text\\\":\\\"\u043a\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#00FFCC\\\",\\\"text\\\":\\\"\u0430\\\"}],\\\"text\\\":\\\"\\\"}\"},\"CustomPotionColor\":16738740,\"PublicBukkitValues\":{\"auctions:if-uuid\":[B;-69b,73b,-125b,-85b,-116b,3b,79b,-52b,-115b,33b,-39b,109b,68b,28b,113b,88b]},\"CustomPotionEffects\":[{\"ShowParticles\":1b,\"Ambient\":0b,\"ShowIcon\":1b,\"Duration\":200,\"Id\":2b,\"Amplifier\":9b},{\"ShowParticles\":1b,\"Ambient\":0b,\"ShowIcon\":1b,\"Duration\":400,\"Id\":1b,\"Amplifier\":4b},{\"ShowParticles\":1b,\"Ambient\":0b,\"ShowIcon\":1b,\"Duration\":100,\"Id\":15b,\"Amplifier\":9b},{\"ShowParticles\":1b,\"Ambient\":0b,\"ShowIcon\":1b,\"Duration\":3600,\"Id\":24b,\"Amplifier\":0b}]}"));
        objectArray[0] = new rrfO_2(rLYArray, rdn_32, 16738740);
        String string2 = stringsf407dfe4cb09378d9b156ac8f4322895[1];
        rLY[] rLYArray2 = new rLY[]{new rLY(rLD.id_finally, 900, 1), new rLY(rLD.id_final, 12000, 1), new rLY(rLD.id_case, 0, 1)};
        rdn_3 rdn_33 = new rdn_3(rdy_3.kk, 1);
        rdn_33.id_byte(rcH_2.id_class("{\"CustomPotionEffects\":[{\"Duration\":900,\"Ambient\":0b,\"Id\":10b,\"Amplifier\":1b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":12000,\"Ambient\":0b,\"Id\":14b,\"Amplifier\":1b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":1,\"Ambient\":0b,\"Id\":6b,\"Amplifier\":1b,\"ShowIcon\":1b,\"ShowParticles\":1b}],\"CustomPotionColor\":16777215,\"Potion\":\"minecraft:empty\",\"display\":{\"Lore\":[],\"Name\":\"{\\\"extra\\\":[{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFFCB\\\",\\\"text\\\":\\\"[\u2605]\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"white\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFFCB\\\",\\\"text\\\":\\\"\u0421\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFFBC\\\",\\\"text\\\":\\\"\u0432\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFFAC\\\",\\\"text\\\":\\\"\u044f\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFF9D\\\",\\\"text\\\":\\\"\u0442\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFF8E\\\",\\\"text\\\":\\\"\u0430\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFF7F\\\",\\\"text\\\":\\\"\u044f\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFE6F\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFE60\\\",\\\"text\\\":\\\"\u0432\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFE51\\\",\\\"text\\\":\\\"\u043e\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFE41\\\",\\\"text\\\":\\\"\u0434\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFFE32\\\",\\\"text\\\":\\\"\u0430\\\"}],\\\"text\\\":\\\"\\\"}\"}}"));
        objectArray[1] = new rrfO_2(rLYArray2, rdn_33, 0xFFFFFF);
        String string3 = stringsf407dfe4cb09378d9b156ac8f4322895[2];
        rLY[] rLYArray3 = new rLY[]{new rLY(rLD.id_throws, 600, 4), new rLY(rLD.id_break, 600, 3)};
        rdn_3 rdn_34 = new rdn_3(rdy_3.kk, 1);
        rdn_34.id_byte(rcH_2.id_class("{\"PublicBukkitValues\":{\"auctions:if-uuid\":[B;-59b,-40b,-118b,10b,104b,12b,74b,-13b,-69b,13b,118b,125b,-59b,63b,98b,-25b]},\"CustomPotionEffects\":[{\"Duration\":600,\"Ambient\":0b,\"Id\":5b,\"Amplifier\":4b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":600,\"Ambient\":0b,\"Id\":2b,\"Amplifier\":3b,\"ShowIcon\":1b,\"ShowParticles\":1b}],\"CustomPotionColor\":10040115,\"Potion\":\"minecraft:empty\",\"is-tshop\":1b,\"display\":{\"Lore\":[],\"Name\":\"{\\\"extra\\\":[{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#8B0000\\\",\\\"text\\\":\\\"[\u2605]\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"white\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#8B0000\\\",\\\"text\\\":\\\"\u0417\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#A20E00\\\",\\\"text\\\":\\\"\u0435\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#B91C00\\\",\\\"text\\\":\\\"\u043b\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#D12900\\\",\\\"text\\\":\\\"\u044c\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#E83700\\\",\\\"text\\\":\\\"\u0435\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF4500\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF5300\\\",\\\"text\\\":\\\"\u0413\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF6100\\\",\\\"text\\\":\\\"\u043d\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF7000\\\",\\\"text\\\":\\\"\u0435\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF7E00\\\",\\\"text\\\":\\\"\u0432\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FF8C00\\\",\\\"text\\\":\\\"\u0430\\\"}],\\\"text\\\":\\\"\\\"}\"}}"));
        objectArray[2] = new rrfO_2(rLYArray3, rdn_34, 0x993333);
        String string4 = stringsf407dfe4cb09378d9b156ac8f4322895[3];
        rLY[] rLYArray4 = new rLY[]{new rLY(rLD.id_extends, 12000, 0), new rLY(rLD.id_native, 12000, 0), new rLY(rLD.id_else, 1200, 2), new rLY(rLD.id_final, 18000, 0)};
        rdn_3 rdn_35 = new rdn_3(rdy_3.kk, 1);
        rdn_35.id_byte(rcH_2.id_class("{\"CustomPotionEffects\":[{\"Duration\":12000,\"Ambient\":0b,\"Id\":11b,\"Amplifier\":0b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":12000,\"Ambient\":0b,\"Id\":12b,\"Amplifier\":0b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":1200,\"Ambient\":0b,\"Id\":21b,\"Amplifier\":2b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":18000,\"Ambient\":0b,\"Id\":14b,\"Amplifier\":0b,\"ShowIcon\":1b,\"ShowParticles\":1b}],\"CustomPotionColor\":65535,\"Potion\":\"minecraft:empty\",\"display\":{\"Lore\":[],\"Name\":\"{\\\"extra\\\":[{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#D1FF5B\\\",\\\"text\\\":\\\"[\u2605]\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"white\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#D1FF5B\\\",\\\"text\\\":\\\"\u0417\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#D6FF6C\\\",\\\"text\\\":\\\"\u0435\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#DBFF7D\\\",\\\"text\\\":\\\"\u043b\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#E0FF8E\\\",\\\"text\\\":\\\"\u044c\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#E4FFA0\\\",\\\"text\\\":\\\"\u0435\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#E9FFB1\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#EEFFC2\\\",\\\"text\\\":\\\"\u041f\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#F3FFD3\\\",\\\"text\\\":\\\"\u0430\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#EEFFC2\\\",\\\"text\\\":\\\"\u043b\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#E9FFB1\\\",\\\"text\\\":\\\"\u043b\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#E4FFA0\\\",\\\"text\\\":\\\"\u0430\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#E0FF8E\\\",\\\"text\\\":\\\"\u0434\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#DBFF7D\\\",\\\"text\\\":\\\"\u0438\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#D6FF6C\\\",\\\"text\\\":\\\"\u043d\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#D1FF5B\\\",\\\"text\\\":\\\"\u0430\\\"}],\\\"text\\\":\\\"\\\"}\"}}"));
        objectArray[3] = new rrfO_2(rLYArray4, rdn_35, 65535);
        String string5 = stringsf407dfe4cb09378d9b156ac8f4322895[4];
        rLY[] rLYArray5 = new rLY[]{new rLY(rLD.id_throws, 1200, 3), new rLY(rLD.id_class, 6000, 2), new rLY(rLD.id_byte, 1200, 0), new rLY(rLD.id_catch, 0, 1)};
        rdn_3 rdn_36 = new rdn_3(rdy_3.kk, 1);
        rdn_36.id_byte(rcH_2.id_class("{\"PublicBukkitValues\":{\"auctions:if-uuid\":[B;-6b,90b,-5b,78b,-61b,74b,64b,-69b,-127b,-59b,99b,96b,-16b,72b,5b,-75b]},\"CustomPotionEffects\":[{\"Duration\":1200,\"Ambient\":0b,\"Id\":5b,\"Amplifier\":3b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":6000,\"Ambient\":0b,\"Id\":1b,\"Amplifier\":2b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":1200,\"Ambient\":0b,\"Id\":3b,\"Amplifier\":0b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":1,\"Ambient\":0b,\"Id\":7b,\"Amplifier\":1b,\"ShowIcon\":1b,\"ShowParticles\":1b}],\"CustomPotionColor\":3355443,\"Potion\":\"minecraft:empty\",\"is-tshop\":1b,\"display\":{\"Lore\":[],\"Name\":\"{\\\"extra\\\":[{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#414345\\\",\\\"text\\\":\\\"[\u2605]\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"white\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#414345\\\",\\\"text\\\":\\\"\u0417\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#463E40\\\",\\\"text\\\":\\\"\u0435\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#4B393A\\\",\\\"text\\\":\\\"\u043b\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#503435\\\",\\\"text\\\":\\\"\u044c\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#542E30\\\",\\\"text\\\":\\\"\u0435\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#59292A\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#5E2425\\\",\\\"text\\\":\\\"\u0410\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#631F20\\\",\\\"text\\\":\\\"\u0441\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#681A1B\\\",\\\"text\\\":\\\"\u0441\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#6D1515\\\",\\\"text\\\":\\\"\u0430\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#710F10\\\",\\\"text\\\":\\\"\u0441\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#760A0B\\\",\\\"text\\\":\\\"\u0438\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#7B0505\\\",\\\"text\\\":\\\"\u043d\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#800000\\\",\\\"text\\\":\\\"\u0430\\\"}],\\\"text\\\":\\\"\\\"}\"}}"));
        objectArray[4] = new rrfO_2(rLYArray5, rdn_36, 0x333333);
        String string6 = stringsf407dfe4cb09378d9b156ac8f4322895[5];
        rLY[] rLYArray6 = new rLY[]{new rLY(rLD.id_super, 400, 1), new rLY(rLD.id_this, 400, 1), new rLY(rLD.id_break, 400, 2), new rLY(rLD.id_new, 400, 4), new rLY(rLD.id_public, 400, 0)};
        rdn_3 rdn_37 = new rdn_3(rdy_3.kk, 1);
        rdn_37.id_byte(rcH_2.id_class("{\"PublicBukkitValues\":{\"auctions:if-uuid\":[B;-95b,-28b,102b,122b,14b,95b,68b,-89b,-65b,-13b,90b,-54b,121b,82b,-64b,121b]},\"CustomPotionEffects\":[{\"Duration\":400,\"Ambient\":0b,\"Id\":19b,\"Amplifier\":1b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":400,\"Ambient\":0b,\"Id\":20b,\"Amplifier\":1b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":400,\"Ambient\":0b,\"Id\":2b,\"Amplifier\":2b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":400,\"Ambient\":0b,\"Id\":17b,\"Amplifier\":4b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":400,\"Ambient\":0b,\"Id\":24b,\"Amplifier\":0b,\"ShowIcon\":1b,\"ShowParticles\":1b}],\"CustomPotionColor\":3329330,\"Potion\":\"minecraft:empty\",\"is-tshop\":1b,\"display\":{\"Lore\":[],\"Name\":\"{\\\"extra\\\":[{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFF73A\\\",\\\"text\\\":\\\"[\u2605]\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"white\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#FFF73A\\\",\\\"text\\\":\\\"\u0417\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#F7F550\\\",\\\"text\\\":\\\"\u0435\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#EEF366\\\",\\\"text\\\":\\\"\u043b\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#E6F17C\\\",\\\"text\\\":\\\"\u044c\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#DDF093\\\",\\\"text\\\":\\\"\u0435\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#D5EEA9\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#CCECBF\\\",\\\"text\\\":\\\"\u0420\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#C4EDBF\\\",\\\"text\\\":\\\"\u0430\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#BCF0AA\\\",\\\"text\\\":\\\"\u0434\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#B4F394\\\",\\\"text\\\":\\\"\u0438\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#ABF67F\\\",\\\"text\\\":\\\"\u0430\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#A3F969\\\",\\\"text\\\":\\\"\u0446\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#9BFC54\\\",\\\"text\\\":\\\"\u0438\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#93FF3E\\\",\\\"text\\\":\\\"\u0438\\\"}],\\\"text\\\":\\\"\\\"}\"}}"));
        objectArray[5] = new rrfO_2(rLYArray6, rdn_37, 3329330);
        String string7 = stringsf407dfe4cb09378d9b156ac8f4322895[6];
        rLY[] rLYArray7 = new rLY[]{new rLY(rLD.id_continue, 1800, 1), new rLY(rLD.id_protected, 200, 0), new rLY(rLD.id_this, 1800, 2), new rLY(rLD.id_package, 200, 0)};
        rdn_3 rdn_38 = new rdn_3(rdy_3.kk, 1);
        rdn_38.id_byte(rcH_2.id_class("{\"CustomPotionEffects\":[{\"Duration\":1800,\"Ambient\":0b,\"Id\":18b,\"Amplifier\":1b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":200,\"Ambient\":0b,\"Id\":4b,\"Amplifier\":0b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":1800,\"Ambient\":0b,\"Id\":20b,\"Amplifier\":2b,\"ShowIcon\":1b,\"ShowParticles\":1b},{\"Duration\":200,\"Ambient\":0b,\"Id\":15b,\"Amplifier\":0b,\"ShowIcon\":1b,\"ShowParticles\":1b}],\"CustomPotionColor\":254,\"Potion\":\"minecraft:empty\",\"display\":{\"Lore\":[],\"Name\":\"{\\\"extra\\\":[{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#3F0D9A\\\",\\\"text\\\":\\\"[\u2605]\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"white\\\",\\\"text\\\":\\\" \\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#3F0D9A\\\",\\\"text\\\":\\\"\u0421\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#31209F\\\",\\\"text\\\":\\\"\u043d\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#2332A5\\\",\\\"text\\\":\\\"\u043e\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#1545AA\\\",\\\"text\\\":\\\"\u0442\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#0758AF\\\",\\\"text\\\":\\\"\u0432\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#0C66B8\\\",\\\"text\\\":\\\"\u043e\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#2371C4\\\",\\\"text\\\":\\\"\u0440\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#3A7CD1\\\",\\\"text\\\":\\\"\u043d\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#5287DD\\\",\\\"text\\\":\\\"\u043e\\\"},{\\\"bold\\\":true,\\\"italic\\\":false,\\\"underlined\\\":false,\\\"strikethrough\\\":false,\\\"obfuscated\\\":false,\\\"color\\\":\\\"#6992E9\\\",\\\"text\\\":\\\"\u0435\\\"}],\\\"text\\\":\\\"\\\"}\"}}"));
        objectArray[6] = new rrfO_2(rLYArray7, rdn_38, 0x484848);
        objectArray[7] = new rrfO_2[]{(rrfO_2)((Object)objectArray[0]), (rrfO_2)((Object)objectArray[1]), (rrfO_2)((Object)objectArray[2]), (rrfO_2)((Object)objectArray[3]), (rrfO_2)((Object)objectArray[4]), (rrfO_2)((Object)objectArray[5]), (rrfO_2)((Object)objectArray[6])};
        objectArray[8] = new rrfO_2[]{(rrfO_2)((Object)objectArray[0]), (rrfO_2)((Object)objectArray[1]), (rrfO_2)((Object)objectArray[2]), (rrfO_2)((Object)objectArray[3]), (rrfO_2)((Object)objectArray[4]), (rrfO_2)((Object)objectArray[5]), (rrfO_2)((Object)objectArray[6])};
        staticFieldsf407dfe4cb09378d9b156ac8f4322895 = objectArray;
    }
}

