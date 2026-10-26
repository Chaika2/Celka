/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 */
package celestial;

import celestial.rTP;
import celestial.rTr_1;
import celestial.rqR_2;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import org.apache.commons.io.IOUtils;

public sealed class rqi_3
extends Enum<rqi_3>
permits rTr_1, rTP {
    public static final /* enum */ rqi_3 LINUX = new rqi_3();
    public static final /* enum */ rqi_3 SOLARIS = new rqi_3();
    public static final /* enum */ rqi_3 WINDOWS = new rTr_1();
    public static final /* enum */ rqi_3 OSX = new rTP();
    public static final /* enum */ rqi_3 UNKNOWN = new rqi_3();
    private static final /* synthetic */ rqi_3[] $VALUES;

    static {
        $VALUES = rqi_3.id_class();
    }

    public static rqi_3[] values() {
        return (rqi_3[])$VALUES.clone();
    }

    public static rqi_3 valueOf(String string) {
        return Enum.valueOf(rqi_3.class, string);
    }

    public void id_class(String string) {
        try {
            this.id_class(new URI(string).toURL());
        }
        catch (IllegalArgumentException | MalformedURLException | URISyntaxException exception) {
            rqR_2.id_catch.error("Couldn't open uri '{}'", (Object)string, (Object)exception);
        }
    }

    public void id_class(File file) {
        try {
            this.id_class(file.toURI().toURL());
        }
        catch (MalformedURLException malformedURLException) {
            rqR_2.id_catch.error("Couldn't open file '{}'", (Object)file, (Object)malformedURLException);
        }
    }

    private static /* synthetic */ rqi_3[] id_class() {
        return new rqi_3[]{LINUX, SOLARIS, WINDOWS, OSX, UNKNOWN};
    }

    public void id_class(URL uRL) {
        try {
            Process process = AccessController.doPrivileged(() -> Runtime.getRuntime().exec(this.id_break(uRL)));
            for (String string : IOUtils.readLines((InputStream)process.getErrorStream())) {
                rqR_2.id_catch.error(string);
            }
            process.getInputStream().close();
            process.getErrorStream().close();
            process.getOutputStream().close();
        }
        catch (IOException | SecurityException | PrivilegedActionException exception) {
            rqR_2.id_catch.error("Couldn't open url '{}'", (Object)uRL, (Object)exception);
            rqR_2.id_private = exception;
        }
    }

    public void id_class(URI uRI) {
        try {
            this.id_class(uRI.toURL());
        }
        catch (MalformedURLException malformedURLException) {
            rqR_2.id_catch.error("Couldn't open uri '{}'", (Object)uRI, (Object)malformedURLException);
        }
    }

    protected String[] id_break(URL uRL) {
        String string = uRL.toString();
        if ("file".equals(uRL.getProtocol())) {
            string = string.replace("file:", "file://");
        }
        return new String[]{"xdg-open", string};
    }
}

