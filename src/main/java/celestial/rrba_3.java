/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 *  org.apache.commons.io.Charsets
 *  org.apache.commons.io.IOUtils
 */
package celestial;

import celestial.jI_2;
import celestial.rAC;
import celestial.rAF;
import celestial.rAI;
import celestial.rAL;
import celestial.rgn_3;
import celestial.rqO_2;
import celestial.rrbb_3;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class rrba_3 {
    private static final Splitter id_class = Splitter.on((char)'=').limit(2);
    private static final Pattern id_break = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");

    public static String id_byte() {
        return jI_2.id_class("options.off", new Object[0]);
    }

    public static void id_class() {
        HashMap hashMap = new HashMap();
        ArrayList<CallSite> arrayList = new ArrayList<CallSite>();
        String string = "optifine/lang/";
        String string2 = "en_us";
        String string3 = ".lang";
        arrayList.add((CallSite)((Object)(string + string2 + string3)));
        if (!rrbb_3.rE().rG.equals(string2)) {
            arrayList.add((CallSite)((Object)(string + rrbb_3.rE().rG + string3)));
        }
        String[] stringArray = arrayList.toArray(new String[arrayList.size()]);
        rrba_3.id_class(rrbb_3.W(), stringArray, hashMap);
        rAC[] rACArray = rrbb_3.d();
        for (int i = 0; i < rACArray.length; ++i) {
            rAC rAC2 = rACArray[i];
            rrba_3.id_class(rAC2, stringArray, hashMap);
        }
    }

    public static String id_class(String string, String string2) {
        String string3 = jI_2.id_class(string, new Object[0]);
        return string3 != null && !string3.equals(string) ? string3 : string2;
    }

    private static void id_class(rAC rAC2, String[] stringArray, Map map) {
        try {
            for (int i = 0; i < stringArray.length; ++i) {
                InputStream inputStream;
                String string = stringArray[i];
                rqO_2 rqO_22 = new rqO_2(string);
                if (!rAC2.id_break(rAI.CLIENT_RESOURCES, rqO_22) || (inputStream = rAC2.id_class(rAI.CLIENT_RESOURCES, rqO_22)) == null) continue;
                rrba_3.id_class(inputStream, map);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static void id_class(InputStream inputStream, Map map) throws IOException {
        Iterator iterator = IOUtils.readLines((InputStream)inputStream, (Charset)Charsets.UTF_8).iterator();
        inputStream.close();
        while (iterator.hasNext()) {
            String[] stringArray;
            String string = (String)iterator.next();
            if (string.isEmpty() || string.charAt(0) == '#' || (stringArray = (String[])Iterables.toArray((Iterable)id_class.split((CharSequence)string), String.class)) == null || stringArray.length != 2) continue;
            String string2 = stringArray[0];
            String string3 = id_break.matcher(stringArray[1]).replaceAll("%$1s");
            map.put(string2, string3);
        }
    }

    public static String id_class(String string) {
        return jI_2.id_class(string, new Object[0]);
    }

    public static void id_class(rAL rAL2, String string, Map<String, String> map) {
        try {
            String string2 = "optifine/lang/" + string + ".lang";
            rqO_2 rqO_22 = new rqO_2(string2);
            rAF rAF2 = rAL2.id_class(rqO_22);
            InputStream inputStream = rAF2.id_break();
            rrba_3.id_class(inputStream, map);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static String id_break() {
        return jI_2.id_class("options.on", new Object[0]);
    }

    public static rgn_3 id_break(String string) {
        return new rgn_3(string);
    }

    public static String id_throws() {
        return jI_2.id_class("options.graphics.fancy", new Object[0]);
    }

    public static String id_case() {
        return jI_2.id_class("generator.default", new Object[0]);
    }

    public static String id_protected() {
        return jI_2.id_class("options.graphics.fast", new Object[0]);
    }
}

