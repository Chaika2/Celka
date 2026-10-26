/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rFR;
import celestial.rFa_1;
import celestial.rFe_1;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rFg_1
extends rFe_1 {
    private static final Logger id_protected = LogManager.getLogger();
    private boolean id_throws;
    private final Socket id_case;
    private final byte[] id_catch = new byte[1460];
    private final String id_private;
    private final rFR id_implements;

    public rFg_1(rFR rFR2, String string, Socket socket) {
        super("RCON Client " + socket.getInetAddress());
        this.id_implements = rFR2;
        this.id_case = socket;
        try {
            this.id_case.setSoTimeout(0);
        }
        catch (Exception exception) {
            this.id_class = false;
        }
        this.id_private = string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        try {
            block14: while (true) {
                if (!this.id_class) {
                    return;
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.id_case.getInputStream());
                int n = bufferedInputStream.read(this.id_catch, 0, 1460);
                if (10 > n) break;
                int n2 = 0;
                int n3 = rFa_1.id_break(this.id_catch, 0, n);
                if (n3 != n - 4) {
                    return;
                }
                int n4 = rFa_1.id_break(this.id_catch, n2 += 4, n);
                int n5 = rFa_1.id_class(this.id_catch, n2 += 4);
                n2 += 4;
                switch (n5) {
                    case 2: {
                        String string;
                        if (this.id_throws) {
                            string = rFa_1.id_class(this.id_catch, n2, n);
                            try {
                                this.id_class(n4, this.id_implements.id_class(string));
                            }
                            catch (Exception exception) {
                                this.id_class(n4, "Error executing: " + string + " (" + exception.getMessage() + ")");
                            }
                            continue block14;
                        }
                        this.id_protected();
                        continue block14;
                    }
                    case 3: {
                        String string = rFa_1.id_class(this.id_catch, n2, n);
                        int n6 = n2 + string.length();
                        if (!string.isEmpty() && string.equals(this.id_private)) {
                            this.id_throws = true;
                            this.id_class(n4, 2, "");
                            continue block14;
                        }
                        this.id_throws = false;
                        this.id_protected();
                        continue block14;
                    }
                }
                this.id_class(n4, String.format("Unknown request %s", Integer.toHexString(n5)));
            }
            return;
        }
        catch (IOException iOException) {
            return;
        }
        catch (Exception exception) {
            id_protected.error("Exception whilst parsing RCON input", (Throwable)exception);
            return;
        }
        finally {
            this.id_throws();
            id_protected.info("Thread {} shutting down", (Object)this.id_break);
            this.id_class = false;
        }
    }

    @Override
    public void id_class() {
        this.id_class = false;
        this.id_throws();
        super.id_class();
    }

    private void id_class(int n, String string) throws IOException {
        int n2;
        int n3 = string.length();
        do {
            n2 = 4096 <= n3 ? 4096 : n3;
            this.id_class(n, 0, string.substring(0, n2));
        } while (0 != (n3 = (string = string.substring(n2)).length()));
    }

    private void id_class(int n, int n2, String string) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1248);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        dataOutputStream.writeInt(Integer.reverseBytes(byArray.length + 10));
        dataOutputStream.writeInt(Integer.reverseBytes(n));
        dataOutputStream.writeInt(Integer.reverseBytes(n2));
        dataOutputStream.write(byArray);
        dataOutputStream.write(0);
        dataOutputStream.write(0);
        this.id_case.getOutputStream().write(byteArrayOutputStream.toByteArray());
    }

    private void id_throws() {
        try {
            this.id_case.close();
        }
        catch (IOException iOException) {
            id_protected.warn("Failed to close socket", (Throwable)iOException);
        }
    }

    private void id_protected() throws IOException {
        this.id_class(-1, 2, "");
    }
}

