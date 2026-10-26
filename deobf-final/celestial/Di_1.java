package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Di_1 implements DT {
   private static final Path break_ = null;
   private static final Logger byte_ = LogManager.getLogger();
   private final DA protected_;
   private final List<Ur_1> throws_ = Lists.newArrayList();

   public Di_1(DA var1) {
      this.protected_ = var1;
   }

   private void class_(Dn_1 var1, UP var2, Path var3) {
      if (var2.byte_ != null) {
         Path var4 = break_.resolve(var2.class_ + ".snbt");

         try {
            FileUtils.write(var4.toFile(), var2.byte_, StandardCharsets.UTF_8);
         } catch (IOException var9) {
            byte_.error("Couldn't write structure SNBT {} at {}", var2.class_, var4, var9);
         }
      }

      Path var12 = var3.resolve(var2.class_ + ".nbt");

      try {
         if (!Objects.equals(var1.class_(var12), var2.protected_) || !Files.exists(var12)) {
            Files.createDirectories(var12.getParent());

            try (OutputStream var5 = Files.newOutputStream(var12)) {
               var5.write(var2.break_);
            }
         }

         var1.class_(var12, var2.protected_);
      } catch (IOException var11) {
         byte_.error("Couldn't write structure {} at {}", var2.class_, var12, var11);
      }
   }

   private UP class_(Path var1, String var2) {
      try {
         UP var10;
         try (BufferedReader var3 = Files.newBufferedReader(var1)) {
            String var4 = IOUtils.toString(var3);
            rcd_3 var5 = this.class_(var2, rcH_2.class_(var4));
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            rcW_2.class_(var5, var6);
            byte[] var7 = var6.toByteArray();
            String var8 = class_.hashBytes(var7).toString();
            String var9;
            if (break_ != null) {
               var9 = var5.class_("    ", 0).getString() + "\n";
            } else {
               var9 = null;
            }

            var10 = new UP(var2, var7, var9, var8);
         }

         return var10;
      } catch (CommandSyntaxException var13) {
         byte_.error("Couldn't convert {} from SNBT to NBT at {} as it's invalid SNBT", var2, var1, var13);
      } catch (IOException var14) {
         byte_.error("Couldn't convert {} from SNBT to NBT at {}", var2, var1, var14);
      }

      return null;
   }

   @Override
   public void class_(Dn_1 var1) throws IOException {
      Path var2 = this.protected_.break_();
      ArrayList var3 = Lists.newArrayList();

      for (Path var5 : this.protected_.class_()) {
         Files.walk(var5)
            .filter(var0 -> var0.toString().endsWith(".snbt"))
            .forEach(var3x -> var3.add(CompletableFuture.supplyAsync(() -> this.class_(var3x, this.class_(var5, var3x)), rqR_2.case_())));
      }

      rqR_2.<UP>break_(var3).join().stream().filter(Objects::nonNull).forEach(var3x -> this.class_(var1, var3x, var2));
   }

   private rcd_3 class_(String var1, rcd_3 var2) {
      rcd_3 var3 = var2;

      for (Ur_1 var5 : this.throws_) {
         var3 = var5.class_(var1, var3);
      }

      return var3;
   }

   @Override
   public String class_() {
      return "SNBT -> NBT";
   }

   private String class_(Path var1, Path var2) {
      String var3 = var1.relativize(var2).toString().replaceAll("\\\\", "/");
      return var3.substring(0, var3.length() - ".snbt".length());
   }

   public Di_1 class_(Ur_1 var1) {
      this.throws_.add(var1);
      return this;
   }
}
