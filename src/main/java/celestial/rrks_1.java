/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrWV;
import celestial.rrWz_1;
import celestial.rrXA;
import celestial.rrXC;
import celestial.rrXF;
import celestial.rrXL;
import celestial.rrXf_1;
import celestial.rrXj_1;
import celestial.rrXo_1;
import celestial.rrXt_1;
import celestial.rrXw_1;
import celestial.rrbb_3;
import celestial.rrdD;
import celestial.rrdG;
import celestial.rrdJ;
import celestial.rrdU;
import celestial.rrdV;
import celestial.rrdY;
import celestial.rrdZ;
import celestial.rrda_1;
import celestial.rrde_1;
import celestial.rrdi_1;
import celestial.rrdj_1;
import celestial.rrdm_1;
import celestial.rrdo_1;
import celestial.rrkB;
import celestial.rrkE;
import celestial.rrkG;
import celestial.rrkN;
import celestial.rrkP;
import celestial.rrkQ;
import celestial.rrkS;
import celestial.rrkb_1;
import celestial.rrkr_1;
import celestial.rrkt_1;
import celestial.rrkz_1;
import celestial.rrxW_2;
import celestial.rrxi_3;
import celestial.rrxz_3;
import celestial.rrzX_2;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrks_1 {
    private static final Pattern id_class = Pattern.compile("^\\s*#version\\s+.*$");
    private static final Pattern id_break = Pattern.compile("^\\s*#include\\s+\"([A-Za-z0-9_/\\.]+)\".*$");
    private static final Set<String> id_byte = rrks_1.id_class();
    private static final Map<String, Integer> id_protected = rrks_1.id_break();
    private static final Map<String, Integer> id_throws = rrks_1.id_byte();

    public static Set<String> id_byte(Properties properties, rrdD[] rrdDArray) {
        HashSet<String> hashSet = new HashSet<String>();
        String string = properties.getProperty("sliders");
        if (string == null) {
            return hashSet;
        }
        String[] stringArray = rrbb_3.id_class(string, " ");
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            rrdD rrdD2 = rrdm_1.id_class(string2, rrdDArray);
            if (rrdD2 == null) {
                rrbb_3.id_protected("Invalid shader option: " + string2);
                continue;
            }
            hashSet.add(string2);
        }
        return hashSet;
    }

    private static rrdj_1 id_byte(String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = rrbb_3.id_class(string, " ");
        float f = rrbb_3.id_class(stringArray[0], -1.0f);
        float f2 = 0.0f;
        float f3 = 0.0f;
        if (stringArray.length > 1) {
            if (stringArray.length != 3) {
                rrdJ.id_class("Invalid render scale: " + string);
                return null;
            }
            f2 = rrbb_3.id_class(stringArray[1], -1.0f);
            f3 = rrbb_3.id_class(stringArray[2], -1.0f);
        }
        if (rrbb_3.id_break(f, 0.0f, 1.0f) && rrbb_3.id_break(f2, 0.0f, 1.0f) && rrbb_3.id_break(f3, 0.0f, 1.0f)) {
            return new rrdj_1(f, f2, f3);
        }
        rrdJ.id_class("Invalid render scale: " + string);
        return null;
    }

    private static Map<String, Integer> id_byte() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("ZERO", new Integer(0));
        hashMap.put("ONE", new Integer(1));
        hashMap.put("SRC_COLOR", new Integer(768));
        hashMap.put("ONE_MINUS_SRC_COLOR", new Integer(769));
        hashMap.put("DST_COLOR", new Integer(774));
        hashMap.put("ONE_MINUS_DST_COLOR", new Integer(775));
        hashMap.put("SRC_ALPHA", new Integer(770));
        hashMap.put("ONE_MINUS_SRC_ALPHA", new Integer(771));
        hashMap.put("DST_ALPHA", new Integer(772));
        hashMap.put("ONE_MINUS_DST_ALPHA", new Integer(773));
        hashMap.put("CONSTANT_COLOR", new Integer(32769));
        hashMap.put("ONE_MINUS_CONSTANT_COLOR", new Integer(32770));
        hashMap.put("CONSTANT_ALPHA", new Integer(32771));
        hashMap.put("ONE_MINUS_CONSTANT_ALPHA", new Integer(32772));
        hashMap.put("SRC_ALPHA_SATURATE", new Integer(776));
        return Collections.unmodifiableMap(hashMap);
    }

    public static void id_byte(Properties properties) {
        for (String string : properties.keySet()) {
            String string2;
            String[] stringArray = rrbb_3.id_class(string, ".");
            if (stringArray.length < 2 || stringArray.length > 3) continue;
            String string3 = stringArray[0];
            String string4 = stringArray[1];
            String string5 = string2 = stringArray.length == 3 ? stringArray[2] : null;
            if (!string3.equals("blend")) continue;
            rrdG rrdG2 = rrdZ.id_native(string4);
            if (rrdG2 == null) {
                rrdJ.id_class("Invalid program name: " + string4);
                continue;
            }
            String string6 = properties.getProperty(string).trim();
            rrxz_3 rrxz_32 = rrks_1.id_break(string6);
            if (rrxz_32 == null) continue;
            if (string2 != null) {
                int n;
                int n2 = rrdG2.id_case().id_protected() ? rrkG.id_byte(string2) : rrdZ.id_implements(string2);
                int n3 = n = rrdG2.id_case().id_protected() ? 2 : 16;
                if (n2 >= 0 && n2 < n) {
                    rrdG2.id_class(n2, rrxz_32);
                    rrdJ.id_byte("Blend " + string4 + "." + string2 + "=" + string6);
                    continue;
                }
                rrdJ.id_class("Invalid buffer name: " + string2);
                continue;
            }
            rrdG2.id_class(rrxz_32);
        }
    }

    private static rrXt_1 id_class(rrXt_1 rrXt_12) {
        if (rrXt_12 instanceof rrXf_1) {
            return new rrXL((rrXf_1)rrXt_12);
        }
        return rrXt_12 instanceof rrXj_1 ? new rrXF((rrXj_1)rrXt_12) : rrXt_12;
    }

    private static rrkz_1 id_class(String string, String string2, String string3, String string4, Map<String, rrXt_1> map) {
        try {
            rrkt_1 rrkt_12 = rrkt_1.id_break(string3);
            if (rrkt_12 == null) {
                rrdJ.id_break("Unknown " + string + " type: " + rrkt_12);
                return null;
            }
            rrkN rrkN2 = new rrkN(map);
            rrXA rrXA2 = new rrXA(rrkN2);
            rrXt_1 rrXt_12 = rrXA2.id_byte(string4);
            rrXC rrXC2 = rrXt_12.id_byte();
            if (!rrkt_12.id_class(rrXC2)) {
                rrdJ.id_break("Expression type does not match " + string + " type, expression: " + rrXC2 + ", " + string + ": " + rrkt_12 + " " + string2);
                return null;
            }
            rrXt_12 = rrks_1.id_class(rrXt_12);
            return new rrkz_1(string2, rrkt_12, rrXt_12);
        }
        catch (rrXo_1 rrXo_12) {
            rrdJ.id_break(rrXo_12.getClass().getName() + ": " + rrXo_12.getMessage());
            return null;
        }
    }

    public static rrkQ id_class(Properties properties) {
        String string = "uniform";
        String string2 = "variable";
        String string3 = string + ".";
        String string4 = string2 + ".";
        HashMap<String, rrXt_1> hashMap = new HashMap<String, rrXt_1>();
        ArrayList<rrkz_1> arrayList = new ArrayList<rrkz_1>();
        for (String string5 : properties.keySet()) {
            String[] stringArray = rrbb_3.id_class(string5, ".");
            if (stringArray.length != 3) continue;
            String string6 = stringArray[0];
            String string7 = stringArray[1];
            String string8 = stringArray[2];
            String string9 = properties.getProperty(string5).trim();
            if (hashMap.containsKey(string8)) {
                rrdJ.id_break("Expression already defined: " + string8);
                continue;
            }
            if (!string6.equals(string) && !string6.equals(string2)) continue;
            rrdJ.id_byte("Custom " + string6 + ": " + string8);
            rrkz_1 rrkz_12 = rrks_1.id_class(string6, string8, string7, string9, hashMap);
            if (rrkz_12 == null) continue;
            hashMap.put(string8, rrkz_12.id_throws());
            if (string6.equals(string2)) continue;
            arrayList.add(rrkz_12);
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        rrkz_1[] rrkz_1Array = arrayList.toArray(new rrkz_1[arrayList.size()]);
        return new rrkQ(rrkz_1Array, hashMap);
    }

    private static rrWV id_class(String string, rrxi_3 rrxi_32, int n, List<String> list, int n2) throws IOException {
        if (n2 >= 10) {
            throw new IOException("#include depth exceeded: " + n2 + ", file: " + string);
        }
        ++n2;
        InputStream inputStream = rrxi_32.id_class(string);
        if (inputStream == null) {
            return null;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "ASCII");
        rrWV rrWV2 = rrWV.id_class(inputStreamReader);
        return rrks_1.id_class(rrWV2, string, rrxi_32, n, list, n2);
    }

    private static rrdY[] id_class(String string, rrdY[] rrdYArray) {
        ArrayList<rrdY> arrayList = new ArrayList<rrdY>();
        for (int i = 0; i < rrdYArray.length; ++i) {
            rrdY rrdY2 = rrdYArray[i];
            if (!string.contains(rrdY2.id_class())) continue;
            arrayList.add(rrdY2);
        }
        return arrayList.toArray(new rrdY[arrayList.size()]);
    }

    private static boolean id_class(rrdD rrdD2, String[] stringArray) {
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            if (!rrdD2.id_catch(string)) continue;
            return true;
        }
        return false;
    }

    public static rrWV id_class(rrWV rrWV2) throws IOException {
        if (!rrdZ.i()) {
            return rrWV2;
        }
        rrWV rrWV3 = new rrWV();
        for (Object object : rrWV2) {
            Object object2 = ((String)object).replace("gl_TextureMatrix[1]", "gl_TextureMatrix[2]");
            if (!((String)(object2 = ((String)object2).replace("gl_MultiTexCoord1", "gl_MultiTexCoord2"))).equals(object)) {
                object = object2 = (String)object2 + " // Legacy fix, replaced TU 1 with 2";
            }
            rrWV3.id_class((String)object);
        }
        return rrWV3;
    }

    public static rrWz_1[] id_class(Properties properties, int n) {
        rrWz_1[] rrWz_1Array = new rrWz_1[n];
        for (Object object : properties.keySet()) {
            String[] stringArray;
            String string = (String)object;
            if (!string.startsWith("size.buffer.") || (stringArray = rrbb_3.id_class(string, ".")).length != 3) continue;
            String string2 = stringArray[2];
            int n2 = rrdZ.id_implements(string2);
            if (n2 >= 0 && n2 < rrWz_1Array.length) {
                String string3 = properties.getProperty(string).trim();
                rrWz_1 rrWz_12 = rrks_1.id_protected(string3);
                if (rrWz_12 == null) {
                    rrdJ.id_class("Invalid buffer size: " + string + "=" + string3);
                    continue;
                }
                rrWz_1Array[n2] = rrWz_12;
                if (rrWz_12.id_class()) {
                    rrdJ.id_byte("Relative size " + string2 + ": " + rrWz_12.id_break() + " " + rrWz_12.id_byte());
                    continue;
                }
                rrdJ.id_byte("Fixed size " + string2 + ": " + (int)rrWz_12.id_break() + " " + (int)rrWz_12.id_byte());
                continue;
            }
            rrdJ.id_class("Invalid buffer name: " + string);
        }
        return rrWz_1Array;
    }

    public static rrdD[] id_class(rrxi_3 rrxi_32, String[] stringArray, List<Integer> list) {
        Object object;
        if (rrxi_32 == null) {
            return new rrdD[0];
        }
        HashMap<String, rrdD> hashMap = new HashMap<String, rrdD>();
        rrks_1.id_class(rrxi_32, "/shaders", stringArray, hashMap);
        Object object2 = list.iterator();
        while (object2.hasNext()) {
            int n = object2.next();
            object = "/shaders/world" + n;
            rrks_1.id_class(rrxi_32, (String)object, stringArray, hashMap);
        }
        object2 = hashMap.values();
        rrdD[] rrdDArray = object2.toArray(new rrdD[object2.size()]);
        object = new rrkE();
        Arrays.sort(rrdDArray, object);
        return rrdDArray;
    }

    private static void id_class(rrxi_3 rrxi_32, String string, String[] stringArray, Map<String, rrdD> map) {
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            if (string2.equals("")) continue;
            String string3 = string + "/" + string2 + ".csh";
            String string4 = string + "/" + string2 + ".vsh";
            String string5 = string + "/" + string2 + ".gsh";
            String string6 = string + "/" + string2 + ".fsh";
            rrks_1.id_class(rrxi_32, string3, map);
            rrks_1.id_class(rrxi_32, string4, map);
            rrks_1.id_class(rrxi_32, string5, map);
            rrks_1.id_class(rrxi_32, string6, map);
        }
    }

    private static void id_class(rrxi_3 rrxi_32, String string, Map<String, rrdD> map) {
        String[] stringArray = rrks_1.id_class(rrxi_32, string);
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            rrdD rrdD2 = rrks_1.id_class(string2, string);
            if (rrdD2 == null || rrdD2.id_class().startsWith(rrdo_1.id_protected()) || rrdD2.id_final() && !rrks_1.id_class(rrdD2, stringArray)) continue;
            String string3 = rrdD2.id_class();
            rrdD rrdD3 = map.get(string3);
            if (rrdD3 != null) {
                if (!rrbb_3.id_class((Object)rrdD3.id_throws(), (Object)rrdD2.id_throws())) {
                    if (rrdD3.id_finally()) {
                        rrbb_3.id_protected("Ambiguous shader option: " + rrdD2.id_class());
                        rrbb_3.id_protected(" - in " + rrbb_3.id_class(rrdD3.id_implements()) + ": " + rrdD3.id_throws());
                        rrbb_3.id_protected(" - in " + rrbb_3.id_class(rrdD2.id_implements()) + ": " + rrdD2.id_throws());
                    }
                    rrdD3.id_class(false);
                }
                if (rrdD3.id_break() == null || rrdD3.id_break().length() <= 0) {
                    rrdD3.id_class(rrdD2.id_break());
                }
                rrdD3.id_class(rrdD2.id_implements());
                continue;
            }
            map.put(string3, rrdD2);
        }
    }

    public static rrxW_2 id_class(String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = rrbb_3.id_class(string, " ");
        if (stringArray.length == 1) {
            String string2 = stringArray[0];
            if (string2.equals("off") || string2.equals("false")) {
                return new rrxW_2(false);
            }
        } else if (stringArray.length == 2) {
            String string3 = stringArray[0];
            String string4 = stringArray[1];
            Integer n = id_protected.get(string3);
            float f = rrbb_3.id_class(string4, -1.0f);
            if (n != null && f >= 0.0f) {
                return new rrxW_2(true, n, f);
            }
        }
        rrdJ.id_class("Invalid alpha test: " + string);
        return null;
    }

    private static String[] id_class(rrxi_3 rrxi_32, String string) {
        try {
            ArrayList<String> arrayList = new ArrayList<String>();
            rrWV rrWV2 = rrks_1.id_class(string, rrxi_32, 0, arrayList, 0);
            return rrWV2 == null ? new String[]{} : rrWV2.id_break();
        }
        catch (IOException iOException) {
            rrbb_3.id_byte(iOException.getClass().getName() + ": " + iOException.getMessage());
            return new String[0];
        }
    }

    private static rrXw_1 id_class(String string, rrdD[] rrdDArray) {
        try {
            rrde_1 rrde_12 = new rrde_1(rrdDArray);
            rrXA rrXA2 = new rrXA(rrde_12);
            return rrXA2.id_break(string);
        }
        catch (rrXo_1 rrXo_12) {
            rrdJ.id_break(rrXo_12.getClass().getName() + ": " + rrXo_12.getMessage());
            return null;
        }
    }

    private static rrdD id_class(String string, String string2) {
        rrdD rrdD2 = null;
        if (rrdD2 == null) {
            rrdD2 = rrkr_1.id_class(string, string2);
        }
        if (rrdD2 == null) {
            rrdD2 = rrkB.id_class(string, string2);
        }
        if (rrdD2 != null) {
            return rrdD2;
        }
        if (rrdD2 == null) {
            rrdD2 = rrkP.id_break(string, string2);
        }
        if (rrdD2 == null) {
            rrdD2 = rrkS.id_byte(string, string2);
        }
        return rrdD2 != null && id_byte.contains(rrdD2.id_class()) ? rrdD2 : null;
    }

    public static rrkb_1[] id_class(Properties properties, rrdD[] rrdDArray) {
        String string = "profile.";
        ArrayList<rrkb_1> arrayList = new ArrayList<rrkb_1>();
        for (String string2 : properties.keySet()) {
            if (!string2.startsWith(string)) continue;
            String string3 = string2.substring(string.length());
            properties.getProperty(string2);
            HashSet<String> hashSet = new HashSet<String>();
            rrkb_1 rrkb_12 = rrks_1.id_class(string3, properties, hashSet, rrdDArray);
            if (rrkb_12 == null) continue;
            arrayList.add(rrkb_12);
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        rrkb_1[] rrkb_1Array = arrayList.toArray(new rrkb_1[arrayList.size()]);
        return rrkb_1Array;
    }

    private static Set<String> id_class() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("shadowMapResolution");
        hashSet.add("shadowMapFov");
        hashSet.add("shadowDistance");
        hashSet.add("shadowDistanceRenderMul");
        hashSet.add("shadowIntervalSize");
        hashSet.add("generateShadowMipmap");
        hashSet.add("generateShadowColorMipmap");
        hashSet.add("shadowHardwareFiltering");
        hashSet.add("shadowHardwareFiltering0");
        hashSet.add("shadowHardwareFiltering1");
        hashSet.add("shadowtex0Mipmap");
        hashSet.add("shadowtexMipmap");
        hashSet.add("shadowtex1Mipmap");
        hashSet.add("shadowcolor0Mipmap");
        hashSet.add("shadowColor0Mipmap");
        hashSet.add("shadowcolor1Mipmap");
        hashSet.add("shadowColor1Mipmap");
        hashSet.add("shadowtex0Nearest");
        hashSet.add("shadowtexNearest");
        hashSet.add("shadow0MinMagNearest");
        hashSet.add("shadowtex1Nearest");
        hashSet.add("shadow1MinMagNearest");
        hashSet.add("shadowcolor0Nearest");
        hashSet.add("shadowColor0Nearest");
        hashSet.add("shadowColor0MinMagNearest");
        hashSet.add("shadowcolor1Nearest");
        hashSet.add("shadowColor1Nearest");
        hashSet.add("shadowColor1MinMagNearest");
        hashSet.add("wetnessHalflife");
        hashSet.add("drynessHalflife");
        hashSet.add("eyeBrightnessHalflife");
        hashSet.add("centerDepthHalflife");
        hashSet.add("sunPathRotation");
        hashSet.add("ambientOcclusionLevel");
        hashSet.add("superSamplingLevel");
        hashSet.add("noiseTextureResolution");
        return hashSet;
    }

    public static rrWV id_class(rrWV rrWV2, String string, rrxi_3 rrxi_32, int n, List<String> list, int n2) throws IOException {
        Object object;
        Object object2;
        String string2 = "/";
        int n3 = string.lastIndexOf("/");
        if (n3 >= 0) {
            string2 = string.substring(0, n3);
        }
        rrWV rrWV3 = new rrWV();
        int n4 = -1;
        int n5 = 0;
        rrdY[] rrdYArray = rrWV2.iterator();
        while (rrdYArray.hasNext()) {
            Matcher matcher;
            object2 = rrdYArray.next();
            ++n5;
            if (n4 < 0 && (matcher = id_class.matcher((CharSequence)object2)).matches()) {
                rrWV3.id_class((String)object2);
                object = rrdo_1.id_finally();
                rrWV3.id_class((String[])object);
                n4 = rrWV3.id_class();
                String string3 = "#line " + (n5 + 1) + " " + n;
                rrWV3.id_class(string3);
                continue;
            }
            matcher = id_break.matcher((CharSequence)object2);
            if (matcher.matches()) {
                int n6;
                rrWV rrWV4;
                String string4;
                object = matcher.group(1);
                boolean bl = ((String)object).startsWith("/");
                String string5 = string4 = bl ? "/shaders" + (String)object : string2 + "/" + (String)object;
                if (!list.contains(string4)) {
                    list.add(string4);
                }
                if ((rrWV4 = rrks_1.id_class(string4, rrxi_32, n6 = list.indexOf(string4) + 1, list, n2)) == null) {
                    throw new IOException("Included file not found: " + string);
                }
                if (rrWV4.id_class(id_class) < 0) {
                    rrWV3.id_class("#line 1 " + n6);
                }
                rrWV3.id_class(rrWV4.id_break());
                rrWV3.id_class("#line " + (n5 + 1) + " " + n);
                continue;
            }
            rrWV3.id_class((String)object2);
        }
        if (n4 >= 0 && (rrdYArray = rrks_1.id_class(rrWV3, n4)).length > 0) {
            object2 = new rrWV();
            for (int i = 0; i < rrdYArray.length; ++i) {
                object = rrdYArray[i];
                ((rrWV)object2).id_class(((rrdY)object).id_byte());
            }
            rrWV3.id_class(n4, ((rrWV)object2).id_break());
        }
        return rrWV3;
    }

    private static boolean id_class(String string, Properties properties, Map<String, rrdV> map, rrkb_1[] rrkb_1Array, rrdD[] rrdDArray) {
        String string2;
        String string3 = properties.getProperty(string);
        if (string3 == null) {
            return false;
        }
        String string4 = string + "$parent$";
        if (map.containsKey(string4)) {
            rrbb_3.id_protected("[Shaders] Screen circular reference: " + string + " = " + string3);
            return false;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        HashSet<String> hashSet = new HashSet<String>();
        String[] stringArray = rrbb_3.id_class(string3, " ");
        for (int i = 0; i < stringArray.length; ++i) {
            Object object;
            string2 = stringArray[i];
            if (string2.equals("<empty>")) {
                arrayList.add(null);
                continue;
            }
            if (hashSet.contains(string2)) {
                rrbb_3.id_protected("[Shaders] Duplicate option: " + string2 + ", key: " + string);
                continue;
            }
            hashSet.add(string2);
            if (string2.equals("<profile>")) {
                if (rrkb_1Array == null) {
                    rrbb_3.id_protected("[Shaders] Option profile can not be used, no profiles defined: " + string2 + ", key: " + string);
                    continue;
                }
                object = new rrdU(rrkb_1Array, rrdDArray);
                arrayList.add(object);
                continue;
            }
            if (string2.equals("*")) {
                object = new rrda_1("<rest>");
                arrayList.add(object);
                continue;
            }
            if (string2.startsWith("[") && string2.endsWith("]")) {
                object = rrzX_2.id_byte(string2, "[", "]");
                if (!((String)object).matches("^[a-zA-Z0-9_]+$")) {
                    rrbb_3.id_protected("[Shaders] Invalid screen: " + string2 + ", key: " + string);
                    continue;
                }
                map.put(string4, null);
                boolean bl = rrks_1.id_class("screen." + (String)object, properties, map, rrkb_1Array, rrdDArray);
                map.remove(string4);
                if (!bl) {
                    rrbb_3.id_protected("[Shaders] Invalid screen: " + string2 + ", key: " + string);
                    continue;
                }
                rrdi_1 rrdi_12 = new rrdi_1((String)object);
                arrayList.add(rrdi_12);
                continue;
            }
            object = rrdm_1.id_class(string2, rrdDArray);
            if (object == null) {
                rrbb_3.id_protected("[Shaders] Invalid option: " + string2 + ", key: " + string);
                arrayList.add(null);
                continue;
            }
            ((rrdD)object).id_break(true);
            arrayList.add(object);
        }
        rrdD[] rrdDArray2 = arrayList.toArray(new rrdD[arrayList.size()]);
        string2 = properties.getProperty(string + ".columns");
        int n = rrbb_3.id_class(string2, 2);
        rrdV rrdV2 = new rrdV(string, rrdDArray2, n);
        map.put(string, rrdV2);
        return true;
    }

    public static Map<String, rrdV> id_class(Properties properties, rrkb_1[] rrkb_1Array, rrdD[] rrdDArray) {
        HashMap<String, rrdV> hashMap = new HashMap<String, rrdV>();
        rrks_1.id_class("screen", properties, hashMap, rrkb_1Array, rrdDArray);
        return hashMap.isEmpty() ? null : hashMap;
    }

    private static rrkb_1 id_class(String string, Properties properties, Set<String> set, rrdD[] rrdDArray) {
        String string2 = "profile.";
        String string3 = string2 + string;
        if (set.contains(string3)) {
            rrbb_3.id_protected("[Shaders] Profile already parsed: " + string);
            return null;
        }
        set.add(string);
        rrkb_1 rrkb_12 = new rrkb_1(string);
        String string4 = properties.getProperty(string3);
        String[] stringArray = rrbb_3.id_class(string4, " ");
        for (int i = 0; i < stringArray.length; ++i) {
            Object object;
            Object object2;
            Object object3;
            String string5 = stringArray[i];
            if (string5.startsWith(string2)) {
                object3 = string5.substring(string2.length());
                object2 = rrks_1.id_class((String)object3, properties, set, rrdDArray);
                if (rrkb_12 == null) continue;
                rrkb_12.id_class((rrkb_1)object2);
                rrkb_12.id_class(((rrkb_1)object2).id_byte());
                continue;
            }
            object3 = rrbb_3.id_class(string5, ":=");
            if (((String[])object3).length == 1) {
                Object object4;
                object2 = object3[0];
                boolean bl = true;
                if (((String)object2).startsWith("!")) {
                    bl = false;
                    object2 = ((String)object2).substring(1);
                }
                if (((String)object2).startsWith((String)(object = "program."))) {
                    object4 = ((String)object2).substring(((String)object).length());
                    if (!rrdZ.id_extends((String)object4)) {
                        rrbb_3.id_protected("Invalid program: " + (String)object4 + " in profile: " + rrkb_12.id_class());
                        continue;
                    }
                    if (bl) {
                        rrkb_12.id_byte((String)object4);
                        continue;
                    }
                    rrkb_12.id_break((String)object4);
                    continue;
                }
                object4 = rrdm_1.id_class((String)object2, rrdDArray);
                if (!(object4 instanceof rrkr_1)) {
                    rrbb_3.id_protected("[Shaders] Invalid option: " + (String)object2);
                    continue;
                }
                rrkb_12.id_class((String)object2, String.valueOf(bl));
                ((rrdD)object4).id_break(true);
                continue;
            }
            if (((String[])object3).length != 2) {
                rrbb_3.id_protected("[Shaders] Invalid option value: " + string5);
                continue;
            }
            object2 = object3[0];
            String string6 = object3[1];
            object = rrdm_1.id_class((String)object2, rrdDArray);
            if (object == null) {
                rrbb_3.id_protected("[Shaders] Invalid option: " + string5);
                continue;
            }
            if (!((rrdD)object).id_byte(string6)) {
                rrbb_3.id_protected("[Shaders] Invalid value: " + string5);
                continue;
            }
            ((rrdD)object).id_break(true);
            rrkb_12.id_class((String)object2, string6);
        }
        return rrkb_12;
    }

    private static rrdY[] id_class(rrWV rrWV2, int n) {
        LinkedHashSet<rrdY> linkedHashSet = new LinkedHashSet<rrdY>();
        for (int i = n; i < rrWV2.id_class(); ++i) {
            String string = rrWV2.id_class(i);
            if (!string.contains(rrdo_1.id_protected())) continue;
            rrdY[] rrdYArray = rrks_1.id_class(string, rrdo_1.id_throws());
            linkedHashSet.addAll(Arrays.asList(rrdYArray));
            rrdY[] rrdYArray2 = rrks_1.id_class(string, rrdo_1.id_case());
            linkedHashSet.addAll(Arrays.asList(rrdYArray2));
        }
        return linkedHashSet.toArray(new rrdY[linkedHashSet.size()]);
    }

    public static rrxz_3 id_break(String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = rrbb_3.id_class(string, " ");
        if (stringArray.length == 1) {
            String string2 = stringArray[0];
            if (string2.equals("off") || string2.equals("false")) {
                return new rrxz_3(false);
            }
        } else if (stringArray.length == 2 || stringArray.length == 4) {
            String string3 = stringArray[0];
            String string4 = stringArray[1];
            String string5 = string3;
            String string6 = string4;
            if (stringArray.length == 4) {
                string5 = stringArray[2];
                string6 = stringArray[3];
            }
            Integer n = id_throws.get(string3);
            Integer n2 = id_throws.get(string4);
            Integer n3 = id_throws.get(string5);
            Integer n4 = id_throws.get(string6);
            if (n != null && n2 != null && n3 != null && n4 != null) {
                return new rrxz_3(true, n, n2, n3, n4);
            }
        }
        rrdJ.id_class("Invalid blend mode: " + string);
        return null;
    }

    private static Map<String, Integer> id_break() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("NEVER", new Integer(512));
        hashMap.put("LESS", new Integer(513));
        hashMap.put("EQUAL", new Integer(514));
        hashMap.put("LEQUAL", new Integer(515));
        hashMap.put("GREATER", new Integer(516));
        hashMap.put("NOTEQUAL", new Integer(517));
        hashMap.put("GEQUAL", new Integer(518));
        hashMap.put("ALWAYS", new Integer(519));
        return Collections.unmodifiableMap(hashMap);
    }

    public static void id_break(Properties properties) {
        for (String string : properties.keySet()) {
            String[] stringArray = rrbb_3.id_class(string, ".");
            if (stringArray.length != 2) continue;
            String string2 = stringArray[0];
            String string3 = stringArray[1];
            if (!string2.equals("alphaTest")) continue;
            rrdG rrdG2 = rrdZ.id_native(string3);
            if (rrdG2 == null) {
                rrdJ.id_class("Invalid program name: " + string3);
                continue;
            }
            String string4 = properties.getProperty(string).trim();
            rrxW_2 rrxW_22 = rrks_1.id_class(string4);
            if (rrxW_22 == null) continue;
            rrdG2.id_class(rrxW_22);
        }
    }

    public static Map<String, rrXw_1> id_break(Properties properties, rrdD[] rrdDArray) {
        String string = "program.";
        Pattern pattern = Pattern.compile("program\\.([^.]+)\\.enabled");
        HashMap<String, rrXw_1> hashMap = new HashMap<String, rrXw_1>();
        for (String string2 : properties.keySet()) {
            Matcher matcher = pattern.matcher(string2);
            if (!matcher.matches()) continue;
            String string3 = matcher.group(1);
            String string4 = properties.getProperty(string2).trim();
            rrXw_1 rrXw_12 = rrks_1.id_class(string4, rrdDArray);
            if (rrXw_12 == null) {
                rrdJ.id_class("Error parsing program condition: " + string2);
                continue;
            }
            hashMap.put(string3, rrXw_12);
        }
        return hashMap;
    }

    public static void id_throws(Properties properties) {
        for (String string : properties.keySet()) {
            String[] stringArray = rrbb_3.id_class(string, ".");
            if (stringArray.length != 3) continue;
            String string2 = stringArray[0];
            String string3 = stringArray[1];
            String string4 = stringArray[2];
            if (!string2.equals("flip")) continue;
            rrdG rrdG2 = rrdZ.id_native(string3);
            if (rrdG2 == null) {
                rrdJ.id_class("Invalid program name: " + string3);
                continue;
            }
            Boolean[] booleanArray = rrdG2.id_this();
            int n = rrdZ.id_implements(string4);
            if (n >= 0 && n < booleanArray.length) {
                String string5 = properties.getProperty(string).trim();
                Boolean bl = rrbb_3.id_class(string5, (Boolean)null);
                if (bl == null) {
                    rrdJ.id_class("Invalid boolean value: " + string5);
                    continue;
                }
                booleanArray[n] = bl;
                continue;
            }
            rrdJ.id_class("Invalid buffer name: " + string4);
        }
    }

    public static void id_protected(Properties properties) {
        for (String string : properties.keySet()) {
            String[] stringArray = rrbb_3.id_class(string, ".");
            if (stringArray.length != 2) continue;
            String string2 = stringArray[0];
            String string3 = stringArray[1];
            if (!string2.equals("scale")) continue;
            rrdG rrdG2 = rrdZ.id_native(string3);
            if (rrdG2 == null) {
                rrdJ.id_class("Invalid program name: " + string3);
                continue;
            }
            String string4 = properties.getProperty(string).trim();
            rrdj_1 rrdj_12 = rrks_1.id_byte(string4);
            if (rrdj_12 == null) continue;
            rrdG2.id_class(rrdj_12);
        }
    }

    private static rrWz_1 id_protected(String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = rrbb_3.id_class(string, " ");
        if (stringArray.length != 2) {
            return null;
        }
        int n = rrbb_3.id_class(stringArray[0], -1);
        int n2 = rrbb_3.id_class(stringArray[1], -1);
        if (n >= 0 && n2 >= 0) {
            return new rrWz_1(false, n, n2);
        }
        float f = rrbb_3.id_class(stringArray[0], -1.0f);
        float f2 = rrbb_3.id_class(stringArray[1], -1.0f);
        return f >= 0.0f && f2 >= 0.0f ? new rrWz_1(true, f, f2) : null;
    }
}

