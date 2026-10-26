/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.FieldFinder
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.CompoundList$CompoundListType
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.datafixers.util.Unit
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rIc_1;
import celestial.rTA;
import celestial.rTC;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.FieldFinder;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.CompoundList;
import com.mojang.datafixers.types.templates.TaggedChoice;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Map;

public class rwk_3
extends DataFix {
    public rwk_3(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private <T> Dynamic<T> id_class(Dynamic<T> dynamic) {
        long l = dynamic.get("seed").asLong(0L);
        return new Dynamic(dynamic.getOps(), rIc_1.id_class(dynamic, l, rIc_1.id_class(dynamic, l), false));
    }

    private static <A> Type<Pair<A, Dynamic<?>>> id_class(String string, Type<A> type) {
        return DSL.and((Type)DSL.field((String)string, type), (Type)DSL.remainderType());
    }

    private static <A1, A2> Type<Pair<Either<A1, Unit>, Pair<Either<A2, Unit>, Dynamic<?>>>> id_class(String string, Type<A1> type, String string2, Type<A2> type2) {
        return DSL.and((Type)DSL.optional((Type)DSL.field((String)string, type)), (Type)DSL.optional((Type)DSL.field((String)string2, type2)), (Type)DSL.remainderType());
    }

    private static <A> Type<Pair<Either<A, Unit>, Dynamic<?>>> id_break(String string, Type<A> type) {
        return DSL.and((Type)DSL.optional((Type)DSL.field((String)string, type)), (Type)DSL.remainderType());
    }

    protected TypeRewriteRule makeRule() {
        Schema schema = this.getInputSchema();
        TaggedChoice.TaggedChoiceType taggedChoiceType = new TaggedChoice.TaggedChoiceType("type", DSL.string(), (Map)ImmutableMap.of((Object)"minecraft:debug", (Object)DSL.remainderType(), (Object)"minecraft:flat", rwk_3.id_break("settings", rwk_3.id_class("biome", schema.getType(rTC.id_public), "layers", DSL.list(rwk_3.id_break("block", schema.getType(rTC.id_new))))), (Object)"minecraft:noise", rwk_3.id_class("biome_source", DSL.taggedChoiceType((String)"type", (Type)DSL.string(), (Map)ImmutableMap.of((Object)"minecraft:fixed", rwk_3.id_class("biome", schema.getType(rTC.id_public)), (Object)"minecraft:multi_noise", (Object)DSL.list(rwk_3.id_class("biome", schema.getType(rTC.id_public))), (Object)"minecraft:checkerboard", rwk_3.id_class("biomes", DSL.list((Type)schema.getType(rTC.id_public))), (Object)"minecraft:vanilla_layered", (Object)DSL.remainderType(), (Object)"minecraft:the_end", (Object)DSL.remainderType())), "settings", DSL.or((Type)DSL.string(), rwk_3.id_class("default_block", schema.getType(rTC.id_new), "default_fluid", schema.getType(rTC.id_new))))));
        CompoundList.CompoundListType compoundListType = DSL.compoundList(rTA.id_class(), rwk_3.id_class("generator", taggedChoiceType));
        Type type = DSL.and((Type)compoundListType, (Type)DSL.remainderType());
        Type type2 = schema.getType(rTC.id_goto);
        FieldFinder fieldFinder = new FieldFinder("dimensions", type);
        if (!type2.findFieldType("dimensions").equals((Object)type)) {
            throw new IllegalStateException();
        }
        OpticFinder opticFinder = compoundListType.finder();
        return this.fixTypeEverywhereTyped("MissingDimensionFix", type2, typed -> typed.updateTyped((OpticFinder)fieldFinder, typed3 -> typed3.updateTyped(opticFinder, typed2 -> {
            if (!(typed2.getValue() instanceof List)) {
                throw new IllegalStateException("List exptected");
            }
            if (((List)typed2.getValue()).isEmpty()) {
                Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
                Dynamic dynamic2 = this.id_class(dynamic);
                return (Typed)DataFixUtils.orElse(compoundListType.readTyped(dynamic2).result().map(Pair::getFirst), (Object)typed2);
            }
            return typed2;
        })));
    }
}

