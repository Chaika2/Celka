package celestial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.brigadier.CommandDispatcher;
import java.io.IOException;
import java.nio.file.Path;

public class Dm_1 implements DT {
   private static final Gson break_ = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final DA byte_;

   public Dm_1(DA var1) {
      this.byte_ = var1;
   }

   @Override
   public void class_(Dn_1 var1) throws IOException {
      Path var2 = this.byte_.break_().resolve("reports/commands.json");
      CommandDispatcher var3 = new gp_3(gq_3.ALL).class_();
      DT.class_(break_, var1, RG.class_(var3, var3.getRoot()), var2);
   }

   @Override
   public String class_() {
      return "Command Syntax";
   }
}
