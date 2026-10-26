/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.QY;
import celestial.jY_2;
import celestial.rAF;
import celestial.rAL;
import celestial.rqN_2;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.stream.Collectors;

public class gW_2
extends jY_2<List<String>> {
    private static final rqO_2 id_class = new rqO_2("texts/splashes.txt");
    private static final Random id_break = new Random();
    private final List<String> id_byte = Lists.newArrayList();
    private final rqN_2 id_protected;

    public gW_2(rqN_2 rqN_22) {
        this.id_protected = rqN_22;
    }

    /*
     * Enabled aggressive exception aggregation
     */
    protected List<String> id_class(rAL rAL2) {
        try (rAF rAF2 = QY.id_instanceof().F().id_class(id_class);){
            List<String> list;
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(rAF2.id_break(), StandardCharsets.UTF_8));){
                list = bufferedReader.lines().map(String::trim).filter(string -> string.hashCode() != 125780783).collect(Collectors.toList());
            }
            return list;
        }
        catch (IOException iOException) {
            return Collections.emptyList();
        }
    }

    @Override
    protected void id_class(List<String> list, rAL rAL2) {
        this.id_byte.clear();
        this.id_byte.addAll(list);
    }

    public String id_break() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        if (calendar.get(2) + 1 == 12 && calendar.get(5) == 24) {
            return "Merry X-mas!";
        }
        if (calendar.get(2) + 1 == 1 && calendar.get(5) == 1) {
            return "Happy new year!";
        }
        if (calendar.get(2) + 1 == 10 && calendar.get(5) == 31) {
            return "OOoooOOOoooo! Spooky!";
        }
        if (this.id_byte.isEmpty()) {
            return null;
        }
        return this.id_protected != null && id_break.nextInt(this.id_byte.size()) == 42 ? this.id_protected.id_byte().toUpperCase(Locale.ROOT) + " IS YOU" : this.id_byte.get(id_break.nextInt(this.id_byte.size()));
    }

    @Override
    protected /* synthetic */ Object id_break(rAL rAL2) {
        return this.id_class(rAL2);
    }
}

