/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.List$ListType
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rIJ;
import celestial.rTC;
import celestial.rTT;
import celestial.rwb_3;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List;
import com.mojang.datafixers.types.templates.TaggedChoice;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rIX
extends DataFix {
    private static final Logger id_class = LogManager.getLogger();

    public rIX(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static /* synthetic */ Typed id_class(TaggedChoice.TaggedChoiceType taggedChoiceType, int n, int n2, IntSet intSet, Typed typed2) {
        return typed2.updateTyped(taggedChoiceType.finder(), typed -> {
            int n3;
            int n4;
            Dynamic dynamic = (Dynamic)typed.getOrCreate(DSL.remainderFinder());
            int n5 = dynamic.get("x").asInt(0) - (n << 4);
            return intSet.contains(rwb_3.id_class(n5, n4 = dynamic.get("y").asInt(0), n3 = dynamic.get("z").asInt(0) - (n2 << 4))) ? typed.update(taggedChoiceType.finder(), pair -> pair.mapFirst(string -> {
                if (!Objects.equals(string, "minecraft:chest")) {
                    id_class.warn("Block Entity was expected to be a chest");
                }
                return "minecraft:trapped_chest";
            })) : typed;
        });
    }

    public TypeRewriteRule makeRule() {
        Type type = this.getOutputSchema().getType(rTC.id_byte);
        Type type2 = type.findFieldType("Level");
        Type type3 = type2.findFieldType("TileEntities");
        if (!(type3 instanceof List.ListType)) {
            throw new IllegalStateException("Tile entity type is not a list type.");
        }
        List.ListType listType = (List.ListType)type3;
        OpticFinder opticFinder = DSL.fieldFinder((String)"TileEntities", (Type)listType);
        Type type4 = this.getInputSchema().getType(rTC.id_byte);
        OpticFinder opticFinder2 = type4.findField("Level");
        OpticFinder opticFinder3 = opticFinder2.type().findField("Sections");
        Type type5 = opticFinder3.type();
        if (!(type5 instanceof List.ListType)) {
            throw new IllegalStateException("Expecting sections to be a list.");
        }
        Type type6 = ((List.ListType)type5).getElement();
        OpticFinder opticFinder4 = DSL.typeFinder((Type)type6);
        return TypeRewriteRule.seq((TypeRewriteRule)new rTT(this.getOutputSchema(), "AddTrappedChestFix", rTC.id_extends).makeRule(), (TypeRewriteRule)this.fixTypeEverywhereTyped("Trapped Chest fix", type4, typed2 -> typed2.updateTyped(opticFinder2, typed -> {
            Optional optional = typed.getOptionalTyped(opticFinder3);
            if (!optional.isPresent()) {
                return typed;
            }
            List list = ((Typed)optional.get()).getAllTyped(opticFinder4);
            IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
            for (Typed typed2 : list) {
                rIJ rIJ2 = new rIJ(typed2, this.getInputSchema());
                if (rIJ2.id_break()) continue;
                for (int i = 0; i < 4096; ++i) {
                    int n = rIJ2.id_byte(i);
                    if (!rIJ2.id_class(n)) continue;
                    intOpenHashSet.add(rIJ2.id_byte() << 12 | i);
                }
            }
            Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
            int n = dynamic.get("xPos").asInt(0);
            int n2 = dynamic.get("zPos").asInt(0);
            TaggedChoice.TaggedChoiceType taggedChoiceType = this.getInputSchema().findChoiceType(rTC.id_extends);
            return typed.updateTyped(opticFinder, arg_0 -> rIX.id_class(taggedChoiceType, n, n2, (IntSet)intOpenHashSet, arg_0));
        })));
    }
}

