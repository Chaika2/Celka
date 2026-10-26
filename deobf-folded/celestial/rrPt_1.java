package celestial;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrPt_1 {
   private static final Logger id_class = LogManager.getLogger();
   private final Map<rqO_2, rrPl_1> id_break = Maps.newHashMap();
   private final DataFixer id_byte;
   private rAL id_protected;
   private final Path id_throws;

   public boolean id_byte(rqO_2 var1) {
      rrPl_1 var2 = this.id_break.get(var1);
      if (var2 == null) {
         return false;
      } else {
         Path var3 = this.id_break(var1, ".nbt");
         Path var4 = var3.getParent();
         if (var4 == null) {
            return false;
         } else {
            try {
               Files.createDirectories(Files.exists(var4) ? var4.toRealPath() : var4);
            } catch (IOException var12) {
               id_class.error("Failed to create parent directory: {}", var4);
               return false;
            }

            rcd_3 var5 = var2.id_class(new rcd_3());

            try {
               boolean var7;
               try (FileOutputStream var6 = new FileOutputStream(var3.toFile())) {
                  rcW_2.id_class(var5, var6);
                  var7 = true;
               }

               return var7;
            } catch (Throwable var11) {
               return false;
            }
         }
      }
   }

   public rrPt_1(rAL var1, rrGk_1 var2, DataFixer var3) {
      this.id_protected = var1;
      this.id_byte = var3;
      this.id_throws = var2.id_class(rrGr_1.id_case).normalize();
   }

   private rrPl_1 id_class(InputStream var1) throws IOException {
      rcd_3 var2 = rcW_2.id_class(var1);
      return this.id_class(var2);
   }

   public rrPl_1 id_class(rqO_2 var1) {
      rrPl_1 var2 = this.id_break(var1);
      if (var2 == null) {
         var2 = new rrPl_1();
         this.id_break.put(var1, var2);
      }

      return var2;
   }

   public Path id_class(rqO_2 var1, String var2) {
      try {
         Path var3 = this.id_throws.resolve(var1.id_byte());
         Path var4 = var3.resolve("structures");
         return rpz_3.id_break(var4, var1.id_break(), var2);
      } catch (InvalidPathException var5) {
         throw new rqX_2("Invalid resource path: " + var1, var5);
      }
   }

   public rrPl_1 id_class(rcd_3 var1) {
      if (!var1.id_byte("DataVersion", 99)) {
         var1.id_break("DataVersion", 500);
      }

      rrPl_1 var2 = new rrPl_1();
      var2.id_break(rco_3.id_class(this.id_byte, rTv_1.STRUCTURE, var1, var1.id_private("DataVersion")));
      return var2;
   }

   public void id_class(rAL var1) {
      this.id_protected = var1;
      this.id_break.clear();
   }

   public rrPl_1 id_break(rqO_2 var1) {
      return this.id_break.computeIfAbsent(var1, var1x -> {
         rrPl_1 var2 = this.id_case(var1x);
         return var2 != null ? var2 : this.id_throws(var1x);
      });
   }

   private Path id_break(rqO_2 var1, String var2) {
      if (var1.id_break().contains("//")) {
         throw new rqX_2("Invalid resource path: " + var1);
      } else {
         Path var3 = this.id_class(var1, var2);
         if (var3.startsWith(this.id_throws) && rpz_3.id_class(var3) && rpz_3.id_break(var3)) {
            return var3;
         } else {
            throw new rqX_2("Invalid resource path: " + var3);
         }
      }
   }

   private rrPl_1 id_throws(rqO_2 var1) {
      rqO_2 var2 = new rqO_2(var1.id_byte(), "structures/" + var1.id_break() + ".nbt");

      try {
         rrPl_1 var4;
         try (rAF var3 = this.id_protected.id_class(var2)) {
            var4 = this.id_class(var3.id_break());
         }

         return var4;
      } catch (FileNotFoundException var8) {
         return null;
      } catch (Throwable var9) {
         id_class.error("Couldn't load structure {}: {}", var1, var9.toString());
         return null;
      }
   }

   private rrPl_1 id_case(rqO_2 var1) {
      if (!this.id_throws.toFile().isDirectory()) {
         return null;
      } else {
         Path var2 = this.id_break(var1, ".nbt");

         try {
            rrPl_1 var4;
            try (FileInputStream var3 = new FileInputStream(var2.toFile())) {
               var4 = this.id_class(var3);
            }

            return var4;
         } catch (FileNotFoundException var8) {
            return null;
         } catch (IOException var9) {
            id_class.error("Couldn't load structure from {}", var2, var9);
            return null;
         }
      }
   }

   public void id_protected(rqO_2 var1) {
      this.id_break.remove(var1);
   }
}
