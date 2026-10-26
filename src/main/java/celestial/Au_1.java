/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ac_1;
import celestial.Am_1;
import celestial.rya_3;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;

public class Au_1
extends Thread {
    private final Am_1 id_class;
    private final InetAddress id_break;
    private final MulticastSocket id_byte;

    public Au_1(Am_1 am_1) throws IOException {
        super("LanServerDetector #" + Ac_1.id_class.incrementAndGet());
        this.id_class = am_1;
        this.setDaemon(true);
        this.setUncaughtExceptionHandler(new rya_3(Ac_1.id_break));
        this.id_byte = new MulticastSocket(4445);
        this.id_break = InetAddress.getByName("224.0.2.60");
        this.id_byte.setSoTimeout(5000);
        this.id_byte.joinGroup(this.id_break);
    }

    @Override
    public void run() {
        byte[] byArray = new byte[1024];
        while (!this.isInterrupted()) {
            DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length);
            try {
                this.id_byte.receive(datagramPacket);
            }
            catch (SocketTimeoutException socketTimeoutException) {
                continue;
            }
            catch (IOException iOException) {
                Ac_1.id_break.error("Couldn't ping server", (Throwable)iOException);
                break;
            }
            String string = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength(), StandardCharsets.UTF_8);
            Ac_1.id_break.debug("{}: {}", (Object)datagramPacket.getAddress(), (Object)string);
            this.id_class.id_class(string, datagramPacket.getAddress());
        }
        try {
            this.id_byte.leaveGroup(this.id_break);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.id_byte.close();
    }
}

