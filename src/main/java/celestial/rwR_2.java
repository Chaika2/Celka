/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.rTC;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import java.util.Optional;

public class rwR_2
extends DataFix {
    public rwR_2(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private <OldEntityTree, NewEntityTree, Entity> TypeRewriteRule id_class(Schema schema, Schema schema2, Type<OldEntityTree> type, Type<NewEntityTree> type2, Type<Entity> type3) {
        Type type4 = DSL.named((String)rTC.id_package.typeName(), (Type)DSL.and((Type)DSL.optional((Type)DSL.field((String)"Riding", type)), type3));
        Type type5 = DSL.named((String)rTC.id_package.typeName(), (Type)DSL.and((Type)DSL.optional((Type)DSL.field((String)"Passengers", (Type)DSL.list(type2))), type3));
        Type type6 = schema.getType(rTC.id_package);
        Type type7 = schema2.getType(rTC.id_package);
        if (!Objects.equals(type6, type4)) {
            throw new IllegalStateException("Old entity type is not what was expected.");
        }
        if (!type7.equals((Object)type5, true, true)) {
            throw new IllegalStateException("New entity type is not what was expected.");
        }
        OpticFinder opticFinder = DSL.typeFinder((Type)type4);
        OpticFinder opticFinder2 = DSL.typeFinder((Type)type5);
        OpticFinder opticFinder3 = DSL.typeFinder(type2);
        Type type8 = schema.getType(rTC.id_break);
        Type type9 = schema2.getType(rTC.id_break);
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhere("EntityRidingToPassengerFix", type4, type5, dynamicOps -> pair2 -> {
            Optional<Object> optional = Optional.empty();
            Pair pair3 = pair2;
            while (true) {
                Either either = (Either)DataFixUtils.orElse(optional.map(pair -> {
                    Typed typed = (Typed)type2.pointTyped(dynamicOps).orElseThrow(() -> new IllegalStateException("Could not create new entity tree"));
                    Object t = typed.set(opticFinder2, pair).getOptional(opticFinder3).orElseThrow(() -> new IllegalStateException("Should always have an entity tree here"));
                    return Either.left((Object)ImmutableList.of(t));
                }), (Object)Either.right((Object)DSL.unit()));
                optional = Optional.of(Pair.of((Object)rTC.id_package.typeName(), (Object)Pair.of((Object)either, (Object)((Pair)pair3.getSecond()).getSecond())));
                Optional optional2 = ((Either)((Pair)pair3.getSecond()).getFirst()).left();
                if (!optional2.isPresent()) {
                    return (Pair)optional.orElseThrow(() -> new IllegalStateException("Should always have an entity tree here"));
                }
                pair3 = (Pair)new Typed(type, dynamicOps, optional2.get()).getOptional(opticFinder).orElseThrow(() -> new IllegalStateException("Should always have an entity here"));
            }
        }), (TypeRewriteRule)this.writeAndRead("player RootVehicle injecter", type8, type9));
    }

    public TypeRewriteRule makeRule() {
        Schema schema = this.getInputSchema();
        Schema schema2 = this.getOutputSchema();
        Type type = schema.getTypeRaw(rTC.id_package);
        Type type2 = schema2.getTypeRaw(rTC.id_package);
        Type type3 = schema.getTypeRaw(rTC.id_int);
        return this.id_class(schema, schema2, type, type2, type3);
    }
}

