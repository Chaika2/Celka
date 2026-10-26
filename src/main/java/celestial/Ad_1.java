/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import com.mojang.datafixers.util.Pair;
import java.net.IDN;
import java.util.Hashtable;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

public class Ad_1 {
    private final String id_class;
    private final int id_break;

    private Ad_1(String string, int n) {
        this.id_class = string;
        this.id_break = n;
    }

    private static int id_class(String string, int n) {
        try {
            return Integer.parseInt(string.trim());
        }
        catch (Exception exception) {
            return n;
        }
    }

    public static Ad_1 id_class(String string) {
        int n;
        Object object;
        int n2;
        if (string == null) {
            return null;
        }
        String[] stringArray = string.split(":");
        if (string.startsWith("[") && (n2 = string.indexOf("]")) > 0) {
            String string2 = string.substring(1, n2);
            object = string.substring(n2 + 1).trim();
            if (object.startsWith(":") && !object.isEmpty()) {
                object = object.substring(1);
                stringArray = new String[]{string2, object};
            } else {
                stringArray = new String[]{string2};
            }
        }
        if (stringArray.length > 2) {
            stringArray = new String[]{string};
        }
        String string3 = stringArray[0];
        int n3 = n = stringArray.length > 1 ? Ad_1.id_class(stringArray[1], 25565) : 25565;
        if (n == 25565) {
            object = Ad_1.id_break(string3);
            string3 = (String)object.getFirst();
            n = (Integer)object.getSecond();
        }
        return new Ad_1(string3, n);
    }

    public String id_class() {
        try {
            return IDN.toASCII(this.id_class);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return "";
        }
    }

    private static Pair<String, Integer> id_break(String string) {
        try {
            String string2 = "com.sun.jndi.dns.DnsContextFactory";
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            Hashtable<String, String> hashtable = new Hashtable<String, String>();
            hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            hashtable.put("java.naming.provider.url", "dns:");
            hashtable.put("com.sun.jndi.dns.timeout.retries", "1");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            Attributes attributes = initialDirContext.getAttributes("_minecraft._tcp." + string, new String[]{"SRV"});
            Attribute attribute = attributes.get("srv");
            if (attribute != null) {
                String[] stringArray = attribute.get().toString().split(" ", 4);
                return Pair.of((Object)stringArray[3], (Object)Ad_1.id_class(stringArray[2], 25565));
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return Pair.of((Object)string, (Object)25565);
    }

    public int id_break() {
        return this.id_break;
    }
}

