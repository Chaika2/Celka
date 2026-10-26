/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Keyable
 */
package celestial;

import celestial.rpH_2;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rpp_3
implements Keyable {
    public final /* synthetic */ rpH_2[] id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rpp_3(rpH_2[] rpH_2Array) {
        this.id_class = rpH_2Array;
    }

    public <T> Stream<T> keys(DynamicOps<T> dynamicOps) {
        return dynamicOps.compressMaps() ? IntStream.range(0, this.id_class.length).mapToObj(arg_0 -> dynamicOps.createInt(arg_0)) : Arrays.stream(this.id_class).map(rpH_2::id_class).map(arg_0 -> dynamicOps.createString(arg_0));
    }
}

