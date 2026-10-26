package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rAY implements rAC {
   public static Path class_;
   private static final Logger protected_ = LogManager.getLogger();
   public static Class<?> break_;
   private static final Map<rAI, FileSystem> throws_ = rqR_2.class_(Maps.newHashMap(), var0 -> {
      synchronized (rAY.class) {
         for (rAI var5 : rAI.values()) {
            URL var6 = rAY.class.getResource("/" + var5.class_() + "/.mcassetsroot");

            try {
               URI var7 = var6.toURI();
               if ("jar".equals(var7.getScheme())) {
                  FileSystem var8;
                  try {
                     var8 = FileSystems.getFileSystem(var7);
                  } catch (FileSystemNotFoundException var11) {
                     var8 = FileSystems.newFileSystem(var7, Collections.emptyMap());
                  }

                  var0.put(var5, var8);
               }
            } catch (IOException | URISyntaxException var12) {
               protected_.error("Couldn't get a list of all vanilla resources", var12);
            }
         }
      }
   });
   public final Set<String> byte_;
   private static final boolean case_ = rqR_2.implements_() == rqi_3.WINDOWS;
   private static final boolean catch_ = rrxr_3.rb.byte_();

   protected InputStream byte_(rAI var1, rqO_2 var2) {
      String var3 = protected_(var1, var2);
      if (class_ != null) {
         Path var4 = class_.resolve(var1.class_() + "/" + var2.byte_() + "/" + var2.break_());
         if (Files.exists(var4)) {
            try {
               return Files.newInputStream(var4);
            } catch (IOException var7) {
            }
         }
      }

      try {
         URL var8 = rAY.class.getResource(var3);
         return class_(var3, var8) ? (catch_ ? this.class_(var1, var3) : var8.openStream()) : null;
      } catch (IOException var6) {
         return rAY.class.getResourceAsStream(var3);
      }
   }

   public rAY(String... var1) {
      this.byte_ = ImmutableSet.copyOf(var1);
   }

   private InputStream class_(rAI var1, String var2) {
      try {
         FileSystem var3 = throws_.get(var1);
         return var3 != null ? Files.newInputStream(var3.getPath(var2)) : rAY.class.getResourceAsStream(var2);
      } catch (IOException var4) {
         return rAY.class.getResourceAsStream(var2);
      }
   }

   private static boolean class_(File var0, String var1) throws IOException {
      String var2 = var0.getPath();
      if (var2.startsWith("file:")) {
         if (case_) {
            var2 = var2.replace("\\", "/");
         }

         return var2.endsWith(var1);
      } else {
         return rAW.class_(var0, var1);
      }
   }

   @Override
   public String class_() {
      return "Default";
   }

   @Override
   public <T> T class_(rAo_1<T> var1) throws IOException {
      try {
         Object var3;
         try (InputStream var2 = this.class_("pack.mcmeta")) {
            var3 = rAH.class_(var1, var2);
         }

         return (T)var3;
      } catch (FileNotFoundException | RuntimeException var7) {
         return null;
      }
   }

   @Override
   public Set<String> class_(rAI var1) {
      return this.byte_;
   }

   private static boolean class_(String var0, URL var1) throws IOException {
      return var1 != null && (var1.getProtocol().equals("jar") || class_(new File(var1.getFile()), var0));
   }

   @Override
   public InputStream class_(rAI var1, rqO_2 var2) throws IOException {
      InputStream var3 = this.byte_(var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         throw new FileNotFoundException(var2.break_());
      }
   }

   private static void class_(Collection<rqO_2> var0, int var1, String var2, Path var3, String var4, Predicate<String> var5) throws IOException {
      Path var6 = var3.resolve(var2);

      try (Stream var7 = Files.walk(var6.resolve(var4), var1)) {
         var7.filter(var1x -> !var1x.endsWith(".mcmeta") && Files.isRegularFile(var1x) && var5.test(var1x.getFileName().toString()))
            .map(var2x -> new rqO_2(var2, var6.relativize(var2x).toString().replaceAll("\\\\", "/")))
            .forEach(var0::add);
      }
   }

   @Override
   public Collection<rqO_2> class_(rAI var1, String var2, String var3, int var4, Predicate<String> var5) {
      HashSet var6 = Sets.newHashSet();
      if (class_ != null) {
         try {
            class_(var6, var4, var2, class_.resolve(var1.class_()), var3, var5);
         } catch (IOException var15) {
         }

         if (var1 == rAI.CLIENT_RESOURCES) {
            Enumeration var7 = null;

            try {
               var7 = break_.getClassLoader().getResources(var1.class_() + "/");
            } catch (IOException var14) {
            }

            while (var7 != null && var7.hasMoreElements()) {
               try {
                  URI var8 = ((URL)var7.nextElement()).toURI();
                  if ("file".equals(var8.getScheme())) {
                     class_(var6, var4, var2, Paths.get(var8), var3, var5);
                  }
               } catch (IOException | URISyntaxException var13) {
               }
            }
         }
      }

      try {
         URL var16 = rAY.class.getResource("/" + var1.class_() + "/.mcassetsroot");
         if (var16 == null) {
            protected_.error("Couldn't find .mcassetsroot, cannot load vanilla resources");
            return var6;
         }

         URI var17 = var16.toURI();
         if ("file".equals(var17.getScheme())) {
            URL var9 = new URL(var16.toString().substring(0, var16.toString().length() - ".mcassetsroot".length()));
            Path var10 = Paths.get(var9.toURI());
            class_(var6, var4, var2, var10, var3, var5);
         } else if ("jar".equals(var17.getScheme())) {
            Path var18 = throws_.get(var1).getPath("/" + var1.class_());
            class_(var6, var4, "minecraft", var18, var3, var5);
         } else {
            protected_.error("Unsupported scheme {} trying to list vanilla resources (NYI?)", var17);
         }
      } catch (NoSuchFileException | FileNotFoundException var11) {
      } catch (IOException | URISyntaxException var12) {
         protected_.error("Couldn't get a list of all vanilla resources", var12);
      }

      return var6;
   }

   @Override
   public InputStream class_(String var1) throws IOException {
      if (!var1.contains("/") && !var1.contains("\\")) {
         if (class_ != null) {
            Path var2 = class_.resolve(var1);
            if (Files.exists(var2)) {
               return Files.newInputStream(var2);
            }
         }

         return this.break_(var1);
      } else {
         throw new IllegalArgumentException("Root resources can only be filenames, not paths (no / allowed!)");
      }
   }

   @Override
   public void close() {
   }

   @Override
   public boolean break_(rAI var1, rqO_2 var2) {
      String var3 = protected_(var1, var2);
      Object var4 = null;
      if (class_ != null) {
         Path var5 = class_.resolve(var1.class_() + "/" + var2.byte_() + "/" + var2.break_());
         if (Files.exists(var5)) {
            return true;
         }
      }

      try {
         URL var7 = rAY.class.getResource(var3);
         return class_(var3, var7);
      } catch (IOException var6) {
         return false;
      }
   }

   protected InputStream break_(String var1) {
      return catch_ ? this.class_(rAI.SERVER_DATA, "/" + var1) : rAY.class.getResourceAsStream("/" + var1);
   }

   private static String protected_(rAI var0, rqO_2 var1) {
      return "/" + var0.class_() + "/" + var1.byte_() + "/" + var1.break_();
   }
}
