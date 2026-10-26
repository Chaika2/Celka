/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrJL;
import celestial.rrJZ;
import celestial.rrJu_1;
import celestial.rrbb_3;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;

public class rrJm_1
extends Thread {
    private rrJu_1 id_class = null;
    private static final Charset id_break = Charset.forName("ASCII");
    private static final String id_byte = "Content-Length";
    private static final char id_protected = '\r';
    private static final char id_throws = '\n';

    private String id_byte(InputStream inputStream) throws IOException {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = -1;
        boolean bl = false;
        while ((n = inputStream.read()) >= 0) {
            byteArrayOutputStream.write(n);
            if (n2 == 13 && n == 10) {
                bl = true;
                break;
            }
            n2 = n;
        }
        byte[] byArray = byteArrayOutputStream.toByteArray();
        String string = new String(byArray, id_break);
        if (bl) {
            string = string.substring(0, string.length() - 2);
        }
        return string;
    }

    public rrJm_1(rrJu_1 rrJu_12) {
        super("HttpPipelineReceiver");
        this.id_class = rrJu_12;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            rrJZ rrJZ2 = null;
            try {
                rrJZ2 = this.id_class.id_protected();
                InputStream inputStream = this.id_class.id_break();
                rrJL rrJL2 = this.id_class(inputStream);
                this.id_class.id_class(rrJZ2, rrJL2);
            }
            catch (InterruptedException interruptedException) {
                return;
            }
            catch (Exception exception) {
                this.id_class.id_break(rrJZ2, exception);
            }
        }
    }

    private rrJL id_class(InputStream inputStream) throws IOException {
        String string = this.id_byte(inputStream);
        String[] stringArray = rrbb_3.id_class(string, " ");
        if (stringArray.length < 3) {
            throw new IOException("Invalid status line: " + string);
        }
        String string2 = stringArray[0];
        int n = rrbb_3.id_class(stringArray[1], 0);
        String string3 = stringArray[2];
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        while (true) {
            String string4;
            String string5;
            String string6;
            if ((string6 = this.id_byte(inputStream)).length() <= 0) {
                byte[] byArray = null;
                string5 = (String)linkedHashMap.get(id_byte);
                if (string5 != null) {
                    int n2 = rrbb_3.id_class(string5, -1);
                    if (n2 > 0) {
                        byArray = new byte[n2];
                        this.id_class(byArray, inputStream);
                    }
                } else {
                    string4 = (String)linkedHashMap.get("Transfer-Encoding");
                    if (rrbb_3.id_class((Object)string4, (Object)"chunked")) {
                        byArray = this.id_break(inputStream);
                    }
                }
                return new rrJL(n, string, linkedHashMap, byArray);
            }
            int n3 = string6.indexOf(":");
            if (n3 <= 0) continue;
            string5 = string6.substring(0, n3).trim();
            string4 = string6.substring(n3 + 1).trim();
            linkedHashMap.put(string5, string4);
        }
    }

    private void id_class(byte[] byArray, InputStream inputStream) throws IOException {
        int n;
        for (int i = 0; i < byArray.length; i += n) {
            n = inputStream.read(byArray, i, byArray.length - i);
            if (n >= 0) continue;
            throw new EOFException();
        }
    }

    private byte[] id_break(InputStream inputStream) throws IOException {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        do {
            String string = this.id_byte(inputStream);
            String[] stringArray = rrbb_3.id_class(string, "; ");
            n = Integer.parseInt(stringArray[0], 16);
            byte[] byArray = new byte[n];
            this.id_class(byArray, inputStream);
            byteArrayOutputStream.write(byArray);
            this.id_byte(inputStream);
        } while (n != 0);
        return byteArrayOutputStream.toByteArray();
    }
}

