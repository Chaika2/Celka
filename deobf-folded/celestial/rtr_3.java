package celestial;

import com.google.common.base.Splitter;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.apache.commons.lang3.math.NumberUtils;

public class rtr_3 extends DataFix {
   private static final Splitter id_class = Splitter.on(';').limit(5);
   private static final Splitter id_break = Splitter.on(',');
   private static final Splitter id_byte = Splitter.on('x').limit(2);
   private static final Splitter id_protected = Splitter.on('*').limit(2);
   private static final Splitter id_throws = Splitter.on(':').limit(3);

   public rtr_3(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private Dynamic<?> id_class(Dynamic<?> var1) {
      return var1.get("generatorName").asString("").equalsIgnoreCase("flat")
         ? var1.update(
            "generatorOptions",
            var1x -> (Dynamic)DataFixUtils.orElse(var1x.asString().map(this::id_class).map(var1xx -> var1x.createString(var1xx)).result(), var1x)
         )
         : var1;
   }

   String id_class(String var1) {
      if (var1.isEmpty()) {
         return "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
      } else {
         Iterator var2 = id_class.split(var1).iterator();
         String var3 = (String)var2.next();
         int var4;
         String var5;
         if (var2.hasNext()) {
            var4 = NumberUtils.toInt(var3, 0);
            var5 = (String)var2.next();
         } else {
            var4 = 0;
            var5 = var3;
         }

         if (var4 >= 0 && var4 <= 3) {
            StringBuilder var6 = new StringBuilder();
            Splitter var7 = var4 < 3 ? id_byte : id_protected;
            var6.append(StreamSupport.<String>stream(id_break.split(var5).spliterator(), false).map(var2x -> {
               List var3x = var7.splitToList(var2x);
               int var4x;
               String var5x;
               if (var3x.size() == 2) {
                  var4x = NumberUtils.toInt((String)var3x.get(0));
                  var5x = (String)var3x.get(1);
               } else {
                  var4x = 1;
                  var5x = (String)var3x.get(0);
               }

               List var6x = id_throws.splitToList(var5x);
               int var7x = ((String)var6x.get(0)).equals("minecraft") ? 1 : 0;
               String var8 = (String)var6x.get(var7x);
               int var9 = var4 == 3 ? rts_3.id_class("minecraft:" + var8) : NumberUtils.toInt(var8, 0);
               int var10 = var7x + 1;
               int var11 = var6x.size() > var10 ? NumberUtils.toInt((String)var6x.get(var10), 0) : 0;
               return (var4x == 1 ? "" : var4x + "*") + rtS_2.id_break(var9 << 4 | var11).get("Name").asString("");
            }).collect(Collectors.joining(",")));

            while (var2.hasNext()) {
               var6.append(';').append((String)var2.next());
            }

            return var6.toString();
         } else {
            return "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
         }
      }
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "LevelFlatGeneratorInfoFix", this.getInputSchema().getType(rTC.id_class), var1 -> var1.update(DSL.remainderFinder(), this::id_class)
      );
   }
}
