/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package celestial;

import celestial.Ml_1;
import celestial.fk_3;
import celestial.lD_2;
import celestial.rjV_2;
import celestial.rqO_2;
import celestial.rrZM;
import celestial.rrZx_1;
import celestial.rrfQ_2;
import celestial.rrjr_3;
import celestial.util.MinecraftAccessor;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZb_1
implements MinecraftAccessor {
    private static short[] id_break;
    private static boolean[] id_byte;
    private static float[] id_protected;
    private static byte[] id_throws;
    public Object[] id_class;

    public rrZx_1 id_byte() {
        return (rrZx_1)this.id_class[id_break[81]];
    }

    public rrZb_1(Font font, rrZx_1 rrZx_12, boolean bl, boolean bl2, boolean bl3) {
        this(font, rrZx_12, bl, bl2);
        Boolean bl4 = bl3;
        this.id_class[rrZb_1.id_break[13]] = bl4;
    }

    public rrZb_1(Font font, rrZx_1 rrZx_12, boolean bl, boolean bl2) {
        this.id_case();
        Integer n = id_break[0];
        this.id_class[rrZb_1.id_break[1]] = n;
        Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap((int)id_break[2]);
        this.id_class[rrZb_1.id_break[3]] = int2ObjectOpenHashMap;
        Integer n2 = id_throws[0];
        this.id_class[rrZb_1.id_break[4]] = n2;
        Integer n3 = id_byte[0];
        this.id_class[rrZb_1.id_break[5]] = n3;
        rrZx_1 rrZx_13 = rrZx_12;
        this.id_class[rrZb_1.id_break[6]] = rrZx_13;
        Font font2 = font;
        this.id_class[rrZb_1.id_break[7]] = font2;
        Boolean bl3 = bl;
        this.id_class[rrZb_1.id_break[8]] = bl3;
        Boolean bl4 = bl2;
        this.id_class[rrZb_1.id_break[9]] = bl4;
        fk_3 fk_32 = this.id_class(font, bl, bl2);
        this.id_class[rrZb_1.id_break[10]] = fk_32;
        rrZM rrZM2 = (rrZM)((Int2ObjectOpenHashMap)this.id_class[id_break[11]]).getOrDefault((int)id_throws[1], (Object)new rrZM());
        this.id_class[rrZb_1.id_break[12]] = rrZM2;
    }

    static {
        rrZb_1.ntfClinit();
    }

    public void id_class(Ml_1 ml_1, lD_2 lD_22, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        Objects.requireNonNull(this);
        float f13 = f5 / id_protected[0];
        float f14 = f6 / (float)((Integer)this.id_class[id_break[66]]).intValue();
        Objects.requireNonNull(this);
        float f15 = f7 / id_protected[1];
        float f16 = f8 / (float)((Integer)this.id_class[id_break[67]]).intValue();
        lD_22.id_class(rjV_22, f, f2 + f4, id_protected[2]).id_class(f13, f14 + f16).id_class(f9, f10, f11, f12).id_class();
        lD_22.id_class(rjV_22, f + f3, f2 + f4, id_protected[3]).id_class(f13 + f15, f14 + f16).id_class(f9, f10, f11, f12).id_class();
        lD_22.id_class(rjV_22, f + f3, f2, id_protected[4]).id_class(f13 + f15, f14).id_class(f9, f10, f11, f12).id_class();
        lD_22.id_class(rjV_22, f, f2, id_protected[5]).id_class(f13, f14).id_class(f9, f10, f11, f12).id_class();
    }

    private static String id_class(Font font, rrZx_1 rrZx_12) {
        int n = rrZx_12.id_break();
        StringBuilder stringBuilder = new StringBuilder(n);
        rrZx_12.id_class().stream().flatMapToInt(rrZd_12 -> IntStream.rangeClosed(rrZd_12.id_break(), rrZd_12.id_class())).distinct().sorted().filter(font::canDisplay).forEach(stringBuilder::appendCodePoint);
        return stringBuilder.toString();
    }

    public void id_class(Ml_1 ml_1, char c, float f, float f2, float f3, float f4, float f5, float f6) {
        rrZM rrZM2 = (rrZM)((Int2ObjectOpenHashMap)this.id_class[id_break[42]]).getOrDefault((int)c, (Object)((rrZM)this.id_class[id_break[43]]));
        if (rrZM2 == null) {
            return;
        }
        this.id_class(ml_1, id_strictfp, f, f2, ((Integer)rrZM2.id_class[id_break[44]]).intValue(), ((Integer)rrZM2.id_class[id_break[45]]).intValue(), ((Integer)rrZM2.id_class[id_break[46]]).intValue(), ((Integer)rrZM2.id_class[id_break[47]]).intValue(), ((Integer)rrZM2.id_class[id_break[48]]).intValue(), ((Integer)rrZM2.id_class[id_break[49]]).intValue(), f3, f4, f5, f6);
    }

    public void id_class(Ml_1 ml_1, char c, float f, float f2, int n) throws ArrayIndexOutOfBoundsException {
        rrZM rrZM2 = (rrZM)((Int2ObjectOpenHashMap)this.id_class[id_break[58]]).getOrDefault((int)c, (Object)((rrZM)this.id_class[id_break[59]]));
        this.id_class(ml_1, f, f2, ((Integer)rrZM2.id_class[id_break[60]]).intValue(), ((Integer)rrZM2.id_class[id_break[61]]).intValue(), ((Integer)rrZM2.id_class[id_break[62]]).intValue(), ((Integer)rrZM2.id_class[id_break[63]]).intValue(), ((Integer)rrZM2.id_class[id_break[64]]).intValue(), ((Integer)rrZM2.id_class[id_break[65]]).intValue(), n);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAE309D32;
    }

    public static Font id_class(String string, float f) {
        try {
            Font font = Font.createFont(id_byte[1], id_import.F().id_class(new rqO_2("celestial/fonts/" + string + ".ttf")).id_break());
            return font.deriveFont(f);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5F51A0843F53F31L;
    }

    public void id_class(Font font) {
        Font font2 = font;
        this.id_class[rrZb_1.id_break[75]] = font2;
        fk_3 fk_32 = this.id_class(font, (Boolean)this.id_class[id_break[76]], (Boolean)this.id_class[id_break[77]]);
        this.id_class[rrZb_1.id_break[78]] = fk_32;
    }

    public int id_class() {
        return (Integer)this.id_class[id_break[70]];
    }

    public void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n) {
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        Objects.requireNonNull(this);
        float f9 = f5 / id_protected[6];
        float f10 = f6 / (float)((Integer)this.id_class[id_break[68]]).intValue();
        Objects.requireNonNull(this);
        float f11 = f7 / id_protected[7];
        float f12 = f8 / (float)((Integer)this.id_class[id_break[69]]).intValue();
        id_strictfp.id_class(rjV_22, f, f2 + f4, id_protected[8]).id_class(f9, f10 + f12).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + f3, f2 + f4, id_protected[9]).id_class(f9 + f11, f10 + f12).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f + f3, f2, id_protected[10]).id_class(f9 + f11, f10).id_class(n).id_class();
        id_strictfp.id_class(rjV_22, f, f2, id_protected[11]).id_class(f9, f10).id_class(n).id_class();
    }

    public fk_3 id_class(Font font, boolean bl, boolean bl2) {
        return rrjr_3.id_class(this.id_break(font, bl, bl2), (Boolean)this.id_class[id_break[14]], id_byte[2], id_byte[3], id_byte[4]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{4, -124, -77, -60, 66, 111, 122, 120}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        this.id_class(ml_1, MinecraftAccessor.id_strictfp, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12);
    }

    public void id_class(Ml_1 ml_1, lD_2 lD_22, char c, float f, float f2, float f3, float f4, float f5, float f6) {
        rrZM rrZM2 = (rrZM)((Int2ObjectOpenHashMap)this.id_class[id_break[50]]).getOrDefault((int)c, (Object)((rrZM)this.id_class[id_break[51]]));
        if (rrZM2 == null) {
            return;
        }
        this.id_class(ml_1, lD_22, f, f2, ((Integer)rrZM2.id_class[id_break[52]]).intValue(), ((Integer)rrZM2.id_class[id_break[53]]).intValue(), ((Integer)rrZM2.id_class[id_break[54]]).intValue(), ((Integer)rrZM2.id_class[id_break[55]]).intValue(), ((Integer)rrZM2.id_class[id_break[56]]).intValue(), ((Integer)rrZM2.id_class[id_break[57]]).intValue(), f3, f4, f5, f6);
    }

    public BufferedImage id_break(Font font, boolean bl, boolean bl2) {
        Objects.requireNonNull(this);
        short s = id_break[15];
        Objects.requireNonNull(this);
        BufferedImage bufferedImage = new BufferedImage(s, id_break[16], id_throws[2]);
        Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
        graphics2D.setFont(font);
        graphics2D.setColor(new Color(id_break[17], id_break[18], id_break[19], id_byte[5]));
        int n = id_byte[6];
        int n2 = id_byte[7];
        Objects.requireNonNull(this);
        short s2 = id_break[20];
        Objects.requireNonNull(this);
        graphics2D.fillRect(n, n2, s2, id_break[21]);
        graphics2D.setColor(Color.WHITE);
        graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, bl2 ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, bl ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, bl ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n3 = id_byte[8];
        int n4 = id_byte[9];
        int n5 = id_byte[10];
        String string = rrZb_1.id_class(font, (rrZx_1)this.id_class[id_break[22]]);
        for (int i = id_byte[11]; i < string.length(); ++i) {
            char c = string.charAt(i);
            rrZM rrZM2 = new rrZM();
            String string2 = String.valueOf(c);
            Rectangle2D rectangle2D = fontMetrics.getStringBounds(string2, graphics2D);
            Rectangle rectangle = rectangle2D.getBounds();
            Integer n6 = rectangle.width + id_throws[3];
            rrZM2.id_class[rrZb_1.id_break[23]] = n6;
            Integer n7 = rectangle.height;
            rrZM2.id_class[rrZb_1.id_break[24]] = n7;
            int n8 = n4 + (Integer)rrZM2.id_class[id_break[25]];
            Objects.requireNonNull(this);
            if (n8 >= id_break[26]) {
                n4 = id_byte[12];
                n5 += n3;
                n3 = id_byte[13];
            }
            if ((Integer)rrZM2.id_class[id_break[27]] > n3) {
                n3 = (Integer)rrZM2.id_class[id_break[28]];
            }
            Integer n9 = n4;
            rrZM2.id_class[rrZb_1.id_break[29]] = n9;
            Integer n10 = n5;
            rrZM2.id_class[rrZb_1.id_break[30]] = n10;
            if ((Integer)rrZM2.id_class[id_break[31]] > (Integer)this.id_class[id_break[32]]) {
                Integer n11 = (int)((Integer)rrZM2.id_class[id_break[33]]);
                this.id_class[rrZb_1.id_break[34]] = n11;
            }
            Integer n12 = ((Integer)this.id_class[id_break[35]] - id_throws[4]) / id_throws[5];
            this.id_class[rrZb_1.id_break[36]] = n12;
            ((Int2ObjectOpenHashMap)this.id_class[id_break[37]]).put((int)c, (Object)rrZM2);
            graphics2D.drawString(string2, n4 + id_throws[6], n5 + fontMetrics.getAscent());
            n4 += ((Integer)rrZM2.id_class[id_break[38]]).intValue();
        }
        graphics2D.dispose();
        int n13 = id_byte[14];
        int n14 = id_byte[15];
        Objects.requireNonNull(this);
        int n15 = rrfQ_2.id_class(n5 + (Integer)this.id_class[id_break[40]]);
        Integer n16 = n15;
        this.id_class[rrZb_1.id_break[41]] = n16;
        return bufferedImage.getSubimage(n13, n14, id_break[39], n15);
    }

    public float id_break(String string) {
        float f = id_protected[12];
        char[] cArray = string.toCharArray();
        int n = cArray.length;
        for (int i = id_byte[16]; i < n; ++i) {
            char c = cArray[i];
            rrZM rrZM2 = (rrZM)((Int2ObjectOpenHashMap)this.id_class[id_break[71]]).getOrDefault((int)c, (Object)((rrZM)this.id_class[id_break[72]]));
            f += (float)((Integer)rrZM2.id_class[id_break[73]] - id_throws[7] + (Integer)this.id_class[id_break[74]]);
        }
        return f / id_protected[13];
    }

    public boolean id_break() {
        return (Boolean)this.id_class[id_break[80]];
    }

    private static void id_throws() {
        float[] fArray = new float[14];
        fArray[0] = 512.0f;
        fArray[1] = 512.0f;
        fArray[6] = 512.0f;
        fArray[7] = 512.0f;
        fArray[13] = 2.0f;
        id_protected = fArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrZb_1.id_catch();
        rrZb_1.id_implements();
        rrZb_1.id_throws();
        rrZb_1.id_private();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[24];
        blArray[10] = true;
        id_byte = blArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[8]];
            objectArray[rrZb_1.id_byte[17]] = (int)id_break[82];
            objectArray[rrZb_1.id_throws[9]] = id_byte[18];
            objectArray[rrZb_1.id_throws[10]] = id_byte[19];
            objectArray[rrZb_1.id_throws[11]] = id_byte[20];
            objectArray[rrZb_1.id_throws[12]] = id_byte[21];
            objectArray[rrZb_1.id_throws[13]] = id_byte[22];
            objectArray[rrZb_1.id_throws[14]] = id_byte[23];
        }
    }

    private static void id_implements() {
        short[] sArray = new short[83];
        sArray[0] = 512;
        sArray[2] = 128;
        sArray[3] = 1;
        sArray[4] = 7;
        sArray[5] = 8;
        sArray[6] = 3;
        sArray[7] = 4;
        sArray[8] = 5;
        sArray[9] = 6;
        sArray[10] = 10;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 11;
        sArray[14] = 11;
        sArray[15] = 512;
        sArray[16] = 512;
        sArray[17] = 255;
        sArray[18] = 255;
        sArray[19] = 255;
        sArray[20] = 512;
        sArray[21] = 512;
        sArray[22] = 3;
        sArray[23] = 2;
        sArray[24] = 3;
        sArray[25] = 2;
        sArray[26] = 512;
        sArray[27] = 3;
        sArray[28] = 3;
        sArray[30] = 1;
        sArray[31] = 3;
        sArray[32] = 7;
        sArray[33] = 3;
        sArray[34] = 7;
        sArray[35] = 7;
        sArray[36] = 7;
        sArray[37] = 1;
        sArray[38] = 2;
        sArray[39] = 512;
        sArray[40] = 7;
        sArray[41] = 9;
        sArray[42] = 1;
        sArray[43] = 2;
        sArray[44] = 2;
        sArray[45] = 3;
        sArray[47] = 1;
        sArray[48] = 2;
        sArray[49] = 3;
        sArray[50] = 1;
        sArray[51] = 2;
        sArray[52] = 2;
        sArray[53] = 3;
        sArray[55] = 1;
        sArray[56] = 2;
        sArray[57] = 3;
        sArray[58] = 1;
        sArray[59] = 2;
        sArray[60] = 2;
        sArray[61] = 3;
        sArray[63] = 1;
        sArray[64] = 2;
        sArray[65] = 3;
        sArray[66] = 9;
        sArray[67] = 9;
        sArray[68] = 9;
        sArray[69] = 9;
        sArray[70] = 7;
        sArray[71] = 1;
        sArray[72] = 2;
        sArray[73] = 2;
        sArray[74] = 8;
        sArray[75] = 4;
        sArray[76] = 5;
        sArray[77] = 6;
        sArray[78] = 10;
        sArray[79] = 10;
        sArray[80] = 11;
        sArray[81] = 3;
        sArray[82] = 512;
        id_break = sArray;
    }

    public fk_3 id_protected() {
        return (fk_3)this.id_class[id_break[79]];
    }

    private static void id_private() {
        id_throws = new byte[]{-1, 63, 2, 8, 8, 2, 2, 8, 12, 5, 6, 7, 8, 9, 11};
    }
}

