/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.CharMatcher
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  org.apache.commons.io.filefilter.DirectoryFileFilter
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rAH;
import celestial.rAI;
import celestial.rAy_1;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqX_2;
import celestial.rqi_3;
import com.google.common.base.CharMatcher;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rAW
extends rAH {
    private static final Logger id_class = LogManager.getLogger();
    private static final boolean id_byte = rqR_2.id_implements() == rqi_3.WINDOWS;
    private static final CharMatcher id_protected = CharMatcher.is((char)'\\');

    @Override
    protected boolean id_byte(String string) {
        return this.id_throws(string) != null;
    }

    public rAW(File file) {
        super(file);
    }

    @Override
    public Collection<rqO_2> id_class(rAI rAI2, String string, String string2, int n, Predicate<String> predicate) {
        File file = new File(this.id_break, rAI2.id_class());
        ArrayList arrayList = Lists.newArrayList();
        this.id_class(new File(new File(file, string), string2), n, string, arrayList, string2 + "/", predicate);
        return arrayList;
    }

    public static boolean id_class(File file, String string) throws IOException {
        String string2 = file.getCanonicalPath();
        if (id_byte) {
            string2 = id_protected.replaceFrom((CharSequence)string2, '/');
        }
        return string2.endsWith(string);
    }

    private void id_class(File file, int n, String string, List<rqO_2> list, String string2, Predicate<String> predicate) {
        File[] fileArray = file.listFiles();
        if (fileArray != null) {
            for (File file2 : fileArray) {
                if (file2.isDirectory()) {
                    if (n <= 0) continue;
                    this.id_class(file2, n - 1, string, list, string2 + file2.getName() + "/", predicate);
                    continue;
                }
                if (file2.getName().endsWith(".mcmeta") || !predicate.test(file2.getName())) continue;
                try {
                    list.add(new rqO_2(string, string2 + file2.getName()));
                }
                catch (rqX_2 rqX_22) {
                    id_class.error(rqX_22.getMessage());
                }
            }
        }
    }

    @Override
    public Set<String> id_class(rAI rAI2) {
        HashSet hashSet = Sets.newHashSet();
        File file = new File(this.id_break, rAI2.id_class());
        File[] fileArray = file.listFiles((FileFilter)DirectoryFileFilter.DIRECTORY);
        if (fileArray != null) {
            for (File file2 : fileArray) {
                String string = rAW.id_class(file, file2);
                if (string.equals(string.toLowerCase(Locale.ROOT))) {
                    hashSet.add(string.substring(0, string.length() - 1));
                    continue;
                }
                this.id_protected(string);
            }
        }
        return hashSet;
    }

    @Override
    public void close() {
    }

    @Override
    protected InputStream id_break(String string) throws IOException {
        File file = this.id_throws(string);
        if (file == null) {
            throw new rAy_1(this.id_break, string);
        }
        return new FileInputStream(file);
    }

    private File id_throws(String string) {
        try {
            File file = new File(this.id_break, string);
            if (file.isFile() && rAW.id_class(file, string)) {
                return file;
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return null;
    }
}

