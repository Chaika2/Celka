/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rTp_1
extends DataFix {
    protected static final Logger id_class = LogManager.getLogger();
    protected DSL.TypeReference id_break;

    protected static Optional<Dynamic<?>> id_byte(Dynamic<?> dynamic, String string, String string2) {
        String string3 = string + "Most";
        String string4 = string + "Least";
        return rTp_1.id_protected(dynamic, string3, string4).map(dynamic2 -> dynamic.remove(string3).remove(string4).set(string2, dynamic2));
    }

    public rTp_1(Schema schema, DSL.TypeReference typeReference) {
        super(schema, false);
        this.id_break = typeReference;
    }

    protected Typed<?> id_class(Typed<?> typed2, String string, Function<Dynamic<?>, Dynamic<?>> function) {
        Type type = this.getInputSchema().getChoiceType(this.id_break, string);
        Type type2 = this.getOutputSchema().getChoiceType(this.id_break, string);
        return typed2.updateTyped(DSL.namedChoice((String)string, (Type)type), type2, typed -> typed.update(DSL.remainderFinder(), function));
    }

    protected static Optional<Dynamic<?>> id_class(Dynamic<?> dynamic, long l, long l2) {
        return Optional.of(dynamic.createIntList(Arrays.stream(new int[]{(int)(l >> 32), (int)l, (int)(l2 >> 32), (int)l2})));
    }

    protected static Optional<Dynamic<?>> id_class(Dynamic<?> dynamic, String string, String string2) {
        return rTp_1.id_class(dynamic, string).map(dynamic2 -> dynamic.remove(string).set(string2, dynamic2));
    }

    protected static Optional<Dynamic<?>> id_class(Dynamic<?> dynamic, String string) {
        return dynamic.get(string).result().flatMap(dynamic2 -> {
            String string = dynamic2.asString((String)null);
            if (string != null) {
                try {
                    UUID uUID = UUID.fromString(string);
                    return rTp_1.id_class(dynamic, uUID.getMostSignificantBits(), uUID.getLeastSignificantBits());
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    // empty catch block
                }
            }
            return Optional.empty();
        });
    }

    protected static Optional<Dynamic<?>> id_class(Dynamic<?> dynamic) {
        return rTp_1.id_protected(dynamic, "M", "L");
    }

    protected static Optional<Dynamic<?>> id_break(Dynamic<?> dynamic, String string, String string2) {
        return dynamic.get(string).result().flatMap(rTp_1::id_class).map(dynamic2 -> dynamic.remove(string).set(string2, dynamic2));
    }

    protected static Optional<Dynamic<?>> id_protected(Dynamic<?> dynamic, String string, String string2) {
        long l = dynamic.get(string).asLong(0L);
        long l2 = dynamic.get(string2).asLong(0L);
        return l != 0L && l2 != 0L ? rTp_1.id_class(dynamic, l, l2) : Optional.empty();
    }
}

