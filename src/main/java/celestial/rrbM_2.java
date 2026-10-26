/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.fJ_2;
import celestial.fQ_2;
import celestial.fj_3;
import celestial.rCZ;
import celestial.rYG;
import celestial.rqO_2;
import celestial.rrMH;
import celestial.rrMk_1;
import celestial.rrMl_1;
import celestial.rrMn_1;
import celestial.rrMp_1;
import celestial.rrMq_1;
import celestial.rrMz_1;
import celestial.rrWD;
import celestial.rrWP;
import celestial.rrbO_2;
import celestial.rrbb_3;
import celestial.rrxA_2;
import celestial.rrzJ_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;

public class rrbM_2 {
    public String id_class = null;
    public String id_break = null;
    public rrMn_1[] id_byte = null;
    public int[] id_protected = null;
    public String[] id_throws = null;
    public int id_case = 0;
    public String[] id_catch = null;
    public int id_private = 0;
    public int id_implements = 63;
    public rrMk_1[] id_finally = null;
    public rrMq_1 id_extends = null;
    public int id_native = 0;
    public boolean id_volatile = false;
    public int[] id_final = null;
    public int id_package = 0;
    public int id_int = 0;
    public int[] id_new = null;
    public int id_continue = 0;
    public int id_super = 1;
    public boolean id_this = false;
    public rrMH id_else = null;
    public int[] id_synchronized = null;
    public int id_return = 1;
    public fj_3[] id_public = null;
    public fj_3[] id_goto = null;
    public rrMn_1[] id_while = null;
    public String[] id_try = null;
    public fj_3[] id_instanceof = null;
    public int id_throw = -1;
    public xc_3 id_interface = xu_3.id_class.id_continue();
    public HU id_char = null;
    public static final int id_abstract = 0;
    public static final int id_long = 1;
    public static final int id_float = 2;
    public static final int id_void = 3;
    public static final int id_static = 4;
    public static final int id_import = 5;
    public static final int id_short = 6;
    public static final int id_default = 7;
    public static final int id_const = 8;
    public static final int id_strictfp = 9;
    public static final int id_boolean = 10;
    public static final int id_transient = 11;
    public static final int id_for = 12;
    public static final int id_double = 13;
    public static final int id_switch = 14;
    public static final int r = 15;
    public static final int P = 0;
    public static final int B = 1;
    public static final int S = 2;
    public static final int s = 3;
    public static final int E = 4;
    public static final int G = 128;
    public static final int b = 1;
    public static final int M = 2;
    public static final int O = 4;
    public static final int h = 8;
    public static final int X = 16;
    public static final int J = 32;
    public static final int x = 60;
    public static final int d = 63;
    public static final int k = 128;
    public static final int W = 1;
    public static final int z = 2;
    public static final int Q = 6;
    public static final int N = 128;
    public static final String c = "<skip>.png";
    public static final String u = "<default>.png";

    private static String id_byte(String string) {
        int n;
        String string2 = string;
        int n2 = string.lastIndexOf(47);
        if (n2 >= 0) {
            string2 = string.substring(n2 + 1);
        }
        if ((n = string2.lastIndexOf(46)) >= 0) {
            string2 = string2.substring(0, n);
        }
        return string2;
    }

    private int[] id_byte() {
        String string = "block_";
        if (!this.id_class.startsWith(string)) {
            return null;
        }
        String string2 = this.id_class.substring(string.length());
        rqO_2 rqO_22 = new rqO_2(string2);
        xd_3 xd_32 = rrWP.id_class(rqO_22);
        if (xd_32 == null) {
            return null;
        }
        int n = rrWP.id_class(xd_32);
        return new int[]{n};
    }

    private boolean id_int(String string) {
        if (!this.id_return(string)) {
            return false;
        }
        if (this.id_char != null && this.id_char != rrxA_2.id_class) {
            return true;
        }
        rrbb_3.id_protected("Invalid overlay layer: " + this.id_char);
        return false;
    }

    public rrbM_2(Properties properties, String string) {
        rrMz_1 rrMz_12 = new rrMz_1("ConnectedTextures");
        this.id_class = rrMz_12.id_class(string);
        this.id_break = rrMz_12.id_break(string);
        this.id_byte = rrMz_12.id_byte(properties.getProperty("matchBlocks"));
        this.id_protected = rrMz_12.id_private(properties.getProperty("metadata"));
        this.id_throws = this.id_break(properties.getProperty("matchTiles"));
        this.id_case = rrbM_2.id_finally(properties.getProperty("method"));
        this.id_catch = this.id_throws(properties.getProperty("tiles"));
        this.id_private = rrbM_2.id_implements(properties.getProperty("connect"));
        this.id_implements = rrbM_2.id_catch(properties.getProperty("faces"));
        this.id_finally = rrMz_12.id_case(properties.getProperty("biomes"));
        this.id_extends = rrMz_12.id_native(properties.getProperty("heights"));
        if (this.id_extends == null) {
            int n = rrMz_12.id_class(properties.getProperty("minHeight"), -1);
            int n2 = rrMz_12.id_class(properties.getProperty("maxHeight"), 1024);
            if (n != -1 || n2 != 1024) {
                this.id_extends = new rrMq_1(new rrMp_1(n, n2));
            }
        }
        this.id_native = rrMz_12.id_class(properties.getProperty("renderPass"), -1);
        this.id_volatile = rrMz_12.id_class(properties.getProperty("innerSeams"), false);
        this.id_final = this.id_class(properties);
        this.id_package = rrMz_12.id_class(properties.getProperty("width"), -1);
        this.id_int = rrMz_12.id_class(properties.getProperty("height"), -1);
        this.id_new = rrMz_12.id_private(properties.getProperty("weights"));
        this.id_continue = rrMz_12.id_class(properties.getProperty("randomLoops"), 0);
        this.id_super = rrbM_2.id_case(properties.getProperty("symmetry"));
        this.id_this = rrMz_12.id_class(properties.getProperty("linked"), false);
        this.id_else = rrMz_12.id_break("name", properties.getProperty("name"));
        this.id_while = rrMz_12.id_byte(properties.getProperty("connectBlocks"));
        this.id_try = this.id_break(properties.getProperty("connectTiles"));
        this.id_throw = rrMz_12.id_class(properties.getProperty("tintIndex"), -1);
        this.id_interface = rrMz_12.id_class(properties.getProperty("tintBlock"), xu_3.id_class.id_continue());
        this.id_char = rrMz_12.id_class(properties.getProperty("layer"), rrxA_2.id_break);
    }

    public String toString() {
        return "CTM name: " + this.id_class + ", basePath: " + this.id_break + ", matchBlocks: " + rrbb_3.id_class(this.id_byte) + ", matchTiles: " + rrbb_3.id_class(this.id_throws);
    }

    private boolean id_this(String string) {
        if (this.id_catch == null) {
            rrbb_3.id_protected("No tiles defined for vertical: " + string);
            return false;
        }
        if (this.id_catch.length != 4) {
            rrbb_3.id_protected("Invalid tiles, must be exactly 4: " + string);
            return false;
        }
        return true;
    }

    public boolean id_class(int n) {
        return rrMl_1.id_class(n, this.id_byte);
    }

    public boolean id_class(int n, int n2) {
        return rrMl_1.id_class(n, n2, this.id_byte);
    }

    public boolean id_class(fj_3 fj_32) {
        return rrMl_1.id_class(fj_32, this.id_public);
    }

    private int id_class() {
        if (this.id_byte != null) {
            return 1;
        }
        return this.id_throws != null ? 2 : 128;
    }

    private void id_class(fj_3[] fj_3Array, fJ_2 fJ_22) {
        if (fj_3Array != null) {
            for (int i = 0; i < fj_3Array.length; ++i) {
                fj_3 fj_32 = fj_3Array[i];
                if (fj_32 == null) continue;
                rqO_2 rqO_22 = fj_32.id_finally();
                fj_3 fj_33 = fJ_22.id_break(rqO_22);
                if (fj_33 == null || fj_33 instanceof fQ_2) {
                    rrbb_3.id_protected("Missing CTM sprite: " + rqO_22 + ", properties: " + this.id_break);
                }
                fj_3Array[i] = fj_33;
            }
        }
    }

    private int[] id_class(Properties properties) {
        if (this.id_catch == null) {
            return null;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (Object object : properties.keySet()) {
            String string;
            String string2;
            if (!(object instanceof String) || !(string2 = (String)object).startsWith(string = "ctm.")) continue;
            String string3 = string2.substring(string.length());
            String string4 = properties.getProperty(string2);
            if (string4 == null) continue;
            string4 = string4.trim();
            int n = rrbb_3.id_class(string3, -1);
            if (n >= 0 && n <= 46) {
                int n2 = rrbb_3.id_class(string4, -1);
                if (n2 >= 0 && n2 < this.id_catch.length) {
                    hashMap.put(n, n2);
                    continue;
                }
                rrbb_3.id_protected("Invalid CTM tile index: " + string4);
                continue;
            }
            rrbb_3.id_protected("Invalid CTM index: " + string3);
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        Object object = new int[47];
        for (int i = 0; i < ((Object)object).length; ++i) {
            object[i] = -1;
            if (!hashMap.containsKey(i)) continue;
            object[i] = (Integer)hashMap.get(i);
        }
        return object;
    }

    private static fj_3[] id_class(String[] stringArray, fJ_2 fJ_22, boolean bl, boolean bl2) {
        if (stringArray == null) {
            return null;
        }
        ArrayList<fj_3> arrayList = new ArrayList<fj_3>();
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            rqO_2 rqO_22 = new rqO_2(string);
            String string2 = rqO_22.id_byte();
            Object object = rqO_22.id_break();
            if (!((String)object).contains("/")) {
                object = "textures/block/" + (String)object;
            }
            String string3 = (String)object + ".png";
            if (bl && string3.endsWith(c)) {
                arrayList.add(null);
                continue;
            }
            if (bl2 && string3.endsWith(u)) {
                arrayList.add(rrbO_2.id_finally);
                continue;
            }
            rqO_2 rqO_23 = new rqO_2(string2, string3);
            boolean bl3 = rrbb_3.id_byte(rqO_23);
            if (!bl3) {
                rrbb_3.id_protected("File not found: " + string3);
            }
            String string4 = "textures/";
            Object object2 = object;
            if (((String)object).startsWith(string4)) {
                object2 = ((String)object).substring(string4.length());
            }
            rqO_2 rqO_24 = new rqO_2(string2, (String)object2);
            fj_3 fj_32 = fJ_22.id_throws(rqO_24);
            arrayList.add(fj_32);
        }
        return arrayList.toArray(new fj_3[arrayList.size()]);
    }

    public void id_class(fJ_2 fJ_22) {
        if (this.id_throws != null) {
            this.id_public = rrbM_2.id_class(this.id_throws, fJ_22, false, false);
        }
        if (this.id_try != null) {
            this.id_instanceof = rrbM_2.id_class(this.id_try, fJ_22, false, false);
        }
        if (this.id_catch != null) {
            this.id_goto = rrbM_2.id_class(this.id_catch, fJ_22, true, !rrbM_2.id_break(this.id_case));
        }
    }

    public boolean id_class(rYG rYG2) {
        return rrMl_1.id_class(rYG2, this.id_finally);
    }

    public static rCZ id_class(String string, Collection collection) {
        for (rCZ rCZ2 : collection) {
            if (!string.equals(rCZ2.id_throws())) continue;
            return rCZ2;
        }
        return null;
    }

    public boolean id_class(String string) {
        if (this.id_class != null && this.id_class.length() > 0) {
            if (this.id_break == null) {
                rrbb_3.id_protected("No base path found: " + string);
                return false;
            }
            if (this.id_byte == null) {
                this.id_byte = this.id_break();
            }
            if (this.id_throws == null && this.id_byte == null) {
                this.id_throws = this.id_protected();
            }
            if (this.id_byte == null && this.id_throws == null) {
                rrbb_3.id_protected("No matchBlocks or matchTiles specified: " + string);
                return false;
            }
            if (this.id_protected != null) {
                rrbb_3.id_protected("Metadata is not supported: " + rrbb_3.id_class(this.id_protected));
                return false;
            }
            if (this.id_case == 0) {
                rrbb_3.id_protected("No method: " + string);
                return false;
            }
            if (this.id_catch != null && this.id_catch.length > 0) {
                if (this.id_private == 0) {
                    this.id_private = this.id_class();
                }
                if (this.id_private == 128) {
                    rrbb_3.id_protected("Invalid connect in: " + string);
                    return false;
                }
                if (this.id_native > 0) {
                    rrbb_3.id_protected("Render pass not supported: " + this.id_native);
                    return false;
                }
                if ((this.id_implements & 0x80) != 0) {
                    rrbb_3.id_protected("Invalid faces in: " + string);
                    return false;
                }
                if ((this.id_super & 0x80) != 0) {
                    rrbb_3.id_protected("Invalid symmetry in: " + string);
                    return false;
                }
                switch (this.id_case) {
                    case 1: {
                        return this.id_native(string);
                    }
                    case 2: {
                        return this.id_super(string);
                    }
                    case 3: {
                        return this.id_while(string);
                    }
                    case 4: {
                        return this.id_return(string);
                    }
                    case 5: {
                        return this.id_public(string);
                    }
                    case 6: {
                        return this.id_this(string);
                    }
                    case 7: {
                        return this.id_goto(string);
                    }
                    case 8: {
                        return this.id_else(string);
                    }
                    case 9: {
                        return this.id_synchronized(string);
                    }
                    case 10: {
                        return this.id_volatile(string);
                    }
                    case 11: {
                        return this.id_final(string);
                    }
                    case 12: {
                        return this.id_package(string);
                    }
                    case 13: {
                        return this.id_int(string);
                    }
                    case 14: {
                        return this.id_new(string);
                    }
                    case 15: {
                        return this.id_continue(string);
                    }
                }
                rrbb_3.id_protected("Unknown method: " + string);
                return false;
            }
            rrbb_3.id_protected("No tiles specified: " + string);
            return false;
        }
        rrbb_3.id_protected("No name found: " + string);
        return false;
    }

    private static int id_class(int[] nArray, int n) {
        if (nArray == null) {
            return n;
        }
        for (int i = 0; i < nArray.length; ++i) {
            int n2 = nArray[i];
            if (n2 <= n) continue;
            n = n2;
        }
        return n;
    }

    public void id_break(fJ_2 fJ_22) {
        this.id_class(this.id_public, fJ_22);
        this.id_class(this.id_instanceof, fJ_22);
        this.id_class(this.id_goto, fJ_22);
    }

    private static boolean id_break(int n) {
        switch (n) {
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return true;
            }
        }
        return false;
    }

    private String[] id_break(String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = rrbb_3.id_class(string, " ");
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            if (string2.endsWith(".png")) {
                string2 = string2.substring(0, string2.length() - 4);
            }
            stringArray[i] = string2 = rrzJ_2.id_class(string2, this.id_break);
        }
        return stringArray;
    }

    private rrMn_1[] id_break() {
        int[] nArray = this.id_byte();
        if (nArray == null) {
            return null;
        }
        rrMn_1[] rrMn_1Array = new rrMn_1[nArray.length];
        for (int i = 0; i < rrMn_1Array.length; ++i) {
            rrMn_1Array[i] = new rrMn_1(nArray[i]);
        }
        return rrMn_1Array;
    }

    private String[] id_throws(String string) {
        Object object;
        if (string == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray = rrbb_3.id_class(string, " ,");
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            if (string2.contains("-") && ((String[])(object = rrbb_3.id_class(string2, "-"))).length == 2) {
                int n = rrbb_3.id_class(object[0], -1);
                int n2 = rrbb_3.id_class(object[1], -1);
                if (n >= 0 && n2 >= 0) {
                    if (n > n2) {
                        rrbb_3.id_protected("Invalid interval: " + string2 + ", when parsing: " + string);
                        continue;
                    }
                    for (int j = n; j <= n2; ++j) {
                        arrayList.add(String.valueOf(j));
                    }
                    continue;
                }
            }
            arrayList.add(string2);
        }
        String[] stringArray2 = arrayList.toArray(new String[arrayList.size()]);
        for (int i = 0; i < stringArray2.length; ++i) {
            object = stringArray2[i];
            if (!(((String)(object = rrzJ_2.id_class((String)object, this.id_break))).startsWith(this.id_break) || ((String)object).startsWith("textures/") || ((String)object).startsWith("optifine/"))) {
                object = this.id_break + "/" + (String)object;
            }
            if (((String)object).endsWith(".png")) {
                object = ((String)object).substring(0, ((String)object).length() - 4);
            }
            if (((String)object).startsWith("/")) {
                object = ((String)object).substring(1);
            }
            stringArray2[i] = object;
        }
        return stringArray2;
    }

    private static int id_finally(String string) {
        if (string == null) {
            return 1;
        }
        if (!(string = string.trim()).equals("ctm") && !string.equals("glass")) {
            if (string.equals("ctm_compact")) {
                return 10;
            }
            if (!string.equals("horizontal") && !string.equals("bookshelf")) {
                if (string.equals("vertical")) {
                    return 6;
                }
                if (string.equals("top")) {
                    return 3;
                }
                if (string.equals("random")) {
                    return 4;
                }
                if (string.equals("repeat")) {
                    return 5;
                }
                if (string.equals("fixed")) {
                    return 7;
                }
                if (!string.equals("horizontal+vertical") && !string.equals("h+v")) {
                    if (!string.equals("vertical+horizontal") && !string.equals("v+h")) {
                        if (string.equals("overlay")) {
                            return 11;
                        }
                        if (string.equals("overlay_fixed")) {
                            return 12;
                        }
                        if (string.equals("overlay_random")) {
                            return 13;
                        }
                        if (string.equals("overlay_repeat")) {
                            return 14;
                        }
                        if (string.equals("overlay_ctm")) {
                            return 15;
                        }
                        rrbb_3.id_protected("Unknown method: " + string);
                        return 0;
                    }
                    return 9;
                }
                return 8;
            }
            return 2;
        }
        return 1;
    }

    private static int id_catch(String string) {
        if (string == null) {
            return 63;
        }
        String[] stringArray = rrbb_3.id_class(string, " ,");
        int n = 0;
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            int n2 = rrbM_2.id_private(string2);
            n |= n2;
        }
        return n;
    }

    private static fj_3 id_extends(String string) {
        fJ_2 fJ_22 = rrbb_3.rF();
        fj_3 fj_32 = fJ_22.id_class(string);
        return fj_32 != null ? fj_32 : fJ_22.id_class("block/" + string);
    }

    private boolean id_goto(String string) {
        if (this.id_catch == null) {
            rrbb_3.id_protected("Tiles not defined: " + string);
            return false;
        }
        if (this.id_catch.length != 1) {
            rrbb_3.id_protected("Number of tiles should be 1 for method: fixed.");
            return false;
        }
        return true;
    }

    private static int id_case(String string) {
        if (string == null) {
            return 1;
        }
        if ((string = string.trim()).equals("opposite")) {
            return 2;
        }
        if (string.equals("all")) {
            return 6;
        }
        rrbb_3.id_protected("Unknown symmetry: " + string);
        return 1;
    }

    private boolean id_continue(String string) {
        if (!this.id_native(string)) {
            return false;
        }
        if (this.id_char != null && this.id_char != rrxA_2.id_class) {
            return true;
        }
        rrbb_3.id_protected("Invalid overlay layer: " + this.id_char);
        return false;
    }

    private boolean id_else(String string) {
        if (this.id_catch == null) {
            rrbb_3.id_protected("No tiles defined for horizontal+vertical: " + string);
            return false;
        }
        if (this.id_catch.length != 7) {
            rrbb_3.id_protected("Invalid tiles, must be exactly 7: " + string);
            return false;
        }
        return true;
    }

    private static int id_implements(String string) {
        if (string == null) {
            return 0;
        }
        if ((string = string.trim()).equals("block")) {
            return 1;
        }
        if (string.equals("tile")) {
            return 2;
        }
        if (string.equals("material")) {
            return 3;
        }
        if (string.equals("state")) {
            return 4;
        }
        rrbb_3.id_protected("Unknown connect: " + string);
        return 128;
    }

    private boolean id_new(String string) {
        if (!this.id_public(string)) {
            return false;
        }
        if (this.id_char != null && this.id_char != rrxA_2.id_class) {
            return true;
        }
        rrbb_3.id_protected("Invalid overlay layer: " + this.id_char);
        return false;
    }

    private boolean id_package(String string) {
        if (!this.id_goto(string)) {
            return false;
        }
        if (this.id_char != null && this.id_char != rrxA_2.id_class) {
            return true;
        }
        rrbb_3.id_protected("Invalid overlay layer: " + this.id_char);
        return false;
    }

    private boolean id_return(String string) {
        if (this.id_catch != null && this.id_catch.length > 0) {
            if (this.id_new != null) {
                int n;
                int[] nArray;
                if (this.id_new.length > this.id_catch.length) {
                    rrbb_3.id_protected("More weights defined than tiles, trimming weights: " + string);
                    nArray = new int[this.id_catch.length];
                    System.arraycopy(this.id_new, 0, nArray, 0, nArray.length);
                    this.id_new = nArray;
                }
                if (this.id_new.length < this.id_catch.length) {
                    rrbb_3.id_protected("Less weights defined than tiles, expanding weights: " + string);
                    nArray = new int[this.id_catch.length];
                    System.arraycopy(this.id_new, 0, nArray, 0, this.id_new.length);
                    n = rrWD.id_class(this.id_new);
                    for (int i = this.id_new.length; i < nArray.length; ++i) {
                        nArray[i] = n;
                    }
                    this.id_new = nArray;
                }
                this.id_synchronized = new int[this.id_new.length];
                int n2 = 0;
                for (n = 0; n < this.id_new.length; ++n) {
                    this.id_synchronized[n] = n2 += this.id_new[n];
                }
                this.id_return = n2;
                if (this.id_return <= 0) {
                    rrbb_3.id_protected("Invalid sum of all weights: " + n2);
                    this.id_return = 1;
                }
            }
            if (this.id_continue >= 0 && this.id_continue <= 9) {
                return true;
            }
            rrbb_3.id_protected("Invalid randomLoops: " + this.id_continue);
            return false;
        }
        rrbb_3.id_protected("Tiles not defined: " + string);
        return false;
    }

    private boolean id_super(String string) {
        if (this.id_catch == null) {
            this.id_catch = this.id_throws("12-15");
        }
        if (this.id_catch.length != 4) {
            rrbb_3.id_protected("Invalid tiles, must be exactly 4: " + string);
            return false;
        }
        return true;
    }

    private boolean id_while(String string) {
        if (this.id_catch == null) {
            this.id_catch = this.id_throws("66");
        }
        if (this.id_catch.length != 1) {
            rrbb_3.id_protected("Invalid tiles, must be exactly 1: " + string);
            return false;
        }
        return true;
    }

    private boolean id_public(String string) {
        if (this.id_catch == null) {
            rrbb_3.id_protected("Tiles not defined: " + string);
            return false;
        }
        if (this.id_package <= 0) {
            rrbb_3.id_protected("Invalid width: " + string);
            return false;
        }
        if (this.id_int <= 0) {
            rrbb_3.id_protected("Invalid height: " + string);
            return false;
        }
        if (this.id_catch.length != this.id_package * this.id_int) {
            rrbb_3.id_protected("Number of tiles does not equal width x height: " + string);
            return false;
        }
        return true;
    }

    private String[] id_protected() {
        String[] stringArray;
        fj_3 fj_32 = rrbM_2.id_extends(this.id_class);
        if (fj_32 == null) {
            stringArray = null;
        } else {
            String[] stringArray2 = new String[1];
            stringArray = stringArray2;
            stringArray2[0] = this.id_class;
        }
        return stringArray;
    }

    private static String id_protected(String string) {
        int n = string.lastIndexOf(47);
        return n < 0 ? "" : string.substring(0, n);
    }

    private static int id_private(String string) {
        if (!(string = string.toLowerCase()).equals("bottom") && !string.equals("down")) {
            if (!string.equals("top") && !string.equals("up")) {
                if (string.equals("north")) {
                    return 4;
                }
                if (string.equals("south")) {
                    return 8;
                }
                if (string.equals("east")) {
                    return 32;
                }
                if (string.equals("west")) {
                    return 16;
                }
                if (string.equals("sides")) {
                    return 60;
                }
                if (string.equals("all")) {
                    return 63;
                }
                rrbb_3.id_protected("Unknown face: " + string);
                return 128;
            }
            return 2;
        }
        return 1;
    }

    private boolean id_final(String string) {
        if (this.id_catch == null) {
            this.id_catch = this.id_throws("0-16");
        }
        if (this.id_catch.length < 17) {
            rrbb_3.id_protected("Invalid tiles, must be at least 17: " + string);
            return false;
        }
        if (this.id_char != null && this.id_char != rrxA_2.id_class) {
            return true;
        }
        rrbb_3.id_protected("Invalid overlay layer: " + this.id_char);
        return false;
    }

    private boolean id_volatile(String string) {
        if (this.id_catch == null) {
            this.id_catch = this.id_throws("0-4");
        }
        if (this.id_catch.length < 5) {
            rrbb_3.id_protected("Invalid tiles, must be at least 5: " + string);
            return false;
        }
        return true;
    }

    private boolean id_synchronized(String string) {
        if (this.id_catch == null) {
            rrbb_3.id_protected("No tiles defined for vertical+horizontal: " + string);
            return false;
        }
        if (this.id_catch.length != 7) {
            rrbb_3.id_protected("Invalid tiles, must be exactly 7: " + string);
            return false;
        }
        return true;
    }

    private boolean id_native(String string) {
        if (this.id_catch == null) {
            this.id_catch = this.id_throws("0-11 16-27 32-43 48-58");
        }
        if (this.id_catch.length < 47) {
            rrbb_3.id_protected("Invalid tiles, must be at least 47: " + string);
            return false;
        }
        return true;
    }
}

