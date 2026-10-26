/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.List$ListType
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rfU_2;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.stream.LongStream;

public class rTo_1
extends DataFix {
    public rTo_1(Schema schema) {
        super(schema, false);
    }

    private Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic -> dynamic.update("Heightmaps", dynamic2 -> dynamic2.updateMapValues(pair -> pair.mapSecond(dynamic2 -> rTo_1.id_class(dynamic, dynamic2, 256, 9)))));
    }

    private static Typed<?> id_class(OpticFinder<?> opticFinder, OpticFinder<?> opticFinder2, OpticFinder<List<Pair<String, Dynamic<?>>>> opticFinder3, Typed<?> typed) {
        return typed.updateTyped(opticFinder, typed2 -> typed2.updateTyped(opticFinder2, typed -> {
            int n = typed.getOptional(opticFinder3).map(list -> Math.max(4, DataFixUtils.ceillog2((int)list.size()))).orElse(0);
            return n != 0 && !rfU_2.id_protected(n) ? typed.update(DSL.remainderFinder(), dynamic -> dynamic.update("BlockStates", dynamic2 -> rTo_1.id_class(dynamic, dynamic2, 4096, n))) : typed;
        }));
    }

    private static Dynamic<?> id_class(Dynamic<?> dynamic, Dynamic<?> dynamic2, int n, int n2) {
        long[] lArray = dynamic2.asLongStream().toArray();
        long[] lArray2 = rTo_1.id_class(n, n2, lArray);
        return dynamic.createLongList(LongStream.of(lArray2));
    }

    public static long[] id_class(int n, int n2, long[] lArray) {
        int n3 = lArray.length;
        if (n3 == 0) {
            return lArray;
        }
        long l = (1L << n2) - 1L;
        int n4 = 64 / n2;
        int n5 = (n + n4 - 1) / n4;
        long[] lArray2 = new long[n5];
        int n6 = 0;
        int n7 = 0;
        long l2 = 0L;
        int n8 = 0;
        long l3 = lArray[0];
        long l4 = n3 > 1 ? lArray[1] : 0L;
        for (int i = 0; i < n; ++i) {
            int n9;
            long l5;
            int n10 = i * n2;
            int n11 = n10 >> 6;
            int n12 = (i + 1) * n2 - 1 >> 6;
            int n13 = n10 ^ n11 << 6;
            if (n11 != n8) {
                l3 = l4;
                l4 = n11 + 1 < n3 ? lArray[n11 + 1] : 0L;
                n8 = n11;
            }
            if (n11 == n12) {
                l5 = l3 >>> n13 & l;
            } else {
                n9 = 64 - n13;
                l5 = (l3 >>> n13 | l4 << n9) & l;
            }
            n9 = n7 + n2;
            if (n9 >= 64) {
                lArray2[n6++] = l2;
                l2 = l5;
                n7 = n2;
                continue;
            }
            l2 |= l5 << n7;
            n7 = n9;
        }
        if (l2 != 0L) {
            lArray2[n6] = l2;
        }
        return lArray2;
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(rTC.id_byte);
        Type type2 = type.findFieldType("Level");
        OpticFinder opticFinder = DSL.fieldFinder((String)"Level", (Type)type2);
        OpticFinder opticFinder2 = opticFinder.type().findField("Sections");
        Type type3 = ((List.ListType)opticFinder2.type()).getElement();
        OpticFinder opticFinder3 = DSL.typeFinder((Type)type3);
        Type type4 = DSL.named((String)rTC.id_volatile.typeName(), (Type)DSL.remainderType());
        OpticFinder opticFinder4 = DSL.fieldFinder((String)"Palette", (Type)DSL.list((Type)type4));
        return this.fixTypeEverywhereTyped("BitStorageAlignFix", type, this.getOutputSchema().getType(rTC.id_byte), typed2 -> typed2.updateTyped(opticFinder, typed -> this.id_class(rTo_1.id_class(opticFinder2, opticFinder3, opticFinder4, typed))));
    }
}

