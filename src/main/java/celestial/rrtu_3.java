/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rrtN_2;
import celestial.rrtm_3;
import celestial.rrvV;
import celestial.rrvj_1;
import celestial.rrwb_3;
import celestial.ui.clickgui.ClickGuiScreen;
import celestial.util.MinecraftAccessor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtu_3 {
    private static boolean[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;

    public void id_byte(int n, int n2, int n3) {
        for (rrtN_2 rrtN_22 : (List)this.id_class[id_protected[16]]) {
            if (!rrtN_22.aq_()) continue;
            rrtN_22.id_break(n, n2, n3);
            for (rrtm_3 rrtm_32 : rrtN_22.id_strictfp()) {
                rrtm_32.id_class(n, n2, n3);
            }
        }
    }

    public static rrtu_3[] id_byte() {
        rrtu_3[] rrtu_3Array = new rrtu_3[id_byte[0]];
        rrtu_3Array[rrtu_3.id_break[18]] = (rrtu_3)ClickGuiScreen.id_class[id_protected[24]];
        rrtu_3Array[rrtu_3.id_break[19]] = (rrtu_3)rrvV.id_break[id_protected[25]];
        return rrtu_3Array;
    }

    public rrtu_3() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.id_native();
        this.id_class[rrtu_3.id_protected[0]] = copyOnWriteArrayList = new CopyOnWriteArrayList();
    }

    static {
        rrtu_3.ntfClinit();
    }

    public void id_class(char c, int n) {
        for (rrtN_2 rrtN_22 : (List)this.id_class[id_protected[18]]) {
            if (!rrtN_22.aq_()) continue;
            rrtN_22.id_class(c, n);
            for (rrtm_3 rrtm_32 : rrtN_22.id_strictfp()) {
                rrtm_32.id_class(c, n);
            }
        }
    }

    public void id_class(Ml_1 ml_1, int n, int n2, boolean bl) {
        if (this.id_case()) {
            rrwb_3.id_class(ml_1, this, MinecraftAccessor.id_const.id_volatile(), MinecraftAccessor.id_const.id_final());
        }
        for (rrtN_2 rrtN_22 : (List)this.id_class[id_protected[5]]) {
            this.id_class(rrtN_22, !bl ? id_break[0] : id_break[1]);
            rrtN_22.id_boolean();
            if (!rrtN_22.aq_()) {
                if (rrtN_22.id_protected()) {
                    rrtN_22.at_();
                    ((List)this.id_class[id_protected[6]]).remove(rrtN_22);
                }
                rrtN_22.id_for();
                continue;
            }
            ml_1.id_class();
            RenderSystem.enableAlphaTest();
            rrtN_22.id_class(ml_1, this, n, n2, bl);
            RenderSystem.disableAlphaTest();
            ml_1.id_break();
            rrtN_22.id_break(ml_1, this, n, n2, bl);
        }
        rrwb_3.id_class(ml_1, this);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x70081F6C;
    }

    public void id_class(rrtN_2 rrtN_22, boolean bl) {
        if (bl) {
            rrtN_22.as_();
        }
    }

    public void id_class(rrtN_2 rrtN_22, Runnable runnable) {
        ((List)this.id_class[id_protected[3]]).add(rrtN_22);
        runnable.run();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7DD010C7F1FF694AL;
    }

    public void id_class(rrtN_2 ... rrtN_2Array) {
        ((List)this.id_class[id_protected[1]]).addAll(Arrays.asList(rrtN_2Array));
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-58, -28, -95, -56, 83, 100, -95, 86}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public List<rrtN_2> id_class() {
        return (List)this.id_class[id_protected[26]];
    }

    public void id_class(int n, int n2, int n3) {
        for (rrtN_2 rrtN_22 : (List)this.id_class[id_protected[13]]) {
            if (!rrtN_22.aq_()) continue;
            rrtN_22.id_class(n, n2, n3);
            for (rrtm_3 rrtm_32 : rrtN_22.id_strictfp()) {
                rrtm_32.id_break(n, n2, n3);
            }
        }
    }

    public void id_class(rrtN_2 rrtN_22) {
        ((List)this.id_class[id_protected[4]]).add(rrtN_22);
        rrtN_22.id_class(this);
    }

    public boolean id_class(rrtN_2 rrtN_22, int n, int n2) {
        List<rrtN_2> list = this.id_class();
        for (rrtN_2 rrtN_23 : list) {
            if (rrtN_23 == rrtN_22 || !rrtN_23.aq_()) continue;
            if (rrtN_23.id_class(n, n2)) {
                return rrtN_23.id_class(list) > rrtN_22.id_class(list) ? id_break[13] : id_break[14];
            }
            for (rrtm_3 rrtm_32 : rrtN_23.id_strictfp()) {
                if (!rrtm_32.id_implements()) continue;
                return id_break[15];
            }
        }
        return id_break[16];
    }

    public static boolean id_class(rrtu_3 rrtu_32, int n, int n2) {
        if (rrtu_32 == null) {
            return id_break[10];
        }
        for (rrtN_2 rrtN_22 : rrtu_32.id_class()) {
            if (!rrtN_22.aq_() || !rrtN_22.id_class(n, n2)) continue;
            return id_break[11];
        }
        return id_break[12];
    }

    public void id_class(int n, int n2, int n3, boolean bl, boolean bl2) {
        rrtN_2 rrtN_22;
        int n4;
        for (n4 = ((List)this.id_class[id_protected[7]]).size() - id_break[2]; n4 >= 0; --n4) {
            rrtN_22 = (rrtN_2)((List)this.id_class[id_protected[8]]).get(n4);
            if (!rrtN_22.aq_()) continue;
            for (rrtm_3 rrtm_32 : rrtN_22.id_strictfp()) {
                if (rrtm_3.id_class(rrtm_32, rrtN_22) || rrtm_32.id_volatile().id_break(n, n2) && rrtN_22.id_break(this, n, n2)) continue;
                rrtm_32.id_class(this, n, n2, n3);
            }
        }
        for (n4 = ((List)this.id_class[id_protected[9]]).size() - id_break[3]; n4 >= 0; --n4) {
            rrtN_22 = (rrtN_2)((List)this.id_class[id_protected[10]]).get(n4);
            if (!rrtN_22.aq_() || !rrtN_22.id_class(n, n2)) continue;
            rrtN_22.id_class(this, n, n2, n3, bl, bl2);
            break;
        }
        for (n4 = ((List)this.id_class[id_protected[11]]).size() - id_break[4]; n4 >= 0; --n4) {
            rrtN_22 = (rrtN_2)((List)this.id_class[id_protected[12]]).get(n4);
            if (!rrtN_22.aq_() || !rrtN_22.id_float().id_case() || rrtN_22.id_break(this, n, n2)) continue;
            rrtN_22.id_break(this, n, n2, n3, bl, bl2);
        }
    }

    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, double d, boolean bl, boolean bl2) {
        for (int i = ((List)this.id_class[id_protected[19]]).size() - id_break[5]; i >= 0; --i) {
            rrtN_2 rrtN_22 = (rrtN_2)((List)this.id_class[id_protected[20]]).get(i);
            if (!rrtN_22.aq_() || !rrtN_22.id_class(this, n, n2, d, bl, bl2)) continue;
            return id_break[6];
        }
        return id_break[7];
    }

    public void id_break() {
        for (rrtN_2 rrtN_22 : (List)this.id_class[id_protected[15]]) {
            if (!rrtN_22.aq_()) continue;
            rrtN_22.r();
            for (rrtm_3 rrtm_32 : rrtN_22.id_strictfp()) {
                rrtm_32.id_extends();
            }
        }
    }

    public void id_break(rrtN_2 rrtN_22) {
        ((List)this.id_class[id_protected[2]]).add(rrtN_22);
    }

    public void id_break(int n, int n2, int n3) {
        for (rrtN_2 rrtN_22 : (List)this.id_class[id_protected[17]]) {
            if (!rrtN_22.aq_()) continue;
            rrtN_22.id_byte(n, n2, n3);
            for (rrtm_3 rrtm_32 : rrtN_22.id_strictfp()) {
                rrtm_32.id_byte(n, n2, n3);
            }
        }
    }

    public void id_throws() {
        for (rrtN_2 rrtN_22 : (List)this.id_class[id_protected[23]]) {
            rrtN_22.id_char();
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrtu_3.id_extends();
        rrtu_3.id_finally();
        rrtu_3.id_implements();
    }

    private static void id_finally() {
        short[] sArray = new short[27];
        sArray[24] = 1;
        id_protected = sArray;
    }

    public void id_catch() {
        for (rrtN_2 rrtN_22 : (List)this.id_class[id_protected[14]]) {
            if (!rrtN_22.aq_()) continue;
            rrtN_22.id_private();
            rrtN_22.id_short().id_protected();
            for (rrtm_3 rrtm_32 : rrtN_22.id_strictfp()) {
                rrtm_32.id_case();
            }
        }
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[21];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[19] = true;
        blArray[20] = true;
        id_break = blArray;
    }

    public boolean id_case() {
        for (rrtN_2 rrtN_22 : (List)this.id_class[id_protected[22]]) {
            if (!(rrtN_22 instanceof rrvj_1) || !rrtN_22.id_short().id_catch()) continue;
            return id_break[8];
        }
        return id_break[9];
    }

    private static void id_implements() {
        id_byte = new byte[]{2};
    }

    public static void id_protected() {
        rrtu_3[] rrtu_3Array = rrtu_3.id_byte();
        int n = rrtu_3Array.length;
        for (int i = id_break[17]; i < n; ++i) {
            rrtu_3 rrtu_32 = rrtu_3Array[i];
            for (rrtN_2 rrtN_22 : rrtu_32.id_class()) {
                rrtN_22.id_instanceof();
            }
        }
    }

    public void id_private() {
        for (rrtN_2 rrtN_22 : (List)this.id_class[id_protected[21]]) {
            if (!rrtN_22.aq_()) continue;
            rrtN_22.id_void();
            for (rrtm_3 rrtm_32 : rrtN_22.id_strictfp()) {
                rrtm_32.id_else();
            }
        }
    }

    private void id_native() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[20]];
        }
    }
}

