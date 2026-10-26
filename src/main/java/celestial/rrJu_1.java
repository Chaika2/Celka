/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrJF;
import celestial.rrJL;
import celestial.rrJN;
import celestial.rrJQ;
import celestial.rrJZ;
import celestial.rrJm_1;
import celestial.rrJv_1;
import celestial.rrbb_3;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class rrJu_1 {
    private String id_byte = null;
    private int id_protected = 0;
    private Proxy id_throws = Proxy.NO_PROXY;
    private List<rrJZ> id_case = new LinkedList<rrJZ>();
    private List<rrJZ> id_catch = new LinkedList<rrJZ>();
    private Socket id_private = null;
    private InputStream id_implements = null;
    private OutputStream id_finally = null;
    private rrJv_1 id_extends = null;
    private rrJm_1 id_native = null;
    private int id_volatile = 0;
    private boolean id_final = false;
    private long id_package = 5000L;
    private int id_int = 1000;
    private long id_new = System.currentTimeMillis();
    private boolean id_continue = false;
    private static final String id_super = "\n";
    public static final int id_class = 5000;
    public static final int id_break = 5000;
    private static final Pattern id_this = Pattern.compile("^[a-zA-Z]+://.*");

    public synchronized rrJZ id_byte() throws InterruptedException, IOException {
        if (this.id_catch.size() <= 0 && this.id_finally != null) {
            this.id_finally.flush();
        }
        return this.id_class(this.id_catch, true);
    }

    public rrJu_1(String string, int n) {
        this(string, n, Proxy.NO_PROXY);
    }

    public rrJu_1(String string, int n, Proxy proxy) {
        this.id_byte = string;
        this.id_protected = n;
        this.id_throws = proxy;
        this.id_extends = new rrJv_1(this);
        this.id_extends.start();
        this.id_native = new rrJm_1(this);
        this.id_native.start();
    }

    private String[] id_class(String string, char c) {
        int n = string.indexOf(c);
        if (n < 0) {
            return new String[]{string};
        }
        String string2 = string.substring(0, n);
        String string3 = string.substring(n + 1);
        return new String[]{string2, string3};
    }

    private void id_class(rrJL rrJL2) {
        String string;
        String string2 = rrJL2.id_class("Connection");
        if (string2 != null && !string2.toLowerCase().equals("keep-alive")) {
            this.id_class(new EOFException("Connection not keep-alive"));
        }
        if ((string = rrJL2.id_class("Keep-Alive")) != null) {
            String[] stringArray = rrbb_3.id_class(string, ",;");
            for (int i = 0; i < stringArray.length; ++i) {
                int n;
                String string3 = stringArray[i];
                String[] stringArray2 = this.id_class(string3, '=');
                if (stringArray2.length < 2) continue;
                if (stringArray2[0].equals("timeout") && (n = rrbb_3.id_class(stringArray2[1], -1)) > 0) {
                    this.id_package = n * 1000;
                }
                if (!stringArray2[0].equals("max") || (n = rrbb_3.id_class(stringArray2[1], -1)) <= 0) continue;
                this.id_int = n;
            }
        }
    }

    public synchronized boolean id_class(rrJZ rrJZ2) {
        if (this.id_throws()) {
            return false;
        }
        this.id_class(rrJZ2, this.id_case);
        this.id_class(rrJZ2, this.id_catch);
        ++this.id_volatile;
        return true;
    }

    public synchronized void id_class(rrJZ rrJZ2, rrJL rrJL2) {
        if (!this.id_continue) {
            this.id_final = true;
            this.id_native();
            if (this.id_case.size() > 0 && this.id_case.get(0) == rrJZ2) {
                this.id_case.remove(0);
                rrJZ2.id_class(true);
                String string = rrJL2.id_class("Location");
                if (rrJL2.id_class() / 100 == 3 && string != null && rrJZ2.id_class().id_private() < 5) {
                    try {
                        string = this.id_class(string, rrJZ2.id_class());
                        rrJF rrJF2 = rrJN.id_class(string, rrJZ2.id_class().id_implements());
                        rrJF2.id_class(rrJZ2.id_class().id_private() + 1);
                        rrJZ rrJZ3 = new rrJZ(rrJF2, rrJZ2.id_break());
                        rrJN.id_class(rrJZ3);
                    }
                    catch (IOException iOException) {
                        rrJZ2.id_break().id_class(rrJZ2.id_class(), iOException);
                    }
                } else {
                    rrJQ rrJQ2 = rrJZ2.id_break();
                    rrJQ2.id_class(rrJZ2.id_class(), rrJL2);
                }
                this.id_class(rrJL2);
            } else {
                throw new IllegalArgumentException("Response out of order: " + rrJZ2);
            }
        }
    }

    public synchronized void id_class(rrJZ rrJZ2, Exception exception) {
        this.id_class(exception);
    }

    private synchronized void id_class(Exception exception) {
        if (!this.id_continue) {
            this.id_continue = true;
            this.id_break(exception);
            if (this.id_extends != null) {
                this.id_extends.interrupt();
            }
            if (this.id_native != null) {
                this.id_native.interrupt();
            }
            try {
                if (this.id_private != null) {
                    this.id_private.close();
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
            this.id_private = null;
            this.id_implements = null;
            this.id_finally = null;
        }
    }

    private String id_class(String string, rrJF rrJF2) {
        if (id_this.matcher(string).matches()) {
            return string;
        }
        if (string.startsWith("//")) {
            return "http:" + string;
        }
        Object object = rrJF2.id_class();
        if (rrJF2.id_break() != 80) {
            object = (String)object + ":" + rrJF2.id_break();
        }
        if (string.startsWith("/")) {
            return "http://" + (String)object + string;
        }
        String string2 = rrJF2.id_protected();
        int n = string2.lastIndexOf("/");
        return n >= 0 ? "http://" + (String)object + string2.substring(0, n + 1) + string : "http://" + (String)object + "/" + string;
    }

    public synchronized void id_class(Socket socket) throws IOException {
        if (!this.id_continue) {
            if (this.id_private != null) {
                throw new IllegalArgumentException("Already connected");
            }
            this.id_private = socket;
            this.id_private.setTcpNoDelay(true);
            this.id_implements = this.id_private.getInputStream();
            this.id_finally = new BufferedOutputStream(this.id_private.getOutputStream());
            this.id_native();
            this.notifyAll();
        }
    }

    private void id_class(rrJZ rrJZ2, List<rrJZ> list) {
        list.add(rrJZ2);
        this.notifyAll();
    }

    private rrJZ id_class(List<rrJZ> list, boolean bl) throws InterruptedException {
        while (list.size() <= 0) {
            this.id_extends();
            this.wait(1000L);
        }
        this.id_native();
        return bl ? list.remove(0) : list.get(0);
    }

    public synchronized OutputStream id_class() throws IOException, InterruptedException {
        while (this.id_finally == null) {
            this.id_extends();
            this.wait(1000L);
        }
        return this.id_finally;
    }

    public synchronized void id_break(rrJZ rrJZ2, Exception exception) {
        this.id_class(exception);
    }

    public synchronized InputStream id_break() throws IOException, InterruptedException {
        while (this.id_implements == null) {
            this.id_extends();
            this.wait(1000L);
        }
        return this.id_implements;
    }

    public synchronized void id_break(rrJZ rrJZ2) {
        if (!this.id_continue) {
            this.id_native();
        }
    }

    private void id_break(Exception exception) {
        if (this.id_case.size() > 0) {
            rrJZ rrJZ2;
            if (!this.id_final) {
                rrJZ2 = this.id_case.remove(0);
                rrJZ2.id_break().id_class(rrJZ2.id_class(), exception);
                rrJZ2.id_class(true);
            }
            while (this.id_case.size() > 0) {
                rrJZ2 = this.id_case.remove(0);
                rrJN.id_class(rrJZ2);
            }
        }
    }

    public synchronized boolean id_throws() {
        if (this.id_continue) {
            return true;
        }
        return this.id_volatile >= this.id_int;
    }

    public Proxy id_finally() {
        return this.id_throws;
    }

    public synchronized boolean id_catch() {
        return this.id_case.size() > 0;
    }

    private void id_extends() {
        if (this.id_private != null) {
            long l;
            long l2 = this.id_package;
            if (this.id_case.size() > 0) {
                l2 = 5000L;
            }
            if ((l = System.currentTimeMillis()) > this.id_new + l2) {
                this.id_class(new InterruptedException("Timeout " + l2));
            }
        }
    }

    public int id_case() {
        return this.id_volatile;
    }

    public int id_implements() {
        return this.id_protected;
    }

    public synchronized rrJZ id_protected() throws InterruptedException {
        return this.id_class(this.id_case, false);
    }

    public String id_private() {
        return this.id_byte;
    }

    private void id_native() {
        this.id_new = System.currentTimeMillis();
    }
}

