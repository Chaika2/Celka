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
   private static final Logger id_class = LogManager.getLogger();
   private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("commands.debug.notRunning"));
   private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType(new rgn_3("commands.debug.alreadyRunning"));
   private static final FileSystemProvider id_protected = FileSystemProvider.installedProviders()
      .stream()
      .filter(var0 -> var0.getScheme().equalsIgnoreCase("jar"))
      .findFirst()
      .orElse((FileSystemProvider)null);

   private static int id_byte(gy_3 var0) {
      rnW_2 var1 = var0.id_super();
      String var2 = "debug-report-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date());

      try {
         Path var3 = var1.id_protected("debug").toPath();
         Files.createDirectories(var3);
         if (!rqu_3.id_byte && id_protected != null) {
            Path var11 = var3.resolve(var2 + ".zip");

            try (FileSystem var5 = id_protected.newFileSystem(var11, ImmutableMap.of("create", "true"))) {
               var1.id_class(var5.getPath("/"));
            }
         } else {
            Path var4 = var3.resolve(var2);
            var1.id_class(var4);
         }

         var0.id_class(new rgn_3("commands.debug.reportSaved", var2), false);
         return 1;
      } catch (IOException var10) {
         id_class.error("Failed to save debug dump", var10);
         var0.id_class(new rgn_3("commands.debug.reportFailed"));
         return 0;
      }
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("debug")
                     .requires(var0x -> var0x.id_class(3)))
                  .then(gp_3.id_class("start").executes(var0x -> id_class((gy_3)var0x.getSource()))))
               .then(gp_3.id_class("stop").executes(var0x -> id_break((gy_3)var0x.getSource()))))
            .then(gp_3.id_class("report").executes(var0x -> id_byte((gy_3)var0x.getSource())))
      );
   }

   private static int id_class(gy_3 var0) {
      return 0;
   }

   private static int id_break(gy_3 var0) {
      return 0;
   }
}
