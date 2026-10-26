/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrWg_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrWV
implements Iterable<String> {
    public ArrayList<String> id_class = new ArrayList();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.id_class.size(); ++i) {
            String string = this.id_class.get(i);
            stringBuilder.append(string);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public Iterator<String> iterator() {
        return new rrWg_1(this);
    }

    public int id_class() {
        return this.id_class.size();
    }

    public void id_class(int n, String[] stringArray) {
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            this.id_break(string);
        }
        this.id_class.addAll(n, Arrays.asList(stringArray));
    }

    public int id_class(Pattern pattern) {
        for (int i = 0; i < this.id_class.size(); ++i) {
            String string = this.id_class.get(i);
            Matcher matcher = pattern.matcher(string);
            if (!matcher.matches()) continue;
            return i;
        }
        return -1;
    }

    public static rrWV id_class(Reader reader) throws IOException {
        rrWV rrWV2 = new rrWV();
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (true) {
            String string;
            if ((string = bufferedReader.readLine()) == null) {
                bufferedReader.close();
                return rrWV2;
            }
            rrWV2.id_class(string);
        }
    }

    public String id_class(int n) {
        return this.id_class.get(n);
    }

    public void id_class(String string) {
        this.id_break(string);
        this.id_class.add(string);
    }

    public void id_class(String[] stringArray) {
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            this.id_class(string);
        }
    }

    public void id_class(int n, String string) {
        this.id_break(string);
        this.id_class.add(n, string);
    }

    private void id_break(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Line is null");
        }
        if (string.indexOf(10) >= 0) {
            throw new IllegalArgumentException("Line contains LF");
        }
        if (string.indexOf(13) >= 0) {
            throw new IllegalArgumentException("Line contains CR");
        }
    }

    public String[] id_break() {
        return this.id_class.toArray(new String[this.id_class.size()]);
    }
}

