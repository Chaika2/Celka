/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.lD_2;
import celestial.manager.FontManager;
import celestial.rrFl_1;
import celestial.rrFu_1;
import celestial.rrTB;
import celestial.rrTE;
import celestial.rrTG;
import celestial.rrTS;
import celestial.rrTs_1;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrfD_2;
import celestial.util.ColorHelper;
import celestial.util.MinecraftAccessor;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFm_1
extends rrFl_1<rrTB> {
    private static float[] id_break;
    private static boolean[] id_protected;
    private static byte[] id_throws;
    public Object[] id_class;
    private static short[] id_case;

    @Override
    public Collection<rrTB> id_byte() {
        return ((rrTs_1)((Object)rrTs_1.staticFields535ba6477b2d307ba91b4de7d306c5df[id_case[10]])).id_class();
    }

    public rrFm_1(rrFu_1 rrFu_12) {
        Map<rrTS, List<rrTB>> map;
        this.id_implements();
        this.id_class[rrFm_1.id_case[1]] = map = ((rrTs_1)((Object)rrTs_1.staticFields535ba6477b2d307ba91b4de7d306c5df[id_case[0]])).id_break();
        rrFu_1 rrFu_13 = rrFu_12;
        this.id_class[rrFm_1.id_case[2]] = rrFu_13;
    }

    static {
        rrFm_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFB51A732;
    }

    @Override
    public float id_class(rrTB rrTB2) {
        String string = rrTB2.id_throws() + rrTB2.id_case();
        return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_case[12]]).id_class().id_break(string) + id_break[10];
    }

    @Override
    public void id_class(Ml_1 ml_1, float f, float f2) {
        this.id_implements();
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_case[3]]).id_class();
        this.id_break(id_break[0]);
        float f3 = this.id_finally();
        float f4 = this.id_protected();
        int n = (int)(id_break[1] * ((rrFu_1)this.id_class[id_case[4]]).id_long());
        int n2 = ColorHelper.id_break(rrZF.d_, n);
        rrfD_2.id_protected((lD_2)rrfD_2.id_class[id_case[5]]);
        rrZO2.id_class(MinecraftAccessor.id_strictfp);
        List<rrTB> list = ((rrTs_1)((Object)rrTs_1.staticFields535ba6477b2d307ba91b4de7d306c5df[id_case[6]])).id_class();
        for (rrTB rrTB2 : list) {
            String string = rrTB2.id_case();
            float f5 = f + id_break[2];
            float f6 = f2 + f3;
            rrZO2.id_break(ml_1, MinecraftAccessor.id_strictfp, rrTB2.id_throws(), f5 + id_break[3], f6, n2, id_protected[0], id_protected[1]);
            rrZO2.id_break(ml_1, MinecraftAccessor.id_strictfp, string, f5 + ((rrFu_1)this.id_class[id_case[7]]).id_implements() - rrZO2.id_break(string) - id_break[4], f6, n2, id_protected[2], id_protected[3]);
            rrfD_2.id_class(ml_1, (lD_2)rrfD_2.id_class[id_case[8]], f5 + id_break[5], f6 + id_break[6], id_break[7], ColorHelper.id_break(rrTB2.id_break(), n), id_break[8]);
            f3 += f4;
            this.id_class(f4);
        }
        rrfD_2.id_break((lD_2)rrfD_2.id_class[id_case[9]]);
        rrZO2.id_byte(MinecraftAccessor.id_strictfp);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x47E4E38B1147864AL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{107, 31, 57, -94, -119, -40, -79, 58}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrFu_1 id_class() {
        this.id_implements();
        return (rrFu_1)this.id_class[id_case[13]];
    }

    public Map<rrTS, List<rrTB>> id_break() {
        this.id_implements();
        return (Map)this.id_class[id_case[14]];
    }

    @Override
    public void id_throws() {
        super.id_throws();
        Collection<rrTB> collection = this.id_byte();
        for (rrTB rrTB2 : collection) {
            rrTE[] rrTEArray = rrTB2.id_catch();
            LocalDateTime localDateTime = LocalDateTime.now((ZoneId)rrTG.id_class[id_case[11]]);
            LocalDateTime localDateTime2 = rrTG.id_class(rrTEArray, localDateTime);
            rrTB2.id_class(localDateTime2);
            rrTB2.id_class(rrTG.id_break(localDateTime, localDateTime2));
            rrTB2.id_class(ColorHelper.id_break(ColorHelper.id_break(Color.GREEN.getRGB(), Color.RED.getRGB(), rrTB2.id_byte()), id_break[9]));
            rrTB2.id_break(rrTG.id_class(localDateTime, localDateTime2));
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrFm_1.id_private();
        rrFm_1.id_catch();
        rrFm_1.id_case();
        rrFm_1.id_extends();
    }

    private static void id_catch() {
        short[] sArray = new short[15];
        sArray[1] = 1;
        sArray[5] = 7;
        sArray[8] = 7;
        sArray[9] = 7;
        sArray[14] = 1;
        id_case = sArray;
    }

    private static void id_extends() {
        id_throws = new byte[]{2};
    }

    private static void id_case() {
        id_break = new float[]{18.0f, 255.0f, 3.0f, 7.0f, 5.0f, 2.0f, 1.5f, 5.0f, 1.0f, 0.5f, 20.0f, 10.0f};
    }

    private void id_implements() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
        }
    }

    @Override
    public float id_protected() {
        return id_break[11];
    }

    private static void id_private() {
        id_protected = new boolean[4];
    }
}

