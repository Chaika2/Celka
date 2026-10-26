/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrJF;
import celestial.rrJL;
import celestial.rrJQ;
import celestial.rrJZ;
import celestial.rrJc_1;
import celestial.rrJu_1;
import celestial.rrbb_3;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class rrJN {
    private static Map id_finally = new HashMap();
    public static final String id_class = "User-Agent";
    public static final String id_break = "Host";
    public static final String id_byte = "Accept";
    public static final String id_protected = "Location";
    public static final String id_throws = "Keep-Alive";
    public static final String id_case = "Connection";
    public static final String id_catch = "keep-alive";
    public static final String id_private = "Transfer-Encoding";
    public static final String id_implements = "chunked";

    private rrJN() {
    }

    public static void id_class(String string, rrJQ rrJQ2) throws IOException {
        rrJN.id_class(string, rrJQ2, Proxy.NO_PROXY);
    }

    private static synchronized void id_class(String string, int n, Proxy proxy, rrJu_1 rrJu_12) {
        String string2 = rrJN.id_break(string, n, proxy);
        rrJu_1 rrJu_13 = (rrJu_1)id_finally.get(string2);
        if (rrJu_13 == rrJu_12) {
            id_finally.remove(string2);
        }
    }

    public static byte[] id_class(String string) throws IOException {
        return rrJN.id_break(string, Proxy.NO_PROXY);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static rrJL id_class(rrJF rrJF2) throws IOException {
        HashMap hashMap = new HashMap();
        String string = "Response";
        String string2 = "Exception";
        rrJc_1 rrJc_12 = new rrJc_1(hashMap);
        HashMap hashMap2 = hashMap;
        synchronized (hashMap2) {
            rrJZ rrJZ2 = new rrJZ(rrJF2, rrJc_12);
            rrJN.id_class(rrJZ2);
            try {
                hashMap.wait();
            }
            catch (InterruptedException interruptedException) {
                throw new InterruptedIOException("Interrupted");
            }
            Exception exception = (Exception)hashMap.get("Exception");
            if (exception != null) {
                if (exception instanceof IOException) {
                    throw (IOException)exception;
                }
                if (exception instanceof RuntimeException) {
                    throw (RuntimeException)exception;
                }
                throw new RuntimeException(exception.getMessage(), exception);
            }
            rrJL rrJL2 = (rrJL)hashMap.get("Response");
            if (rrJL2 == null) {
                throw new IOException("Response is null");
            }
            return rrJL2;
        }
    }

    public static boolean id_class() {
        for (rrJu_1 rrJu_12 : id_finally.values()) {
            if (!rrJu_12.id_catch()) continue;
            return true;
        }
        return false;
    }

    public static void id_class(String string, rrJQ rrJQ2, Proxy proxy) throws IOException {
        rrJF rrJF2 = rrJN.id_class(string, proxy);
        rrJZ rrJZ2 = new rrJZ(rrJF2, rrJQ2);
        rrJN.id_class(rrJZ2);
    }

    public static rrJF id_class(String string, Proxy proxy) throws IOException {
        URL uRL = new URL(string);
        if (!uRL.getProtocol().equals("http")) {
            throw new IOException("Only protocol http is supported: " + uRL);
        }
        String string2 = uRL.getFile();
        String string3 = uRL.getHost();
        int n = uRL.getPort();
        if (n <= 0) {
            n = 80;
        }
        String string4 = "GET";
        String string5 = "HTTP/1.1";
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put(id_class, "Java/" + System.getProperty("java.version"));
        linkedHashMap.put(id_break, string3);
        linkedHashMap.put(id_byte, "text/html, image/gif, image/png");
        linkedHashMap.put(id_case, id_catch);
        byte[] byArray = new byte[]{};
        return new rrJF(string3, n, proxy, string4, string2, string5, linkedHashMap, byArray);
    }

    private static synchronized rrJu_1 id_class(String string, int n, Proxy proxy) {
        String string2 = rrJN.id_break(string, n, proxy);
        rrJu_1 rrJu_12 = (rrJu_1)id_finally.get(string2);
        if (rrJu_12 == null) {
            rrJu_12 = new rrJu_1(string, n, proxy);
            id_finally.put(string2, rrJu_12);
        }
        return rrJu_12;
    }

    public static void id_class(rrJZ rrJZ2) {
        rrJF rrJF2 = rrJZ2.id_class();
        rrJu_1 rrJu_12 = rrJN.id_class(rrJF2.id_class(), rrJF2.id_break(), rrJF2.id_implements());
        while (!rrJu_12.id_class(rrJZ2)) {
            rrJN.id_class(rrJF2.id_class(), rrJF2.id_break(), rrJF2.id_implements(), rrJu_12);
            rrJu_12 = rrJN.id_class(rrJF2.id_class(), rrJF2.id_break(), rrJF2.id_implements());
        }
    }

    private static String id_break(String string, int n, Proxy proxy) {
        return string + ":" + n + "-" + proxy;
    }

    public static byte[] id_break(String string, Proxy proxy) throws IOException {
        if (string.startsWith("file:")) {
            URL uRL = new URL(string);
            InputStream inputStream = uRL.openStream();
            return rrbb_3.id_byte(inputStream);
        }
        rrJF rrJF2 = rrJN.id_class(string, proxy);
        rrJL rrJL2 = rrJN.id_class(rrJF2);
        if (rrJL2.id_class() / 100 != 2) {
            throw new IOException("HTTP response: " + rrJL2.id_class());
        }
        return rrJL2.id_protected();
    }
}

