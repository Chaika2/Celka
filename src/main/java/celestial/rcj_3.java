/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.MapLike
 */
package celestial;

import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcf_3;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapLike;
import java.util.stream.Stream;

public class rcj_3
implements MapLike<rcZ_2> {
    public final /* synthetic */ rcd_3 id_class;
    public final /* synthetic */ rcf_3 id_break;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rcj_3(rcf_3 rcf_32, rcd_3 rcd_32) {
        this.id_break = rcf_32;
        this.id_class = rcd_32;
    }

    public /* synthetic */ Object get(String string) {
        return this.id_class(string);
    }

    public /* synthetic */ Object get(Object object) {
        return this.id_class((rcZ_2)object);
    }

    public String toString() {
        return "MapLike[" + this.id_class + "]";
    }

    public rcZ_2 id_class(String string) {
        return this.id_class.id_byte(string);
    }

    public rcZ_2 id_class(rcZ_2 rcZ_22) {
        return this.id_class.id_byte(rcZ_22.id_native());
    }

    public Stream<Pair<rcZ_2, rcZ_2>> entries() {
        return this.id_class.id_protected().stream().map(string -> Pair.of((Object)this.id_break.id_class((String)string), (Object)this.id_class.id_byte((String)string)));
    }
}

