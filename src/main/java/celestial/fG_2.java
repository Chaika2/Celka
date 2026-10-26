/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.base.Splitter
 */
package celestial;

import celestial.fB_2;
import celestial.rCF;
import celestial.rCZ;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class fG_2
implements fB_2 {
    private static final Splitter id_byte = Splitter.on((char)'|').omitEmptyStrings();
    private final String id_protected;
    private final String id_throws;

    public fG_2(String string, String string2) {
        this.id_protected = string;
        this.id_throws = string2;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("key", (Object)this.id_protected).add("value", (Object)this.id_throws).toString();
    }

    private Predicate<xc_3> id_class(rCF<xd_3, xc_3> rCF2, rCZ<?> rCZ2, String string) {
        Optional<?> optional = rCZ2.id_break(string);
        if (!optional.isPresent()) {
            throw new RuntimeException(String.format("Unknown value '%s' for property '%s' on '%s' in '%s'", string, this.id_protected, rCF2.id_byte().toString(), this.id_throws));
        }
        return xc_32 -> xc_32.id_byte(rCZ2).equals(optional.get());
    }

    @Override
    public Predicate<xc_3> getPredicate(rCF<xd_3, xc_3> rCF2) {
        Predicate<xc_3> predicate;
        List list;
        boolean bl;
        rCZ<?> rCZ2 = rCF2.id_class(this.id_protected);
        if (rCZ2 == null) {
            throw new RuntimeException(String.format("Unknown property '%s' on '%s'", this.id_protected, rCF2.id_byte().toString()));
        }
        String string2 = this.id_throws;
        boolean bl2 = bl = !string2.isEmpty() && string2.charAt(0) == '!';
        if (bl) {
            string2 = string2.substring(1);
        }
        if ((list = id_byte.splitToList((CharSequence)string2)).isEmpty()) {
            throw new RuntimeException(String.format("Empty value '%s' for property '%s' on '%s'", this.id_throws, this.id_protected, rCF2.id_byte().toString()));
        }
        if (list.size() == 1) {
            predicate = this.id_class(rCF2, rCZ2, string2);
        } else {
            List list2 = list.stream().map(string -> this.id_class(rCF2, rCZ2, (String)string)).collect(Collectors.toList());
            predicate = xc_32 -> list2.stream().anyMatch(predicate -> predicate.test(xc_32));
        }
        return bl ? predicate.negate() : predicate;
    }
}

