/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  org.apache.commons.io.IOUtils
 */
package celestial;

import celestial.rAH;
import celestial.rAI;
import celestial.rAy_1;
import celestial.rqO_2;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.commons.io.IOUtils;

public class rAk_1
extends rAH {
    public static final Splitter id_class = Splitter.on((char)'/').omitEmptyStrings().limit(3);
    private ZipFile id_byte;

    @Override
    public boolean id_byte(String string) {
        try {
            return this.id_break().getEntry(string) != null;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public rAk_1(File file) {
        super(file);
    }

    protected void finalize() throws Throwable {
        this.close();
        super.finalize();
    }

    @Override
    public Set<String> id_class(rAI rAI2) {
        ZipFile zipFile;
        try {
            zipFile = this.id_break();
        }
        catch (IOException iOException) {
            return Collections.emptySet();
        }
        Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
        HashSet hashSet = Sets.newHashSet();
        while (enumeration.hasMoreElements()) {
            ArrayList arrayList;
            ZipEntry zipEntry = enumeration.nextElement();
            String string = zipEntry.getName();
            if (!string.startsWith(rAI2.id_class() + "/") || (arrayList = Lists.newArrayList((Iterable)id_class.split((CharSequence)string))).size() <= 1) continue;
            String string2 = (String)arrayList.get(1);
            if (string2.equals(string2.toLowerCase(Locale.ROOT))) {
                hashSet.add(string2);
                continue;
            }
            this.id_protected(string2);
        }
        return hashSet;
    }

    @Override
    public Collection<rqO_2> id_class(rAI rAI2, String string, String string2, int n, Predicate<String> predicate) {
        ZipFile zipFile;
        try {
            zipFile = this.id_break();
        }
        catch (IOException iOException) {
            return Collections.emptySet();
        }
        Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
        ArrayList arrayList = Lists.newArrayList();
        String string3 = rAI2.id_class() + "/" + string + "/";
        String string4 = string3 + string2 + "/";
        while (enumeration.hasMoreElements()) {
            String string5;
            String[] stringArray;
            String string6;
            ZipEntry zipEntry = enumeration.nextElement();
            if (zipEntry.isDirectory() || (string6 = zipEntry.getName()).endsWith(".mcmeta") || !string6.startsWith(string4) || (stringArray = (string5 = string6.substring(string3.length())).split("/")).length < n + 1 || !predicate.test(stringArray[stringArray.length - 1])) continue;
            arrayList.add(new rqO_2(string, string5));
        }
        return arrayList;
    }

    @Override
    public void close() {
        if (this.id_byte != null) {
            IOUtils.closeQuietly((Closeable)this.id_byte);
            this.id_byte = null;
        }
    }

    private ZipFile id_break() throws IOException {
        if (this.id_byte == null) {
            this.id_byte = new ZipFile(this.id_break);
        }
        return this.id_byte;
    }

    @Override
    protected InputStream id_break(String string) throws IOException {
        ZipFile zipFile = this.id_break();
        ZipEntry zipEntry = zipFile.getEntry(string);
        if (zipEntry == null) {
            throw new rAy_1(this.id_break, string);
        }
        return zipFile.getInputStream(zipEntry);
    }
}

