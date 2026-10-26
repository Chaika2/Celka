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
   private static final Logger break_ = LogManager.getLogger();
   private static final Gson byte_ = new GsonBuilder().setPrettyPrinting().create();
   private final DA protected_;
   private final List<Consumer<Consumer<OT>>> throws_ = ImmutableList.of(new UN(), new Uc_1(), new UQ(), new Uu_1(), new Um_1());

   public Ka_1(DA var1) {
      this.protected_ = var1;
   }

   @Override
   public String class_() {
      return "Advancements";
   }

   @Override
   public void class_(Dn_1 var1) throws IOException {
      Path var2 = this.protected_.break_();
      HashSet var3 = Sets.newHashSet();
      Consumer var4 = var3x -> {
         if (!var3.add(var3x.private_())) {
            throw new IllegalStateException("Duplicate advancement " + var3x.private_());
         } else {
            Path var4x = class_(var2, var3x);

            try {
               DT.class_(byte_, var1, var3x.class_().break_(), var4x);
            } catch (IOException var6x) {
               break_.error("Couldn't save advancement {}", var4x, var6x);
            }
         }
      };

      for (Consumer var6 : this.throws_) {
         var6.accept(var4);
      }
   }

   private static Path class_(Path var0, OT var1) {
      return var0.resolve("data/" + var1.private_().byte_() + "/advancements/" + var1.private_().break_() + ".json");
   }
}
