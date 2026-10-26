/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.an_3;
import celestial.gy_3;
import celestial.jI_2;
import celestial.rVi_1;
import celestial.rgC_2;
import celestial.rgM_2;
import celestial.rgO_2;
import celestial.rgP_2;
import celestial.rgS_2;
import celestial.rgX_2;
import celestial.rgZ_2;
import celestial.rgc_3;
import celestial.rgr_3;
import celestial.rgv_3;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rgn_3
extends rgZ_2
implements rgr_3 {
    private static final Object[] id_byte = new Object[0];
    private static final rgS_2 id_protected = rgS_2.id_protected("%");
    private static final rgS_2 id_throws = rgS_2.id_protected("null");
    private final String id_catch;
    private final Object[] id_private;
    private rgX_2 id_implements;
    private final List<rgS_2> id_finally = Lists.newArrayList();
    private static final Pattern id_extends = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

    public rgn_3(String string) {
        this.id_catch = string;
        this.id_private = id_byte;
    }

    public rgn_3(String string, Object ... objectArray) {
        this.id_catch = string;
        this.id_private = objectArray;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rgn_3)) {
            return false;
        }
        rgn_3 rgn_32 = (rgn_3)object;
        return Arrays.equals(this.id_private, rgn_32.id_private) && this.id_catch.equals(rgn_32.id_catch) && super.equals(object);
    }

    @Override
    public String toString() {
        return "TranslatableComponent{key='" + this.id_catch + "', args=" + Arrays.toString(this.id_private) + ", siblings=" + this.id_case + ", style=" + this.id_class() + "}";
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.id_catch.hashCode();
        return 31 * n + Arrays.hashCode(this.id_private);
    }

    @Override
    public rVi_1 id_class(gy_3 gy_32, an_3 an_32, int n) throws CommandSyntaxException {
        Object[] objectArray = new Object[this.id_private.length];
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = this.id_private[i];
            objectArray[i] = object instanceof rgP_2 ? rgv_3.id_class(gy_32, (rgP_2)object, an_32, n) : object;
        }
        return new rgn_3(this.id_catch, objectArray);
    }

    private void id_class(String string) {
        Matcher matcher = id_extends.matcher(string);
        try {
            int n = 0;
            int n2 = 0;
            while (matcher.find(n2)) {
                String string2;
                int n3 = matcher.start();
                int n4 = matcher.end();
                if (n3 > n2) {
                    string2 = string.substring(n2, n3);
                    if (string2.indexOf(37) != -1) {
                        throw new IllegalArgumentException();
                    }
                    this.id_finally.add(rgS_2.id_protected(string2));
                }
                string2 = matcher.group(2);
                String string3 = string.substring(n3, n4);
                if ("%".equals(string2) && "%%".equals(string3)) {
                    this.id_finally.add(id_protected);
                } else {
                    int n5;
                    if (!"s".equals(string2)) {
                        throw new rgC_2(this, "Unsupported format: '" + string3 + "'");
                    }
                    String string4 = matcher.group(1);
                    int n6 = n5 = string4 != null ? Integer.parseInt(string4) - 1 : n++;
                    if (n5 < this.id_private.length) {
                        this.id_finally.add(this.id_break(n5));
                    }
                }
                n2 = n4;
            }
            if (n2 < string.length()) {
                String string5 = string.substring(n2);
                if (string5.indexOf(37) != -1) {
                    throw new IllegalArgumentException();
                }
                this.id_finally.add(rgS_2.id_protected(string5));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new rgC_2(this, (Throwable)illegalArgumentException);
        }
    }

    @Override
    public <T> Optional<T> id_break(rgM_2<T> rgM_22, rgc_3 rgc_32) {
        this.id_volatile();
        for (rgS_2 rgS_22 : this.id_finally) {
            Optional<T> optional = rgS_22.id_class(rgM_22, rgc_32);
            if (!optional.isPresent()) continue;
            return optional;
        }
        return Optional.empty();
    }

    private rgS_2 id_break(int n) {
        if (n >= this.id_private.length) {
            throw new rgC_2(this, n);
        }
        Object object = this.id_private[n];
        if (object instanceof rgP_2) {
            return (rgP_2)object;
        }
        return object == null ? id_throws : rgS_2.id_protected(object.toString());
    }

    @Override
    public <T> Optional<T> id_break(rgO_2<T> rgO_22) {
        this.id_volatile();
        for (rgS_2 rgS_22 : this.id_finally) {
            Optional<T> optional = rgS_22.id_class(rgO_22);
            if (!optional.isPresent()) continue;
            return optional;
        }
        return Optional.empty();
    }

    @Override
    public /* synthetic */ rVi_1 id_throws() {
        return this.id_private();
    }

    @Override
    public /* synthetic */ rgZ_2 id_finally() {
        return this.id_private();
    }

    public Object[] id_extends() {
        return this.id_private;
    }

    public String id_implements() {
        return this.id_catch;
    }

    public rgn_3 id_private() {
        return new rgn_3(this.id_catch, this.id_private);
    }

    private void id_volatile() {
        rgX_2 rgX_22 = rgX_2.id_byte();
        if (rgX_22 != this.id_implements) {
            this.id_implements = rgX_22;
            this.id_finally.clear();
            String string = rgX_22.id_class(this.id_catch);
            try {
                this.id_class(string);
            }
            catch (rgC_2 rgC_22) {
                this.id_finally.clear();
                this.id_finally.add(rgS_2.id_protected(string));
            }
        }
    }

    public boolean id_native() {
        return jI_2.id_class(this.id_catch);
    }
}

