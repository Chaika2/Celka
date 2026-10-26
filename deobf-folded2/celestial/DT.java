package celestial;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public interface DT {
   HashFunction id_class = Hashing.sha1();

   void id_class(Dn_1 var1) throws IOException;

   static void id_class(Gson var0, Dn_1 var1, JsonElement var2, Path var3) throws IOException {
      String var4 = var0.toJson(var2);
      String var5 = id_class.hashUnencodedChars(var4).toString();
      if (!Objects.equals(var1.id_class(var3), var5) || !Files.exists(var3)) {
         Files.createDirectories(var3.getParent());

         try (BufferedWriter var6 = Files.newBufferedWriter(var3)) {
            var6.write(var4);
         }
      }

      var1.id_class(var3, var5);
   }

   String id_class();
}
