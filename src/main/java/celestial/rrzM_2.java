/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.jR_2;
import celestial.jg_3;
import celestial.rAC;
import celestial.rAH;
import celestial.rAI;
import celestial.rAY;
import celestial.rqO_2;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.rrzE_2;
import celestial.rrzX_2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class rrzM_2 {
    private static String[] id_class(File file, String[] stringArray, String[] stringArray2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string = "assets/minecraft/";
        try {
            String[] stringArray3;
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
            while (enumeration.hasMoreElements()) {
                stringArray3 = enumeration.nextElement();
                String string2 = stringArray3.getName();
                if (!string2.startsWith(string) || !rrzX_2.id_class(string2 = string2.substring(string.length()), stringArray) || !rrzX_2.id_break(string2, stringArray2)) continue;
                if (!rrzM_2.id_class(string2)) {
                    rrbb_3.id_protected("Skipping non-lowercase path: " + string2);
                    continue;
                }
                arrayList.add(string2);
            }
            zipFile.close();
            stringArray3 = arrayList.toArray(new String[arrayList.size()]);
            return stringArray3;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return new String[0];
        }
    }

    private static String[] id_class(File file, String string, String[] stringArray, String[] stringArray2) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        String string2 = "assets/minecraft/";
        File[] fileArray = file.listFiles();
        if (fileArray == null) {
            return new String[0];
        }
        for (int i = 0; i < fileArray.length; ++i) {
            Object object;
            File file2 = fileArray[i];
            if (file2.isFile()) {
                object = string + file2.getName();
                if (!((String)object).startsWith(string2) || !rrzX_2.id_class((String)(object = ((String)object).substring(string2.length())), stringArray) || !rrzX_2.id_break((String)object, stringArray2)) continue;
                if (!rrzM_2.id_class((String)object)) {
                    rrbb_3.id_protected("Skipping non-lowercase path: " + (String)object);
                    continue;
                }
                arrayList.add(object);
                continue;
            }
            if (!file2.isDirectory()) continue;
            object = string + file2.getName() + "/";
            String[] stringArray3 = rrzM_2.id_class(file2, (String)object, stringArray, stringArray2);
            for (int j = 0; j < stringArray3.length; ++j) {
                String string3 = stringArray3[j];
                arrayList.add(string3);
            }
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    private static String[] id_class(rAC rAC2, String[] stringArray) {
        if (stringArray == null) {
            return new String[0];
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            if (!rrzM_2.id_class(string)) {
                rrbb_3.id_protected("Skipping non-lowercase path: " + string);
                continue;
            }
            rqO_2 rqO_22 = new rqO_2(string);
            if (!rAC2.id_break(rAI.CLIENT_RESOURCES, rqO_22)) continue;
            arrayList.add(string);
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    private static boolean id_class(String string) {
        return string.equals(string.toLowerCase(Locale.ROOT));
    }

    public static Properties id_class(InputStream inputStream, String string) {
        if (inputStream == null) {
            return null;
        }
        try {
            rrzE_2 rrzE_22 = new rrzE_2();
            rrzE_22.load(inputStream);
            inputStream.close();
            return rrzE_22;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public static String[] id_class(String string, String string2) {
        return rrzM_2.id_class(new String[]{string}, new String[]{string2});
    }

    public static String[] id_class(String[] stringArray, String[] stringArray2) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        rAC[] rACArray = rrbb_3.d();
        for (int i = 0; i < rACArray.length; ++i) {
            rAC rAC2 = rACArray[i];
            String[] stringArray3 = rrzM_2.id_class(rAC2, stringArray, stringArray2, (String[])null);
            linkedHashSet.addAll(Arrays.asList(stringArray3));
        }
        return linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    public static String[] id_class(rAC rAC2, String string, String string2, String[] stringArray) {
        return rrzM_2.id_class(rAC2, new String[]{string}, new String[]{string2}, stringArray);
    }

    public static String[] id_class(rAC rAC2, String[] stringArray, String[] stringArray2) {
        return rrzM_2.id_class(rAC2, stringArray, stringArray2, (String[])null);
    }

    public static String[] id_class(rAC rAC2, String[] stringArray, String[] stringArray2, String[] stringArray3) {
        rAC rAC3;
        if (rAC2 instanceof rAY) {
            return rrzM_2.id_class(rAC2, stringArray3);
        }
        if (rAC2 instanceof jg_3) {
            rAC3 = (rAC)rrxr_3.id_class(rAC2, rrxr_3.Sk);
            if (rAC3 == null) {
                rrbb_3.id_protected("LegacyResourcePackWrapper base resource pack not found: " + rAC2);
                return new String[0];
            }
            rAC2 = rAC3;
        }
        if (rAC2 instanceof jR_2) {
            rAC3 = (rAC)rrxr_3.id_class(rAC2, rrxr_3.Sz);
            if (rAC3 == null) {
                rrbb_3.id_protected("LegacyResourcePackWrapperV4 base resource pack not found: " + rAC2);
                return new String[0];
            }
            rAC2 = rAC3;
        }
        if (!(rAC2 instanceof rAH)) {
            rrbb_3.id_protected("Unknown resource pack type: " + rAC2);
            return new String[0];
        }
        rAC3 = (rAH)rAC2;
        File file = ((rAH)rAC3).id_break;
        if (file == null) {
            return new String[0];
        }
        if (file.isDirectory()) {
            return rrzM_2.id_class(file, "", stringArray, stringArray2);
        }
        if (file.isFile()) {
            return rrzM_2.id_class(file, stringArray, stringArray2);
        }
        rrbb_3.id_protected("Unknown resource pack file: " + file);
        return new String[0];
    }

    public static Properties id_break(String string, String string2) {
        rqO_2 rqO_22 = new rqO_2(string);
        try {
            InputStream inputStream = rrbb_3.id_class(rqO_22);
            if (inputStream == null) {
                return null;
            }
            rrzE_2 rrzE_22 = new rrzE_2();
            rrzE_22.load(inputStream);
            inputStream.close();
            rrbb_3.id_byte(string2 + ": Loading " + string);
            return rrzE_22;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
        catch (IOException iOException) {
            rrbb_3.id_protected(string2 + ": Error reading " + string);
            return null;
        }
    }
}

