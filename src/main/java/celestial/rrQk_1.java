/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQX;
import celestial.rrQd_1;
import celestial.rrQt_1;
import celestial.rrQw_1;
import celestial.rrQx_1;
import celestial.rrtQ_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQk_1
extends Enum<rrQk_1>
implements MinecraftAccessor {
    private static boolean[] booleans9c4062aebf3b3e0dbb68c82ac08880ac;
    public Object[] fields9c4062aebf3b3e0dbb68c82ac08880ac;
    public static Object[] staticFields9c4062aebf3b3e0dbb68c82ac08880ac;
    private static String[] strings9c4062aebf3b3e0dbb68c82ac08880ac;
    private static short[] shorts9c4062aebf3b3e0dbb68c82ac08880ac;
    private static byte[] bytes9c4062aebf3b3e0dbb68c82ac08880ac;

    public void id_byte() {
        if (((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[12]]).isEmpty()) {
            ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[13]]).forEach(rrQt_1::id_byte);
            return;
        }
        ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[14]]).clear();
        ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[15]]).forEach(rrQt_1::id_class);
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-14, -67, -116, 44, -60, 96, 19, 122}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private rrQk_1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.id_throws();
        this.fields9c4062aebf3b3e0dbb68c82ac08880ac[rrQk_1.shorts9c4062aebf3b3e0dbb68c82ac08880ac[1]] = arrayList2 = new ArrayList();
        this.fields9c4062aebf3b3e0dbb68c82ac08880ac[rrQk_1.shorts9c4062aebf3b3e0dbb68c82ac08880ac[2]] = arrayList = new ArrayList();
        ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[3]]).add(new rrQw_1());
    }

    static {
        rrQk_1.ntfClinit();
    }

    public static rrQk_1[] values() {
        return (rrQk_1[])((rrQk_1[])staticFields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[0]]).clone();
    }

    public static rrQk_1 valueOf(String string) {
        return Enum.valueOf(rrQk_1.class, string);
    }

    public boolean id_class(rrQx_1 rrQx_12, boolean bl, boolean bl2) {
        boolean bl3;
        if (rrQx_12 == null || rrQx_12.id_class() == null || rrQx_12.id_class().length() > bytes9c4062aebf3b3e0dbb68c82ac08880ac[0]) {
            ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[4]]).forEach(rrQt_1::id_break);
            return booleans9c4062aebf3b3e0dbb68c82ac08880ac[0];
        }
        boolean bl4 = bl3 = !((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[5]]).contains(rrQx_12) ? booleans9c4062aebf3b3e0dbb68c82ac08880ac[1] : booleans9c4062aebf3b3e0dbb68c82ac08880ac[2];
        if (bl3) {
            if (bl2) {
                ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[6]]).add(booleans9c4062aebf3b3e0dbb68c82ac08880ac[3], rrQx_12);
            } else {
                ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[7]]).add(rrQx_12);
            }
        }
        if (bl) {
            ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[8]]).forEach(rrQt_12 -> rrQt_12.id_class(rrQx_12, bl3));
        }
        return bl3;
    }

    public boolean id_class(rrQd_1 rrQd_12) {
        if (((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[16]]).stream().noneMatch(rrQx_12 -> rrQx_12.id_break().equals((Object)rrQd_12))) {
            ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[17]]).forEach(rrQt_12 -> rrQt_12.id_class(rrQd_12));
            return booleans9c4062aebf3b3e0dbb68c82ac08880ac[4];
        }
        ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[18]]).forEach(rrQt_12 -> rrQt_12.id_break(rrQd_12));
        return ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[19]]).removeIf(rrQx_12 -> rrQx_12.id_break().equals((Object)rrQd_12));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC90B682C;
    }

    public void id_class(rrQx_1 rrQx_12) {
        ((CompletableFuture)rrQx_12.id_byte().thenAccept(void_ -> {
            String string = "\u0412\u044b \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u0430\u0432\u0442\u043e\u0440\u0438\u0437\u043e\u0432\u0430\u043b\u0438\u0441\u044c \u0432 \u0430\u043a\u043a\u0430\u0443\u043d\u0442 '" + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts9c4062aebf3b3e0dbb68c82ac08880ac[27]]).id_private().id_throws().id_break(rrQx_12.id_class()) + "'";
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[shorts9c4062aebf3b3e0dbb68c82ac08880ac[28]]).id_class(new rrtQ_2(strings9c4062aebf3b3e0dbb68c82ac08880ac[2], string, (int)shorts9c4062aebf3b3e0dbb68c82ac08880ac[29]));
        })).exceptionally(throwable -> {
            String string = strings9c4062aebf3b3e0dbb68c82ac08880ac[0];
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[shorts9c4062aebf3b3e0dbb68c82ac08880ac[25]]).id_class(new rrtx_3(strings9c4062aebf3b3e0dbb68c82ac08880ac[1], string, (int)shorts9c4062aebf3b3e0dbb68c82ac08880ac[26]));
            return null;
        });
    }

    public List<rrQx_1> id_class() {
        return (List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[23]];
    }

    public rrQx_1 id_class(String string) {
        return ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[20]]).stream().filter(rrQx_12 -> rrQx_12.id_class().equalsIgnoreCase(string.toLowerCase())).findFirst().orElse(null);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5BEC2C968ABDFCCBL;
    }

    public List<rrQt_1> id_break() {
        return (List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[24]];
    }

    public void id_break(String string) {
        rrQx_1 rrQx_13 = this.id_class(string);
        if (rrQx_13 == null) {
            ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[9]]).forEach(rrQt_12 -> rrQt_12.id_class(string));
            return;
        }
        ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[10]]).forEach(rrQt_12 -> rrQt_12.id_break(rrQx_13, this.id_protected(string)));
        ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[11]]).removeIf(rrQx_12 -> rrQx_12.id_class().equals(string));
    }

    private void id_throws() {
        if (this.fields9c4062aebf3b3e0dbb68c82ac08880ac == null) {
            Object[] objectArray = this.fields9c4062aebf3b3e0dbb68c82ac08880ac = new Object[bytes9c4062aebf3b3e0dbb68c82ac08880ac[1]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrQk_1.id_case();
        rrQk_1.id_catch();
        rrQk_1.id_implements();
        rrQk_1.id_extends();
        rrQk_1.id_private();
    }

    private static /* synthetic */ rrQk_1[] id_finally() {
        rrQk_1[] rrQk_1Array = new rrQk_1[booleans9c4062aebf3b3e0dbb68c82ac08880ac[5]];
        rrQk_1Array[rrQk_1.booleans9c4062aebf3b3e0dbb68c82ac08880ac[6]] = (rrQk_1)staticFields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[30]];
        return rrQk_1Array;
    }

    private static void id_catch() {
        strings9c4062aebf3b3e0dbb68c82ac08880ac = new String[]{new String("\u041e\u0448\u0438\u0431\u043a\u0430 \u0430\u0432\u0442\u043e\u0440\u0438\u0437\u0430\u0446\u0438\u0438 \u0432 \u0430\u043a\u043a\u0430\u0443\u043d\u0442"), new String("Accounts"), new String("Accounts"), new String("INSTANCE")};
    }

    private static void id_extends() {
        bytes9c4062aebf3b3e0dbb68c82ac08880ac = new byte[]{16, 2, 2};
    }

    private static void id_case() {
        boolean[] blArray = new boolean[10];
        blArray[1] = true;
        blArray[5] = true;
        blArray[9] = true;
        booleans9c4062aebf3b3e0dbb68c82ac08880ac = blArray;
    }

    private static void id_implements() {
        short[] sArray = new short[31];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[13] = 1;
        sArray[15] = 1;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[24] = 1;
        sArray[26] = 2000;
        sArray[29] = 2000;
        shorts9c4062aebf3b3e0dbb68c82ac08880ac = sArray;
    }

    public boolean id_protected(String string) {
        return ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[22]]).stream().anyMatch(rrQx_12 -> rrQx_12.id_class().equals(string));
    }

    public rrQx_1 id_protected() {
        return ((List)this.fields9c4062aebf3b3e0dbb68c82ac08880ac[shorts9c4062aebf3b3e0dbb68c82ac08880ac[21]]).stream().filter(rrQx_12 -> rrQx_12.id_class().equalsIgnoreCase(id_import.id_while().id_byte().toLowerCase())).findFirst().orElse(null);
    }

    private static void id_private() {
        Object[] objectArray;
        objectArray = new Object[]{new rrQk_1(), new rrQk_1[]{(rrQk_1)objectArray[0]}};
        staticFields9c4062aebf3b3e0dbb68c82ac08880ac = objectArray;
    }
}

