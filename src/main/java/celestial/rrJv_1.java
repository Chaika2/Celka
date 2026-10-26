/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrJF;
import celestial.rrJZ;
import celestial.rrJu_1;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Map;

public class rrJv_1
extends Thread {
    private rrJu_1 id_class = null;
    private static final String id_break = "\r\n";
    private static Charset id_byte = Charset.forName("ASCII");

    public rrJv_1(rrJu_1 rrJu_12) {
        super("HttpPipelineSender");
        this.id_class = rrJu_12;
    }

    @Override
    public void run() {
        rrJZ rrJZ2 = null;
        try {
            this.id_class();
            while (!Thread.interrupted()) {
                rrJZ2 = this.id_class.id_byte();
                rrJF rrJF2 = rrJZ2.id_class();
                OutputStream outputStream = this.id_class.id_class();
                this.id_class(rrJF2, outputStream);
                this.id_class.id_break(rrJZ2);
            }
        }
        catch (InterruptedException interruptedException) {
            return;
        }
        catch (Exception exception) {
            this.id_class.id_class(rrJZ2, exception);
        }
    }

    private void id_class(rrJF rrJF2, OutputStream outputStream) throws IOException {
        this.id_class(outputStream, rrJF2.id_byte() + " " + rrJF2.id_protected() + " " + rrJF2.id_throws() + id_break);
        Map<String, String> map = rrJF2.id_case();
        for (String string : map.keySet()) {
            String string2 = rrJF2.id_case().get(string);
            this.id_class(outputStream, string + ": " + string2 + id_break);
        }
        this.id_class(outputStream, id_break);
    }

    private void id_class(OutputStream outputStream, String string) throws IOException {
        byte[] byArray = string.getBytes(id_byte);
        outputStream.write(byArray);
    }

    private void id_class() throws IOException {
        String string = this.id_class.id_private();
        int n = this.id_class.id_implements();
        Proxy proxy = this.id_class.id_finally();
        Socket socket = new Socket(proxy);
        socket.connect(new InetSocketAddress(string, n), 5000);
        this.id_class.id_class(socket);
    }
}

