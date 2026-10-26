/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rFR;
import celestial.rFe_1;
import celestial.rFg_1;
import celestial.rnp_3;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rFY
extends rFe_1 {
    private static final Logger id_protected = LogManager.getLogger();
    private final ServerSocket id_throws;
    private final String id_case;
    private final List<rFg_1> id_catch = Lists.newArrayList();
    private final rFR id_private;

    private rFY(rFR rFR2, ServerSocket serverSocket, String string) {
        super("RCON Listener");
        this.id_private = rFR2;
        this.id_throws = serverSocket;
        this.id_case = string;
    }

    @Override
    public void run() {
        try {
            while (this.id_class) {
                try {
                    Socket socket = this.id_throws.accept();
                    rFg_1 rFg_12 = new rFg_1(this.id_private, this.id_case, socket);
                    rFg_12.id_break();
                    this.id_catch.add(rFg_12);
                    this.id_protected();
                }
                catch (SocketTimeoutException socketTimeoutException) {
                    this.id_protected();
                }
                catch (IOException iOException) {
                    if (!this.id_class) continue;
                    id_protected.info("IO exception: ", (Throwable)iOException);
                }
            }
        }
        finally {
            this.id_class(this.id_throws);
        }
    }

    private void id_class(ServerSocket serverSocket) {
        id_protected.debug("closeSocket: {}", (Object)serverSocket);
        try {
            serverSocket.close();
        }
        catch (IOException iOException) {
            id_protected.warn("Failed to close socket", (Throwable)iOException);
        }
    }

    @Override
    public void id_class() {
        this.id_class = false;
        this.id_class(this.id_throws);
        super.id_class();
        for (rFg_1 rFg_12 : this.id_catch) {
            if (!rFg_12.id_byte()) continue;
            rFg_12.id_class();
        }
        this.id_catch.clear();
    }

    public static rFY id_class(rFR rFR2) {
        int n;
        rnp_3 rnp_32 = rFR2.id_class();
        String string = rFR2.id_break();
        if (string.isEmpty()) {
            string = "0.0.0.0";
        }
        if (0 < (n = rnp_32.id_else) && 65535 >= n) {
            String string2 = rnp_32.id_synchronized;
            if (string2.isEmpty()) {
                id_protected.warn("No rcon password set in server.properties, rcon disabled!");
                return null;
            }
            try {
                ServerSocket serverSocket = new ServerSocket(n, 0, InetAddress.getByName(string));
                serverSocket.setSoTimeout(500);
                rFY rFY2 = new rFY(rFR2, serverSocket, string2);
                if (!rFY2.id_break()) {
                    return null;
                }
                id_protected.info("RCON running on {}:{}", (Object)string, (Object)n);
                return rFY2;
            }
            catch (IOException iOException) {
                id_protected.warn("Unable to initialise RCON on {}:{}", (Object)string, (Object)n, (Object)iOException);
                return null;
            }
        }
        id_protected.warn("Invalid rcon port {} found in server.properties, rcon disabled!", (Object)n);
        return null;
    }

    private void id_protected() {
        this.id_catch.removeIf(rFg_12 -> !rFg_12.id_byte());
    }
}

