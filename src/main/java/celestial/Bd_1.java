/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgF_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bd_1
extends HashMap<String, String> {
    private static String[] id_class;

    public Bd_1() {
        this.put(id_class[0], id_class[1]);
        this.put(id_class[2], id_class[3]);
        this.put(id_class[4], id_class[5]);
        this.put(id_class[6], id_class[7]);
        this.put(id_class[8], rgF_2.BLUE + "HERO");
        this.put(id_class[9], rgF_2.YELLOW + "TITAN");
        this.put(id_class[10], rgF_2.GREEN + "AVENGER");
        this.put(id_class[11], rgF_2.AQUA + "OVERLORD");
        this.put(id_class[12], rgF_2.GOLD + "MAGISTER");
        this.put(id_class[13], rgF_2.GOLD + "GOD");
        this.put(id_class[14], rgF_2.RED + "VAMPIRE");
        this.put(id_class[15], rgF_2.GOLD + "PEGAS");
        this.put(id_class[16], rgF_2.RED + "IMPERATOR");
        this.put(id_class[17], rgF_2.LIGHT_PURPLE + "DRAGON");
        this.put(id_class[18], rgF_2.LIGHT_PURPLE + "BULL");
        this.put(id_class[19], rgF_2.GOLD + "TIGER");
        this.put(id_class[20], rgF_2.DARK_GREEN + "HYDRA");
        this.put(id_class[21], rgF_2.RED + "DRACULA");
        this.put(id_class[22], rgF_2.GREEN + "COBRA");
        this.put(id_class[23], id_class[24]);
        this.put(id_class[25], rgF_2.DARK_GRAY + "BUNNY");
        this.put(id_class[26], rgF_2.YELLOW + "D.HELPER");
        this.put(id_class[27], rgF_2.LIGHT_PURPLE + "MEDIA");
        this.put(id_class[28], rgF_2.DARK_RED + "YT");
        this.put(id_class[29], rgF_2.YELLOW + "HELPER");
        this.put(id_class[30], rgF_2.BLUE + "ML.MODER");
        this.put(id_class[31], rgF_2.BLUE + "MODER");
        this.put(id_class[32], rgF_2.BLUE + "MODER+");
        this.put(id_class[33], rgF_2.BLUE + "ST.MODER");
        this.put(id_class[34], rgF_2.BLUE + "GL.MODER");
        this.put(id_class[35], rgF_2.AQUA + "ML.ADMIN");
        this.put(id_class[36], rgF_2.DARK_RED + "ADMIN");
    }

    static {
        Bd_1.id_class();
    }

    private static void id_class() {
        id_class = new String[]{new String(" \u00a7c\u25cf\u00a7f "), new String(""), new String(" \u00a76\u25cf\u00a7f "), new String(""), new String(" \u00a7a\u25cf\u00a7f "), new String(""), new String("\u00a7f\ua500 \u00a77\u00a77"), new String(""), new String("\ua504"), new String("\ua508"), new String("\ua512"), new String("\ua516"), new String("\ua520"), new String("\ua541"), new String("\ua545"), new String("\ua549"), new String("\ua524"), new String("\ua528"), new String("\ua532"), new String("\ua536"), new String("\ua540"), new String("\ua544"), new String("\ua548"), new String("\ua552"), new String("RABBIT"), new String("\ua556"), new String("\ua560"), new String("\ua501"), new String("\ua505"), new String("\ua509"), new String("\ua513"), new String("\ua517"), new String("\ua521"), new String("\ua525"), new String("\ua529"), new String("\ua533"), new String("\ua537")};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xECE4B09029FF0ADFL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{6, -10, -34, 99, -75, -5, -104, 47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x150210E;
    }
}

