/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 */
package celestial;

import celestial.rrbb_3;
import celestial.rrxi_3;
import celestial.rrzX_2;
import com.google.common.base.Joiner;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class rrdc_1
implements rrxi_3 {
    protected File id_class;
    protected ZipFile id_break;
    protected String id_byte;

    private String id_byte(String string) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
        String[] stringArray = rrbb_3.id_class(string, "/");
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            if (string2.equals("..")) {
                if (arrayDeque.isEmpty()) {
                    return "";
                }
                arrayDeque.removeLast();
                continue;
            }
            arrayDeque.add(string2);
        }
        return Joiner.on((char)'/').join(arrayDeque);
    }

    public rrdc_1(String string, File file) {
        this.id_class = file;
        this.id_break = null;
        this.id_byte = "";
    }

    @Override
    public String id_class() {
        return this.id_class.getName();
    }

    private String id_class(ZipFile zipFile) {
        ZipEntry zipEntry = zipFile.getEntry("shaders/");
        if (zipEntry != null && zipEntry.isDirectory()) {
            return "";
        }
        Pattern pattern = Pattern.compile("([^/]+/)shaders/");
        Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
        while (enumeration.hasMoreElements()) {
            String string;
            ZipEntry zipEntry2 = enumeration.nextElement();
            String string2 = zipEntry2.getName();
            Matcher matcher = pattern.matcher(string2);
            if (!matcher.matches() || (string = matcher.group(1)) == null) continue;
            if (string.equals("shaders/")) {
                return "";
            }
            return string;
        }
        return "";
    }

    @Override
    public InputStream id_class(String string) {
        try {
            ZipEntry zipEntry;
            String string2;
            if (this.id_break == null) {
                this.id_break = new ZipFile(this.id_class);
                this.id_byte = this.id_class(this.id_break);
            }
            if ((string2 = rrzX_2.id_protected(string, "/")).contains("..")) {
                string2 = this.id_byte(string2);
            }
            return (zipEntry = this.id_break.getEntry(this.id_byte + string2)) == null ? null : this.id_break.getInputStream(zipEntry);
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Override
    public boolean id_break(String string) {
        try {
            String string2;
            ZipEntry zipEntry;
            if (this.id_break == null) {
                this.id_break = new ZipFile(this.id_class);
                this.id_byte = this.id_class(this.id_break);
            }
            return (zipEntry = this.id_break.getEntry(this.id_byte + (string2 = rrzX_2.id_protected(string, "/")))) != null;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    @Override
    public void id_break() {
        if (this.id_break != null) {
            try {
                this.id_break.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.id_break = null;
        }
    }
}

