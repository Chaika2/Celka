package celestial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.brigadier.CommandDispatcher;
import java.io.IOException;
import java.nio.file.Path;

public class Dm_1 implements DT {
   private static final Gson id_break = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final DA id_byte;

   public Dm_1(DA var1) {
      this.id_byte = var1;
   }

   @Override
   public void id_class(Dn_1 var1) throws IOException {
      Path var2 = this.id_byte.id_break().resolve("reports/commands.json");
      CommandDispatcher var3 = new gp_3(gq_3.ALL).id_class();
      DT.id_class(id_break, var1, RG.id_class(var3, var3.getRoot()), var2);
   }

   @Override
   public String id_class() {
      return "Command Syntax";
   }
}
