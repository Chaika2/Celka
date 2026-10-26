/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRp_1;
import celestial.rVL;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rqO_2;
import celestial.rrGi_1;
import celestial.rrMl_1;
import celestial.rrMn_1;
import celestial.rrMz_1;
import celestial.rrWP;
import celestial.rrWr_1;
import celestial.rrbF_2;
import celestial.rrbN_2;
import celestial.rrbb_3;
import celestial.rrzJ_2;
import celestial.xc_3;
import celestial.xd_3;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrbQ_2
implements rrbF_2 {
    public String id_class = null;
    public String id_break = null;
    private int id_volatile = -1;
    private rrMn_1[] id_final = null;
    private String id_package = null;
    private int id_int = -1;
    private int id_new = 0;
    private int id_continue = 0;
    private int id_super = 0;
    private int id_this = 0;
    private int[] id_else = null;
    private float[][] id_synchronized = null;
    private static final int id_return = -1;
    private static final int id_public = 0;
    private static final int id_goto = 1;
    private static final int id_while = 2;
    public static final String id_byte = "vanilla";
    public static final String id_protected = "grid";
    public static final String id_throws = "fixed";
    public static final String[] id_case = new String[]{"vanilla", "grid", "fixed"};
    public static final String id_catch = "format";
    public static final String id_private = "blocks";
    public static final String id_implements = "source";
    public static final String id_finally = "color";
    public static final String id_extends = "yVariance";
    public static final String id_native = "yOffset";

    private int id_byte(rYG rYG2, rfH_2 rfH_22) {
        int n = rrWr_1.id_break(rYG2);
        int n2 = rfH_22.c_() - this.id_continue;
        if (this.id_new > 0) {
            int n3 = rfH_22.b_() << 16 + rfH_22.d_();
            int n4 = rrbb_3.id_class(n3);
            int n5 = this.id_new * 2 + 1;
            int n6 = (n4 & 0xFF) % n5 - this.id_new;
            n2 += n6;
        }
        return this.id_class(n, n2);
    }

    private int id_byte(String string) {
        if (string == null) {
            return 0;
        }
        if ((string = string.trim()).equals(id_byte)) {
            return 0;
        }
        if (string.equals(id_protected)) {
            return 1;
        }
        if (string.equals(id_throws)) {
            return 2;
        }
        rrbQ_2.id_throws("Unknown format: " + string);
        return -1;
    }

    @Override
    public boolean id_byte() {
        return this.id_volatile == 2;
    }

    public rrbQ_2(Properties properties, String string, int n, int n2, String string2) {
        rrMz_1 rrMz_12 = new rrMz_1("Colormap");
        this.id_class = rrMz_12.id_class(string);
        this.id_break = rrMz_12.id_break(string);
        this.id_volatile = this.id_byte(properties.getProperty(id_catch, string2));
        this.id_final = rrMz_12.id_byte(properties.getProperty(id_private));
        this.id_package = rrbQ_2.id_class(properties.getProperty(id_implements), string, this.id_break);
        this.id_int = rrMz_1.id_break(properties.getProperty(id_finally), -1);
        this.id_new = rrMz_12.id_class(properties.getProperty(id_extends), 0);
        this.id_continue = rrMz_12.id_class(properties.getProperty(id_native), 0);
        this.id_super = n;
        this.id_this = n2;
    }

    public String toString() {
        return this.id_break + "/" + this.id_class + ", blocks: " + rrbb_3.id_class(this.id_final) + ", source: " + this.id_package;
    }

    public int id_class(rRp_1 rRp_12, double d, double d2, double d3, int n) {
        int n2;
        int n3;
        int n4;
        if (this.id_volatile == 2) {
            return this.id_int;
        }
        int n5 = rfU_2.id_byte(d);
        int n6 = rfU_2.id_byte(d2);
        int n7 = rfU_2.id_byte(d3);
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        rrGi_1 rrGi_12 = new rrGi_1(0, 0, 0);
        for (n4 = n5 - n; n4 <= n5 + n; ++n4) {
            for (n3 = n7 - n; n3 <= n7 + n; ++n3) {
                rrGi_12.id_class(n4, n6, n3);
                n2 = this.id_class(rRp_12, (rfH_2)rrGi_12);
                n8 += n2 >> 16 & 0xFF;
                n9 += n2 >> 8 & 0xFF;
                n10 += n2 & 0xFF;
                ++n11;
            }
        }
        n4 = n8 / n11;
        n3 = n9 / n11;
        n2 = n10 / n11;
        return n4 << 16 | n3 << 8 | n2;
    }

    public int id_class(rRp_1 rRp_12, rfH_2 rfH_22) {
        rYG rYG2 = rrbN_2.id_class(rRp_12, rfH_22);
        return this.id_class(rYG2, rfH_22);
    }

    @Override
    public int id_class(xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22) {
        return this.id_class(rRp_12, rfH_22);
    }

    public int id_class(int n, int n2) {
        n = rrbb_3.id_class(n, 0, this.id_super - 1);
        n2 = rrbb_3.id_class(n2, 0, this.id_this - 1);
        return this.id_else[n2 * this.id_super + n] & 0xFFFFFF;
    }

    public boolean id_class(String string) {
        if (this.id_volatile != 0 && this.id_volatile != 1) {
            if (this.id_volatile != 2) {
                return false;
            }
            if (this.id_int < 0) {
                this.id_int = 0xFFFFFF;
            }
        } else {
            if (this.id_package == null) {
                rrbQ_2.id_throws("Source not defined: " + string);
                return false;
            }
            this.id_implements();
            if (this.id_else == null) {
                return false;
            }
            if (this.id_int < 0) {
                if (this.id_volatile == 0) {
                    this.id_int = this.id_class(127, 127);
                }
                if (this.id_volatile == 1) {
                    this.id_int = this.id_byte(rrWr_1.id_class, new rfH_2(0, 64, 0));
                }
            }
        }
        return true;
    }

    private static float[][] id_class(int[] nArray) {
        float[][] fArray = new float[nArray.length][3];
        for (int i = 0; i < nArray.length; ++i) {
            int n = nArray[i];
            float f = (float)(n >> 16 & 0xFF) / 255.0f;
            float f2 = (float)(n >> 8 & 0xFF) / 255.0f;
            float f3 = (float)(n & 0xFF) / 255.0f;
            float[] fArray2 = fArray[i];
            fArray2[0] = f;
            fArray2[1] = f2;
            fArray2[2] = f3;
        }
        return fArray;
    }

    public void id_class(rrMn_1 rrMn_12) {
        if (this.id_final == null) {
            this.id_final = new rrMn_1[0];
        }
        this.id_final = (rrMn_1[])rrbb_3.id_class((Object[])this.id_final, (Object)rrMn_12);
    }

    public int id_class(rYG rYG2, rfH_2 rfH_22) {
        if (this.id_volatile == 0) {
            return this.id_break(rYG2, rfH_22);
        }
        return this.id_volatile == 1 ? this.id_byte(rYG2, rfH_22) : this.id_int;
    }

    private static String id_class(String string, String string2, String string3) {
        int n;
        if (string != null) {
            String string4;
            if ((string = string.trim()).endsWith(string4 = ".png")) {
                string = string.substring(0, string.length() - string4.length());
            }
            return rrbQ_2.id_class(string, string3);
        }
        String string5 = string2;
        int n2 = string2.lastIndexOf(47);
        if (n2 >= 0) {
            string5 = string2.substring(n2 + 1);
        }
        if ((n = string5.lastIndexOf(46)) >= 0) {
            string5 = string5.substring(0, n);
        }
        return rrbQ_2.id_class(string5, string3);
    }

    public boolean id_class(xc_3 xc_32) {
        return rrMl_1.id_class(xc_32, this.id_final);
    }

    private static String id_class(String object, String string) {
        String string2;
        if (!(((String)(object = rrzJ_2.id_class((String)object, string))).startsWith(string) || ((String)object).startsWith("textures/") || ((String)object).startsWith("optifine/"))) {
            object = string + "/" + (String)object;
        }
        if (((String)object).endsWith(".png")) {
            object = ((String)object).substring(0, ((String)object).length() - 4);
        }
        if (((String)object).startsWith(string2 = "textures/block/")) {
            object = ((String)object).substring(string2.length());
        }
        if (((String)object).startsWith("/")) {
            object = ((String)object).substring(1);
        }
        return object;
    }

    public int id_class(int n) {
        n = rrbb_3.id_class(n, 0, this.id_else.length - 1);
        return this.id_else[n] & 0xFFFFFF;
    }

    public int id_class() {
        if (this.id_volatile == 2) {
            return this.id_int;
        }
        int n = rrbN_2.id_class.nextInt(this.id_else.length);
        return this.id_else[n];
    }

    public void id_break(int n, int n2) {
        rrMn_1 rrMn_12 = this.id_break(n);
        if (rrMn_12 != null) {
            if (n2 >= 0) {
                rrMn_12.id_class(n2);
            }
        } else {
            this.id_class(new rrMn_1(n, n2));
        }
    }

    private rrMn_1 id_break(int n) {
        if (this.id_final == null) {
            return null;
        }
        for (int i = 0; i < this.id_final.length; ++i) {
            rrMn_1 rrMn_12 = this.id_final[i];
            if (rrMn_12.id_class() != n) continue;
            return rrMn_12;
        }
        return null;
    }

    public boolean id_break(String string) {
        if (this.id_final == null) {
            this.id_final = this.id_private();
            if (this.id_final == null) {
                rrbQ_2.id_throws("Match blocks not defined: " + string);
                return false;
            }
        }
        return true;
    }

    public float[][] id_break() {
        if (this.id_synchronized == null) {
            this.id_synchronized = rrbQ_2.id_class(this.id_else);
        }
        return this.id_synchronized;
    }

    private int id_break(rYG rYG2, rfH_2 rfH_22) {
        double d = rfU_2.id_class(rYG2.id_class(rfH_22), 0.0f, 1.0f);
        double d2 = rfU_2.id_class(rYG2.id_implements(), 0.0f, 1.0f);
        int n = (int)((1.0 - d) * (double)(this.id_super - 1));
        int n2 = (int)((1.0 - (d2 *= d)) * (double)(this.id_this - 1));
        return this.id_class(n, n2);
    }

    private static void id_throws(String string) {
        rrbb_3.id_protected("CustomColors: " + string);
    }

    public int id_throws() {
        return this.id_super;
    }

    public int[] id_catch() {
        Object object;
        if (this.id_final == null) {
            return null;
        }
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < this.id_final.length; ++i) {
            object = this.id_final[i];
            if (((rrMn_1)object).id_class() < 0) continue;
            hashSet.add(((rrMn_1)object).id_class());
        }
        Integer[] integerArray = hashSet.toArray(new Integer[hashSet.size()]);
        object = new int[integerArray.length];
        for (int i = 0; i < integerArray.length; ++i) {
            object[i] = integerArray[i];
        }
        return object;
    }

    public int id_case() {
        return this.id_this;
    }

    private void id_implements() {
        try {
            boolean bl;
            this.id_else = null;
            if (this.id_package == null) {
                return;
            }
            String string = this.id_package + ".png";
            rqO_2 rqO_22 = new rqO_2(string);
            InputStream inputStream = rrbb_3.id_class(rqO_22);
            if (inputStream == null) {
                return;
            }
            BufferedImage bufferedImage = rrzJ_2.id_class(inputStream);
            if (bufferedImage == null) {
                return;
            }
            int n = bufferedImage.getWidth();
            int n2 = bufferedImage.getHeight();
            boolean bl2 = this.id_super < 0 || this.id_super == n;
            boolean bl3 = bl = this.id_this < 0 || this.id_this == n2;
            if (!bl2 || !bl) {
                rrbQ_2.id_protected("Non-standard palette size: " + n + "x" + n2 + ", should be: " + this.id_super + "x" + this.id_this + ", path: " + string);
            }
            this.id_super = n;
            this.id_this = n2;
            if (this.id_super <= 0 || this.id_this <= 0) {
                rrbQ_2.id_throws("Invalid palette size: " + n + "x" + n2 + ", path: " + string);
                return;
            }
            this.id_else = new int[n * n2];
            bufferedImage.getRGB(0, 0, n, n2, this.id_else, 0, n);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public int id_protected() {
        return this.id_volatile == 2 ? 1 : this.id_else.length;
    }

    private static void id_protected(String string) {
        rrbb_3.id_byte("CustomColors: " + string);
    }

    private rrMn_1[] id_private() {
        Object object;
        int n;
        rqO_2 rqO_22 = new rqO_2(this.id_class);
        if (rVL.id_strictfp.id_byte(rqO_22)) {
            xd_3 xd_32 = rVL.id_strictfp.id_class(rqO_22);
            return new rrMn_1[]{new rrMn_1(rrWP.id_class(xd_32))};
        }
        Pattern pattern = Pattern.compile("^block([0-9]+).*$");
        Matcher matcher = pattern.matcher(this.id_class);
        if (matcher.matches() && (n = rrbb_3.id_class((String)(object = matcher.group(1)), -1)) >= 0) {
            return new rrMn_1[]{new rrMn_1(n)};
        }
        object = new rrMz_1("Colormap");
        rrMn_1[] rrMn_1Array = ((rrMz_1)object).id_protected(this.id_class);
        return rrMn_1Array != null ? rrMn_1Array : null;
    }
}

