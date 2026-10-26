/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package celestial;

import celestial.IC;
import celestial.IF;
import celestial.IG;
import celestial.II;
import celestial.IJ;
import celestial.IN;
import celestial.IS;
import celestial.IY;
import celestial.If_1;
import celestial.Ig_1;
import celestial.Ih_1;
import celestial.Ip_1;
import celestial.MT;
import celestial.QY;
import celestial.fJ_2;
import celestial.fQ_2;
import celestial.fY_2;
import celestial.ff_3;
import celestial.fj_3;
import celestial.rVL;
import celestial.rXQ;
import celestial.rdb_3;
import celestial.rdy_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rrMF;
import celestial.rrMH;
import celestial.rrMp_1;
import celestial.rrMq_1;
import celestial.rrMy_1;
import celestial.rrbb_3;
import celestial.rrxh_3;
import celestial.rrzJ_2;
import celestial.rrzX_2;
import celestial.rxE_2;
import celestial.rxS_2;
import celestial.wK_2;
import celestial.we_3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import org.lwjgl.opengl.GL11;

public class rrbH_2 {
    public String id_class = null;
    public String id_break = null;
    public int id_byte = 1;
    public int[] id_protected = null;
    public String id_throws = null;
    public Map<String, String> id_case = null;
    public String id_catch = null;
    public Map<String, String> id_private = null;
    public rrMq_1 id_implements = null;
    public boolean id_finally = false;
    public int id_extends = 0;
    public rrMq_1 id_native = null;
    public int[] id_volatile = null;
    public rrMq_1 id_final = null;
    public rrMH[] id_package = null;
    public int id_int = 0;
    public int id_new = 1;
    public float id_continue = 0.0f;
    public float id_super = 0.0f;
    public int id_this = 0;
    public float id_else = 1.0f;
    public int id_synchronized = 0;
    public rqO_2 id_return = null;
    public Map id_public = null;
    public fj_3 id_goto = null;
    public Map id_while = null;
    public IJ id_try = null;
    public Map<String, IJ> id_instanceof = null;
    public IJ id_throw = null;
    public Map<String, IJ> id_interface = null;
    private int id_const = 0;
    private int id_strictfp = 0;
    public static final int id_char = 0;
    public static final int id_abstract = 1;
    public static final int id_long = 2;
    public static final int id_float = 3;
    public static final int id_void = 4;
    public static final int id_static = 0;
    public static final int id_import = 1;
    public static final int id_short = 2;
    public static final String id_default = "inventory";

    private static String id_byte(String object, String string) {
        String string2;
        boolean bl;
        boolean bl2 = bl = ((String)(object = rrzJ_2.id_class((String)object, string))).startsWith("block/") || ((String)object).startsWith("item/");
        if (!(((String)object).startsWith(string) || bl || ((String)object).startsWith("optifine/"))) {
            object = string + "/" + (String)object;
        }
        if (((String)object).endsWith(string2 = ".json")) {
            object = ((String)object).substring(0, ((String)object).length() - string2.length());
        }
        if (((String)object).startsWith("/")) {
            object = ((String)object).substring(1);
        }
        return object;
    }

    private boolean id_byte() {
        return true;
    }

    private static Map id_byte(Properties properties, String string) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        for (String string2 : properties.keySet()) {
            String string3 = properties.getProperty(string2);
            if (!string2.startsWith(string)) continue;
            linkedHashMap.put(string2, string3);
        }
        return linkedHashMap;
    }

    private static String id_byte(String string) {
        int n = string.lastIndexOf(47);
        return n < 0 ? "" : string.substring(0, n);
    }

    public rrbH_2(Properties properties, String string) {
        this.id_class = rrbH_2.id_break(string);
        this.id_break = rrbH_2.id_byte(string);
        this.id_byte = this.id_protected(properties.getProperty("type"));
        this.id_protected = this.id_class(properties.getProperty("items"), properties.getProperty("matchItems"));
        this.id_private = rrbH_2.id_break(properties, this.id_break);
        this.id_catch = rrbH_2.id_class(properties.getProperty("model"), string, this.id_break, this.id_byte, this.id_private);
        this.id_case = rrbH_2.id_class(properties, this.id_break);
        boolean bl = this.id_private == null && this.id_catch == null;
        this.id_throws = rrbH_2.id_class(properties.getProperty("texture"), properties.getProperty("tile"), properties.getProperty("source"), string, this.id_break, this.id_byte, this.id_case, bl);
        String string2 = properties.getProperty("damage");
        if (string2 != null) {
            this.id_finally = string2.contains("%");
            string2 = string2.replace("%", "");
            this.id_implements = this.id_case(string2);
            this.id_extends = this.id_class(properties.getProperty("damageMask"), 0);
        }
        this.id_native = this.id_case(properties.getProperty("stackSize"));
        this.id_volatile = this.id_class(rrbH_2.id_class(properties, "enchantmentIDs", "enchantments"), new rrMy_1());
        this.id_final = this.id_case(properties.getProperty("enchantmentLevels"));
        this.id_package = this.id_class(properties);
        this.id_int = this.id_private(properties.getProperty("hand"));
        this.id_new = rrxh_3.id_class(properties.getProperty("blend"));
        this.id_continue = this.id_class(properties.getProperty("speed"), 0.0f);
        this.id_super = this.id_class(properties.getProperty("rotation"), 0.0f);
        this.id_this = this.id_class(properties.getProperty("layer"), 0);
        this.id_synchronized = this.id_class(properties.getProperty("weight"), 0);
        this.id_else = this.id_class(properties.getProperty("duration"), 1.0f);
    }

    public String toString() {
        return this.id_break + "/" + this.id_class + ", type: " + this.id_byte + ", items: [" + rrbb_3.id_class(this.id_protected) + "], textture: " + this.id_throws;
    }

    public boolean id_class(String string) {
        if (this.id_class != null && this.id_class.length() > 0) {
            if (this.id_break == null) {
                rrbb_3.id_protected("No base path found: " + string);
                return false;
            }
            if (this.id_byte == 0) {
                rrbb_3.id_protected("No type defined: " + string);
                return false;
            }
            if (this.id_byte == 4 && this.id_protected == null) {
                this.id_protected = new int[]{rdb_3.id_class(rdy_3.kc)};
            }
            if (this.id_byte == 1 || this.id_byte == 3 || this.id_byte == 4) {
                if (this.id_protected == null) {
                    this.id_protected = this.id_break();
                }
                if (this.id_protected == null) {
                    rrbb_3.id_protected("No items defined: " + string);
                    return false;
                }
            }
            if (this.id_throws == null && this.id_case == null && this.id_catch == null && this.id_private == null) {
                rrbb_3.id_protected("No texture or model specified: " + string);
                return false;
            }
            if (this.id_byte == 2 && this.id_volatile == null) {
                rrbb_3.id_protected("No enchantmentIDs specified: " + string);
                return false;
            }
            return true;
        }
        rrbb_3.id_protected("No name found: " + string);
        return false;
    }

    public static fj_3 id_class(Ig_1 ig_1) {
        fJ_2 fJ_22 = QY.id_instanceof().id_extends().id_class(ig_1.id_class());
        return fJ_22.id_break(ig_1.id_break());
    }

    private static wK_2 id_class(IS iS, IG iG, fj_3 fj_32, rpr_3 rpr_32, If_1 if_1) {
        Ih_1 ih_1 = new Ih_1();
        return ih_1.id_class(iS.id_class, iS.id_break, iG, fj_32, rpr_32, if_1, iS.id_protected, iS.id_throws, fj_32.id_finally());
    }

    private static IJ id_class(fJ_2 fJ_22, IN iN, String[] stringArray, boolean bl) {
        Object object;
        String[] stringArray2 = new String[stringArray.length];
        for (int i = 0; i < stringArray2.length; ++i) {
            object = stringArray[i];
            stringArray2[i] = rrzX_2.id_protected((String)object, "textures/");
        }
        we_3 we_32 = rrbH_2.id_class(stringArray2);
        object = iN.id_class(rrbH_2::id_class, we_32);
        return rrbH_2.id_class(fJ_22, (we_3)object, bl);
    }

    private rrMH[] id_class(Properties properties) {
        String string = "nbt.";
        Map map = rrbH_2.id_byte(properties, string);
        if (map.size() <= 0) {
            return null;
        }
        ArrayList<rrMH> arrayList = new ArrayList<rrMH>();
        for (String string2 : map.keySet()) {
            String string3 = (String)map.get(string2);
            String string4 = string2.substring(string.length());
            rrMH rrMH2 = new rrMH(string4, string3);
            arrayList.add(rrMH2);
        }
        rrMH[] rrMHArray = arrayList.toArray(new rrMH[arrayList.size()]);
        return rrMHArray;
    }

    private static we_3 id_class(String[] stringArray) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{\"parent\": \"builtin/generated\",\"textures\": {");
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append("\"layer" + i + "\": \"" + string + "\"");
        }
        stringBuffer.append("}}");
        String string = stringBuffer.toString();
        return we_3.id_class(string);
    }

    private rqO_2 id_class(rqO_2 rqO_22) {
        String string = rqO_22.id_break();
        string = rrzX_2.id_protected(string, "textures/");
        string = rrzX_2.id_throws(string, ".png");
        return new rqO_2(rqO_22.id_byte(), string);
    }

    private String id_class(Map<String, String> map, String string, String string2) {
        if (map == null) {
            return string2;
        }
        String string3 = map.get(string);
        return string3 == null ? string2 : string3;
    }

    public void id_class(fJ_2 fJ_22, IN iN) {
        if (this.id_throws != null || this.id_case != null) {
            String[] stringArray = this.id_protected();
            boolean bl = this.id_byte();
            this.id_try = rrbH_2.id_class(fJ_22, iN, stringArray, bl);
            if (this.id_byte == 1 && this.id_case != null) {
                for (String string : this.id_case.keySet()) {
                    String string2 = this.id_case.get(string);
                    String string3 = rrzX_2.id_protected(string, "texture.");
                    if (!this.id_finally(string3)) continue;
                    String[] stringArray2 = new String[]{string2};
                    IJ iJ = rrbH_2.id_class(fJ_22, iN, stringArray2, bl);
                    if (this.id_instanceof == null) {
                        this.id_instanceof = new HashMap<String, IJ>();
                    }
                    String string4 = "item/" + string3;
                    this.id_instanceof.put(string4, iJ);
                }
            }
        }
    }

    public void id_class(fJ_2 fJ_22) {
        if (this.id_throws != null) {
            this.id_return = this.id_implements(this.id_throws);
            if (this.id_byte == 1) {
                rqO_2 rqO_22 = this.id_class(this.id_return);
                this.id_goto = fJ_22.id_throws(rqO_22);
            }
        }
        if (this.id_case != null) {
            this.id_public = new HashMap();
            this.id_while = new HashMap();
            for (String string : this.id_case.keySet()) {
                String string2 = this.id_case.get(string);
                rqO_2 rqO_23 = this.id_implements(string2);
                this.id_public.put(string, rqO_23);
                if (this.id_byte != 1) continue;
                rqO_2 rqO_24 = this.id_class(rqO_23);
                fj_3 fj_32 = fJ_22.id_throws(rqO_24);
                this.id_while.put(string, fj_32);
            }
        }
    }

    private static IJ id_class(fJ_2 fJ_22, we_3 we_32, boolean bl) {
        If_1 if_1 = If_1.X0_Y0;
        Ig_1 ig_1 = we_32.id_byte("particle");
        fj_3 fj_32 = ig_1.id_byte();
        IY iY = new IY(we_32, IF.id_class, false).id_class(fj_32);
        for (IS iS : we_32.id_class()) {
            for (rpr_3 rpr_32 : iS.id_byte.keySet()) {
                IG iG = iS.id_byte.get(rpr_32);
                if (!bl) {
                    iG = new IG(iG.id_class, -1, iG.id_byte, iG.id_protected);
                }
                Ig_1 ig_12 = we_32.id_byte(iG.id_byte);
                fj_3 fj_33 = ig_12.id_byte();
                wK_2 wK_22 = rrbH_2.id_class(iS, iG, fj_33, rpr_32, if_1);
                if (iG.id_class == null) {
                    iY.id_class(wK_22);
                    continue;
                }
                iY.id_class(rpr_3.id_class(if_1.id_class().id_byte(), iG.id_class), wK_22);
            }
        }
        return iY.id_class();
    }

    private int[] id_class(String string, String string2) {
        Object object;
        if (string == null) {
            string = string2;
        }
        if (string == null) {
            return null;
        }
        string = string.trim();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        String[] stringArray = rrbb_3.id_class(string, " ");
        for (int i = 0; i < stringArray.length; ++i) {
            object = stringArray[i];
            rdb_3 rdb_32 = this.id_throws((String)object);
            if (rdb_32 == null) {
                rrbb_3.id_protected("Item not found: " + (String)object);
                continue;
            }
            int n = rdb_3.id_class(rdb_32);
            if (n < 0) {
                rrbb_3.id_protected("Item ID not found: " + (String)object);
                continue;
            }
            treeSet.add(new Integer(n));
        }
        Integer[] integerArray = treeSet.toArray(new Integer[treeSet.size()]);
        object = new int[integerArray.length];
        for (int i = 0; i < ((Object)object).length; ++i) {
            object[i] = integerArray[i];
        }
        return object;
    }

    public void id_class(IC iC) {
        if (this.id_catch != null) {
            rrbH_2.id_class(iC, this.id_catch);
        }
        if (this.id_byte == 1 && this.id_private != null) {
            for (String string : this.id_private.keySet()) {
                String string2 = this.id_private.get(string);
                String string3 = rrzX_2.id_protected(string, "model.");
                if (!this.id_finally(string3)) continue;
                rrbH_2.id_class(iC, string2);
            }
        }
    }

    private static String id_class(String string, String string2, String string3, String string4, String string5, int n, Map<String, String> map, boolean bl) {
        int n2;
        String string6;
        if (string == null) {
            string = string2;
        }
        if (string == null) {
            string = string3;
        }
        if (string != null) {
            String string7 = ".png";
            if (string.endsWith(string7)) {
                string = string.substring(0, string.length() - string7.length());
            }
            return rrbH_2.id_break(string, string5);
        }
        if (n == 3) {
            return null;
        }
        if (map != null && (string6 = map.get("texture.bow_standby")) != null) {
            return string6;
        }
        if (!bl) {
            return null;
        }
        string6 = string4;
        int n3 = string4.lastIndexOf(47);
        if (n3 >= 0) {
            string6 = string4.substring(n3 + 1);
        }
        if ((n2 = string6.lastIndexOf(46)) >= 0) {
            string6 = string6.substring(0, n2);
        }
        return rrbH_2.id_break(string6, string5);
    }

    private static Map id_class(Properties properties, String string) {
        String string2 = "texture.";
        Map map = rrbH_2.id_byte(properties, string2);
        if (map.size() <= 0) {
            return null;
        }
        Set set = map.keySet();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        for (String string3 : set) {
            String string4 = (String)map.get(string3);
            string4 = rrbH_2.id_break(string4, string);
            linkedHashMap.put(string3, string4);
        }
        return linkedHashMap;
    }

    public void id_class() {
        Ip_1 ip_1 = rrbb_3.id_float();
        IJ iJ = ip_1.id_break();
        if (this.id_catch != null) {
            rqO_2 rqO_22 = rrbH_2.id_extends(this.id_catch);
            II object = new II(rqO_22, id_default);
            this.id_throw = ip_1.id_class(object);
            if (this.id_throw == iJ) {
                rrbb_3.id_protected("Custom Items: Model not found " + object.id_break());
                this.id_throw = null;
            }
        }
        if (this.id_byte == 1 && this.id_private != null) {
            for (String string : this.id_private.keySet()) {
                String string2 = this.id_private.get(string);
                String string3 = rrzX_2.id_protected(string, "model.");
                if (!this.id_finally(string3)) continue;
                rqO_2 rqO_22 = rrbH_2.id_extends(string2);
                II iI = new II(rqO_22, id_default);
                IJ iJ2 = ip_1.id_class(iI);
                if (iJ2 == iJ) {
                    rrbb_3.id_protected("Custom Items: Model not found " + iI.id_break());
                    continue;
                }
                if (this.id_interface == null) {
                    this.id_interface = new HashMap<String, IJ>();
                }
                String string4 = "item/" + string3;
                this.id_interface.put(string4, iJ2);
            }
        }
    }

    private static void id_class(IC iC, String string) {
        rqO_2 rqO_22 = rrbH_2.id_extends(string);
        II iI = new II(rqO_22, id_default);
        iC.id_class(iI);
    }

    private static String id_class(Properties properties, String ... stringArray) {
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            String string2 = properties.getProperty(string);
            if (string2 == null) continue;
            return string2;
        }
        return null;
    }

    private int id_class(String string, int n) {
        if (string == null) {
            return n;
        }
        int n2 = rrbb_3.id_class(string = string.trim(), Integer.MIN_VALUE);
        if (n2 == Integer.MIN_VALUE) {
            rrbb_3.id_protected("Invalid integer: " + string);
            return n;
        }
        return n2;
    }

    private float id_class(String string, float f) {
        if (string == null) {
            return f;
        }
        float f2 = rrbb_3.id_class(string = string.trim(), Float.MIN_VALUE);
        if (f2 == Float.MIN_VALUE) {
            rrbb_3.id_protected("Invalid float: " + string);
            return f;
        }
        return f2;
    }

    private int[] id_class(String string, rrMF rrMF2) {
        if (string == null) {
            return null;
        }
        String[] stringArray = rrbb_3.id_class(string, " ");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            int n = rrMF2.id_class(string2, Integer.MIN_VALUE);
            if (n == Integer.MIN_VALUE) {
                rrbb_3.id_protected("Invalid value: " + string2);
                continue;
            }
            arrayList.add(n);
        }
        Integer[] integerArray = arrayList.toArray(new Integer[arrayList.size()]);
        return rrbb_3.id_class(integerArray);
    }

    public float id_class(fY_2 fY_22) {
        if (this.id_const <= 0) {
            if (this.id_return != null) {
                ff_3 ff_32 = fY_22.id_break(this.id_return);
                int n = ff_32.id_new();
                int n2 = MT.S();
                MT.id_super(n);
                this.id_const = GL11.glGetTexLevelParameteri((int)3553, (int)0, (int)4096);
                MT.id_super(n2);
            }
            if (this.id_const <= 0) {
                this.id_const = 16;
            }
        }
        return this.id_const;
    }

    private static String id_class(String string, String string2, String string3, int n, Map<String, String> map) {
        String string4;
        if (string != null) {
            String string5 = ".json";
            if (string.endsWith(string5)) {
                string = string.substring(0, string.length() - string5.length());
            }
            return rrbH_2.id_byte(string, string3);
        }
        if (n == 3) {
            return null;
        }
        if (map != null && (string4 = map.get("model.bow_standby")) != null) {
            return string4;
        }
        return string;
    }

    public IJ id_class(rqO_2 rqO_22, boolean bl) {
        String string;
        IJ iJ;
        Map<String, IJ> map;
        IJ iJ2;
        if (bl) {
            iJ2 = this.id_throw;
            map = this.id_interface;
        } else {
            iJ2 = this.id_try;
            map = this.id_instanceof;
        }
        if (rqO_22 != null && map != null && (iJ = map.get(string = rqO_22.id_break())) != null) {
            return iJ;
        }
        return iJ2;
    }

    public float id_break(fY_2 fY_22) {
        if (this.id_strictfp <= 0) {
            if (this.id_return != null) {
                ff_3 ff_32 = fY_22.id_break(this.id_return);
                int n = ff_32.id_new();
                int n2 = MT.S();
                MT.id_super(n);
                this.id_strictfp = GL11.glGetTexLevelParameteri((int)3553, (int)0, (int)4097);
                MT.id_super(n2);
            }
            if (this.id_strictfp <= 0) {
                this.id_strictfp = 16;
            }
        }
        return this.id_strictfp;
    }

    private static String id_break(String object, String string) {
        if (!(((String)(object = rrzJ_2.id_class((String)object, string))).startsWith(string) || ((String)object).startsWith("textures/") || ((String)object).startsWith("optifine/"))) {
            object = string + "/" + (String)object;
        }
        if (((String)object).endsWith(".png")) {
            object = ((String)object).substring(0, ((String)object).length() - 4);
        }
        if (((String)object).startsWith("/")) {
            object = ((String)object).substring(1);
        }
        return object;
    }

    private static Map id_break(Properties properties, String string) {
        String string2 = "model.";
        Map map = rrbH_2.id_byte(properties, string2);
        if (map.size() <= 0) {
            return null;
        }
        Set set = map.keySet();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        for (String string3 : set) {
            String string4 = (String)map.get(string3);
            string4 = rrbH_2.id_byte(string4, string);
            linkedHashMap.put(string3, string4);
        }
        return linkedHashMap;
    }

    public void id_break(fJ_2 fJ_22) {
        if (this.id_goto != null) {
            this.id_goto = fJ_22.id_break(this.id_goto.id_finally());
        }
        if (this.id_while != null) {
            for (String string : this.id_while.keySet()) {
                fj_3 fj_32 = (fj_3)this.id_while.get(string);
                if (fj_32 == null) continue;
                rqO_2 rqO_22 = fj_32.id_finally();
                fj_3 fj_33 = fJ_22.id_break(rqO_22);
                if (fj_33 == null || fj_33 instanceof fQ_2) {
                    rrbb_3.id_protected("Missing CIT sprite: " + rqO_22 + ", properties: " + this.id_break);
                }
                this.id_while.put(string, fj_33);
            }
        }
    }

    private int[] id_break() {
        int[] nArray;
        rdb_3 rdb_32 = this.id_throws(this.id_class);
        if (rdb_32 == null) {
            return null;
        }
        int n = rdb_3.id_class(rdb_32);
        if (n < 0) {
            nArray = null;
        } else {
            int[] nArray2 = new int[1];
            nArray = nArray2;
            nArray2[0] = n;
        }
        return nArray;
    }

    private static String id_break(String string) {
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

    private rdb_3 id_throws(String string) {
        rqO_2 rqO_22 = new rqO_2(string);
        return !rVL.id_for.id_byte(rqO_22) ? null : rVL.id_for.id_class(rqO_22);
    }

    private boolean id_finally(String string) {
        return string.startsWith("bow") || string.startsWith("crossbow") || string.startsWith("fishing_rod") || string.startsWith("shield");
    }

    private rrMp_1 id_catch(String string) {
        int n;
        if (string == null) {
            return null;
        }
        int n2 = (string = string.trim()).length() - string.replace("-", "").length();
        if (n2 > 1) {
            rrbb_3.id_protected("Invalid range: " + string);
            return null;
        }
        String[] stringArray = rrbb_3.id_class(string, "- ");
        int[] nArray = new int[stringArray.length];
        for (n = 0; n < stringArray.length; ++n) {
            String string2 = stringArray[n];
            int n3 = rrbb_3.id_class(string2, -1);
            if (n3 < 0) {
                rrbb_3.id_protected("Invalid range: " + string);
                return null;
            }
            nArray[n] = n3;
        }
        if (nArray.length == 1) {
            n = nArray[0];
            if (string.startsWith("-")) {
                return new rrMp_1(0, n);
            }
            return string.endsWith("-") ? new rrMp_1(n, 65535) : new rrMp_1(n, n);
        }
        if (nArray.length == 2) {
            n = Math.min(nArray[0], nArray[1]);
            int n4 = Math.max(nArray[0], nArray[1]);
            return new rrMp_1(n, n4);
        }
        rrbb_3.id_protected("Invalid range: " + string);
        return null;
    }

    private static rqO_2 id_extends(String string) {
        return new rqO_2(string);
    }

    private rrMq_1 id_case(String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = rrbb_3.id_class(string, " ");
        rrMq_1 rrMq_12 = new rrMq_1();
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            rrMp_1 rrMp_12 = this.id_catch(string2);
            if (rrMp_12 == null) {
                rrbb_3.id_protected("Invalid range list: " + string);
                return null;
            }
            rrMq_12.id_class(rrMp_12);
        }
        return rrMq_12;
    }

    private rqO_2 id_implements(String string) {
        String string2;
        rqO_2 rqO_22;
        boolean bl;
        if (string == null) {
            return null;
        }
        rqO_2 rqO_23 = new rqO_2(string);
        String string3 = rqO_23.id_byte();
        Object object = rqO_23.id_break();
        if (!((String)object).contains("/")) {
            object = "textures/item/" + (String)object;
        }
        if (!(bl = rrbb_3.id_byte(rqO_22 = new rqO_2(string3, string2 = (String)object + ".png")))) {
            rrbb_3.id_protected("File not found: " + string2);
        }
        return rqO_22;
    }

    private int id_protected(String string) {
        if (string == null) {
            return 1;
        }
        if (string.equals("item")) {
            return 1;
        }
        if (string.equals("enchantment")) {
            return 2;
        }
        if (string.equals("armor")) {
            return 3;
        }
        if (string.equals("elytra")) {
            return 4;
        }
        rrbb_3.id_protected("Unknown method: " + string);
        return 0;
    }

    private String[] id_protected() {
        if (this.id_byte == 1 && this.id_protected.length == 1) {
            rxS_2 rxS_22;
            boolean bl;
            rdb_3 rdb_32 = rdb_3.id_break(this.id_protected[0]);
            boolean bl2 = bl = rdb_32 == rdy_3.JA || rdb_32 == rdy_3.kk || rdb_32 == rdy_3.kQ;
            if (bl && this.id_implements != null && this.id_implements.id_class() > 0) {
                rrMp_1 rrMp_12 = this.id_implements.id_break(0);
                int n = rrMp_12.id_class();
                boolean bl3 = (n & 0x4000) != 0;
                String string = this.id_class(this.id_case, "texture.potion_overlay", "item/potion_overlay");
                String string2 = null;
                string2 = bl3 ? this.id_class(this.id_case, "texture.potion_bottle_splash", "item/potion_bottle_splash") : this.id_class(this.id_case, "texture.potion_bottle_drinkable", "item/potion_bottle_drinkable");
                return new String[]{string, string2};
            }
            if (rdb_32 instanceof rxS_2 && (rxS_22 = (rxS_2)rdb_32).id_throws() == rxE_2.LEATHER) {
                String string = "leather";
                String string3 = "helmet";
                rXQ rXQ2 = rxS_22.id_byte();
                if (rXQ2 == rXQ.HEAD) {
                    string3 = "helmet";
                }
                if (rXQ2 == rXQ.CHEST) {
                    string3 = "chestplate";
                }
                if (rXQ2 == rXQ.LEGS) {
                    string3 = "leggings";
                }
                if (rXQ2 == rXQ.FEET) {
                    string3 = "boots";
                }
                String string4 = string + "_" + string3;
                String string5 = this.id_class(this.id_case, "texture." + string4, "item/" + string4);
                String string6 = this.id_class(this.id_case, "texture." + string4 + "_overlay", "item/" + string4 + "_overlay");
                return new String[]{string5, string6};
            }
        }
        return new String[]{this.id_throws};
    }

    private int id_private(String string) {
        if (string == null) {
            return 0;
        }
        if ((string = string.toLowerCase()).equals("any")) {
            return 0;
        }
        if (string.equals("main")) {
            return 1;
        }
        if (string.equals("off")) {
            return 2;
        }
        rrbb_3.id_protected("Invalid hand: " + string);
        return 0;
    }
}

