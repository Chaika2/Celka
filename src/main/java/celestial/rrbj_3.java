/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MT;
import celestial.Ml_1;
import celestial.QY;
import celestial.an_3;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rYB;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rrMk_1;
import celestial.rrMl_1;
import celestial.rrMq_1;
import celestial.rrMz_1;
import celestial.rrbb_3;
import celestial.rrxh_3;
import celestial.rrzJ_2;
import celestial.rrzO_2;
import celestial.rrzP_2;
import celestial.yb_3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class rrbj_3 {
    public String id_class = null;
    private int id_case = -1;
    private int id_catch = -1;
    private int id_private = -1;
    private int id_implements = -1;
    private int id_finally = 1;
    private boolean id_extends = false;
    private float id_native = 1.0f;
    private float[] id_volatile = id_throws;
    private rrMq_1 id_final = null;
    private int id_package = 8;
    private boolean id_int = true;
    private boolean id_new = false;
    private boolean id_continue = false;
    public rrMk_1[] id_break = null;
    public rrMq_1 id_byte = null;
    private float id_super = 1.0f;
    private rrzO_2 id_this = null;
    public int id_protected = -1;
    private rYB id_else = null;
    public static final float[] id_throws = new float[]{1.0f, 0.0f, 0.0f};
    private static final String id_synchronized = "clear";
    private static final String id_return = "rain";
    private static final String id_public = "thunder";

    private int id_byte(String string) {
        if (string == null) {
            return -1;
        }
        String[] stringArray = rrbb_3.id_class(string, ":");
        if (stringArray.length != 2) {
            rrbb_3.id_protected("Invalid time: " + string);
            return -1;
        }
        String string2 = stringArray[0];
        String string3 = stringArray[1];
        int n = rrbb_3.id_class(string2, -1);
        int n2 = rrbb_3.id_class(string3, -1);
        if (n >= 0 && n <= 23 && n2 >= 0 && n2 <= 59) {
            if ((n -= 6) < 0) {
                n += 24;
            }
            return n * 1000 + (int)((double)n2 / 60.0 * 1000.0);
        }
        rrbb_3.id_protected("Invalid time: " + string);
        return -1;
    }

    public rrbj_3(Properties properties, String string) {
        rrMz_1 rrMz_12 = new rrMz_1("CustomSky");
        this.id_class = properties.getProperty("source", string);
        this.id_case = this.id_byte(properties.getProperty("startFadeIn"));
        this.id_catch = this.id_byte(properties.getProperty("endFadeIn"));
        this.id_private = this.id_byte(properties.getProperty("startFadeOut"));
        this.id_implements = this.id_byte(properties.getProperty("endFadeOut"));
        this.id_finally = rrxh_3.id_class(properties.getProperty("blend"));
        this.id_extends = this.id_class(properties.getProperty("rotate"), true);
        this.id_native = this.id_class(properties.getProperty("speed"), 1.0f);
        this.id_volatile = this.id_class(properties.getProperty("axis"), id_throws);
        this.id_final = rrMz_12.id_native(properties.getProperty("days"));
        this.id_package = rrMz_12.id_class(properties.getProperty("daysLoop"), 8);
        List<String> list = this.id_break(properties.getProperty("weather", id_synchronized));
        this.id_int = list.contains(id_synchronized);
        this.id_new = list.contains(id_return);
        this.id_continue = list.contains(id_public);
        this.id_break = rrMz_12.id_case(properties.getProperty("biomes"));
        this.id_byte = rrMz_12.id_native(properties.getProperty("heights"));
        this.id_super = this.id_class(properties.getProperty("transition"), 1.0f);
    }

    public String toString() {
        return this.id_class + ", " + this.id_case + "-" + this.id_catch + " " + this.id_private + "-" + this.id_implements;
    }

    private void id_class(yb_3 yb_32, int n) {
        lD_2 lD_22 = yb_32.id_byte();
        float f = (float)(n % 3) / 3.0f;
        float f2 = (float)(n / 3) / 2.0f;
        lD_22.id_class(7, ju_3.id_synchronized);
        lD_22.id_class(-100.0, -100.0, -100.0).id_class(f, f2).id_class();
        lD_22.id_class(-100.0, -100.0, 100.0).id_class(f, f2 + 0.5f).id_class();
        lD_22.id_class(100.0, -100.0, 100.0).id_class(f + 0.33333334f, f2 + 0.5f).id_class();
        lD_22.id_class(100.0, -100.0, -100.0).id_class(f + 0.33333334f, f2).id_class();
        yb_32.id_break();
    }

    private float id_class(float f, float f2) {
        float f3 = 1.0f - f;
        float f4 = f - f2;
        float f5 = 0.0f;
        if (this.id_int) {
            f5 += f3;
        }
        if (this.id_new) {
            f5 += f4;
        }
        if (this.id_continue) {
            f5 += f2;
        }
        return rrzP_2.id_class(f5, 0.0f, 1.0f);
    }

    private float id_class(rYB rYB2) {
        if (this.id_break == null && this.id_byte == null) {
            return 1.0f;
        }
        float f = this.id_break(rYB2);
        if (this.id_this == null) {
            this.id_this = new rrzO_2(f, this.id_super);
        }
        return this.id_this.id_class(f);
    }

    public boolean id_class(rYB rYB2, int n) {
        if (rYB2 != this.id_else) {
            this.id_else = rYB2;
            this.id_this = null;
        }
        if (this.id_class(n, this.id_implements, this.id_case)) {
            return false;
        }
        if (this.id_final != null) {
            long l;
            long l2 = rYB2.P();
            for (l = l2 - (long)this.id_case; l < 0L; l += (long)(24000 * this.id_package)) {
            }
            int n2 = (int)(l / 24000L);
            int n3 = n2 % this.id_package;
            if (!this.id_final.id_class(n3)) {
                return false;
            }
        }
        return true;
    }

    private boolean id_class(int n, int n2, int n3) {
        if (n2 <= n3) {
            return n >= n2 && n <= n3;
        }
        return n >= n2 || n <= n3;
    }

    private float[] id_class(String string, float[] fArray) {
        if (string == null) {
            return fArray;
        }
        String[] stringArray = rrbb_3.id_class(string, " ");
        if (stringArray.length != 3) {
            rrbb_3.id_protected("Invalid axis: " + string);
            return fArray;
        }
        float[] fArray2 = new float[3];
        for (int i = 0; i < stringArray.length; ++i) {
            fArray2[i] = rrbb_3.id_class(stringArray[i], Float.MIN_VALUE);
            if (fArray2[i] != Float.MIN_VALUE) continue;
            rrbb_3.id_protected("Invalid axis: " + string);
            return fArray;
        }
        float f = fArray2[0];
        float f2 = fArray2[1];
        float f3 = fArray2[2];
        if (f * f + f2 * f2 + f3 * f3 < 1.0E-5f) {
            rrbb_3.id_protected("Invalid axis values: " + string);
            return fArray;
        }
        return new float[]{f3, f2, -f};
    }

    private boolean id_class(String string, boolean bl) {
        if (string == null) {
            return bl;
        }
        if (string.toLowerCase().equals("true")) {
            return true;
        }
        if (string.toLowerCase().equals("false")) {
            return false;
        }
        rrbb_3.id_protected("Unknown boolean: " + string);
        return bl;
    }

    private float id_class(String string, float f) {
        if (string == null) {
            return f;
        }
        float f2 = rrbb_3.id_class(string, Float.MIN_VALUE);
        if (f2 == Float.MIN_VALUE) {
            rrbb_3.id_protected("Invalid value: " + string);
            return f;
        }
        return f2;
    }

    public boolean id_class(String string) {
        if (this.id_class == null) {
            rrbb_3.id_protected("No source texture: " + string);
            return false;
        }
        this.id_class = rrzJ_2.id_class(this.id_class, rrzJ_2.id_class(string));
        if (this.id_case >= 0 && this.id_catch >= 0 && this.id_implements >= 0) {
            int n;
            int n2;
            int n3;
            int n4;
            int n5 = this.id_class(this.id_catch - this.id_case);
            if (this.id_private < 0) {
                this.id_private = this.id_class(this.id_implements - n5);
                if (this.id_class(this.id_private, this.id_case, this.id_catch)) {
                    this.id_private = this.id_catch;
                }
            }
            if ((n4 = n5 + (n3 = this.id_class(this.id_private - this.id_catch)) + (n2 = this.id_class(this.id_implements - this.id_private)) + (n = this.id_class(this.id_case - this.id_implements))) != 24000) {
                rrbb_3.id_protected("Invalid fadeIn/fadeOut times, sum is not 24h: " + n4);
                return false;
            }
            if (this.id_native < 0.0f) {
                rrbb_3.id_protected("Invalid speed: " + this.id_native);
                return false;
            }
            if (this.id_package <= 0) {
                rrbb_3.id_protected("Invalid daysLoop: " + this.id_package);
                return false;
            }
            return true;
        }
        rrbb_3.id_protected("Invalid times, required are: startFadeIn, endFadeIn and endFadeOut.");
        return false;
    }

    public void id_class(rYB rYB2, Ml_1 ml_1, int n, float f, float f2, float f3) {
        float f4 = this.id_class(rYB2);
        float f5 = this.id_class(f2, f3);
        float f6 = this.id_break(n);
        float f7 = f4 * f5 * f6;
        if (!((f7 = rrbb_3.id_class(f7, 0.0f, 1.0f)) < 1.0E-4f)) {
            MT.id_super(this.id_protected);
            rrxh_3.id_class(this.id_finally, f7);
            MT.id_transient();
            MT.id_class(ml_1.id_byte().id_class());
            if (this.id_extends) {
                float f8 = 0.0f;
                if (this.id_native != (float)Math.round(this.id_native)) {
                    long l = (rYB2.P() + 18000L) / 24000L;
                    double d = this.id_native % 1.0f;
                    double d2 = (double)l * d;
                    f8 = (float)(d2 % 1.0);
                }
                MT.id_byte(360.0f * (f8 + f * this.id_native), this.id_volatile[0], this.id_volatile[1], this.id_volatile[2]);
            }
            yb_3 yb_32 = yb_3.id_class();
            MT.id_byte(90.0f, 1.0f, 0.0f, 0.0f);
            MT.id_byte(-90.0f, 0.0f, 0.0f, 1.0f);
            this.id_class(yb_32, 4);
            MT.id_transient();
            MT.id_byte(90.0f, 1.0f, 0.0f, 0.0f);
            this.id_class(yb_32, 1);
            MT.id_for();
            MT.id_transient();
            MT.id_byte(-90.0f, 1.0f, 0.0f, 0.0f);
            this.id_class(yb_32, 0);
            MT.id_for();
            MT.id_byte(90.0f, 0.0f, 0.0f, 1.0f);
            this.id_class(yb_32, 5);
            MT.id_byte(90.0f, 0.0f, 0.0f, 1.0f);
            this.id_class(yb_32, 2);
            MT.id_byte(90.0f, 0.0f, 0.0f, 1.0f);
            this.id_class(yb_32, 3);
            MT.id_for();
        }
    }

    private int id_class(int n) {
        while (n >= 24000) {
            n -= 24000;
        }
        while (n < 0) {
            n += 24000;
        }
        return n;
    }

    private float id_break(rYB rYB2) {
        an_3 an_32 = QY.id_instanceof().id_catch();
        if (an_32 == null) {
            return 0.0f;
        }
        rfH_2 rfH_22 = an_32.Bs();
        if (this.id_break != null) {
            rYG rYG2 = rYB2.id_implements(rfH_22);
            if (rYG2 == null) {
                return 0.0f;
            }
            if (!rrMl_1.id_class(rYG2, this.id_break)) {
                return 0.0f;
            }
        }
        return this.id_byte != null && !this.id_byte.id_class(rfH_22.c_()) ? 0.0f : 1.0f;
    }

    private List<String> id_break(String string) {
        List<String> list = Arrays.asList(id_synchronized, id_return, id_public);
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray = rrbb_3.id_class(string, " ");
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            if (!list.contains(string2)) {
                rrbb_3.id_protected("Unknown weather: " + string2);
                continue;
            }
            arrayList.add(string2);
        }
        return arrayList;
    }

    private float id_break(int n) {
        if (this.id_class(n, this.id_case, this.id_catch)) {
            int n2 = this.id_class(this.id_catch - this.id_case);
            int n3 = this.id_class(n - this.id_case);
            return (float)n3 / (float)n2;
        }
        if (this.id_class(n, this.id_catch, this.id_private)) {
            return 1.0f;
        }
        if (this.id_class(n, this.id_private, this.id_implements)) {
            int n4 = this.id_class(this.id_implements - this.id_private);
            int n5 = this.id_class(n - this.id_private);
            return 1.0f - (float)n5 / (float)n4;
        }
        return 0.0f;
    }
}

