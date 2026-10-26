/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import celestial.Aw_1;
import celestial.C_class;
import celestial.PP;
import celestial.Pv_1;
import celestial.cb_3;
import celestial.rVe_1;
import celestial.rgP_2;
import celestial.rrFT;
import celestial.rrFp_1;
import celestial.rrFq_1;
import celestial.rrFy_1;
import celestial.rrLO;
import celestial.rrQJ;
import celestial.rrQX;
import celestial.rrZW;
import celestial.rrZk_1;
import celestial.rrZr_1;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrvu_1;
import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PD
extends Pv_1
implements PP {
    private static short[] id_throws;
    private static String[] id_case;
    private static boolean[] id_catch;
    public static Object[] id_break;
    private static byte[] id_private;

    private void id_byte(rrLO rrLO2) {
        rgP_2 rgP_22 = rrLO2.id_byte();
        if (rgP_22 instanceof rVe_1) {
            return;
        }
        Aw_1 aw_1 = rrLO2.id_break();
        GameProfile gameProfile = ((cb_3)PD.b_.id_class[id_throws[0]]).sv();
        if (aw_1 == null || aw_1.id_class().equals((Object)gameProfile)) {
            return;
        }
        String string = rrLO2.id_protected().replace(gameProfile.getName(), id_case[0]);
        String string2 = string.toLowerCase();
        if (this.id_class(string2, (Set)id_break[id_throws[1]])) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[2]]).id_finally().id_class(rrFp_1.id_class(aw_1));
            return;
        }
        if (this.id_class(string2, (Set)id_break[id_throws[3]])) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[4]]).id_finally().id_class(rrFq_1.id_class(aw_1));
            return;
        }
        Matcher matcher = ((Pattern)id_break[id_throws[5]]).matcher(string2);
        if (matcher.matches()) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[6]]).id_finally().id_class(rrFT.id_class(aw_1, matcher.group(id_private[0])));
            return;
        }
        HashSet<String> hashSet = new HashSet<String>();
        HashSet<String> hashSet2 = new HashSet<String>(Arrays.asList(string2.split(id_case[1])));
        String string3 = gameProfile.getName();
        String string4 = aw_1.id_class().getName();
        if (hashSet2.contains(string3.toLowerCase()) && !string4.equalsIgnoreCase(string3)) {
            hashSet.add(string3);
        }
        for (rrZk_1 rrZk_12 : ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_throws[7]]).id_class().values()) {
            String string5 = rrZk_12.id_class();
            if (!hashSet2.contains(string5.toLowerCase()) || string4.equalsIgnoreCase(string5)) continue;
            hashSet.add(string5);
        }
        if (!hashSet.isEmpty()) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[8]]).id_finally().id_class(rrFy_1.id_class(aw_1, hashSet));
        }
    }

    private static void id_byte() {
        short[] sArray = new short[13];
        sArray[0] = 57;
        sArray[3] = 1;
        sArray[5] = 3;
        sArray[9] = 1;
        sArray[10] = 5;
        sArray[12] = 5;
        id_throws = sArray;
    }

    public PD(C_class c_class) {
        super(c_class);
    }

    static {
        PD.ntfClinit();
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{Set.of(id_case[5], id_case[6]), Set.of(id_case[7], id_case[8], id_case[9]), Set.of(id_case[10], id_case[11]), Pattern.compile(".*\\b(warp|\u0432\u0430\u0440\u043f)\\s+(\\S+).*", 2)};
        id_break = objectArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1FC78069;
    }

    private boolean id_class(String string, Set<String> set) {
        for (String string2 : set) {
            if (!string.contains(string2)) continue;
            return id_catch[0];
        }
        return id_catch[1];
    }

    @Override
    public void id_class(rrLO rrLO2) {
        this.id_byte(rrLO2);
        this.id_break(rrLO2);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFF4827EAF2F33C41L;
    }

    private void id_break(rrLO rrLO2) {
        String string = rrLO2.id_protected();
        rgP_2 rgP_22 = rrLO2.id_byte();
        if (rgP_22 instanceof rVe_1) {
            return;
        }
        if ((rrfq_3)((Object)rrfp_3.id_class[id_throws[9]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[10]]) && string.contains(id_case[2]) && (string.contains(id_case[3]) || string.contains(id_case[4]))) {
            ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[id_throws[11]]).id_class((rrZr_1)rrQJ.id_class[id_throws[12]], string, rrfp_3.id_throws());
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{93, 99, -128, -110, -87, 48, -128, -19}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_private = new byte[]{2, 2, 2, 2, 3, 4};
    }

    private static void id_throws() {
        id_case = new String[]{new String(""), new String("\\s+"), new String("Polar"), new String(" > "), new String("mitigated"), new String("/pvp"), new String("/\u043f\u0432\u043f"), new String("\u0441\u043f\u0435\u043a"), new String("spec"), new String("spek"), new String("warp"), new String("\u0432\u0430\u0440\u043f"), new String("|")};
    }

    private static /* synthetic */ void ntfClinit() {
        PD.id_protected();
        PD.id_throws();
        PD.id_byte();
        PD.id_break();
        PD.id_class();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[3] = true;
        id_catch = blArray;
    }
}

