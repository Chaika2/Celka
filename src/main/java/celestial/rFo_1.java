/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rFK;
import celestial.rFR;
import celestial.rFU;
import celestial.rFa_1;
import celestial.rFe_1;
import celestial.rqR_2;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.PortUnreachableException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rFo_1
extends rFe_1 {
    private static final Logger id_protected = LogManager.getLogger();
    private long id_throws;
    private final int id_case;
    private final int id_catch;
    private final int id_private;
    private final String id_implements;
    private final String id_finally;
    private DatagramSocket id_extends;
    private final byte[] id_native = new byte[1460];
    private String id_volatile;
    private String id_final;
    private final Map<SocketAddress, rFK> id_package;
    private final rFU id_int;
    private long id_new;
    private final rFR id_continue;

    private Boolean id_byte(DatagramPacket datagramPacket) {
        SocketAddress socketAddress = datagramPacket.getSocketAddress();
        if (!this.id_package.containsKey(socketAddress)) {
            return false;
        }
        byte[] byArray = datagramPacket.getData();
        return this.id_package.get(socketAddress).id_class() == rFa_1.id_byte(byArray, 7, datagramPacket.getLength());
    }

    private rFo_1(rFR rFR2, int n) {
        super("Query Listener");
        this.id_continue = rFR2;
        this.id_case = n;
        this.id_final = rFR2.id_break();
        this.id_catch = rFR2.id_byte();
        this.id_implements = rFR2.id_protected();
        this.id_private = rFR2.id_catch();
        this.id_finally = rFR2.id_implements();
        this.id_new = 0L;
        this.id_volatile = "0.0.0.0";
        if (!this.id_final.isEmpty() && !this.id_volatile.equals(this.id_final)) {
            this.id_volatile = this.id_final;
        } else {
            this.id_final = "0.0.0.0";
            try {
                InetAddress inetAddress = InetAddress.getLocalHost();
                this.id_volatile = inetAddress.getHostAddress();
            }
            catch (UnknownHostException unknownHostException) {
                id_protected.warn("Unable to determine local host IP, please set server-ip in server.properties", (Throwable)unknownHostException);
            }
        }
        this.id_int = new rFU(1460);
        this.id_package = Maps.newHashMap();
    }

    @Override
    public void run() {
        id_protected.info("Query running on {}:{}", (Object)this.id_final, (Object)this.id_case);
        this.id_throws = rqR_2.id_break();
        DatagramPacket datagramPacket = new DatagramPacket(this.id_native, this.id_native.length);
        try {
            while (this.id_class) {
                try {
                    this.id_extends.receive(datagramPacket);
                    this.id_protected();
                    this.id_class(datagramPacket);
                }
                catch (SocketTimeoutException socketTimeoutException) {
                    this.id_protected();
                }
                catch (PortUnreachableException portUnreachableException) {
                }
                catch (IOException iOException) {
                    this.id_class(iOException);
                }
            }
        }
        finally {
            id_protected.debug("closeSocket: {}:{}", (Object)this.id_final, (Object)this.id_case);
            this.id_extends.close();
        }
    }

    public static rFo_1 id_class(rFR rFR2) {
        int n = rFR2.id_class().id_super;
        if (0 < n && 65535 >= n) {
            rFo_1 rFo_12 = new rFo_1(rFR2, n);
            return !rFo_12.id_break() ? null : rFo_12;
        }
        id_protected.warn("Invalid query port {} found in server.properties (queries disabled)", (Object)n);
        return null;
    }

    private boolean id_class(DatagramPacket datagramPacket) throws IOException {
        byte[] byArray = datagramPacket.getData();
        int n = datagramPacket.getLength();
        SocketAddress socketAddress = datagramPacket.getSocketAddress();
        id_protected.debug("Packet len {} [{}]", (Object)n, (Object)socketAddress);
        if (3 <= n && -2 == byArray[0] && -3 == byArray[1]) {
            id_protected.debug("Packet '{}' [{}]", (Object)rFa_1.id_class(byArray[2]), (Object)socketAddress);
            switch (byArray[2]) {
                case 0: {
                    if (!this.id_byte(datagramPacket).booleanValue()) {
                        id_protected.debug("Invalid challenge [{}]", (Object)socketAddress);
                        return false;
                    }
                    if (15 == n) {
                        this.id_class(this.id_break(datagramPacket), datagramPacket);
                        id_protected.debug("Rules [{}]", (Object)socketAddress);
                    } else {
                        rFU rFU2 = new rFU(1460);
                        rFU2.id_class(0);
                        rFU2.id_class(this.id_class(datagramPacket.getSocketAddress()));
                        rFU2.id_class(this.id_implements);
                        rFU2.id_class("SMP");
                        rFU2.id_class(this.id_finally);
                        rFU2.id_class(Integer.toString(this.id_continue.id_case()));
                        rFU2.id_class(Integer.toString(this.id_private));
                        rFU2.id_class((short)this.id_catch);
                        rFU2.id_class(this.id_volatile);
                        this.id_class(rFU2.id_class(), datagramPacket);
                        id_protected.debug("Status [{}]", (Object)socketAddress);
                    }
                }
                default: {
                    return true;
                }
                case 9: 
            }
            this.id_protected(datagramPacket);
            id_protected.debug("Challenge [{}]", (Object)socketAddress);
            return true;
        }
        id_protected.debug("Invalid packet [{}]", (Object)socketAddress);
        return false;
    }

    private void id_class(Exception exception) {
        if (this.id_class) {
            id_protected.warn("Unexpected exception", (Throwable)exception);
            if (!this.id_throws()) {
                id_protected.error("Failed to recover from exception, shutting down!");
                this.id_class = false;
            }
        }
    }

    private byte[] id_class(SocketAddress socketAddress) {
        return this.id_package.get(socketAddress).id_byte();
    }

    private void id_class(byte[] byArray, DatagramPacket datagramPacket) throws IOException {
        this.id_extends.send(new DatagramPacket(byArray, byArray.length, datagramPacket.getSocketAddress()));
    }

    private byte[] id_break(DatagramPacket datagramPacket) throws IOException {
        String[] stringArray;
        long l = rqR_2.id_break();
        if (l < this.id_new + 5000L) {
            byte[] byArray = this.id_int.id_class();
            byte[] byArray2 = this.id_class(datagramPacket.getSocketAddress());
            byArray[1] = byArray2[0];
            byArray[2] = byArray2[1];
            byArray[3] = byArray2[2];
            byArray[4] = byArray2[3];
            return byArray;
        }
        this.id_new = l;
        this.id_int.id_break();
        this.id_int.id_class(0);
        this.id_int.id_class(this.id_class(datagramPacket.getSocketAddress()));
        this.id_int.id_class("splitnum");
        this.id_int.id_class(128);
        this.id_int.id_class(0);
        this.id_int.id_class("hostname");
        this.id_int.id_class(this.id_implements);
        this.id_int.id_class("gametype");
        this.id_int.id_class("SMP");
        this.id_int.id_class("game_id");
        this.id_int.id_class("MINECRAFT");
        this.id_int.id_class("version");
        this.id_int.id_class(this.id_continue.id_throws());
        this.id_int.id_class("plugins");
        this.id_int.id_class(this.id_continue.id_finally());
        this.id_int.id_class("map");
        this.id_int.id_class(this.id_finally);
        this.id_int.id_class("numplayers");
        this.id_int.id_class("" + this.id_continue.id_case());
        this.id_int.id_class("maxplayers");
        this.id_int.id_class("" + this.id_private);
        this.id_int.id_class("hostport");
        this.id_int.id_class("" + this.id_catch);
        this.id_int.id_class("hostip");
        this.id_int.id_class(this.id_volatile);
        this.id_int.id_class(0);
        this.id_int.id_class(1);
        this.id_int.id_class("player_");
        this.id_int.id_class(0);
        for (String string : stringArray = this.id_continue.id_private()) {
            this.id_int.id_class(string);
        }
        this.id_int.id_class(0);
        return this.id_int.id_class();
    }

    @Override
    public boolean id_break() {
        if (this.id_class) {
            return true;
        }
        return !this.id_throws() ? false : super.id_break();
    }

    private boolean id_throws() {
        try {
            this.id_extends = new DatagramSocket(this.id_case, InetAddress.getByName(this.id_final));
            this.id_extends.setSoTimeout(500);
            return true;
        }
        catch (Exception exception) {
            id_protected.warn("Unable to initialise query system on {}:{}", (Object)this.id_final, (Object)this.id_case, (Object)exception);
            return false;
        }
    }

    private void id_protected(DatagramPacket datagramPacket) throws IOException {
        rFK rFK2 = new rFK(datagramPacket);
        this.id_package.put(datagramPacket.getSocketAddress(), rFK2);
        this.id_class(rFK2.id_break(), datagramPacket);
    }

    private void id_protected() {
        long l;
        if (this.id_class && (l = rqR_2.id_break()) >= this.id_throws + 30000L) {
            this.id_throws = l;
            this.id_package.values().removeIf(rFK2 -> rFK2.id_class(l));
        }
    }
}

