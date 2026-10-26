/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rya_3;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AJ
extends Thread {
    private static final AtomicInteger id_class = new AtomicInteger(0);
    private static final Logger id_break = LogManager.getLogger();
    private final String id_byte;
    private final DatagramSocket id_protected;
    private boolean id_throws = true;
    private final String id_case;

    public AJ(String string, String string2) throws IOException {
        super("LanServerPinger #" + id_class.incrementAndGet());
        this.id_byte = string;
        this.id_case = string2;
        this.setDaemon(true);
        this.setUncaughtExceptionHandler(new rya_3(id_break));
        this.id_protected = new DatagramSocket();
    }

    @Override
    public void run() {
        String string = AJ.id_class(this.id_byte, this.id_case);
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        while (!this.isInterrupted() && this.id_throws) {
            try {
                InetAddress inetAddress = InetAddress.getByName("224.0.2.60");
                DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length, inetAddress, 4445);
                this.id_protected.send(datagramPacket);
            }
            catch (IOException iOException) {
                id_break.warn("LanServerPinger: {}", (Object)iOException.getMessage());
                break;
            }
            try {
                AJ.sleep(1500L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    @Override
    public void interrupt() {
        super.interrupt();
        this.id_throws = false;
    }

    public static String id_class(String string, String string2) {
        return "[MOTD]" + string + "[/MOTD][AD]" + string2 + "[/AD]";
    }

    public static String id_class(String string) {
        int n = string.indexOf("[MOTD]");
        if (n < 0) {
            return "missing no";
        }
        int n2 = string.indexOf("[/MOTD]", n + "[MOTD]".length());
        return n2 < n ? "missing no" : string.substring(n + "[MOTD]".length(), n2);
    }

    public static String id_break(String string) {
        int n = string.indexOf("[/MOTD]");
        if (n < 0) {
            return null;
        }
        int n2 = string.indexOf("[/MOTD]", n + "[/MOTD]".length());
        if (n2 >= 0) {
            return null;
        }
        int n3 = string.indexOf("[AD]", n + "[/MOTD]".length());
        if (n3 < 0) {
            return null;
        }
        int n4 = string.indexOf("[/AD]", n3 + "[AD]".length());
        return n4 < n3 ? null : string.substring(n3 + "[AD]".length(), n4);
    }
}

