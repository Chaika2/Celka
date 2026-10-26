package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ka_1 implements DT {
   private static final Logger id_break = LogManager.getLogger();
   private static final Gson id_byte = new GsonBuilder().setPrettyPrinting().create();
   private final DA id_protected;
   private final List<Consumer<Consumer<OT>>> id_throws = ImmutableList.of(new UN(), new Uc_1(), new UQ(), new Uu_1(), new Um_1());

   public Ka_1(DA var1) {
      this.id_protected = var1;
   }

   @Override
   public String id_class() {
      return "Advancements";
   }

   @Override
   public void id_class(Dn_1 var1) throws IOException {
      Path var2 = this.id_protected.id_break();
      HashSet var3 = Sets.newHashSet();
      Consumer var4 = var3x -> {
         if (!var3.add(var3x.id_private())) {
            throw new IllegalStateException("Duplicate advancement " + var3x.id_private());
         } else {
            Path var4x = id_class(var2, var3x);

            try {
               DT.id_class(id_byte, var1, var3x.id_class().id_break(), var4x);
            } catch (IOException var6x) {
               id_break.error("Couldn't save advancement {}", var4x, var6x);
            }
         }
      };

      for (Consumer var6 : this.id_throws) {
         var6.accept(var4);
      }
   }

   private static Path id_class(Path var0, OT var1) {
      return var0.resolve("data/" + var1.id_private().id_byte() + "/advancements/" + var1.id_private().id_break() + ".json");
   }
}
