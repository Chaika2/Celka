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
   private static final Logger class_ = LogManager.getLogger();
   private final Map<rqO_2, rrPl_1> break_ = Maps.newHashMap();
   private final DataFixer byte_;
   private rAL protected_;
   private final Path throws_;

   public boolean byte_(rqO_2 var1) {
      rrPl_1 var2 = this.break_.get(var1);
      if (var2 == null) {
         return false;
      } else {
         Path var3 = this.break_(var1, ".nbt");
         Path var4 = var3.getParent();
         if (var4 == null) {
            return false;
         } else {
            try {
               Files.createDirectories(Files.exists(var4) ? var4.toRealPath() : var4);
            } catch (IOException var12) {
               class_.error("Failed to create parent directory: {}", var4);
               return false;
            }

            rcd_3 var5 = var2.class_(new rcd_3());

            try {
               boolean var7;
               try (FileOutputStream var6 = new FileOutputStream(var3.toFile())) {
                  rcW_2.class_(var5, var6);
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
      this.protected_ = var1;
      this.byte_ = var3;
      this.throws_ = var2.class_(rrGr_1.case_).normalize();
   }

   private rrPl_1 class_(InputStream var1) throws IOException {
      rcd_3 var2 = rcW_2.class_(var1);
      return this.class_(var2);
   }

   public rrPl_1 class_(rqO_2 var1) {
      rrPl_1 var2 = this.break_(var1);
      if (var2 == null) {
         var2 = new rrPl_1();
         this.break_.put(var1, var2);
      }

      return var2;
   }

   public Path class_(rqO_2 var1, String var2) {
      try {
         Path var3 = this.throws_.resolve(var1.byte_());
         Path var4 = var3.resolve("structures");
         return rpz_3.break_(var4, var1.break_(), var2);
      } catch (InvalidPathException var5) {
         throw new rqX_2("Invalid resource path: " + var1, var5);
      }
   }

   public rrPl_1 class_(rcd_3 var1) {
      if (!var1.byte_("DataVersion", 99)) {
         var1.break_("DataVersion", 500);
      }

      rrPl_1 var2 = new rrPl_1();
      var2.break_(rco_3.class_(this.byte_, rTv_1.STRUCTURE, var1, var1.private_("DataVersion")));
      return var2;
   }

   public void class_(rAL var1) {
      this.protected_ = var1;
      this.break_.clear();
   }

   public rrPl_1 break_(rqO_2 var1) {
      return this.break_.computeIfAbsent(var1, var1x -> {
         rrPl_1 var2 = this.case_(var1x);
         return var2 != null ? var2 : this.throws_(var1x);
      });
   }

   private Path break_(rqO_2 var1, String var2) {
      if (var1.break_().contains("//")) {
         throw new rqX_2("Invalid resource path: " + var1);
      } else {
         Path var3 = this.class_(var1, var2);
         if (var3.startsWith(this.throws_) && rpz_3.class_(var3) && rpz_3.break_(var3)) {
            return var3;
         } else {
            throw new rqX_2("Invalid resource path: " + var3);
         }
      }
   }

   private rrPl_1 throws_(rqO_2 var1) {
      rqO_2 var2 = new rqO_2(var1.byte_(), "structures/" + var1.break_() + ".nbt");

      try {
         rrPl_1 var4;
         try (rAF var3 = this.protected_.class_(var2)) {
            var4 = this.class_(var3.break_());
         }

         return var4;
      } catch (FileNotFoundException var8) {
         return null;
      } catch (Throwable var9) {
         class_.error("Couldn't load structure {}: {}", var1, var9.toString());
         return null;
      }
   }

   private rrPl_1 case_(rqO_2 var1) {
      if (!this.throws_.toFile().isDirectory()) {
         return null;
      } else {
         Path var2 = this.break_(var1, ".nbt");

         try {
            rrPl_1 var4;
            try (FileInputStream var3 = new FileInputStream(var2.toFile())) {
               var4 = this.class_(var3);
            }

            return var4;
         } catch (FileNotFoundException var8) {
            return null;
         } catch (IOException var9) {
            class_.error("Couldn't load structure from {}", var2, var9);
            return null;
         }
      }
   }

   public void protected_(rqO_2 var1) {
      this.break_.remove(var1);
   }
}
