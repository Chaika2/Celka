package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class oJ_2 {
   private static final Logger class_ = LogManager.getLogger();
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("commands.debug.notRunning"));
   private static final SimpleCommandExceptionType byte_ = new SimpleCommandExceptionType(new rgn_3("commands.debug.alreadyRunning"));
   private static final FileSystemProvider protected_ = FileSystemProvider.installedProviders()
      .stream()
      .filter(var0 -> var0.getScheme().equalsIgnoreCase("jar"))
      .findFirst()
      .orElse((FileSystemProvider)null);

   private static int byte_(gy_3 var0) {
      rnW_2 var1 = var0.super_();
      String var2 = "debug-report-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date());

      try {
         Path var3 = var1.protected_("debug").toPath();
         Files.createDirectories(var3);
         if (!rqu_3.byte_ && protected_ != null) {
            Path var11 = var3.resolve(var2 + ".zip");

            try (FileSystem var5 = protected_.newFileSystem(var11, ImmutableMap.of("create", "true"))) {
               var1.class_(var5.getPath("/"));
            }
         } else {
            Path var4 = var3.resolve(var2);
            var1.class_(var4);
         }

         var0.class_(new rgn_3("commands.debug.reportSaved", var2), false);
         return 1;
      } catch (IOException var10) {
         class_.error("Failed to save debug dump", var10);
         var0.class_(new rgn_3("commands.debug.reportFailed"));
         return 0;
      }
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("debug")
                     .requires(var0x -> var0x.class_(3)))
                  .then(gp_3.class_("start").executes(var0x -> class_((gy_3)var0x.getSource()))))
               .then(gp_3.class_("stop").executes(var0x -> break_((gy_3)var0x.getSource()))))
            .then(gp_3.class_("report").executes(var0x -> byte_((gy_3)var0x.getSource())))
      );
   }

   private static int class_(gy_3 var0) {
      return 0;
   }

   private static int break_(gy_3 var0) {
      return 0;
   }
}
