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
   HashFunction class_ = Hashing.sha1();

   void class_(Dn_1 var1) throws IOException;

   static void class_(Gson var0, Dn_1 var1, JsonElement var2, Path var3) throws IOException {
      String var4 = var0.toJson(var2);
      String var5 = class_.hashUnencodedChars(var4).toString();
      if (!Objects.equals(var1.class_(var3), var5) || !Files.exists(var3)) {
         Files.createDirectories(var3.getParent());

         try (BufferedWriter var6 = Files.newBufferedWriter(var3)) {
            var6.write(var4);
         }
      }

      var1.class_(var3, var5);
   }

   String class_();
}
