/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rCG;
import celestial.rCM;
import celestial.rCO;
import celestial.rCX;
import celestial.rCb_1;
import celestial.rCh_1;
import celestial.rCk_1;
import celestial.rCr_1;
import celestial.rhd_3;
import celestial.rnD_2;
import celestial.rnU_2;
import celestial.rnW_2;
import celestial.rnY_2;
import celestial.rna_3;
import celestial.rno_3;
import celestial.rnv_3;
import celestial.rql_3;
import celestial.rrGr_1;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rCE {
    public static final Logger id_throws = LogManager.getLogger();
    public static final File id_class = new File("banned-ips.txt");
    public static final File id_break = new File("banned-players.txt");
    public static final File id_byte = new File("ops.txt");
    public static final File id_protected = new File("white-list.txt");

    public static boolean id_byte(rnW_2 rnW_22) {
        rna_3 rna_32 = new rna_3(rCr_1.id_byte);
        if (id_byte.exists() && id_byte.isFile()) {
            if (rna_32.id_break().exists()) {
                try {
                    rna_32.id_case();
                }
                catch (IOException iOException) {
                    id_throws.warn("Could not load existing file {}", (Object)rna_32.id_break().getName(), (Object)iOException);
                }
            }
            try {
                List list = Files.readLines((File)id_byte, (Charset)StandardCharsets.UTF_8);
                rCb_1 rCb_12 = new rCb_1(rnW_22, rna_32);
                rCE.id_class(rnW_22, list, rCb_12);
                rna_32.id_throws();
                rCE.id_break(id_byte);
                return true;
            }
            catch (IOException iOException) {
                id_throws.warn("Could not read old oplist to convert it!", (Throwable)iOException);
                return false;
            }
            catch (rCX rCX2) {
                id_throws.error("Conversion failed, please try again later", (Throwable)rCX2);
                return false;
            }
        }
        return true;
    }

    public static List<String> id_class(File file, Map<String, String[]> map) throws IOException {
        List list = Files.readLines((File)file, (Charset)StandardCharsets.UTF_8);
        for (String string : list) {
            if ((string = string.trim()).startsWith("#") || string.length() < 1) continue;
            String[] stringArray = string.split("\\|");
            map.put(stringArray[0].toLowerCase(Locale.ROOT), stringArray);
        }
        return list;
    }

    private static boolean id_class() {
        boolean bl = false;
        if (id_break.exists() && id_break.isFile()) {
            bl = true;
        }
        boolean bl2 = false;
        if (id_class.exists() && id_class.isFile()) {
            bl2 = true;
        }
        boolean bl3 = false;
        if (id_byte.exists() && id_byte.isFile()) {
            bl3 = true;
        }
        boolean bl4 = false;
        if (id_protected.exists() && id_protected.isFile()) {
            bl4 = true;
        }
        if (!(bl || bl2 || bl3 || bl4)) {
            return true;
        }
        id_throws.warn("**** FAILED TO START THE SERVER AFTER ACCOUNT CONVERSION!");
        id_throws.warn("** please remove the following files and restart the server:");
        if (bl) {
            id_throws.warn("* {}", (Object)id_break.getName());
        }
        if (bl2) {
            id_throws.warn("* {}", (Object)id_class.getName());
        }
        if (bl3) {
            id_throws.warn("* {}", (Object)id_byte.getName());
        }
        if (bl4) {
            id_throws.warn("* {}", (Object)id_protected.getName());
        }
        return false;
    }

    public static Date id_class(String string, Date date) {
        Date date2;
        try {
            date2 = rnY_2.id_class.parse(string);
        }
        catch (ParseException parseException) {
            date2 = date;
        }
        return date2;
    }

    public static void id_class(File file) {
        if (file.exists() ? !file.isDirectory() : !file.mkdirs()) {
            throw new rCX("Can't create directory " + file.getName() + " in world save directory.");
        }
    }

    private static void id_class(rnW_2 rnW_22, Collection<String> collection, ProfileLookupCallback profileLookupCallback) {
        String[] stringArray = (String[])collection.stream().filter(string -> !rql_3.id_break(string)).toArray(String[]::new);
        if (rnW_22.B()) {
            rnW_22.v().findProfilesByNames(stringArray, Agent.MINECRAFT, profileLookupCallback);
        } else {
            for (String string2 : stringArray) {
                UUID uUID = rhd_3.id_class(new GameProfile((UUID)null, string2));
                GameProfile gameProfile = new GameProfile(uUID, string2);
                profileLookupCallback.onProfileLookupSucceeded(gameProfile);
            }
        }
    }

    public static boolean id_class(rnW_2 rnW_22) {
        rno_3 rno_32 = new rno_3(rCr_1.id_class);
        if (id_break.exists() && id_break.isFile()) {
            if (rno_32.id_break().exists()) {
                try {
                    rno_32.id_case();
                }
                catch (IOException iOException) {
                    id_throws.warn("Could not load existing file {}", (Object)rno_32.id_break().getName(), (Object)iOException);
                }
            }
            try {
                HashMap hashMap = Maps.newHashMap();
                rCE.id_class(id_break, hashMap);
                rCG rCG2 = new rCG(rnW_22, hashMap, rno_32);
                rCE.id_class(rnW_22, hashMap.keySet(), rCG2);
                rno_32.id_throws();
                rCE.id_break(id_break);
                return true;
            }
            catch (IOException iOException) {
                id_throws.warn("Could not read old user banlist to convert it!", (Throwable)iOException);
                return false;
            }
            catch (rCX rCX2) {
                id_throws.error("Conversion failed, please try again later", (Throwable)rCX2);
                return false;
            }
        }
        return true;
    }

    public static UUID id_class(rnW_2 rnW_22, String string) {
        if (!rql_3.id_break(string) && string.length() <= 16) {
            GameProfile gameProfile = rnW_22.F().id_class(string);
            if (gameProfile != null && gameProfile.getId() != null) {
                return gameProfile.getId();
            }
            if (!rnW_22.id_const() && rnW_22.B()) {
                ArrayList arrayList = Lists.newArrayList();
                rCO rCO2 = new rCO(rnW_22, arrayList);
                rCE.id_class(rnW_22, Lists.newArrayList((Object[])new String[]{string}), rCO2);
                return !arrayList.isEmpty() && ((GameProfile)arrayList.get(0)).getId() != null ? ((GameProfile)arrayList.get(0)).getId() : null;
            }
            return rhd_3.id_class(new GameProfile((UUID)null, string));
        }
        try {
            return UUID.fromString(string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public static boolean id_class(rnv_3 rnv_32) {
        File file = rCE.id_catch(rnv_32);
        File file2 = new File(file.getParentFile(), "playerdata");
        File file3 = new File(file.getParentFile(), "unknownplayers");
        if (file.exists() && file.isDirectory()) {
            File[] fileArray = file.listFiles();
            ArrayList arrayList = Lists.newArrayList();
            for (File file4 : fileArray) {
                String string;
                String string2 = file4.getName();
                if (!string2.toLowerCase(Locale.ROOT).endsWith(".dat") || (string = string2.substring(0, string2.length() - ".dat".length())).isEmpty()) continue;
                arrayList.add(string);
            }
            try {
                Object[] objectArray = arrayList.toArray(new String[arrayList.size()]);
                rCh_1 rCh_12 = new rCh_1(rnv_32, file2, file3, file, (String[])objectArray);
                rCE.id_class(rnv_32, Lists.newArrayList((Object[])objectArray), rCh_12);
                return true;
            }
            catch (rCX rCX2) {
                id_throws.error("Conversion failed, please try again later", (Throwable)rCX2);
                return false;
            }
        }
        return true;
    }

    public static boolean id_break(rnW_2 rnW_22) {
        rnU_2 rnU_22 = new rnU_2(rCr_1.id_break);
        if (id_class.exists() && id_class.isFile()) {
            if (rnU_22.id_break().exists()) {
                try {
                    rnU_22.id_case();
                }
                catch (IOException iOException) {
                    id_throws.warn("Could not load existing file {}", (Object)rnU_22.id_break().getName(), (Object)iOException);
                }
            }
            try {
                HashMap hashMap = Maps.newHashMap();
                rCE.id_class(id_class, hashMap);
                for (String string : hashMap.keySet()) {
                    String[] stringArray = (String[])hashMap.get(string);
                    Date date = stringArray.length > 1 ? rCE.id_class(stringArray[1], (Date)null) : null;
                    String string2 = stringArray.length > 2 ? stringArray[2] : null;
                    Date date2 = stringArray.length > 3 ? rCE.id_class(stringArray[3], (Date)null) : null;
                    String string3 = stringArray.length > 4 ? stringArray[4] : null;
                    rnU_22.id_class(new rnD_2(string, date, string2, date2, string3));
                }
                rnU_22.id_throws();
                rCE.id_break(id_class);
                return true;
            }
            catch (IOException iOException) {
                id_throws.warn("Could not parse old ip banlist to convert it!", (Throwable)iOException);
                return false;
            }
        }
        return true;
    }

    private static void id_break(File file) {
        File file2 = new File(file.getName() + ".converted");
        file.renameTo(file2);
    }

    public static boolean id_throws(rnW_2 rnW_22) {
        boolean bl = rCE.id_class();
        return bl && rCE.id_case(rnW_22);
    }

    private static File id_catch(rnW_2 rnW_22) {
        return rnW_22.id_class(rrGr_1.id_protected).toFile();
    }

    private static boolean id_case(rnW_2 rnW_22) {
        File file = rCE.id_catch(rnW_22);
        if (!file.exists() || !file.isDirectory() || file.list().length <= 0 && file.delete()) {
            return true;
        }
        id_throws.warn("**** DETECTED OLD PLAYER DIRECTORY IN THE WORLD SAVE");
        id_throws.warn("**** THIS USUALLY HAPPENS WHEN THE AUTOMATIC CONVERSION FAILED IN SOME WAY");
        id_throws.warn("** please restart the server and if the problem persists, remove the directory '{}'", (Object)file.getPath());
        return false;
    }

    public static boolean id_protected(rnW_2 rnW_22) {
        rCk_1 rCk_12 = new rCk_1(rCr_1.id_protected);
        if (id_protected.exists() && id_protected.isFile()) {
            if (rCk_12.id_break().exists()) {
                try {
                    rCk_12.id_case();
                }
                catch (IOException iOException) {
                    id_throws.warn("Could not load existing file {}", (Object)rCk_12.id_break().getName(), (Object)iOException);
                }
            }
            try {
                List list = Files.readLines((File)id_protected, (Charset)StandardCharsets.UTF_8);
                rCM rCM2 = new rCM(rnW_22, rCk_12);
                rCE.id_class(rnW_22, list, rCM2);
                rCk_12.id_throws();
                rCE.id_break(id_protected);
                return true;
            }
            catch (IOException iOException) {
                id_throws.warn("Could not read old whitelist to convert it!", (Throwable)iOException);
                return false;
            }
            catch (rCX rCX2) {
                id_throws.error("Conversion failed, please try again later", (Throwable)rCX2);
                return false;
            }
        }
        return true;
    }
}

