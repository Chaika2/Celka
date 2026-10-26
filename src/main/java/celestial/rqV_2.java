/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rqR_2;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.UUID;

public final class rqV_2 {
    public static final Codec<UUID> id_class = Codec.INT_STREAM.comapFlatMap(intStream -> rqR_2.id_class(intStream, 4).map(rqV_2::id_class), uUID -> Arrays.stream(rqV_2.id_class(uUID)));

    private static int[] id_class(long l, long l2) {
        return new int[]{(int)(l >> 32), (int)l, (int)(l2 >> 32), (int)l2};
    }

    public static UUID id_class(int[] nArray) {
        return new UUID((long)nArray[0] << 32 | (long)nArray[1] & 0xFFFFFFFFL, (long)nArray[2] << 32 | (long)nArray[3] & 0xFFFFFFFFL);
    }

    public static int[] id_class(UUID uUID) {
        long l = uUID.getMostSignificantBits();
        long l2 = uUID.getLeastSignificantBits();
        return rqV_2.id_class(l, l2);
    }
}

