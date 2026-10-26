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
   private static final Logger break_ = LogManager.getLogger();
   private static final Gson byte_ = new GsonBuilder().setPrettyPrinting().create();
   private final DA protected_;

   public Ki_1(DA var1) {
      this.protected_ = var1;
   }

   @Override
   public String class_() {
      return "Biomes";
   }

   @Override
   public void class_(Dn_1 var1) {
      Path var2 = this.protected_.break_();

      for (Entry var4 : rVy_1.implements_.throws_()) {
         Path var5 = class_(var2, ((rqM_2)var4.getKey()).class_());
         rYG var6 = (rYG)var4.getValue();
         Function var7 = JsonOps.INSTANCE.withEncoder(rYG.protected_);

         try {
            Optional var8 = ((DataResult)var7.apply(() -> var6)).result();
            if (var8.isPresent()) {
               DT.class_(byte_, var1, (JsonElement)var8.get(), var5);
            } else {
               break_.error("Couldn't serialize biome {}", var5);
            }
         } catch (IOException var9) {
            break_.error("Couldn't save biome {}", var5, var9);
         }
      }
   }

   private static Path class_(Path var0, rqO_2 var1) {
      return var0.resolve("reports/biomes/" + var1.break_() + ".json");
   }
}
