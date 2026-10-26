/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rAC;
import celestial.rAF;
import celestial.rAI;
import celestial.rAL;
import celestial.rAR;
import celestial.rAd_1;
import celestial.rqO_2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rAx_1
implements rAL {
    public static final Logger id_break = LogManager.getLogger();
    protected final List<rAC> id_class = Lists.newArrayList();
    private final rAI id_byte;
    private final String id_protected;

    @Override
    public List<rAF> id_byte(rqO_2 rqO_22) throws IOException {
        this.id_throws(rqO_22);
        ArrayList arrayList = Lists.newArrayList();
        rqO_2 rqO_23 = rAx_1.id_protected(rqO_22);
        for (rAC rAC2 : this.id_class) {
            if (!rAC2.id_break(this.id_byte, rqO_22)) continue;
            InputStream inputStream = rAC2.id_break(this.id_byte, rqO_23) ? this.id_class(rqO_23, rAC2) : null;
            arrayList.add(new rAR(rAC2.id_class(), rqO_22, this.id_class(rqO_22, rAC2), inputStream));
        }
        if (arrayList.isEmpty()) {
            throw new FileNotFoundException(rqO_22.toString());
        }
        return arrayList;
    }

    public rAx_1(rAI rAI2, String string) {
        this.id_byte = rAI2;
        this.id_protected = string;
    }

    @Override
    public Collection<rqO_2> id_class(String string, Predicate<String> predicate) {
        ArrayList arrayList = Lists.newArrayList();
        for (rAC rAC2 : this.id_class) {
            arrayList.addAll(rAC2.id_class(this.id_byte, this.id_protected, string, Integer.MAX_VALUE, predicate));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public void id_class(rAC rAC2) {
        this.id_class.add(rAC2);
    }

    @Override
    public Set<String> id_class() {
        return ImmutableSet.of((Object)this.id_protected);
    }

    @Override
    public rAF id_class(rqO_2 rqO_22) throws IOException {
        this.id_throws(rqO_22);
        rAC rAC2 = null;
        rqO_2 rqO_23 = rAx_1.id_protected(rqO_22);
        for (int i = this.id_class.size() - 1; i >= 0; --i) {
            rAC rAC3 = this.id_class.get(i);
            if (rAC2 == null && rAC3.id_break(this.id_byte, rqO_23)) {
                rAC2 = rAC3;
            }
            if (!rAC3.id_break(this.id_byte, rqO_22)) continue;
            InputStream inputStream = null;
            if (rAC2 != null) {
                inputStream = this.id_class(rqO_23, rAC2);
            }
            return new rAR(rAC3.id_class(), rqO_22, this.id_class(rqO_22, rAC3), inputStream);
        }
        throw new FileNotFoundException(rqO_22.toString());
    }

    protected InputStream id_class(rqO_2 rqO_22, rAC rAC2) throws IOException {
        InputStream inputStream = rAC2.id_class(this.id_byte, rqO_22);
        return id_break.isDebugEnabled() ? new rAd_1(inputStream, rqO_22, rAC2.id_class()) : inputStream;
    }

    @Override
    public Stream<rAC> id_break() {
        return this.id_class.stream();
    }

    @Override
    public boolean id_break(rqO_2 rqO_22) {
        if (!this.id_case(rqO_22)) {
            return false;
        }
        for (int i = this.id_class.size() - 1; i >= 0; --i) {
            rAC rAC2 = this.id_class.get(i);
            if (!rAC2.id_break(this.id_byte, rqO_22)) continue;
            return true;
        }
        return false;
    }

    private void id_throws(rqO_2 rqO_22) throws IOException {
        if (!this.id_case(rqO_22)) {
            throw new IOException("Invalid relative path to resource: " + rqO_22);
        }
    }

    private boolean id_case(rqO_2 rqO_22) {
        return !rqO_22.id_break().contains("..");
    }

    public static rqO_2 id_protected(rqO_2 rqO_22) {
        return new rqO_2(rqO_22.id_byte(), rqO_22.id_break() + ".mcmeta");
    }
}

