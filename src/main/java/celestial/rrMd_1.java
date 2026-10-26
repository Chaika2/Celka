/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Qw_1;
import celestial.rAC;
import celestial.rAI;
import celestial.rqO_2;
import celestial.rrMJ;
import celestial.rrMh_1;
import celestial.rrbb_3;
import celestial.rrzE_2;
import celestial.rrzJ_2;
import celestial.rrzM_2;
import celestial.yX_2;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import javax.imageio.ImageIO;

public class rrMd_1 {
    private static rrMJ[] id_class = null;
    private static int id_break = 0;
    private static int id_byte = 0;

    public static void id_byte() {
        if (id_class != null && rrbb_3.V()) {
            int n;
            int n2 = 0;
            for (n = 0; n < id_class.length; ++n) {
                rrMJ rrMJ2 = id_class[n];
                rrMJ2.id_protected();
                if (!rrMJ2.id_private()) continue;
                ++n2;
            }
            n = ((yX_2)rrbb_3.X().id_class[8]).id_public();
            if (n != id_byte) {
                id_break = n2;
                id_byte = n;
            }
            if (rrMh_1.id_class()) {
                rrMh_1.id_byte();
            }
        } else {
            id_break = 0;
        }
    }

    private static rrMJ id_class(Properties properties, rqO_2 rqO_22) {
        String string = properties.getProperty("from");
        String string2 = properties.getProperty("to");
        int n = rrbb_3.id_class(properties.getProperty("x"), -1);
        int n2 = rrbb_3.id_class(properties.getProperty("y"), -1);
        int n3 = rrbb_3.id_class(properties.getProperty("w"), -1);
        int n4 = rrbb_3.id_class(properties.getProperty("h"), -1);
        if (string != null && string2 != null) {
            if (n >= 0 && n2 >= 0 && n3 >= 0 && n4 >= 0) {
                string = string.trim();
                string2 = string2.trim();
                String string3 = rrzJ_2.id_class(rqO_22.id_break());
                string = rrzJ_2.id_class(string, string3);
                string2 = rrzJ_2.id_class(string2, string3);
                byte[] byArray = rrMd_1.id_class(string, n3);
                if (byArray == null) {
                    rrbb_3.id_protected("TextureAnimation: Source texture not found: " + string2);
                    return null;
                }
                int n5 = byArray.length / 4;
                int n6 = n5 / (n3 * n4);
                int n7 = n6 * n3 * n4;
                if (n5 != n7) {
                    rrbb_3.id_protected("TextureAnimation: Source texture has invalid number of frames: " + string + ", frames: " + (float)n5 / (float)(n3 * n4));
                    return null;
                }
                rqO_2 rqO_23 = new rqO_2(string2);
                try {
                    InputStream inputStream = rrbb_3.id_class(rqO_23);
                    if (inputStream == null) {
                        rrbb_3.id_protected("TextureAnimation: Target texture not found: " + string2);
                        return null;
                    }
                    BufferedImage bufferedImage = rrMd_1.id_class(inputStream);
                    if (n + n3 <= bufferedImage.getWidth() && n2 + n4 <= bufferedImage.getHeight()) {
                        return new rrMJ(string, byArray, string2, rqO_23, n, n2, n3, n4, properties);
                    }
                    rrbb_3.id_protected("TextureAnimation: Animation coordinates are outside the target texture: " + string2);
                    return null;
                }
                catch (IOException iOException) {
                    rrbb_3.id_protected("TextureAnimation: Target texture not found: " + string2);
                    return null;
                }
            }
            rrbb_3.id_protected("TextureAnimation: Invalid coordinates");
            return null;
        }
        rrbb_3.id_protected("TextureAnimation: Source or target texture not specified");
        return null;
    }

    public static void id_class() {
        id_class = null;
    }

    private static BufferedImage id_class(InputStream inputStream) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        inputStream.close();
        return bufferedImage;
    }

    private static BufferedImage id_class(BufferedImage bufferedImage, int n, int n2) {
        BufferedImage bufferedImage2 = new BufferedImage(n, n2, 2);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(bufferedImage, 0, 0, n, n2, null);
        return bufferedImage2;
    }

    private static byte[] id_class(String string, int n) {
        byte[] byArray = rrMd_1.id_break(string, n);
        if (byArray == null) {
            byArray = rrMd_1.id_break("/anim" + string, n);
        }
        return byArray;
    }

    private static rrMJ[] id_class(rAC[] rACArray) {
        ArrayList<rrMJ> arrayList = new ArrayList<rrMJ>();
        for (int i = 0; i < rACArray.length; ++i) {
            rAC rAC2 = rACArray[i];
            rrMJ[] rrMJArray = rrMd_1.id_class(rAC2);
            if (rrMJArray == null) continue;
            arrayList.addAll(Arrays.asList(rrMJArray));
        }
        return arrayList.toArray(new rrMJ[arrayList.size()]);
    }

    private static rrMJ[] id_class(rAC rAC2) {
        String[] stringArray = rrzM_2.id_class(rAC2, "optifine/anim/", ".properties", (String[])null);
        if (stringArray.length <= 0) {
            return null;
        }
        ArrayList<rrMJ> arrayList = new ArrayList<rrMJ>();
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            rrbb_3.id_byte("Texture animation: " + string);
            try {
                rqO_2 rqO_22 = new rqO_2(string);
                InputStream inputStream = rAC2.id_class(rAI.CLIENT_RESOURCES, rqO_22);
                rrzE_2 rrzE_22 = new rrzE_2();
                rrzE_22.load(inputStream);
                inputStream.close();
                rrMJ rrMJ2 = rrMd_1.id_class(rrzE_22, rqO_22);
                if (rrMJ2 == null) continue;
                rqO_2 rqO_23 = new rqO_2(rrMJ2.id_case());
                if (!rrbb_3.id_class(rAC2, rqO_23)) {
                    rrbb_3.id_byte("Skipped: " + string + ", target texture not loaded from same resource pack");
                    continue;
                }
                arrayList.add(rrMJ2);
                continue;
            }
            catch (FileNotFoundException fileNotFoundException) {
                rrbb_3.id_protected("File not found: " + fileNotFoundException.getMessage());
                continue;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        return arrayList.toArray(new rrMJ[arrayList.size()]);
    }

    public static void id_break() {
        id_class = null;
        id_break = 0;
        rAC[] rACArray = rrbb_3.d();
        id_class = rrMd_1.id_class(rACArray);
        rrMd_1.id_byte();
    }

    private static byte[] id_break(String string, int n) {
        Qw_1 qw_1 = rrbb_3.rE();
        try {
            rqO_2 rqO_22 = new rqO_2(string);
            InputStream inputStream = rrbb_3.id_class(rqO_22);
            if (inputStream == null) {
                return null;
            }
            BufferedImage bufferedImage = rrMd_1.id_class(inputStream);
            inputStream.close();
            if (bufferedImage == null) {
                return null;
            }
            if (n > 0 && bufferedImage.getWidth() != n) {
                double d = bufferedImage.getHeight() / bufferedImage.getWidth();
                int n2 = (int)((double)n * d);
                bufferedImage = rrMd_1.id_class(bufferedImage, n, n2);
            }
            int n3 = bufferedImage.getWidth();
            int n4 = bufferedImage.getHeight();
            int[] nArray = new int[n3 * n4];
            byte[] byArray = new byte[n3 * n4 * 4];
            bufferedImage.getRGB(0, 0, n3, n4, nArray, 0, n3);
            for (int i = 0; i < nArray.length; ++i) {
                int n5 = nArray[i] >> 24 & 0xFF;
                int n6 = nArray[i] >> 16 & 0xFF;
                int n7 = nArray[i] >> 8 & 0xFF;
                int n8 = nArray[i] & 0xFF;
                byArray[i * 4 + 0] = (byte)n6;
                byArray[i * 4 + 1] = (byte)n7;
                byArray[i * 4 + 2] = (byte)n8;
                byArray[i * 4 + 3] = (byte)n5;
            }
            return byArray;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static int id_throws() {
        return id_break;
    }

    public static int id_protected() {
        return id_class == null ? 0 : id_class.length;
    }
}

