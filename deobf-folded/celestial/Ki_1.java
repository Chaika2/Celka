package celestial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ki_1 implements DT {
   private static final Logger id_break = LogManager.getLogger();
   private static final Gson id_byte = new GsonBuilder().setPrettyPrinting().create();
   private final DA id_protected;

   public Ki_1(DA var1) {
      this.id_protected = var1;
   }

   @Override
   public String id_class() {
      return "Biomes";
   }

   @Override
   public void id_class(Dn_1 var1) {
      Path var2 = this.id_protected.id_break();

      for (Entry var4 : rVy_1.id_implements.id_throws()) {
         Path var5 = id_class(var2, ((rqM_2)var4.getKey()).id_class());
         rYG var6 = (rYG)var4.getValue();
         Function var7 = JsonOps.INSTANCE.withEncoder(rYG.id_protected);

         try {
            Optional var8 = ((DataResult)var7.apply(() -> var6)).result();
            if (var8.isPresent()) {
               DT.id_class(id_byte, var1, (JsonElement)var8.get(), var5);
            } else {
               id_break.error("Couldn't serialize biome {}", var5);
            }
         } catch (IOException var9) {
            id_break.error("Couldn't save biome {}", var5, var9);
         }
      }
   }

   private static Path id_class(Path var0, rqO_2 var1) {
      return var0.resolve("reports/biomes/" + var1.id_break() + ".json");
   }
}
